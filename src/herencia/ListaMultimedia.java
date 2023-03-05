/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author davher
 */
public class ListaMultimedia {

    private Multimedia[] lista;
    private int contador = 0;

    public ListaMultimedia(int cantidad) {
        lista = new Multimedia[cantidad];
    }

    public int size() {
        return contador;
    }

    public boolean add(Multimedia m) {
        if (contador < lista.length) {
            lista[contador++] = m;
            return true;
        } else {
            return false;
        }
    }

    public Multimedia get(int posicion) {
        return lista[posicion];
    }

    public int indexOf(Multimedia m) {
        int pos = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(m)) {
                pos = i;
            }
        }
        return pos;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < this.size(); i++) {
            resultado += "\nMultimedia" + "[" + i + "] : \n" + this.get(i).toString() + "\n";
        }
        return resultado;
    }
}
