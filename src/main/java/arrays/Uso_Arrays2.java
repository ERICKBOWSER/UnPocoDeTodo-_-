/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Uso_Arrays2 {
    public static void main(String[] args) {
        String [] paises =  new String[8];
        
//        paises[0] = "España";
//        paises[1] = "México";
//        paises[2] = "Colombia";
//        paises[3] = "Perú";
//        paises[4] = "Chile";
//        paises[5] = "Argentina";
//        paises[6] = "Ecuador";
//        paises[7] = "Venezuela";
//        
//        for(int i = 0; i < paises.length; i++){
//            System.out.println("País: " + (i+1) + " " + paises[i]);
//        }

//        for(int i = 0; i < 8; i++){
//            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
//        }
//        
//        
//        for(String i : paises){
//            System.out.println("País: " + i);
//        }
        
        int[] array_aleatorios = new int[150];
        
        for(int i = 0; i < array_aleatorios.length; i++){
            array_aleatorios[i] = (int)Math.round(Math.random()*100);
        }
    
        for(int numeros : array_aleatorios){
            System.out.print(numeros + " " );
        }

    }
}
