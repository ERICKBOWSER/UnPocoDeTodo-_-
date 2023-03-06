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
        String nombres[] = {"Jose", "Maria", "Pepe"};
        
        String elementos = MisMatrices.<String>getElementos(nombres); // Se puede colocar el tipo de dato, pero no es necesario
        
        System.out.println(elementos);
        
//        Empleado listaEmpleados[] = {new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500),
//            new Empleado("Ana", 45, 2500)
//        }
        
    }
}

class MisMatrices{
    public static <T> String getElementos(T[] a){ // <T> para establecer que es un método genérico y Tipo para especificar el tipo de dato que va a recibir
        return "El array tiene " + a.length + " elementos";
    }
}