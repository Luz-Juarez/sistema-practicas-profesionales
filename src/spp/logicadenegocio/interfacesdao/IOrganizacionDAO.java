/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Organizacion;
import java.sql.SQLException;

/**
 *
 * @author gomes
 */
public interface IOrganizacionDAO {
    public boolean registrarOrganizacion(Organizacion organizacion) throws SQLException;
    public Organizacion consultarOrganizacion(int idOrganizacion)throws SQLException;
    public boolean eliminarOrganizacion(int idOrganizacion)throws SQLException;
    public boolean actualizarOrganizacion(Organizacion organizacion)throws SQLException;
}
