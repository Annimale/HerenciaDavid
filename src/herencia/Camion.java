/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author dmuny
 */
public class Camion extends Automovil {

    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        remolque = null;
    }

    @Override
    public String toString() {
        if (remolque == null) {
            return super.toString() + "}";
        } else {
            return super.toString() + remolque.toString();
        }
    }
    
    public void acelerarCamion(double velocidad) throws DemasiadoRapidoException {
        if ((this.velocidad + velocidad) > 100 && remolque != null) {
            throw new DemasiadoRapidoException("Has  pasado el límite de velocidad perimitido (100km/h)");
        } else {
            this.velocidad += velocidad;
        }
    }
    

    //Excepción a lanzar en caso que se supere la velocidad dada
    private class DemasiadoRapidoException extends Exception {

        public DemasiadoRapidoException(String msg) {
            super(msg);
        }
    }
}
