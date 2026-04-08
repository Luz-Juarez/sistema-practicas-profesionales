/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Profesor;

/**
 *
 * @author gomes
 */
public interface IProfesorDAO {
    public boolean registrarProfesor(Profesor profesor);
    public Profesor consultarProfesor(String noPersonal);
    public boolean eliminarProfesor(String noPersonal);
    public boolean actualizarProfesor(Profesor profesor);
}
