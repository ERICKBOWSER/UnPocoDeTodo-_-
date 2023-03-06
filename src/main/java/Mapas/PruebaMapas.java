/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mapas;


import java.util.*;
/**
 *
 * @author ERICK
 */
public class PruebaMapas {
    public static void main(String[] args) {
        
        // Construir un mapa
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        
        // Añadir datos
        personal.put("1", new Empleado("John"));
        personal.put("2", new Empleado("Drake"));
        personal.put("3", new Empleado("Ana"));
        
        System.out.println(personal);
        
        // Eliminar datos
        personal.remove("2");
        System.out.println(personal);
        
        // Modificar un dato, para ello sobreescribimos los datos del mapa que queremos modificar
        personal.put("3", new Empleado("Maria"));
        System.out.println(personal);
           
        // EntrySet
//        System.out.println(personal.entrySet());// Devuelve una colección set

        for(Map.Entry<String, Empleado> entrada : personal.entrySet()){
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();
            
            System.out.println("Clave = " + clave + ", Valor = "+ valor);
        }


    }
}

class Empleado{
    public Empleado(String n){
        
        nombre = n;
        sueldo = 2000;        
        
    }
    
    public String toString(){
        return "[Nombre = " + nombre + ", sueldo = " + sueldo + "]";
    }
    
    private String nombre;
    private double sueldo;
}