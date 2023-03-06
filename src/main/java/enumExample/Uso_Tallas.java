/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumExample;

import java.util.*;

/**
 *
 * @author ERICK
 */
public class Uso_Tallas {
    
    // Declarar enum
//    enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
    
    enum Talla{
        
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        
        // Constructor
        private Talla(String abreviatura){ // Los enum no permiten la creación de objetos 
            this.abreviatura = abreviatura;
        }
        
        public String dameAbreviatura(){
            return abreviatura;
        }
        
        private String abreviatura;
    }
        
    public static void main(String[] args) {
//        Talla s = Talla.MINI;
//        
//        Talla m = Talla.MEDIANO;
//        
//        Talla l = Talla.GRANDE;
//        
//        Talla xl = Talla.MUY_GRANDE;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe una talla: ");
        
        String resultado = teclado.nextLine().toUpperCase();

        Talla laTalla = Enum.valueOf(Talla.class, resultado); // valueOf Devuelve el nombre de la constante enumerada a la que pertenece el dato pasado por el usuario
        
        System.out.println("Talla = " + laTalla);
        System.out.println("Abreviatura = " + laTalla.dameAbreviatura());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
