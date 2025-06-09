/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Instrumento {
    private String marca;
    private String modelo;
    private double precio;

    public Instrumento(String nombre, String marca, double precio) {
        this.marca = nombre;
        this.modelo = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + marca
                + "\nMarca: " + modelo
                + "\nPrecio: " + precio;
    }
}
