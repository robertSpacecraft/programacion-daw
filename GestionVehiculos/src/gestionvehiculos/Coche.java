/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author Robert
 */
public class Coche extends Vehiculo {

    private int numPuertas;
    private String tipo;

    public Coche(String tipo, int numPuertas, String marca, String modelo, String matricula, int year) {
        super(marca, modelo, matricula, year);
        this.numPuertas = numPuertas;
        this.tipo = tipo;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tipo: " + this.tipo +
                "\nNúmero de puertas: " + this.numPuertas);
    }

    @Override
    public double calcularImpuesto() {
        double impuestoBase = 50.00;
        if (super.getYear() < 2000) {
            return (impuestoBase * numPuertas) + 100;
        } else {
            return (impuestoBase * numPuertas) + 50;
        }
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo +
                "\nNúmero de puertas: " + this.numPuertas;
    }
    
    
    

}
