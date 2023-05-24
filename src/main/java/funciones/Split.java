/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author ERICK
 */
public class Split {
    
    public static void main(String[] args) {
        // Divide una cadena en fragmentos con un cáracter en común
        String cadena = "2019-02-16";
        String [] fragmentos = cadena.split("-");
        System.out.println("Año " + fragmentos[0]);
        System.out.println("Dia " + fragmentos[2] + ", Mes " + fragmentos[1]);        
        
        
        
    }
}
