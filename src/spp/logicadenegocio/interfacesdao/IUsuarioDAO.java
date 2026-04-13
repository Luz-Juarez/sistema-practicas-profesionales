/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Usuario;
import spp.utilerias.excepciones.AccesoADatosExcepcion;

/**
 *
 * @author gomes
 */
public interface IUsuarioDAO {
    public int registrarUsuario(Usuario usuario)throws AccesoADatosExcepcion;
    public Usuario consultarUsuario(int idUsuario)throws AccesoADatosExcepcion;
    public boolean eliminarUsuario(int idUsuario)throws AccesoADatosExcepcion;
    public boolean actualizarUsuario(Usuario usuario)throws AccesoADatosExcepcion;
}
