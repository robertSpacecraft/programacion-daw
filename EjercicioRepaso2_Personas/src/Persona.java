/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Persona implements Comparable<Persona> {
    private String dni;
    private String nombre;
    private int edad;

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() { return edad; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public String toString() {
        return "DNI: " + dni
                + "\nNombre: " + nombre
                + "\nEdad: " + edad;
    }
}

