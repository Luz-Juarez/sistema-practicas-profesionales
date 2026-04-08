/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadenegocio.clasesdao;

import accesoadatos.ConexionBD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import logicadenegocio.clasesdto.Usuario;
import java.sql.ResultSet;
import logicadenegocio.interfacesdao.IUsuarioDAO;

/**
 *
 * @author Luz Fernanda H J
 */
public class UsuarioDAO implements IUsuarioDAO {
    
    @Override
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
            e.printStackTrace();
        }
        if(resultado){
            return usuario.getIdUsuario();
        }else{
            return 0;
        }
    }
    
    @Override
    public Usuario consultarUsuario(int idUsuario) {

        Usuario usuario = null;

        try {
            Connection conexion = ConexionBD.conectar();
            String consultaSQL = "SELECT idUsuario, nombre, apellidos, estado FROM USUARIO WHERE idUsuario = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);
            preparedStatement.setInt(1, idUsuario);

            ResultSet results = preparedStatement.executeQuery();

            if (results.next()) {

                usuario = new Usuario();

                usuario.setIdUsuario(results.getInt("idUsuario"));
                usuario.setNombre(results.getString("nombre"));
                usuario.setApellidos(results.getString("apellidos"));

                int esActivo = results.getInt("estado");
                if (esActivo == 1) {
                    usuario.setEsActivo(true);
                } else {
                    usuario.setEsActivo(false);
                }

            } 
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    return usuario;
}

    @Override
    public boolean eliminarUsuario(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
