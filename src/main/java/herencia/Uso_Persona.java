/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ERICK
 */
public class Uso_Persona {
    
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];
        
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 2, 25);
        
        lasPersonas[1] = new Alumno("Ana López", "Biológicas");
        
        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre());            
            System.out.println(p.dameDescripcion());
            System.out.println("-------------------");
        }
    }
}
    
    abstract class Persona{
        
        public Persona(String nom){
            nombre = nom;
        }
        
        public String dameNombre(){
            return nombre;
        }

        public abstract String dameDescripcion();
        
        private String nombre;
               
    }
    
    
    class Empleado2 extends Persona{
    public Empleado2(String nom, double sue, int anio, int mes, int dia){
       
        super(nom);
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
        altaContrato = calendario.getTime();
        
    }
    
    public String dameDescripcion(){
        return "Este empleado tiene una fecha de contrato " + dameFechaContrato() + " y tiene un sueldo= " + dameSueldo();
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
    
    
    
        
    private double sueldo;
    private Date altaContrato;
    
    }
    
    class Alumno extends Persona{

        public Alumno(String nom, String car) {
            super(nom);
            
            carrera = car;
        }
        
        public String dameDescripcion(){
            return "Este alumno esta estudiando la carrera de " + carrera;
        }
        
        private String carrera;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
