/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import spp.accesoadatos.ConexionBD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import spp.logicadenegocio.clasesdto.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author Luz Fernanda H J
 */
public class UsuarioDAO {
    public int registrarUsuario(Usuario usuario){
        boolean resultado = false;
        try {

            Connection conexion = ConexionBD.conectar();

            String consultaSQL = """
                INSERT INTO USUARIO (nombre, apellidos, contrasena, estado) VALUES (?, ?, ?, ?)""";

            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL,Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getApellidos());
            preparedStatement.setString(3, usuario.getContraseña());
            preparedStatement.setBoolean(4, usuario.getEsActivo());

            preparedStatement.executeUpdate();
            
            ResultSet results = preparedStatement.getGeneratedKeys();

            if (results.next()) {
                int idGenerado = results.getInt(1);
                usuario.setIdUsuario(idGenerado);
            }

            resultado = true;

            conexion.close();
            results.close();
            preparedStatement.close();


        } catch (SQLException e) {
            System.out.println("Error");
        }
        if(resultado){
            return usuario.getIdUsuario();
        }else{
            return 0;
        }
    }
    
    public void consultarUsuario(Usuario usuario) {
        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT idUsuario, nombre, apellidos, estado FROM USUARIO WHERE idUsuario = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, usuario.getIdUsuario());
            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {
                System.out.println("ID: " + results.getInt("idUsuario"));
                System.out.println("Nombre: " + results.getString("nombre"));
                System.out.println("Apellidos: " + results.getString("apellidos"));
                System.out.println("Estado: " + results.getBoolean("estado"));
            } else {
                System.out.println("No se encontró el usuario");
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
    
}
