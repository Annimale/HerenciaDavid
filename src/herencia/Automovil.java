/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author dmuny
 */
public class Automovil {

    protected String matricula;
    protected double velocidad;

    public Automovil(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    protected void acelerar(double velocidad) {
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "Automovil{" + "matricula=" + matricula + ", velocidad=" + velocidad;
    }
    
    
}
