/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author davher
 */
public class Disco_prueba {
    public static void main(String[] args) {
        //Apartado a
        ListaMultimedia lista = new ListaMultimedia(10);
        Disco c2 = null;
        Scanner kb = new Scanner(System.in);
        format f = null;
        //Apartado b
        try {
            boolean repetir;
            do {
                repetir = false;
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
                        repetir = true;
                        break;
                }
            } while (repetir);
            Disco c1 = new Disco("Actor1", "", f, 2.2f, "Titulo1");
            lista.add(c1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            //Apartado d
            boolean repetir;
            do {
                repetir = false;
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
                        repetir = true;
                        break;
                }
            } while (repetir);
            c2 = new Disco("Actor1", "", f, 1.2f, "Titulo1");
            lista.add(c2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            boolean repetir;
            do {
                repetir = false;
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
                        repetir = true;
                        break;
                }
            } while (repetir);
            Disco c1 = new Disco("Actor2", "", f, 0.8f, "Titulo1");
            lista.add(c1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //Apartado c
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }

        //Apartado e    
        System.out.println(lista.indexOf(c2));

        //Apartado f
        System.out.println(lista.get(lista.indexOf(c2)).toString());
        System.out.println(lista.indexOf(c2));
    }
}
