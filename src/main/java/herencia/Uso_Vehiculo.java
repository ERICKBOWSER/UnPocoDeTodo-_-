/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author ERICK
 */
public class Uso_Vehiculo {

    public static void main(String[] args) {
        
        Coche miCoche1 = new Coche();
        
        miCoche1.establece_color("Rojo");
        
        // Reutilización de código
        
        Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
        
        miFurgoneta1.establece_color("Azul");
        
        miFurgoneta1.configura_asientos("si");
        
        miFurgoneta1.configura_climatizador("si");
        
        System.out.println(miCoche1.dime_datos_generales() + " " + miCoche1.getColor());
        
        System.out.println(miFurgoneta1.dime_datos_generales() + miFurgoneta1.dimeDatosFurgoneta());
        
        
        
        
        
        
        
        
        
        
        
    }
        
}
