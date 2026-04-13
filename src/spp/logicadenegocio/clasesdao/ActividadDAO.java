/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.sql.SQLException;
import spp.accesoadatos.ConexionBD;
import spp.logicadenegocio.clasesdto.Actividad;
import spp.logicadenegocio.interfacesdao.IActividadDAO;

/**
 *
 * @author gomes
 */
public class ActividadDAO implements IActividadDAO{

    @Override
    public boolean registrarActividad(Actividad actividad) throws SQLException {
        
        boolean registroExitoso = false;
        
        String consultaSQL = """
                INSERT INTO Actividad 
                (titulo, descripcion, fechaLimite) VALUES (?, ?, ?)""";
        
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada 
            = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setString(1,actividad.getTitulo());
            consultaPreparada.setString(2,actividad.getDescripcion());
            consultaPreparada.setObject(3,actividad.getFechaLimite());
            
            consultaPreparada.executeUpdate();
            registroExitoso = true;
        }
        
    return registroExitoso;
    
    }

    @Override
    public Actividad consultarActividad(String titulo) {
        
        Actividad actividad = null;
        
        String consultaSQL = "SELECT idActividad, titulo, descripcion, fechaLimite "
                + "FROM Actividad WHERE titulo = ? ";
        
        
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setString(1,titulo); 
            
            try(ResultSet resultadosConsulta = consultaPreparada.executeQuery();){
                if(resultadosConsulta.next() ){
                    
                actividad = new Actividad();
                
                actividad.setIdActividad(resultadosConsulta.getInt("idActividad"));
                actividad.setTitulo(resultadosConsulta.getString("titulo"));
                actividad.setDescripcion(resultadosConsulta.getString("descripcion"));
                actividad.setFechaLimite(resultadosConsulta.getObject("fechaLimite",LocalDateTime.class));
                
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    return actividad;
    
    }

    @Override
    public boolean eliminarActividad(String titulo) {
        
        boolean eliminacionExitosa = false;
        
        String consultaSQL = "DELETE FROM Actividad WHERE titulo = ?";
        
         try(Connection conexion = ConexionBD.getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {
            
            consultaPreparada.setString(1, titulo);
            
            int filasAfectadas = consultaPreparada.executeUpdate();
            if(filasAfectadas > 0 ){
                eliminacionExitosa = true;
            }
             
         }catch(Exception e){
             
         }
        
    return eliminacionExitosa; 
    
    }

    @Override
    public boolean actualizarActividad(Actividad actividad) {
        
        boolean actualizacionExitosa = false;
        
        String consultaSQL = "UPDATE Actividad SET titulo = ?, descripcion = ?, "
                + "fechaLimite = ?  WHERE titulo = ?";
        
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL)) {
            
            consultaPreparada.setString(1, actividad.getTitulo());
            consultaPreparada.setString(2, actividad.getDescripcion());
            consultaPreparada.setObject(3, actividad.getFechaLimite());
            
            int filasAfectadas = consultaPreparada.executeUpdate();
            if(filasAfectadas > 0){
                actualizacionExitosa = true;
            }
            
        }catch(Exception e){
            
        }
        return actualizacionExitosa;
    }
    
}
