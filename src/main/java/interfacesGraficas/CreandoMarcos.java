/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesGraficas;

import javax.swing.*;
/**
 *
 * @author ERICK
 */
public class CreandoMarcos {

    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();
        
        
        
        
        
    }


   
}

class MiMarco extends JFrame{
    public MiMarco(){
    
        // Establecer tamaño
        setSize(500, 300);
        
        // Hacer visible
        setVisible(true);
                
        // Que hacer cuando se cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Establecer localización        
        setLocation(500, 300);
        
        // Establecer tamaño y localización, porlo que no hace falta el setSize y el setLocation
        setBounds(500, 300, 250, 250);
        
        // Establecer si se puede redimensionar
        setResizable(false);
        
        // Establecer si se puede maximizar
        setExtendedState(MAXIMIZED_BOTH);
        
        // Establecer titulo
        setTitle("Ventana");
        
    }
    
    
    
    
    
    
    
    
    
    
    
}








