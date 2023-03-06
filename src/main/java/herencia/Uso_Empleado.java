/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;


import java.util.*;

/**
 *
 * @author ERICK
 */
public class Uso_Empleado {
    public static void main(String[] args) {
        
        Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
        
        jefe_RRHH.estableceIncentivo(2570);
        
        // Crear un array con 3 espacios
        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 6, 2);
        
        misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 3, 15);
        
        misEmpleados[3] = new Empleado("Jaime Despa");
        
        misEmpleados[4] = jefe_RRHH; // Polimorfismo en acción. Principio de sustitución
        
        misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26); // Polimorfismo en acción. Principio de sustitución
                                
                
        // Casting de objetos
        Jefatura jefa_Finanzas = (Jefatura)misEmpleados[5];
        
        jefa_Finanzas.estableceIncentivo(5000);
        
        
        
        // ------------------------------------------------------------------------------------
        
        // For mejorado - foreach
        for(Empleado e : misEmpleados){
            e.subeSueldo(5);
        }
        
        for(Empleado e : misEmpleados){
            System.out.println("Nombre: " + e.dameNombre()+
                    "\rSueldo: " + e.dameSueldo() +
                    "\rFecha de Alta: " + e.dameFechaContrato() );
            
            System.out.println("-----------------------------");
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
    
    
    
    
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
}

class Jefatura extends Empleado{
    
    public Jefatura(String nom, double sueldo, int agno, int mes, int dia){
        super(nom, sueldo, agno, mes, dia);
    }
    
    public void estableceIncentivo(double b){
        incentivo = b;
    }
    
    public double dameSueldo(){
        double sueldoJefe = super.dameSueldo();
        
        return sueldoJefe + incentivo;
    }
    
    private double incentivo;
}






















