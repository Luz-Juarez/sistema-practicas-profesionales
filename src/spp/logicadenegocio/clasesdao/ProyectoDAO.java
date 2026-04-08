/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import spp.accesoadatos.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import spp.logicadenegocio.clasesdto.Organizacion;
import spp.logicadenegocio.clasesdto.Proyecto;
import spp.logicadenegocio.interfacesdao.IProyectoDAO;


/**
 *
 * @author Luz Fernanda H J
 */
public class ProyectoDAO implements IProyectoDAO {
    
    @Override
    public boolean registrarProyecto(Proyecto proyecto){
        boolean registroExitoso = false;
        String consultaSQL = """
                INSERT INTO Proyecto 
                (nombre, descripcion, nombreResponsable, cupoMaximo, estado, 
                  Organizacion_idOrganizacion) VALUES (?, ?, ?, ?, ?, ?)""";
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);) {

            consultaPreparada.setString(1, proyecto.getNombre());
            consultaPreparada.setString(2, proyecto.getDescripcion());
            consultaPreparada.setString(3, proyecto.getNombreResponsable());
            consultaPreparada.setInt(4, proyecto.getCupoMaximo());
            consultaPreparada.setBoolean(5, proyecto.getEsActivo());
            consultaPreparada.setInt(6, proyecto.getOrganizacion().getIdOrganizacion());
            
            consultaPreparada.executeUpdate();
            
            registroExitoso = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return registroExitoso;
    }
       
    @Override
    public Proyecto consultarProyecto(int idProyecto) {
        Proyecto proyecto = null;
         String consultaSQL = "SELECT * FROM PROYECTO WHERE idProyecto = ?";

        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);) {
          
            consultaPreparada.setInt(1, idProyecto);

            ResultSet resultadosConsulta = consultaPreparada.executeQuery();

            if (resultadosConsulta.next()) {
                proyecto = new Proyecto();

                proyecto.setIdProyecto(resultadosConsulta.getInt("idProyecto"));
                proyecto.setNombre(resultadosConsulta.getString("nombre"));
                proyecto.setDescripcion(resultadosConsulta.getString("descripcion"));
                proyecto.setNombreResponsable(resultadosConsulta.getString("nombreResponsable"));
                proyecto.setCupoMaximo(resultadosConsulta.getInt("cupoMaximo"));
                int esActivo = resultadosConsulta.getInt("estado");
                if (esActivo == 1) {
                    proyecto.setEsActivo(true);
                } else {
                    proyecto.setEsActivo(false);
                }
                Organizacion organizacion = new Organizacion();
                organizacion.setIdOrganizacion(resultadosConsulta.getInt("idOrganizacion"));

                proyecto.setOrganizacion(organizacion);
            }

            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return proyecto;
    }


    @Override
    public boolean eliminarProyecto(int idProyecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarProyecto(Proyecto proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
