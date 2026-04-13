/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Profesor;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IProfesorDAO {
    public boolean registrarProfesor(Profesor profesor)throws AccesoADatosExcepcion;
    public Profesor consultarProfesor(String numeroDePersonal)throws AccesoADatosExcepcion;
    public boolean eliminarProfesor(String numeroDePersonal)throws AccesoADatosExcepcion;
    public boolean actualizarProfesor(Profesor profesor)throws AccesoADatosExcepcion;
}
