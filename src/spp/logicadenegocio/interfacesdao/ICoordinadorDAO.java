/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Coordinador;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface ICoordinadorDAO {
    public boolean registrarCoordinador(Coordinador coordinador)throws AccesoADatosExcepcion;
    public Coordinador consultarCoordinador(String numeroDePersonal)throws AccesoADatosExcepcion;
    public boolean eliminarCoordinador(String numeroDePersonal)throws AccesoADatosExcepcion;
    public boolean actualizarCoordinador(Coordinador coordinador)throws AccesoADatosExcepcion;       
}
