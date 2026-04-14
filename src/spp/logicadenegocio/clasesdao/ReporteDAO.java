/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdao;

import spp.logicadenegocio.clasesdto.Reporte;
import spp.logicadenegocio.interfacesdao.IReporteDAO;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;

/**
 *
 * @author gomes
 */
public class ReporteDAO implements IReporteDAO{

    @Override
    public boolean registarReporte(Reporte reporte)throws OperacionesDeDaoExcepcion {
        throw new UnsupportedOperationException("No implementada aún."); 
    }

    @Override
    public Reporte consultarReporte()throws OperacionesDeDaoExcepcion {
        throw new UnsupportedOperationException("No implementada aún."); 
    }
    
}
