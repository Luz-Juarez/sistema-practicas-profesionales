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
import spp.logicadenegocio.interfacesdao.IProfesorDAO;

/**
 *
 * @author Luz Fernanda H J
 */
public class ProfesorDAO extends UsuarioDAO implements IProfesorDAO{
    
    @Override
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
            e.printStackTrace();
        }
        return resultado;
    }
    
    @Override
    public Profesor consultarProfesor(String noPersonal) {

         Profesor profesor = null;

         try {
             Connection conexion = ConexionBD.conectar();
             String consultaSQL = "SELECT idUsuario, noPersonal FROM PROFESOR WHERE noPersonal = ?";
             PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
             preparedStatement.setString(1, noPersonal);

             ResultSet results = preparedStatement.executeQuery();

             if (results.next()) {

                 profesor = new Profesor();

                 profesor.setIdUsuario(results.getInt("idUsuario"));
                 profesor.setNoPersonal(results.getString("noPersonal"));

             }

             conexion.close();

         } catch (SQLException e) {
             e.printStackTrace();
         }

         return profesor;
    }

    @Override
    public boolean eliminarProfesor(String noPersonal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       
}
