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
    
    public Organizacion consultarOrganizacion(int idOrganizacion) {

        Organizacion organizacion = null;

        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT * FROM ORGANIZACION WHERE idOrganizacion = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, idOrganizacion);

            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {

                organizacion = new Organizacion();

                organizacion.setIdOrganizacion(results.getInt("idOrganizacion"));
                organizacion.setNombre(results.getString("nombre"));
                organizacion.setDireccion(results.getString("direccion"));
                organizacion.setSector(results.getString("sector"));

                int esActivo = results.getInt("estado");
                if (esActivo == 1) {
                    organizacion.setEsActivo(true);
                } else {
                    organizacion.setEsActivo(false);
                }

            }

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return organizacion;
    }

    
}
