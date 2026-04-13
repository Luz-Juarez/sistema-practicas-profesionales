/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import spp.logicadenegocio.clasesdto.Mensaje;
import spp.logicadenegocio.interfacesdao.IMensajeDAO;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public class MensajeDAO implements IMensajeDAO{

    @Override
    public boolean registrarMensaje(Mensaje mensaje) throws AccesoADatosExcepcion{
        throw new UnsupportedOperationException("No implementada aún."); 
    }

    @Override
    public Mensaje consultarMensaje() throws AccesoADatosExcepcion{
        throw new UnsupportedOperationException("No implementada aún."); 
    }
}
