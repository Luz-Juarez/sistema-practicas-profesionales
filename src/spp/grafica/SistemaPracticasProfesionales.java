/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spp.grafica;


import spp.logicadenegocio.clasesdao.OrganizacionDAO;
import spp.logicadenegocio.clasesdto.Organizacion;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import spp.logicadenegocio.clasesdao.ActividadDAO;
import spp.logicadenegocio.clasesdto.Actividad;
import spp.utilerias.excepciones.AccesoADatosExcepcion;




/**
 *
 * @author Luz Fernanda H J
 */
public class SistemaPracticasProfesionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        OrganizacionDAO organizaciondao = new OrganizacionDAO(); 
        Organizacion organizacion = new Organizacion();
        
        organizacion.setIdOrganizacion(2);
        organizacion.setNombre("McDonalds");
        organizacion.setSector("Privado");
        organizacion.setDireccion("Av.Orizaba");
        organizacion.setEsActivo(true);
         
        try{
            organizaciondao.registrarOrganizacion(organizacion);
            System.out.println("Organización registrada correctamente.");
        }catch(SQLException e){
            System.out.println("Error al registrar la organizacion");
        }finally{
            
        }
*/
        ActividadDAO actividaddao = new ActividadDAO();
        Actividad actividad = new Actividad();
        
        actividad.setIdActividad(1);
        actividad.setTitulo("Actividad 1");
        actividad.setDescripcion("Actividad para la definición de estándar");
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime fechaFormateada = LocalDateTime.parse("25-10-2023 14:30", formatoFecha);
        actividad.setFechaLimite(fechaFormateada);
        actividad.setProfesor(null);
        
        try{
            actividaddao.registrarActividad(actividad);
            System.out.println("Actividad registrada correctamente");
        }catch(AccesoADatosExcepcion e){
            System.out.println("Error: No se pudo registrar la actividad"+ e);
        }
    }
    
}
