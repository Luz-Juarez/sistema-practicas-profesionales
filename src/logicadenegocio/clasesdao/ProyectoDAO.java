/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadenegocio.clasesdao;

import accesoadatos.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logicadenegocio.clasesdto.Organizacion;
import logicadenegocio.clasesdto.Proyecto;
import logicadenegocio.interfacesdao.IProyectoDAO;


/**
 *
 * @author Luz Fernanda H J
 */
public class ProyectoDAO implements IProyectoDAO {
    
    @Override
    public boolean registrarProyecto(Proyecto proyecto){
        boolean resultado = false;
        try {

            Connection conexion = ConexionBD.conectar();

            String consultaSQL = """
                INSERT INTO PROYECTO (nombre, descripcion, nombreResponsable, cupoMaximo, estado, Organizacion_idOrganizacion) VALUES (?, ?, ?, ?, ?, ?)""";

            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, proyecto.getIdProyecto());
            preparedStatement.setString(2, proyecto.getDescripcion());
            preparedStatement.setString(3, proyecto.getNombreResponsable());
            preparedStatement.setInt(4, proyecto.getCupoMaximo());
            preparedStatement.setBoolean(5, proyecto.getEsActivo());
            preparedStatement.setInt(6, proyecto.getOrganizacion().getIdOrganizacion());
            
            preparedStatement.executeUpdate();
            
            resultado = true;

            conexion.close();
            preparedStatement.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
       
    @Override
    public Proyecto consultarProyecto(int idProyecto) {
        Proyecto proyecto = null;

        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT * FROM PROYECTO WHERE idProyecto = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, idProyecto);

            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {
                proyecto = new Proyecto();

                proyecto.setIdProyecto(results.getInt("idProyecto"));
                proyecto.setNombre(results.getString("nombre"));
                proyecto.setDescripcion(results.getString("descripcion"));
                proyecto.setNombreResponsable(results.getString("nombreResponsable"));
                proyecto.setCupoMaximo(results.getInt("cupoMaximo"));
                int esActivo = results.getInt("estado");
                if (esActivo == 1) {
                    proyecto.setEsActivo(true);
                } else {
                    proyecto.setEsActivo(false);
                }
                Organizacion organizacion = new Organizacion();
                organizacion.setIdOrganizacion(results.getInt("idOrganizacion"));

                proyecto.setOrganizacion(organizacion);
            }

            conexion.close();

        } catch (SQLException e) {
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
