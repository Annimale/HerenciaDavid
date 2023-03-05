/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author davher
 */
public class Multimedia {
    protected String titulo;
    protected String autor;
    protected format formato;
    protected float duracion;

    public Multimedia(String titulo, String autor, format formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public format getFormato() {
        return formato;
    }

    public float getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }
    
    public boolean equals(Multimedia m) {
        boolean devolver = false;
        if (m.getAutor().equals(autor) && m.getTitulo().equals(titulo))
            devolver = true;
        
        return devolver;
    }
    
    
}
