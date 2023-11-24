/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaapp;

/**
 *
 * @author eddy-
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private String correoElectronico;
    
    public Contacto(){
        nombre = "";
        telefono = "";
        correoElectronico = "";
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
}
