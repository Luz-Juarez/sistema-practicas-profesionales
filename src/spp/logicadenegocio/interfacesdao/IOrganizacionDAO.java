/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Organizacion;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IOrganizacionDAO {
    public boolean registrarOrganizacion(Organizacion organizacion) throws AccesoADatosExcepcion;
    public Organizacion consultarOrganizacion(int idOrganizacion)throws AccesoADatosExcepcion;
    public boolean eliminarOrganizacion(int idOrganizacion)throws AccesoADatosExcepcion;
    public boolean actualizarOrganizacion(Organizacion organizacion)throws AccesoADatosExcepcion;
}
