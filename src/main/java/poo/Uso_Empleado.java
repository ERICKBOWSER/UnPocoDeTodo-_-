/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;



/**
 *
 * @author ERICK
 */
public class Uso_Empleado {
    public static void main(String[] args) {
        // Instanciar la clase Empleado
//        Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
//
//        Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 6, 2);
//
//        Empleado empleado3 = new Empleado("Maria Martín", 105000, 2002, 3, 15);
//
//        // Subimos el sueldo de todos los empleados
//        empleado1.subeSueldo(5);
//        
//        empleado2.subeSueldo(5);
//        
//        empleado3.subeSueldo(5);
//        
//        System.out.println("Nombre: " + empleado1.dameNombre() + 
//                "\rSueldo: " + empleado1.dameSueldo() +
//                "\rFecha de Alta: " + empleado1.dameFechaContrato());
//        
//        System.out.println("Nombre: " + empleado2.dameNombre() + 
//                "\rSueldo: " + empleado2.dameSueldo() +
//                "\rFecha de Alta: " + empleado2.dameFechaContrato());
//        
//        System.out.println("Nombre: " + empleado3.dameNombre() + 
//                "\rSueldo: " + empleado3.dameSueldo() +
//                "\rFecha de Alta: " + empleado3.dameFechaContrato());
        
        // Crear un array con 3 espacios
        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 6, 2);
        
        misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 3, 15);
        
        misEmpleados[3] = new Empleado("Jaime Despa");
        
        // -------------- ArrayList --------------------------
        
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        listaEmpleados.add(new Empleado("Ana", 45, 2300));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("María", 25, 2600));
        
        
        System.out.println(listaEmpleados.size());
        
        for (Empleado e : listaEmpleados) {
            System.out.println(e.dameDatos());
        }
        
        // Convertir ArrayList en Array
        
        Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()]; // Declaración de array y tamaño
        
        listaEmpleados.toArray(arrayEmpleados); // Convertir ArrayList en array
        
        for(int i = 0; i < arrayEmpleados.length; i++){
            System.out.println(arrayEmpleados[i].dameDatos());
        }
        
        // ------------------------------------------------------------------------------------
        
        // For tradicional
        for(int i = 0; i < misEmpleados.length; i++){
            misEmpleados[i].subeSueldo(5);
        }
        
        for(int i = 0; i < misEmpleados.length; i++){
            System.out.println("Nombre: " + misEmpleados[i].dameNombre()+
                    "\rSueldo: " + misEmpleados[i].dameSueldo() +
                    "\rFecha de Alta: " + misEmpleados[i].dameFechaContrato()                    
                    );
        }
        // ------------------------------------------------------------------------------------
        
        // For mejorado - foreach
        for(Empleado e : misEmpleados){
            e.subeSueldo(5);
        }
        
        for(Empleado e : misEmpleados){
            System.out.println("Nombre: " + e.dameNombre()+
                    "\rSueldo: " + e.dameSueldo() +
                    "\rFecha de Alta: " + e.dameFechaContrato() );
        }
        
        //Iterator <Empleado> iterador = 
        
        
    }
}

class Empleado{
    public Empleado(String nom, double sue, int anio, int mes, int dia){
        
        nombre = nom;        
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
        altaContrato = calendario.getTime();
        
    }
    
    public Empleado(String nom, int edad, double sueldo){
       this.nombre = nom;
       this.edad = edad;
       this.sueldo = sueldo;
    }
    
    public Empleado(String nom){
        this(nom, 30000, 2000, 01,01);
    }
    
    
    public String dameNombre(){ // GETTER
        return nombre;
    }
    
    public double dameSueldo(){ // GETTER
        return sueldo;
    }
    
    public Date dameFechaContrato(){ // GETTER
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){ // SETTER
        double aumento = sueldo * porcentaje/100;
        
        sueldo += aumento;
    }
    
    public String dameDatos(){
        String res = "El empleado se llama " + this.nombre + ", tiene " + this.edad + ". Y un salario de " + this.sueldo;
        
        return res;
    }
    
    
    
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    private int edad;
    
}























