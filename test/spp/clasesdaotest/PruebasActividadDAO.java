/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.clasesdaotest;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import spp.logicadenegocio.clasesdao.ActividadDAO;
import spp.logicadenegocio.clasesdto.Actividad;
import spp.logicadenegocio.clasesdto.Profesor;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;


/**
 *
 * @author Luz Fernanda H J
 */
public class PruebasActividadDAO {
    @Test 
    public void pruebaRegistrarActividadDAOExitosa() throws OperacionesDeDaoExcepcion{
        
        Actividad actividad = new Actividad();
        ActividadDAO actividadDao = new ActividadDAO();
        Profesor profesor = new Profesor();
        
        actividad.setTitulo("Actividad 1");
        actividad.setDescripcion("Actividad para la definición de estándar");
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime fechaFormateada = LocalDateTime.parse("25-10-2023 14:30", formatoFecha);
        actividad.setFechaLimite(fechaFormateada);
        profesor.setIdUsuario(1);
        actividad.setProfesor(profesor);
        
        boolean registroExitoso = actividadDao.registrarActividad(actividad);
        assertTrue("Registro de actividad exitoso es: ",registroExitoso);
    }
}
