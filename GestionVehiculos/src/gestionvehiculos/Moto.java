/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author Robert
 */
public class Moto extends Vehiculo {

    private int cilindrada;
    private String tipo;

    public Moto(int cilindrada, String tipo, String marca, String modelo, String matricula, int year) {
        super(marca, modelo, matricula, year);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: " + this.tipo
                + "\nCilindrada: " + this.cilindrada);
    }

    @Override
    public double calcularImpuesto() {
        double impuestoBase = 20;
        if (super.getYear() < 2000) {
            return impuestoBase + 100 + (this.cilindrada / 10);
        } else {
            return impuestoBase + 50 + (this.cilindrada / 10);
        }
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo
                + "\nCilindrada: " + this.cilindrada;
    }
    
    
    
}
