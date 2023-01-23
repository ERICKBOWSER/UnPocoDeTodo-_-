/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.*;

/**
 *
 * @author ERICK
 */
public class Uso_Coche {

    public static void main(String[] args) {
        
        // Crear objeto de una clase
        // Clase Nombre = new NombreConstructor();
        Coche Renault = new Coche(); // INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
        
//        Renault.ruedas = 3;
//        
//        System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
                
        
//        System.out.println(Renault.getLargo());

// ------------------------------------------------------------------------------

        Coche micoche = new Coche();
        
        micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
        
        System.out.println(micoche.dime_datos_generales());
        
        System.out.println(micoche.getColor());

        micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        
        System.out.println(micoche.dime_asientos());
        
        // Establecemos que tiene climatizador
        micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        
        System.out.println(micoche.dime_climatizador());
        
        // Peso del coche        
        System.out.println(micoche.dime_peso_coche());
        
        System.out.println("El precio final del coche es: " + micoche.precio_coche());
        
        
        
        
        
        
        
        
        
        
        
        
    }
        
}
