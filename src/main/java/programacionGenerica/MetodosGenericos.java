/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionGenerica;

/**
 *
 * @author ERICK
 */
public class MetodosGenericos {
    
    public static void main(String[] args) {
        
        // Ejemplo 1
        String nombres[] = {"Maria", "Jose", "Pepe"};
        
        String elementos = MisMatrices.getElementos(nombres);
        
        System.out.println(elementos);
        
        // Ejemplo 2
        
        Empleado listaEmpleados[] = {new Empleado("Ana", 45, 2500), 
                new Empleado("Paco", 22, 3000)};
        
        System.out.println(MisMatrices.getElementos(listaEmpleados));
        
        System.out.println(MisMatrices.getMenor(nombres));
        
        
        
    }

}

class MisMatrices{
    
    // Devuelve un dato de tipo String
    public static <T> String getElementos(T[] a){
        return "El array tiene " + a.length + " elementos.";
    }
    
    // Devuelve un dato de tipo genérico
    public static <T extends Comparable> T getMenor(T[] a){
        if(a == null || a.length == 0){
            return null;
        }
        
        T elementoMenor = a[0];
        
        for(int i = 1; i < a.length; i++){
            
            // Comparar objetos
            if(elementoMenor.compareTo(a[i]) > 0){
                elementoMenor = a[i];
            }
            
        }
        
        return elementoMenor;
        
    }
    
}