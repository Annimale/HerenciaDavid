/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Scanner;

/**
 * la película
 * @author davher
 */
public class H3_MAIN {

    public static void main(String[] args) {
        boolean repetir = true;
        ListaMultimedia lista = new ListaMultimedia(2);
        Scanner kb = new Scanner(System.in);
        String actor, actriz, titulo, genero, autor;
        float duracion;
        int contPel = 0, contDis = 0;
        boolean repetir1, creable = true, falloEnLosDatos;
        do {
            repetir = true;
            System.out.println("Selecciona una de las siguientes opciones:\n1.- PELÍCULAS\n2.- DISCOS\n3.- SALIR");
            byte opcion = kb.nextByte();
            format f = null;
            
            switch (opcion) {
                case 1:
                    do {
                        kb.nextLine();
                        falloEnLosDatos = false;

                        System.out.print("Introduce el nombre del actor principal: ");
                        actor = kb.nextLine();
                        System.out.print("Introduce nombre de la actriz principal: ");
                        actriz = kb.nextLine();
                        System.out.print("Introduce el título de la película: ");
                        titulo = kb.nextLine();
                        System.out.print("Dime el nombre del autor de la película: ");
                        autor = kb.nextLine();
                        do {
                            repetir1 = false;
                            System.out.println("Introduce el formato: "
                                    + "\n1: vav"
                                    + "\n2: mp3"
                                    + "\n3: midi"
                                    + "\n4: avi"
                                    + "\n5: mov"
                                    + "\n6: mpg"
                                    + "\n7: cdAudio"
                                    + "\n8: dvd");
                            short eleccion = kb.nextShort();

                            switch (eleccion) {
                                case 1:
                                    f = format.vav;
                                    break;
                                case 2:
                                    f = format.mp3;
                                    break;
                                case 3:
                                    f = format.midi;
                                    break;
                                case 4:
                                    f = format.avi;
                                    break;
                                case 5:
                                    f = format.mov;
                                    break;
                                case 6:
                                    f = format.mpg;
                                    break;
                                case 7:
                                    f = format.cdAudio;
                                    break;
                                case 8:
                                    f = format.dvd;
                                    break;
                                default:
                                    repetir1 = true;
                                    break;
                            }
                        } while (repetir1);
                        System.out.print("Introduce la duracion de la película: ");
                        duracion = (float) kb.nextDouble();
                        try {
                            Pelicula pel1 = new Pelicula(actor, actriz, titulo, autor, f, duracion);
                            creable = lista.add(pel1);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            falloEnLosDatos = true;
                        }
                    } while (falloEnLosDatos);
                    break;
                case 2:
                    kb.nextLine();
                    System.out.print("Introduce el título del disco: ");
                    titulo = kb.nextLine();
                    System.out.print("Dime el nombre del autor del disco: ");
                    autor = kb.nextLine();
                    do {
                        repetir1 = false;
                        System.out.println("Introduce el formato: "
                                + "\n1: vav"
                                + "\n2: mp3"
                                + "\n3: midi"
                                + "\n4: avi"
                                + "\n5: mov"
                                + "\n6: mpg"
                                + "\n7: cdAudio"
                                + "\n8: dvd");
                        short eleccion = kb.nextShort();

                        switch (eleccion) {
                            case 1:
                                f = format.vav;
                                break;
                            case 2:
                                f = format.mp3;
                                break;
                            case 3:
                                f = format.midi;
                                break;
                            case 4:
                                f = format.avi;
                                break;
                            case 5:
                                f = format.mov;
                                break;
                            case 6:
                                f = format.mpg;
                                break;
                            case 7:
                                f = format.cdAudio;
                                break;
                            case 8:
                                f = format.dvd;
                                break;
                            default:
                                repetir1 = true;
                                break;
                        }
                    } while (repetir1);
                    System.out.print("Introduce la duracion del disco: ");
                    duracion = (float) kb.nextDouble();
                    kb.nextLine();
                    System.out.print("Introduce el genero del disco: ");
                    genero = kb.nextLine();
                    Disco dis1 = new Disco(titulo, autor, f, duracion, genero);
                    creable = lista.add(dis1);
                    break;
                case 3:
                    repetir = false;
                    break;
            }
        } while (repetir && creable);

        System.out.println(lista.toString());
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Pelicula) {
                contPel++;
            } else {
                contDis++;
            }
        }
        System.out.println("Hay " + contPel + " películas");
        System.out.println("Hay " + contDis + " discos");
    }
}
