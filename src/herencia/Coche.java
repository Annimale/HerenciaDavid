/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author dmuny
 */
public class Coche extends Automovil {

    private int numPuertas=0;

    public Coche(String matricula, int numPuertas) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getMatricula() {
        return matricula;
    }


    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(double velocidad) {
        this.velocidad += velocidad;
    }

    public void frenar(double velocidad) throws Exception {
        if (velocidad < 0 || this.velocidad < velocidad) {
            throw new Exception("La velocidad no puede ser negativa");
        } else {
            this.velocidad -= velocidad;
        }
    }



    @Override
    public String toString() {
        return super.toString() + ", numPuertas = "+ numPuertas + "}";
    }
}

