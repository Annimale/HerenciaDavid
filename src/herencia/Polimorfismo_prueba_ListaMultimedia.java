/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author davher
 */
public class Polimorfismo_prueba_ListaMultimedia {

    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);
        double duracion = 0;
        byte contDiscos=0, contSinActrices=0;
        Disco c1 = new Disco("Titulo1", "Autor1", format.vav, 2.3f, "Rock");
        lista.add(c1);
        
        Disco c2 = new Disco("Titulo2", "Autor2", format.vav, 2.1f, "Rock");
        lista.add(c2);

        Disco c3 = new Disco("Titulo3", "Autor3", format.vav, 1.3f, "Rock");
        lista.add(c3);

        Pelicula P1 = new Pelicula("actor1", "actriz1", "titulo1", "autor1", format.cdAudio, 2.5f);
        lista.add(P1);

        Pelicula P2 = new Pelicula("actor2", "", "titulo2", "autor2", format.dvd, 1.5f);
        lista.add(P2);

        Pelicula P3 = new Pelicula("actor3", "", "titulo3", "autor3", format.dvd, 2.2f);
        lista.add(P3);

        System.out.println(lista.toString());
        
        //En las siguientes líneas calcularemos el total de duración en toda la lista
        for (int i = 0; i < lista.size(); i++) {
            duracion+= lista.get(i).getDuracion();
        }
        System.out.println("La duración total de toda la lista es de " + duracion);
        
        
        
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Disco) {
                if (((Disco) lista.get(i)).getGenero().equals("Rock")) {
                    contDiscos++;
                }
            }
        }
        
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Pelicula) {
                if (((Pelicula) lista.get(i)).getActrizPrincipal().equals("")) {
                    contSinActrices++;
                }
            }
        }
    }
}
