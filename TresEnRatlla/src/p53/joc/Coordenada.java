package p53.joc;

import p53.util.Interval;
import p53.util.GestorIO;

public class Coordenada {

    private int fila;
    private int columna;

    final Interval LIMITS = new Interval(1, 3);

    //Constructor vacío
    public Coordenada() {
    }

    //Constructor completo
    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    //Getters
    public int getFila() {
        return this.fila;
    }

    public int getColumna() {
        return this.columna;
    }

    //Métodos:
    public boolean validar() {
        if (this.fila >= LIMITS.getInferior() && this.fila <= LIMITS.getSuperior()
                && this.columna >= LIMITS.getInferior() && this.columna <= LIMITS.getSuperior()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Coordenada recogir(){
        GestorIO io = new GestorIO();

        io.out("Introduce la fila (1-3): ");
        while ((this.fila = io.inInt()) < 1 || fila > 3){
            System.out.println("Por favor, introduzca un número dentro del rango");
            System.out.print("Introduce la fila: ");
        }
        io.out("Introduce la columna (1-3): ");
        while ((this.columna = io.inInt()) < 1 || columna > 3){
           io.out("Por favor, introduzca un número dentro del rango");
           io.out("Introduce la columna: ");
        }
        
        this.fila -= 1;
        this.columna -= 1;
        
    return this;
    }

}
