/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.utilerias;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Luz Fernanda H J
 */
public class ConfiguracionBaseDatos {
    private static Properties propiedades = new Properties();
    
    static{ 
        try{
            InputStream entrada = ConfiguracionBaseDatos.class
                    .getClassLoader()
                    .getResourceAsStream("recursos/baseDatos.properties");
            
            if(entrada == null){
                throw new RuntimeException("No se encontró db.properties");
            }
            
            propiedades.load(entrada);
        }catch (Exception e) {
            throw new RuntimeException("Error cargando configuracion",e);
        }
    }    
    public static String get(String key){
        return propiedades.getProperty(key);
    }
}