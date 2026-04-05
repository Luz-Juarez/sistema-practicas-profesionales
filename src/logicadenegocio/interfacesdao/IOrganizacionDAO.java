/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logicadenegocio.interfacesdao;

import logicadenegocio.clasesdto.Organizacion;

/**
 *
 * @author gomes
 */
public interface IOrganizacionDAO {
    public boolean registrarOrganizacion(Organizacion organizacion);
    public Organizacion consultarOrganizacion();
    public boolean eliminarOrganizacion();
    public boolean actualizarOrganizacion(Organizacion organizacion);
}
