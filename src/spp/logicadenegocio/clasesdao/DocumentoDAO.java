/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import spp.accesoadatos.ConexionBD;
import spp.logicadenegocio.clasesdto.Documento;
import spp.logicadenegocio.clasesdto.Usuario;
import spp.logicadenegocio.interfacesdao.IDocumentoDAO;

/**
 *
 * @author Luz Fernanda H J
 */
public class DocumentoDAO implements IDocumentoDAO {

    @Override
    public boolean registrarDocumento(Documento documento) {
        
        boolean registroExitoso = false;
        
        String consultaSQL = """
                INSERT INTO Documento 
                (nombre, tipo, ruta, Usuario_idUsuario) VALUES (?, ?, ?, ?)""";
        
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);) {

            consultaPreparada.setString(1, documento.getNombre());
            consultaPreparada.setString(2, documento.getTipo());
            consultaPreparada.setString(3, documento.getRuta());
            consultaPreparada.setInt(4, documento.getUsuario().getIdUsuario());
            
            consultaPreparada.executeUpdate();
            
            registroExitoso = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
    return registroExitoso;
    
    }

    @Override
    public Documento consultarDocumento(String nombre) {
        
        Documento documento = null;
        
        String consultaSQL = "SELECT * FROM Documento WHERE nombre = ?";

        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);) {
          
            consultaPreparada.setString(1, nombre);

            ResultSet resultadosConsulta = consultaPreparada.executeQuery();

            if (resultadosConsulta.next()) {
                documento = new Documento();

                documento.setIdDocumento(resultadosConsulta.getInt("idDocumento"));
                documento.setNombre(resultadosConsulta.getString("nombre"));
                documento.setTipo(resultadosConsulta.getString("tipo"));
                documento.setRuta(resultadosConsulta.getString("ruta")); 
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultadosConsulta.getInt("Usuario_idUsuario"));
                
                documento.setUsuario(usuario);
            }

            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    return documento;
    
    }
    
}
