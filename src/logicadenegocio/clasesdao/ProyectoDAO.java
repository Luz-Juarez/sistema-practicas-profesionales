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
import logicadenegocio.clasesdto.Proyecto;


/**
 *
 * @author Luz Fernanda H J
 */
public class ProyectoDAO {
    
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
            preparedStatement.setBoolean(5, proyecto.esActivo());
            preparedStatement.setInt(6, proyecto.getOrganizacion().getIdOrganizacion());
            
            preparedStatement.executeUpdate();
            
            resultado = true;

            conexion.close();
            preparedStatement.close();


        } catch (SQLException e) {
            System.out.println("Error");
        }
        return resultado;
    }
    
    public void consultarProyecto(Proyecto proyecto) {
        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT * FROM PROYECTO WHERE idProyecto = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, proyecto.getIdProyecto());
            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {
                
                System.out.println("Id Proyecto: " + results.getInt("idProyecto"));
                System.out.println("Nombre: " + results.getString("nombre"));
                System.out.println("Descripcion: " + results.getString("descripcion"));
                System.out.println("Nombre Responsable: " + results.getString("nombreResponsable"));
                System.out.println("Cupo Maximo: " + results.getInt("cupoMaximo"));
                int esActivo = results.getInt("estado");
                if(esActivo==1){
                    System.out.println("¿Esta activo? : Si" );
                }else{
                    System.out.println("¿Esta activo? : No");
                }
                System.out.println("Organizacion" + results.getInt("idOrganizacion"));
                
            } else {
                System.out.println("No se encontró el proyecto");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
    
}
