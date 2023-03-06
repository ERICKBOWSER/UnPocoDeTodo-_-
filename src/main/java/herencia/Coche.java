/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package herencia;

import poo.*;

/**
 *
 * @author ERICK
 */
// Crear la clase
public class Coche {

    // Características comunes
    private int ruedas; // Encapsulación de datos
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    // Características que pueden variar
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    
    
    
    // Método contructor
    public Coche(){
        // Establecer el estado inicial del objeto
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
        
        
    }
    
    public String dime_datos_generales(){
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" + 
                ". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
                " cm y un peso de plataforma de " + peso_plataforma + " kg";
    }
    
    public void establece_color(String color_coche){
        color = color_coche;
    }
    
    public String getColor(){
        return "El color del coche es " + color;
    }
    
    public void configura_asientos(String asientos_cuero){ // SETTER
        if(asientos_cuero.equalsIgnoreCase("si")){
           this.asientos_cuero = true; 
        }else{
            this.asientos_cuero = false;
        }
    }
    
    public String dime_asientos(){ // GETTER
        if(asientos_cuero == true){
            return "El coche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de serie";
        }
    }
    
    
    // Setter para climatizador
    public void configura_climatizador(String climatizador){
        
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
        
    }
    
    public String dime_climatizador(){ // GETTER
        if(climatizador){
            return "El coche incorpora climatizador";
        }else{
            return "El coche lleva aire acondicionado";
        }
        
    }
    
    public String dime_peso_coche(){ // SETTER + GETTER
        
        int peso_carroceria = 500;
        
        peso_total = peso_plataforma + peso_carroceria;
        
        /* IMPORTANTE: no colocar el condicionador del climatizador dentro de la condición de
            asientos ya que si no se cumple, no se ejecuta la otra condición
        */
        if(asientos_cuero == true){
            peso_total = peso_total + 50;
        }
        if(climatizador){
            peso_total = peso_total + 20;
        }
        
        return "El peso del coche es " + peso_total;       
        
    }
    
    public int precio_coche(){ // GETTER
        
        int precio_final = 10000;
        
        if(asientos_cuero){
            precio_final += 2000;
        }
        
        if(climatizador){
            precio_final +=1500;
        }
        
        return precio_final;        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
