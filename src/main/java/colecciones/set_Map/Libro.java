/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.set_Map;

/**
 *
 * @author ERICK
 */
public class Libro {
    
    public Libro(String titulo, String autor, int ISBN){
        
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;        
    }
    
    public String getDatos(){
        return "El libro es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.ISBN;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.ISBN == other.ISBN;
    }
    
    
    private String titulo;
    private String autor;
    private int ISBN;
}
