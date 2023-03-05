/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author davher
 */
public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, format formato, float duracion) throws IllegalArgumentException {        
        super(titulo, autor, formato, duracion);
        if (actorPrincipal.equals("") && actrizPrincipal.equals(""))
            throw new IllegalArgumentException("Los dos actores no pueden ser nulos");
        
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + ", titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion +'}';
    }
}
