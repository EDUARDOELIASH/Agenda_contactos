/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaapp;

import java.util.ArrayList;

/**
 *
 * @author eddy-
 */
public class Agenda {
    private ArrayList<Contacto> contactos;
    
    public Agenda(){
        this.contactos = new ArrayList<Contacto>();
    }
    
    public void agregarContacto(Contacto contacto){
        this.contactos.add(contacto);
    }
    
    public Contacto buscarContacto(String nombre){
        Contacto contactoCoincidente = null;
        for(Contacto c: this.contactos) {
            if(c.getNombre().equals(nombre)){
                contactoCoincidente = c;
            }
        }
        return contactoCoincidente;
    }
    
    public void actualizarContacto(){}
    
    public void eliminarContacto(){}
}
