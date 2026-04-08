/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdto;

/**
 *
 * @author Luz Fernanda H J
 */
public class Profesor extends Usuario{
    private String noPersonal;

    public Profesor() {
    }

    public Profesor(int idUsuario, String nombre, String apellidos, String contraseña, boolean esActivo,String noPersonal) {
        super(idUsuario, nombre, apellidos, contraseña, esActivo);
        this.noPersonal=noPersonal;
    }
    
    public String getNoPersonal() {
        return noPersonal;
    }

    public void setNoPersonal(String noPersonal) {
        this.noPersonal = noPersonal;
    }
    

}
