/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package spp.logicadenegocio.interfacesdao;

import java.sql.SQLException;
import spp.logicadenegocio.clasesdto.Coordinador;

/**
 *
 * @author gomes
 */
public interface ICoordinadorDAO {
    public boolean registrarCoordinador(Coordinador coordinador)throws SQLException;
    public Coordinador consultarCoordinador(String numeroDePersonal)throws SQLException;
    public boolean eliminarCoordinador(String numeroDePersonal)throws SQLException;
    public boolean actualizarCoordinador(Coordinador coordinador)throws SQLException;       
}
