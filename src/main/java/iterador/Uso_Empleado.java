/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterador;

import poo.*;
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

                
        Iterator<Empleado> iterador = listaEmpleados.iterator(); // Devuelve un objeto de tipo iterator
        
        while(iterador.hasNext()){
            System.out.println(iterador.next().dameDatos()); // next() recorre los datos uno tras otros, no los muestra
        }
        
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























