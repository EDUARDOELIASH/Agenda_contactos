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
        Agenda agenda = new Agenda();
        while(!finalizarAplicacion){
            String opcion = "";
            
            System.out.println("\n\n\n Bienvenido a la agenda de contactos! =)");
            System.out.println("1. Agregar contacto \n2. Buscar contacto \n3.Actualizar contacto \n4. Eliminar contacto \n5. Salir");
            
            System.out.println("Seleccione una opcion: ");
            Scanner input = new Scanner(System.in);
            opcion = input.nextLine();
            
            if(opcion.equals("1")){
                String nombre;
                String telefono;
                String correoElectronico;
                Contacto nuevoContacto = new Contacto();
                
                System.out.println("Ingrese nombre: ");
                nombre = input.nextLine();
                System.out.println("Ingrese telefono: ");
                telefono = input.nextLine();               
                System.out.println("Ingrese correo electronico: ");
                correoElectronico = input.nextLine();
                
                nuevoContacto.setNombre(nombre);
                nuevoContacto.setCorreoElectronico(correoElectronico);
                nuevoContacto.setTelefono(telefono);
                System.out.println("Agregando nuevo contacto a agenda...");
                agenda.agregarContacto(nuevoContacto);
                System.out.println("Contacto agregado exitosamente");
            }
            if(opcion.equals("2")){
                System.out.println("Ingrese nombre de contacto a buscar");
                String nombreContacto = input.nextLine();
                Contacto resultado = agenda.buscarContacto(nombreContacto);
                if(resultado != null){
                    System.out.println("Resultado obtenido");
                    System.out.println("Nombre: " + resultado.getNombre());
                    System.out.println("Telefono: " + resultado.getTelefono());
                    System.out.println("Correo Electronico: " + resultado.getCorreoElectronico());
                }
                else{
                    System.out.println("Contacto no existe");
                }
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
