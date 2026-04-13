/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Practicante;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IPracticanteDAO {
    public boolean registrarPracticante(Practicante practicante)throws AccesoADatosExcepcion;
    public Practicante consultarPracticante(String matricula)throws AccesoADatosExcepcion;
    public boolean eliminarPracticante(String matricula)throws AccesoADatosExcepcion;
    public boolean actualizarPracticante(Practicante practicante)throws AccesoADatosExcepcion;
}
