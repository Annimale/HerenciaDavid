/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author osccan
 */
public class Pelicula_prueba {

    public static void main(String[] args) {
        //Apartado a
        ListaMultimedia lista = new ListaMultimedia(10);
        //Apartado b
        Pelicula P3 = null, P2 = null, P1 = null;
        format f;

        f = selectFormat();
        try {
            P1 = new Pelicula("actor1", "actriz1", "titulo1", "autor1", f, 2.5f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        lista.add(P1);
        f = selectFormat();
        try {
            P2 = new Pelicula("actor2", "actriz2", "titulo2", "autor2", f, 1.4f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        lista.add(P2);


        try {
            P3 = new Pelicula("actor3", "actriz3", "titulo3", "autor3", f, 2.9f);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        lista.add(P3);
        //Apartado c
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
        //Apartado d
        try {

            Pelicula prueba = new Pelicula("actor", "actriz", null, null, null, 0);
            lista.add(prueba);
            //Apartado e
            System.out.println(lista.indexOf(prueba));
        } catch (Exception e) {
            System.out.println("Datos Incorrectos");
        }
        //Apartado f
        int pos = lista.indexOf(P3);
        System.out.println("Posicion: " + pos);
        System.out.println(lista.get(pos));
    }

    public static format selectFormat() {
        format f = null;
        boolean sal;
        do {
            sal = false;
            Scanner kb = new Scanner(System.in);
            System.out.println("Seleciona el tipo de formato\n"
                    + "1. vav\n"
                    + "2. Mp3\n"
                    + "3. midi\n"
                    + "4. avi\n"
                    + "5. mov\n"
                    + "6. mpg\n"
                    + "7. cdAudio\n"
                    + "8. dvd\n"
                    + "Selecciona una opción:");
            int dato = kb.nextInt();
            switch (dato) {
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
                case 0:
                    System.out.println();
                    break;
                default:
                    System.out.println("No se ha introducido ninguna de las opciones dadas");
                    sal = true;
            }
        } while (sal == true);

        return f;
    }
}