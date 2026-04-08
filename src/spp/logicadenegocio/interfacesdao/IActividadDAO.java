/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Actividad;

/**
 *
 * @author gomes
 */
public interface IActividadDAO {
    public boolean registrarActividad(Actividad actividad);
    public Actividad consultarActividad();
    public boolean eliminarActividad();
    public boolean actualizarActividad(Actividad actividad);
}
