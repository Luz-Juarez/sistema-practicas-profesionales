/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Actividad;
import java.sql.SQLException; 
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IActividadDAO {
    public boolean registrarActividad(Actividad actividad) throws AccesoADatosExcepcion;
    public Actividad consultarActividad(String titulo) throws SQLException;
    public boolean eliminarActividad(String titulo)throws SQLException;
    public boolean actualizarActividad(Actividad actividad)throws SQLException;
}
