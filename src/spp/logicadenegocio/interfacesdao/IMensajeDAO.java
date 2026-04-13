/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Mensaje;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IMensajeDAO {
    public boolean registrarMensaje(Mensaje mensaje)throws AccesoADatosExcepcion;
    public Mensaje consultarMensaje()throws AccesoADatosExcepcion;
}
