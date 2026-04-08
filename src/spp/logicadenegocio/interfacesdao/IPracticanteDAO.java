/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Practicante;

/**
 *
 * @author gomes
 */
public interface IPracticanteDAO {
    public boolean registrarPracticante(Practicante practicante);
    public Practicante consultarPracticante();
    public boolean eliminarPracticante();
    public boolean actualizarPracticante(Practicante practicante);
}
