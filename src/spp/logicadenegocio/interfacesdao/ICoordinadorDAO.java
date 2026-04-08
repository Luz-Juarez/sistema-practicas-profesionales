/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Coordinador;

/**
 *
 * @author gomes
 */
public interface ICoordinadorDAO {
    public boolean registrarCoordinador(Coordinador coordinador);
    public Coordinador consultarCoordinador(String noPersonal);
    public boolean eliminarCoordinador(String noPersonal);
    public boolean actualizarOrganizacion(Coordinador coordinador);       
}
