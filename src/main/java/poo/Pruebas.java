/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author ERICK
 */
public class Pruebas {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");
        
        Empleados trabajador2 = new Empleados("Josh");
        
        Empleados trabajador3 = new Empleados("Antonio");
        
        Empleados trabajador4 = new Empleados("Maria");
        
        trabajador1.cambiarSeccion("Ejecutivo");
        
        System.out.println(trabajador1.devuelveDatos() + "\n" + 
                trabajador2.devuelveDatos() + "\n" +
                trabajador3.devuelveDatos() + "\n" + 
                trabajador4.devuelveDatos()                
                );
        
        System.out.println(Empleados.dameIdSiguiente());
        
    }
    
}

class Empleados{
    
    public Empleados(String nom){
        nombre = nom;
        
        this.seccion = "Administración";
        
        id = idSiguiente;
        idSiguiente++;
                
    }
    
    public void cambiarSeccion(String seccion){ // SETTER
        this.seccion = seccion;
    }
    
    public String devuelveDatos(){
        return "El nombre es " + nombre + " y la sección es " + seccion + " y el id= " + id;
    }
    
    public static String dameIdSiguiente(){
        return "El IdSiguiente es: " + idSiguiente;
        
        
    }
    
    
    private final String nombre;
    private String seccion;
    
    private int id;
    
    private static int idSiguiente = 1;
    
}

