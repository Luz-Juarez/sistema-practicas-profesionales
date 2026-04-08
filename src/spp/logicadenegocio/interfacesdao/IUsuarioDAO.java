/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import spp.logicadenegocio.clasesdto.Usuario;

/**
 *
 * @author gomes
 */
public interface IUsuarioDAO {
    public boolean registrarUsuario(Usuario usuario);
    public Usuario consultarUsuario();
    public boolean eliminarUsuario();
    public boolean actualizarUsuario(Usuario usuario);
}
