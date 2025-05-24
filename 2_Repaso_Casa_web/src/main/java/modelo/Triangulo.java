/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Robert
 */
public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC) throws IllegalArgumentException {
        if (!trianguloValido(ladoA, ladoB , ladoC)){
            throw new IllegalArgumentException("Los lados no forman un triángulo válido");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    
    private boolean trianguloValido (double ladoA, double ladoB, double ladoC){
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
    }
    
    @Override
    public String toString(){
        return "Lado A: " + ladoA
                + "\nlado B: " + ladoB
                + "\nlado C: " + ladoC;
    }
}
