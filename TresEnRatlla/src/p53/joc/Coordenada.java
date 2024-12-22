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
    
    public Coordenada regogir(){
        GestorIO input = new GestorIO();
        int fila = 0;
        int columna = 0;
        System.out.print("Introduce la fila (1-3): ");
        while ((fila = input.inInt()) < 1 || fila > 3){
            System.out.println("Por favor, introduzca un número dentro del rango");
            System.out.print("Introduce la fila: ");
        }
        System.out.print("Introduce la columna (1-3): ");
        while ((columna = input.inInt()) < 1 || columna > 3){
            System.out.println("Por favor, introduzca un número dentro del rango");
            System.out.print("Introduce la columna: ");
        }
        
    return new Coordenada(fila, columna);
    }

}
