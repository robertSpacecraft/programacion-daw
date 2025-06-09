/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Piano extends Instrumento{
    private int numTeclas;
    
    public Piano(String marca, String modelo, double precio, int numTeclas){
        super(marca, modelo, precio);
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getMarca()
                + "\nMarca: " + super.getModelo()
                + "\nPrecio: " + super.getPrecio()
                + "\nNúmero de teclas: " + numTeclas;
    }
    
}
