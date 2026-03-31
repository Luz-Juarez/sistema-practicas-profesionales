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


/**
 *
 * @author Luz Fernanda H J
 */
public class OrganizacionDAO {
    
    public boolean registrarOrganizacion(Organizacion organizacion){
        boolean resultado = false;
        try {

            Connection conexion = ConexionBD.conectar();

            String consultaSQL = """
                INSERT INTO ORGANIZACION (nombre, direccion, sector, estado) VALUES (?, ?, ?, ?, ?, ?)""";

            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setString(1, organizacion.getNombre());
            preparedStatement.setString(2, organizacion.getDireccion());
            preparedStatement.setString(3, organizacion.getSector());
            preparedStatement.setBoolean(4, organizacion.esActivo());
            
            preparedStatement.executeUpdate();
            
            resultado = true;

            conexion.close();
            preparedStatement.close();


        } catch (SQLException e) {
            System.out.println("Error");
        }
        return resultado;
    }
    public void consultarOrganizacion(Organizacion organizacion) {
        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT * FROM ORGANIZACION WHERE idOrganizacion = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, organizacion.getIdOrganizacion());
            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {
                
                System.out.println("Id Organizacion: " + results.getInt("idOrganizacion"));
                System.out.println("Nombre: " + results.getString("nombre"));
                System.out.println("Direccion: " + results.getString("direccion"));
                System.out.println("Sector: " + results.getString("sector"));
                int esActivo = results.getInt("estado");
                if(esActivo==1){
                    System.out.println("¿Esta activo? : Si" );
                }else{
                    System.out.println("¿Esta activo? : No");
                }
                
            } else {
                System.out.println("No se encontró la organizacion");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
    
}
