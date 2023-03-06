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
        Pareja<String> una = new Pareja<String>();
        
        una.setPrimero("Jacob");
        
        System.out.println(una.getPrimero());

        Persona pers1 = new Persona("Ana");
        
        Pareja<Persona> per1 = new Pareja<Persona>();
        
        per1.setPrimero(pers1);
        System.out.println(per1.getPrimero());
                
    }
    

    
}

    class Persona{
        public Persona(String nombre){
            this.nombre = nombre;
        }
        private String nombre;
    }