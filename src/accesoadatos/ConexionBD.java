/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luz Fernanda H J
 */
public class ConexionBD {
        
    private static final String URL = "jdbc:mysql://localhost:3306/SistemaPracticasProfesionales";
    private static final String USUARIO = "administrador";
    private static final String CONTRASENIA = "administradorfei9";
    //esto debe cambiar, debe extraerse de un archivo externo
    
    public static Connection conectar() throws SQLException {
        try {
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            //System.out.println(" Conexión correcta con BD");
            return conexion;
        } catch (SQLException e) {
            System.err.println(" Error al conectar con la BD");
            System.err.println("  Mensaje: " + e.getMessage());
            throw e; // Relanzamos para que el llamador sepa que falló
        }
    }
}
