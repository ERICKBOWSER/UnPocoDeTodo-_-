/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionGenerica;

/**
 *
 * @author ERICK
 */
public class Pareja<T> {
    
    public Pareja(){
        primero = null;
    }
    
    // Cambiar el dato
    public void setPrimero(T nuevoValor){
        primero = nuevoValor; // Convierte el valor en tipo de dato que se esta dando.
    }
    
    // Como no se sabe el tipo de dato que se va a recibir se coloca T
    public T getPrimero(){
        return primero;
    }
    
    private T primero;

}
