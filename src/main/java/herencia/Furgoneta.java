/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author ERICK
 */
public class Furgoneta extends Coche{
    private int capacidad_carga;
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); // super(), llama la constructor de la clase padre para darle un estado inicial a la furgoneta
        
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }
    
    public String dimeDatosFurgoneta(){
        
        return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
