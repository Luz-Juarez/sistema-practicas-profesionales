/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spp.logicadenegocio.clasesdto;

import java.time.LocalDateTime;
/**
 *
 * @author Luz Fernanda H J
 */
public class Mensaje {
    private Integer idMensaje; 
    private String asunto; 
    private String cuerpo;
    private LocalDateTime fecha;
    
    public Mensaje(){
    }

    public Mensaje(Integer idMensaje, String asunto, String cuerpo, LocalDateTime fecha) {
        this.idMensaje = idMensaje;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public Integer getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    } 
    
}
