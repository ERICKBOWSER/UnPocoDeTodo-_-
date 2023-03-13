/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.set_Map;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ERICK
 */
public class CuentasUsuarios {
    public static void main(String[] args) {
        
        Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cl2 = new Cliente("Rafael", "00002", 250000);
        Cliente cl3 = new Cliente("Penelope", "00003", 4000000);
        Cliente cl4 = new Cliente("Julio", "00004", 480000);
        Cliente cl5 = new Cliente("Julio", "00005", 880000);
        
        // Declarar Set
        Set <Cliente> clientesBanco = new HashSet();
        
        // Insertar datos en el Set
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        
        
        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() + " " + 
                    cliente.getN_cuenta() + " " + cliente.getSaldo());
        }
        
    }
}
