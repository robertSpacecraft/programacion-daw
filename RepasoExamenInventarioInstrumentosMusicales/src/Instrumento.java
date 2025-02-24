/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Instrumento {
    private String nombre;
    private String marca;
    private double precio;
    
    public Instrumento(String nombre, String marca, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Nombre: " + this.nombre +
                "\nMarca: " + this.marca +
                "\nPrecio: " + this.precio;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre +
                "\nMarca: " + this.marca +
                "\nPrecio: " + this.precio;
    }
}
