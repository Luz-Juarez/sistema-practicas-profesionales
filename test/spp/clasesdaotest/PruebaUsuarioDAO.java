/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.clasesdaotest;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import spp.logicadenegocio.clasesdao.UsuarioDAO;
import spp.logicadenegocio.clasesdto.Usuario;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;

/**
 *
 * @author Luz Fernanda H J
 */
public class PruebaUsuarioDAO {
    
    @Test
    public void pruebaInsertarUsuarioDaoExitosa()throws OperacionesDeDaoExcepcion{
        Usuario usuario = new Usuario();
        UsuarioDAO usuariodao = new UsuarioDAO();
        
        usuario.setNombre("Jorge Octavio");
        usuario.setApellidos("Ocharan Hernandez");
        usuario.setContraseña("password");
        usuario.setEsActivo(true);
        
        int idGenerado = usuariodao.registrarUsuario(usuario);
        assertTrue("El id nuevo es: ", idGenerado<0);
    }
}
