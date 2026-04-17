/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.clasesdaotest;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import spp.logicadenegocio.clasesdto.Usuario;
import spp.logicadenegocio.clasesdao.UsuarioDAO;
import spp.logicadenegocio.clasesdto.Coordinador;
import spp.logicadenegocio.clasesdao.CoordinadorDAO;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;
/**
 *
 * @author Luz Fernanda H J
 */
public class PruebaCoordinadorDAO {
    Usuario usuario = new Usuario();
    @Before
    public void recursoInsertarUsuario()throws OperacionesDeDaoExcepcion{
        
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuario.setIdUsuario(2);
        usuario.setNombre("Juan Carlos");
        usuario.setApellidos("Perez Arriaga");
        usuario.setContraseña("password");
        usuario.setEsActivo(true);
        usuariodao.registrarUsuario(usuario);
    }
    
    @Test
    public void pruebaInsertarCoordinadorDao()throws OperacionesDeDaoExcepcion{
       
        Coordinador coordinador = new Coordinador();
        CoordinadorDAO coordinadorDao = new CoordinadorDAO();
        
        coordinador.setIdUsuario(usuario.getIdUsuario());
        coordinador.setNumeroDePersonal("p2401");
        
        boolean registroExitoso = coordinadorDao.registrarCoordinador(coordinador);
        assertTrue(registroExitoso);
    }
    @After
    public void eliminarUsuario()throws OperacionesDeDaoExcepcion{
        
    }
}
