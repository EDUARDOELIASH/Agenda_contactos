/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaapp;

import java.util.Scanner;

/**
 *
 * @author eddy-
 */
public class AgendaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean finalizarAplicacion = false;
        while(!finalizarAplicacion){
            String opcion = "";
            
            System.out.println("Bienvenido a la agenda de contactos! =)");
            System.out.println("1. Agregar contacto \n2. Buscar contacto \n3.Actualizar contacto \n4. Eliminar contacto \n5. Salir"); 
            
            System.out.println("Seleccione una opcion: ");
            Scanner input = new Scanner(System.in);
            opcion = input.nextLine();
            
            if(opcion.equals("1")){
                System.out.println("Ha elegido la opcion 1...");
            }
            if(opcion.equals("2")){
                System.out.println("Opcion 2 elegida...");
            }
            if(opcion.equals("3")){
                System.out.println("Ha elegido la opcion 3...");
            }
            if(opcion.equals("4")){
                System.out.println("Has elegido la opcion 4...");
            }
            if(opcion.equals("5")){
                System.out.println("Saliendo de la aplicacion...");
                finalizarAplicacion = true;
            }
        }
    }
    
}
