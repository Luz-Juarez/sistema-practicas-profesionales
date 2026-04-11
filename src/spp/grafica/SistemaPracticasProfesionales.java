/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spp.grafica;


import spp.logicadenegocio.clasesdao.OrganizacionDAO;
import spp.logicadenegocio.clasesdto.Organizacion;
import java.sql.SQLException;



/**
 *
 * @author Luz Fernanda H J
 */
public class SistemaPracticasProfesionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrganizacionDAO organizaciondao = new OrganizacionDAO(); 
        Organizacion organizacion = new Organizacion();
        organizacion.setIdOrganizacion(0);
        organizacion.setNombre("Tiendita");
        organizacion.setSector("Privado");
        organizacion.setDireccion("Av.Xalapa");
        organizacion.setEsActivo(true);
         
        try{
            organizaciondao.registrarOrganizacion(organizacion);
            
        }catch(SQLException e){
            System.out.println("Error al registrar la organizacion");
        }finally{
            
        }
        
       
    }
    
}
