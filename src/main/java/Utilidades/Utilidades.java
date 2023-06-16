/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Utilidades {
    
    
     //Reemplaza el regex que se le pase por lo que se ponga en la derecha
    List<String> lista = new ArrayList();
    lista.add(linea.replaceAll(",", ""));
    
    
    // Parsea un tipo de fecha por otro
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fecha = LocalDate.parse(tokens[5], formato);
    
    
    
    // Leer cualquier matriz
    public static String[][] leer(String nombre){
        List<String> lineas;
        String[][] matriz = null;
        
        try{
            lineas = Files.readAllLines(Paths.get(nombre));
                        
            
            // Le damos el número de filas que tiene el fichero
            matriz = new String[lineas.size()][];
            
            for (int i = 0; i < lineas.size(); i++) {
                
                // Cogemos el largo y se lo damos a las columnas de la fila
                matriz[i] = new String[lineas.get(i).length()]; 
                
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = String.valueOf(lineas.get(i).charAt(j));
//                    System.out.print(matriz[i][j].replace(",", "") + " ");
                    
                }   
                
//                System.out.println();
            }  
                    
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return matriz;        
    }
    
    // Puede servir para comprobar si hay algo vacío ---------------------------------------
//    
//    if(tokens[0].isEmpty()){
//        d.setCodIDA(0);
//    }else{
//        d.setCodIDA(Integer.parseInt(tokens[0]));
//    }
//
//    if(tokens[1].isEmpty()){
//        d.setNombreInst("");
//    }else{
//        d.setNombreInst(tokens[1]);
//    }
//
//    if(tokens[2].isEmpty()){
//       d.setProvincia("");
//    }else{
//        d.setProvincia(tokens[2]);
//    }
//
//    if(tokens[3].isEmpty()){
//        d.setMunicipio("");
//    }else{
//        d.setMunicipio(tokens[3]);
//    }
//    if(tokens[4].isEmpty()){
//        d.setVia("");
//    }else{
//        d.setVia(tokens[4]);
//    }
//    if(tokens[5].isEmpty()){
//        d.setCp("");
//    }else{
//         d.setCp(tokens[5]);
//    }
//    if(tokens[6].isEmpty()){
//        d.setEspDeportivo("");
//    }else{
//      d.setEspDeportivo(tokens[6]);  
//    }
    
    // Método para leer un fichero
    public static void leerMatriz(String nombre) {


        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(nombre), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
                for (String string : tokens) {
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Leer cualquier tipo de matriz
    public static int[][] leerM(String nombre, String separador) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int[][] matriz = null;
        int contador = 0;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombre), "UTF-8")) {

            while (datosFichero.hasNextLine()) {
                datosFichero.nextLine(); // Para pasar a la siguiente linea

                contador++; // Nos servirá para definir el largo de las filas
            }

            matriz = new int[contador][]; // Establecemos el número de filas que tendrá
            datosFichero.close(); // Cerramos el scanner

            // Abrimos otro scanner y no hace falta try ya que va dentro del que ya tenemos 
            Scanner datosFichero2 = new Scanner(new File(nombre), "UTF-8");

            // hasNextLine devuelve true mientras haya líneas por leer
            int fila = 0;
            while (datosFichero2.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero2.nextLine();

                // Separamos cada dato
                tokens = linea.split(separador);

                // NO SE PUEDE COLOCAR UN BUCLE YA QUE TODAVÍA NO TENEMOS LA SIGUIENTE LINEA DE datosFichero2
//                for (int i = 0; i < tokens.length; i++) {

                    // Cogemos el largo del token y se lo damos a las columnas de la fila
                    matriz[fila] = new int[tokens.length];

                    for (int j = 0; j < tokens.length; j++) {
                      matriz[fila][j] = Integer.parseInt(tokens[j]);

                    }
                fila++;

//                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return matriz;
    }
    // Iterador
//    Iterator<Libro> iterator = listaLibros.iterator();
//
//        while (iterator.hasNext()) {
//
//            Libro libro = iterator.next();
//
//            System.out.println(libro.toString());
//
//        }
    
//    Collections.sort(listaLibros);
    
    public static void ordenarFilasMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
            // Revertir el orden de la fila
            for (int j = 0; j < matriz[i].length / 2; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][matriz[i].length - 1 - j];
                matriz[i][matriz[i].length - 1 - j] = temp;
            }
        }
    }
    
    public static int binarySearch(int[] num, int numEncontrar){
        int bajo = 0;
        int alto = num.length - 1; // max largo del número
        
        while(bajo <= alto){
            int mitadPosicion = (bajo + alto) / 2;
            int mitadNum = num[mitadPosicion];
            
            // Si se encuentra en la mitad
            if(numEncontrar == mitadNum){
                return mitadPosicion;
            }else if(numEncontrar <mitadNum){
                alto = mitadPosicion - 1;                
            }else{
                bajo = mitadPosicion + 1;
            }
            
        }       
        return -1;  
    }
    
    
}
