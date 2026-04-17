/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.pruebasclasesdao;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import spp.logicadenegocio.clasesdto.Usuario;
import spp.logicadenegocio.clasesdao.UsuarioDAO;
import spp.logicadenegocio.clasesdto.Coordinador;
import spp.logicadenegocio.clasesdao.CoordinadorDAO;
import spp.utilerias.excepciones.OperacionesDeDaoExcepcion;
import spp.accesoadatos.ConexionBD;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Luz Fernanda H J
 */
public class PruebaCoordinadorDAO {
    
    Usuario usuario = new Usuario();
    
    @Before
    public void recursoInsertarUsuario()throws OperacionesDeDaoExcepcion{
        
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuario.setIdUsuario(1);
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
        
        try {
            Connection conexion = ConexionBD.getConexion();
            Statement st = conexion.createStatement();

            st.execute("SET FOREIGN_KEY_CHECKS = 0");

            st.execute("DELETE FROM coordinador");
            st.execute("DELETE FROM usuario");

            st.execute("SET FOREIGN_KEY_CHECKS = 1");

            st.close();
            conexion.close();   

        } catch (SQLException e) {
            throw new OperacionesDeDaoExcepcion("No se puede conectar a la base de datos",e);
        }
        
    }
}
