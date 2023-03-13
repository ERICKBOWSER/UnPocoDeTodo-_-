/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionGenerica;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ERICK
 */
public class Empleado {
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
