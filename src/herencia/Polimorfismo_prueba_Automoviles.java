/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author dmuny
 */
public class Polimorfismo_prueba_Automoviles {

    public static void main(String[] args) {
        Automovil lista[] = new Automovil[4];
        Remolque r1 = new Remolque(5000);
        Camion ca1 = new Camion("BBC1254");
        
        lista[0] = ca1;

        Camion ca2 = new Camion("BBC1255");

        ca2.ponRemolque(r1);
        
        lista[1] = ca2;

        Coche co1 = new Coche("BBC1256", 5);
        lista[2] = co1;

        Coche co2 = new Coche("BBC1257", 3);
        lista[3] = co2;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Camion) {
                ((Camion) lista[i]).ponRemolque(r1);
                try {
                    ((Camion) lista[i]).acelerarCamion(200);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                lista[i].acelerar(300);
            } 
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());
        }
    }
}
