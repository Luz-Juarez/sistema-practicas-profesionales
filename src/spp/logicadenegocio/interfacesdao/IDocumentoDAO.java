/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Documento;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IDocumentoDAO {
    public boolean registrarDocumento(Documento documento)throws AccesoADatosExcepcion;
    public Documento consultarDocumento(String nombre)throws AccesoADatosExcepcion;
}
