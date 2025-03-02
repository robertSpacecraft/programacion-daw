/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author Robert
 */
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private String matricula;
    private int year;

    public Vehiculo(String marca, String modelo, String matricula, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.year = year;
        
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nMatrícula: " + this.matricula +
                "\nAño: " + this.year);
    }
    
    @Override
    public int compareTo(Vehiculo otro){
        return this.matricula.compareTo(otro.matricula);
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nMatrícula: " + this.matricula +
                "\nAño: " + this.year;
    }

    public abstract double calcularImpuesto();

    public int getYear() {
        return year;
    }

    public String getMatricula() {
        return matricula;
    }
    
    
       
}
