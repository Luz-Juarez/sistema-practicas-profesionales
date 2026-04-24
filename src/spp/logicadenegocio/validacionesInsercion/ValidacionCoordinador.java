/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.validacionesInsercion;

import spp.grafica.pantallas.coordinador.GuiRegistroExitoso;
import spp.logicadenegocio.clasesdao.CoordinadorDAO;
import spp.logicadenegocio.clasesdao.UsuarioDAO;
import spp.logicadenegocio.clasesdto.Coordinador;
import spp.logicadenegocio.clasesdto.Usuario;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;

/**
 *
 * @author Luz Fernanda H J
 */
public class ValidacionCoordinador {
    public void insertarCoordinador(Coordinador coordinador){
        Usuario usuario = new Usuario();
                
        usuario.setNombre(coordinador.getNombre());
        usuario.setApellidos(coordinador.getApellidos());
        usuario.setContraseña("password");
        usuario.setEsActivo(true);
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        CoordinadorDAO coordinadorDao = new CoordinadorDAO();
        try{
            int idUsuario = usuarioDao.registrarUsuario(usuario);
            coordinador.setIdUsuario(idUsuario);
            coordinadorDao.registrarCoordinador(coordinador);
            GuiRegistroExitoso registroExitoso = new GuiRegistroExitoso();
            registroExitoso.setVisible(true);
        }catch(OperacionesDeDaoExcepcion e){
            System.out.println("insertar da error en " + e);
        }
    }
}
