/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionGenerica;

/**
 *
 * @author ERICK
 */
public class UsoPareja {
    public static void main(String[] args) {
        
        // Ejemplo 1
        Pareja<String> una = new Pareja<String>();
     
     
        una.setPrimero("Juan");// Cambiamos el parametro null de la variable genérica primero
     
        System.out.println(una.getPrimero());
     
        // Ejemplo 2
        Persona pers1 = new Persona("Ana");
        
        Pareja<Persona> persona = new Pareja<Persona>();
        
        persona.setPrimero(pers1);
        
        System.out.println(persona.getPrimero());
        
        
    
    }        
       
    }

class Persona{
        public Persona(String nombre){
            this.nombre = nombre;
        }
        
        public String toString(){
            return nombre;
        }
                
        private String nombre;
    }
