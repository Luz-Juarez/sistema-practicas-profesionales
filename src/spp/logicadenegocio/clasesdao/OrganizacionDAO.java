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
    public boolean registrarOrganizacion(Organizacion organizacion) throws SQLException{
        boolean registroExitoso = false;
        String consultaSQL = """
                INSERT INTO Organizacion(idOrganización, nombre, direccion, sector, estado) 
                             VALUES (?, ?, ?, ?, ?)""";
        try (Connection conexion = ConexionBD.getConexion(); 
             PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setInt(1, organizacion.getIdOrganizacion());
            consultaPreparada.setString(2, organizacion.getNombre());
            consultaPreparada.setString(3, organizacion.getDireccion());
            consultaPreparada.setString(4, organizacion.getSector());
            consultaPreparada.setBoolean(5, organizacion.getEsActivo());
           
            consultaPreparada.executeUpdate();
            
            registroExitoso = true;
        }
        
        /*
        catch( nombredelaexception e){
            throw new nombredelaexception("Mensaje",e); 
            //excepcion personalizada donde solo se 
        } 
        */
        return registroExitoso;
    }
    
    @Override
    public Organizacion consultarOrganizacion(int idOrganizacion)throws SQLException {

        Organizacion organizacion = null;
        String consultaSQL = "SELECT * FROM ORGANIZACION WHERE idOrganizacion = ?";
        
        try (Connection conexion = ConexionBD.getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setInt(1, idOrganizacion);

            ResultSet resultadosConsulta = consultaPreparada.executeQuery();

            if (resultadosConsulta.next()) {

                organizacion = new Organizacion();

                organizacion.setIdOrganizacion(resultadosConsulta.getInt("idOrganizacion"));
                organizacion.setNombre(resultadosConsulta.getString("nombre"));
                organizacion.setDireccion(resultadosConsulta.getString("direccion"));
                organizacion.setSector(resultadosConsulta.getString("sector"));

                int esActivo = resultadosConsulta.getInt("estado");
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
    public boolean eliminarOrganizacion(int idOrganizacion)throws SQLException {
        boolean eliminacionExitosa = false;

        String consultaSQL = "DELETE FROM Organizacion WHERE idOrganizacion = ?";

        try (Connection conexion = ConexionBD.getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {

            consultaPreparada.setInt(1, idOrganizacion);

            int filasAfectadas = consultaPreparada.executeUpdate();

            if (filasAfectadas > 0) {
                eliminacionExitosa = true;
            }
        }catch(Exception e){
            
        }

        return eliminacionExitosa; 

    }

    @Override
    public boolean actualizarOrganizacion(Organizacion organizacion) throws SQLException{
        boolean actualizacionExitosa = false;

        String consultaSQL = "UPDATE Organizacion SET nombre = ?, direccion = ?, "
                + "sector = ?, estado = ?"
                + "WHERE idOrganizacion = ? ";

        try (Connection conexion = ConexionBD.getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {

            consultaPreparada.setString(1, organizacion.getNombre());
            consultaPreparada.setString(2, organizacion.getDireccion());
            consultaPreparada.setString(3, organizacion.getSector());
            consultaPreparada.setBoolean(4, organizacion.getEsActivo());
            consultaPreparada.setInt(5, organizacion.getIdOrganizacion());

            int filasAfectadas = consultaPreparada.executeUpdate();

            if (filasAfectadas > 0) {
                actualizacionExitosa = true;
            }
        }catch(Exception e){
            
        }

        return actualizacionExitosa;
    }

    
}
