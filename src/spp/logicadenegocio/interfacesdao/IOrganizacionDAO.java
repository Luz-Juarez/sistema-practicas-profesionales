/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Organizacion;

/**
 *
 * @author gomes
 */
public interface IOrganizacionDAO {
    public boolean registrarOrganizacion(Organizacion organizacion);
    public Organizacion consultarOrganizacion(int idOrganizacion);
    public boolean eliminarOrganizacion(int idOrganizacion);
    public boolean actualizarOrganizacion(Organizacion organizacion);
}
