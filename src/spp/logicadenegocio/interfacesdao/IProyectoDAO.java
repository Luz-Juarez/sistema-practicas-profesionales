/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Proyecto;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IProyectoDAO {
    public boolean registrarProyecto(Proyecto proyecto)throws AccesoADatosExcepcion;
    public Proyecto consultarProyecto(int idProyecto)throws AccesoADatosExcepcion;
    public boolean eliminarProyecto(int idProyecto)throws AccesoADatosExcepcion;
    public boolean actualizarProyecto(Proyecto proyecto)throws AccesoADatosExcepcion;
}
