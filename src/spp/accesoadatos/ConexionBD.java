/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.accesoadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import spp.utilerias.ConfiguracionBaseDatos;

/**
 *
 * @author Luz Fernanda H J
 */
public class ConexionBD {
        
    public static Connection getConnection() throws Exception{
        String URL = ConfiguracionBaseDatos.get("db.url");
        String USUARIO = ConfiguracionBaseDatos.get("db.usuario");
        String CONTRASENIA = ConfiguracionBaseDatos.get("db.contrasenia");
        
        return DriverManager.getConnection(URL,USUARIO, CONTRASENIA);
    }
}
