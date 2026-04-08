/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Documento;

/**
 *
 * @author gomes
 */
public interface IDocumentoDAO {
    public void registrarDocumento(Documento documento);
    public Documento consultarDocumento();
}
