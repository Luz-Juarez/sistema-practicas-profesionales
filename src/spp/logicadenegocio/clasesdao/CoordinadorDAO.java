/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import spp.logicadenegocio.clasesdto.Coordinador;
import spp.logicadenegocio.interfacesdao.ICoordinadorDAO;
import spp.accesoadatos.ConexionBD;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author gomes
 */
public class CoordinadorDAO implements ICoordinadorDAO {

    @Override
    public boolean registrarCoordinador(Coordinador coordinador) { 
        boolean registroExitoso = false;
        String consultaSQL = "INSERT INTO Coordinador (noPersonal) VALUES (?)";
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setString(1,coordinador.getNumeroDePersonal());
            consultaPreparada.executeUpdate();
            registroExitoso=true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return registroExitoso;
    }

    @Override
    public Coordinador consultarCoordinador(String numeroDePersonal) {
        Coordinador coordinador = null;
        String consultaSQL = "SELECT idUsuario, noPersonal FROM Coordinador WHERE "
                + "noPersonal = ?";
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement
            (consultaSQL);){
            
            consultaPreparada.setString(1, numeroDePersonal);
            try(ResultSet resultadosConsulta = consultaPreparada.executeQuery();){
                if(resultadosConsulta.next() ){
                    coordinador = new Coordinador();
                    coordinador.setNumeroDePersonal
                    (resultadosConsulta.getString("noPersonal"));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return coordinador;
    }
    @Override
    public boolean eliminarCoordinador(String numeroDePersonal) {
        boolean eliminacionExitosa = false;
        String consultaSQL = "DELETE FROM Coordinador WHERE noPersonal = ?";
        try(Connection conexion = ConexionBD.getConexion();
            PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setString(1, numeroDePersonal);
            int filasAfectadas = consultaPreparada.executeUpdate();
            if(filasAfectadas > 0){
                eliminacionExitosa = true;
            }
            
        }catch(Exception e){
            
        }
        
        return eliminacionExitosa;
    }

    @Override
    public boolean actualizarCoordinador(Coordinador coordinador) {
        boolean actualizacionExitosa = false;
        String consultaSQL = "UPDATE Coordinador SET noPersonal";
        try(Connection conexion = ConexionBD.getConexion();
             PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL);){
            
            consultaPreparada.setString(1, coordinador.getNumeroDePersonal());
            
            int filasAfectadas = consultaPreparada.executeUpdate();
            if(filasAfectadas > 0){
                actualizacionExitosa = true;
            }
        }catch(Exception e){
           
        }
        return actualizacionExitosa;
    }
    
}
