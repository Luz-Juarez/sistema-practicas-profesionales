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
import spp.logicadenegocio.clasesdto.Profesor;

/**
 *
 * @author Luz Fernanda H J
 */
public class ProfesorDAO extends UsuarioDAO {
    
    public boolean registrarProfesor(Profesor profesor){
        boolean resultado = false;
        try {

            Connection conexion = ConexionBD.conectar();

            String consultaSQL = """
                INSERT INTO PROFESOR (idUsuario, noPersonal) VALUES (?, ?)""";

            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, profesor.getIdUsuario());
            preparedStatement.setString(2, profesor.getNoPersonal());
            
            preparedStatement.executeUpdate();
            
            resultado = true;

            conexion.close();
            preparedStatement.close();


        } catch (SQLException e) {
            System.out.println("Error");
        }
        return resultado;
    }
     
    public void consultarProfesor(Profesor profesor) {
        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT idUsuario, noPersonal FROM PROFESOR WHERE noPersonal = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setString(1, profesor.getNoPersonal());
            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {
                System.out.println("ID: " + results.getInt("idUsuario"));
                System.out.println("No. Personal: " + results.getString("noPersonal"));
            } else {
                System.out.println("No se encontró el profesor");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
    
    
}
