/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spp.grafica.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import spp.logicadenegocio.clasesdao.ActividadDAO;
import spp.logicadenegocio.clasesdao.ProfesorDAO;
import spp.logicadenegocio.clasesdao.UsuarioDAO;
import spp.logicadenegocio.clasesdto.Actividad;
import spp.logicadenegocio.clasesdto.Profesor;
import spp.logicadenegocio.clasesdto.Usuario;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;


/**
 *
 * @author Luz Fernanda H J
 */
public class SistemaPracticasProfesionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
            
            ActividadDAO actividaddao = new ActividadDAO();
            Actividad actividad = new Actividad();
            Usuario usuario = new Usuario();
            Profesor profesor = new Profesor();
            UsuarioDAO usuariodao = new UsuarioDAO();
            ProfesorDAO profesordao = new ProfesorDAO();

            usuario.setNombre("Jorge Octavio");
            usuario.setApellidos("Ocharan Hernandez");
            usuario.setContraseña("password");
            usuario.setEsActivo(true);

            usuariodao.registrarUsuario(usuario);

            profesor.setIdUsuario(1);
            profesor.setNumeroDePersonal("p2401");

            profesordao.registrarProfesor(profesor);

            actividad.setTitulo("Actividad 1");
            actividad.setDescripcion("Actividad para la definición de estándar");
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime fechaFormateada = LocalDateTime.parse("25-10-2023 14:30", formatoFecha);
            actividad.setFechaLimite(fechaFormateada);
            actividad.setProfesor(profesor);

            actividaddao.registrarActividad(actividad);
            System.out.println("Actividad registrada correctamente");
        
        }catch(OperacionesDeDaoExcepcion e){
            System.out.println("Error: No se pudo registrar la actividad"+ e);
        }
    }
    
}
