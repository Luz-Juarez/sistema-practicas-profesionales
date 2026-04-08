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
import spp.logicadenegocio.clasesdto.Practicante;
import spp.logicadenegocio.interfacesdao.IPracticanteDAO;

/**
 *
 * @author Luz Fernanda H J
 */
public class PracticanteDAO extends UsuarioDAO implements IPracticanteDAO{
    
    @Override
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
            e.printStackTrace();
        }
        return resultado;
    }
     
    @Override
    public Practicante consultarPracticante(String matricula) {

        Practicante practicante = null;

        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT idUsuario, matricula FROM PRACTICANTE WHERE matricula = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setString(1, matricula);

            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {

                practicante = new Practicante();

                practicante.setIdUsuario(results.getInt("idUsuario"));
                practicante.setMatricula(results.getString("matricula"));

            }

            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return practicante;
    }

    @Override
    public boolean eliminarPracticante(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarPracticante(Practicante practicante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
