/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import spp.accesoadatos.ConexionBD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import spp.logicadenegocio.clasesdto.Usuario;
import java.sql.ResultSet;
import spp.logicadenegocio.interfacesdao.IUsuarioDAO;

/**
 *
 * @author Luz Fernanda H J
 */
public class UsuarioDAO implements IUsuarioDAO {
    
    @Override
    public int registrarUsuario(Usuario usuario){
        boolean registroExitoso = false;
        String consultaSQL = """
                INSERT INTO Usuario (nombre, apellidos, contrasena, estado) VALUES (?, ?, ?, ?)""";
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL,Statement.RETURN_GENERATED_KEYS);) {

            consultaPreparada.setString(1, usuario.getNombre());
            consultaPreparada.setString(2, usuario.getApellidos());
            consultaPreparada.setString(3, usuario.getContraseña());
            consultaPreparada.setBoolean(4, usuario.getEsActivo());

            consultaPreparada.executeUpdate();
            
            ResultSet resultadosConsulta = consultaPreparada.getGeneratedKeys();

            if (resultadosConsulta.next()) {
                int idGenerado = resultadosConsulta.getInt(1);
                usuario.setIdUsuario(idGenerado);
            }

            registroExitoso = true;
            resultadosConsulta.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        if(registroExitoso){
            return usuario.getIdUsuario();
        }else{
            return 0;
        }
    }
    
    @Override
    public Usuario consultarUsuario(int idUsuario) {

        Usuario usuario = null;
        String consultaSQL = "SELECT idUsuario, nombre, apellidos, estado FROM USUARIO WHERE idUsuario = ?";

        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);) {
            
            consultaPreparada.setInt(1, idUsuario);

            ResultSet resultadosConsulta = consultaPreparada.executeQuery();

            if (resultadosConsulta.next()) {

                usuario = new Usuario();

                usuario.setIdUsuario(resultadosConsulta.getInt("idUsuario"));
                usuario.setNombre(resultadosConsulta.getString("nombre"));
                usuario.setApellidos(resultadosConsulta.getString("apellidos"));

                int esActivo = resultadosConsulta.getInt("estado");
                if (esActivo == 1) {
                    usuario.setEsActivo(true);
                } else {
                    usuario.setEsActivo(false);
                }

            } 

        } catch (Exception e) {
            e.printStackTrace();
        }

    return usuario;
}

    @Override
    public boolean eliminarUsuario(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
