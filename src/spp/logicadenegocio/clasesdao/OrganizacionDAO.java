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
import spp.logicadenegocio.interfacesdao.IOrganizacionDAO;


/**
 *
 * @author Luz Fernanda H J
 */
public class OrganizacionDAO implements IOrganizacionDAO{
    
    @Override
    public boolean registrarOrganizacion(Organizacion organizacion){
        boolean resultado = false;
        String consultaSQL = """
                INSERT INTO ORGANIZACION (nombre, direccion, sector, estado) VALUES (?, ?, ?, ?, ?, ?)""";
        try (Connection conexion = ConexionBD.getConnection(); 
             PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);){
            
            preparedStatement.setString(1, organizacion.getNombre());
            preparedStatement.setString(2, organizacion.getDireccion());
            preparedStatement.setString(3, organizacion.getSector());
            preparedStatement.setBoolean(4, organizacion.esActivo());
            
            preparedStatement.executeUpdate();
            
            resultado = true;
        } catch (Exception e) {
            System.out.println("Error");
        }
        return resultado;
    }
    
    @Override
    public Organizacion consultarOrganizacion(int idOrganizacion) {

        Organizacion organizacion = null;
        String consultaSQL = "SELECT * FROM ORGANIZACION WHERE idOrganizacion = ?";
        
        try (Connection conexion = ConexionBD.getConnection();
             PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);){
            
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

        } catch (Exception e) {
            e.printStackTrace();
        }

        return organizacion;
    }

    @Override
    public boolean eliminarOrganizacion(int idOrganizacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarOrganizacion(Organizacion organizacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
