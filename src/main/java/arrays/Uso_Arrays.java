/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author ERICK
 */
public class Uso_Arrays {
    public static void main(String[] args) {
        int [] miArray = new int[5]; // Los corchetes pueden ir tanto delante como detrás del nombre
        
        // Insertar datos (iniciar )
        miArray[0] = 5;
        miArray[1] = 38;
        miArray[2] = 15;
        miArray[3] = 92;
        miArray[4] = 71;
        
        // Mostrar los datos
        for(int i = 0; i < miArray.length; i++){
            System.out.println(miArray[i]);
        }
        
        // Declarar e inicializar un array
        int [] miArray2 = {5, 28, 92, 15, 71};
        
    }
    
}
