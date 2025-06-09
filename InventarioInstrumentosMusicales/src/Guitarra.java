/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Guitarra extends Instrumento {
    private int numCuerdas;
    
    public Guitarra(String marca, String modelo, double precio, int numCuerdas){
        super(marca, modelo, precio);
        this.numCuerdas = numCuerdas;
    }

    public int getNumCuerdas() {
        return numCuerdas;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getMarca()
                + "\nMarca: " + super.getModelo()
                + "\nPrecio: " + super.getPrecio()
                + "\nNúmero de cuerdas: " + numCuerdas;
    }
    
    
}
