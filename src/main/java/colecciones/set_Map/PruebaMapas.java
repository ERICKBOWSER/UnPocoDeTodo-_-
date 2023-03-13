/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.set_Map;
import java.util.*;

/**
 *
 * @author ERICK
 */
public class PruebaMapas {
    public static void main(String[] args) {
        
        HashMap<String, Empleado> personal = new HashMap();
        
        personal.put("145", new Empleado("Juan"));
        
        personal.put("146", new Empleado("Antonio"));
        
        personal.put("147", new Empleado("Sandra"));
        
        System.out.println(personal);
        
        personal.remove("147");
        System.out.println(personal);
        
        //System.out.println(personal.entrySet());
        
        // Bucle foreach para recorrer elemento a elementos la colección para que nos devuelva los datos en forma de Set()
        
        for(Map.Entry<String, Empleado> entrada : personal.entrySet()){ // Devuelve lo que hay almacenado en forma de Set()
            
            // Almacenar los datos
            String clave = entrada.getKey();            
            Empleado valor = entrada.getValue();
            
            System.out.println("Clave = " + clave + ", Valor = " + valor);
            
            
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
