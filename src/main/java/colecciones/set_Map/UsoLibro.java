/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.set_Map;

/**
 *
 * @author ERICK
 */
public class UsoLibro {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("P en Java", "Juan", 25);
        
        Libro libro2 = new Libro("P en Java", "Juan", 25);
        
        if(libro1.equals(libro2)){
            System.out.println("Es el mismo libro.");
        }else{
            System.out.println("No es el mismo libro.");
        }
        
    }
}
