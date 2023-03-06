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
    
    public void setPrimero(T nuevoValor){
        primero = nuevoValor;
    }
    
    public T getPrimero(){
        return primero;
    }
    
    private T primero;
    
    
    
    
}
