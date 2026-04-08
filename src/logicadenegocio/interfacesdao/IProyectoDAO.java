/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logicadenegocio.interfacesdao;

import logicadenegocio.clasesdto.Proyecto;

/**
 *
 * @author gomes
 */
public interface IProyectoDAO {
    public boolean registrarProyecto(Proyecto proyecto);
    public Proyecto consultarProyecto(int idProyecto);
    public boolean eliminarProyecto(int idProyecto);
    public boolean actualizarProyecto(Proyecto proyecto);
}
