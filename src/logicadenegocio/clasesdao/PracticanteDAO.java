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
import logicadenegocio.clasesdto.Practicante;

/**
 *
 * @author Luz Fernanda H J
 */
public class PracticanteDAO extends UsuarioDAO{
    
    public boolean registrarPracticante(Practicante practicante){
        boolean resultado = false;
        try {

            Connection conexion = ConexionBD.conectar();

            String consultaSQL = """
                INSERT INTO PRACTICANTE (idUsuario, matricula, genero, lenguaIndigena, fechaNacimiento) VALUES (?, ?)""";

            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

            preparedStatement.setInt(1, practicante.getIdUsuario());
            preparedStatement.setString(2, practicante.getMatricula());
            preparedStatement.setString(3, practicante.getGenero());
            preparedStatement.setBoolean(4, practicante.gethablaLenguaIndigena());
            // Convertimos el java.util.Date a java.sql.Date
            java.sql.Date fechaParaBD = new java.sql.Date(practicante.getFechaNacimiento().getTime());
            preparedStatement.setDate(5, fechaParaBD);
            
            
            preparedStatement.executeUpdate();
            
            resultado = true;

            conexion.close();
            preparedStatement.close();


        } catch (SQLException e) {
            System.out.println("Error");
        }
        return resultado;
    }
     
    public void consultarPracticante(Practicante practicante) {
        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT idUsuario, matricula FROM PRACTICANTE WHERE matricula = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setString(1, practicante.getMatricula());
            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {
                System.out.println("ID: " + results.getInt("idUsuario"));
                System.out.println("Matricula: " + results.getString("matricula"));
            } else {
                System.out.println("No se encontró el practicante");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
    
}
