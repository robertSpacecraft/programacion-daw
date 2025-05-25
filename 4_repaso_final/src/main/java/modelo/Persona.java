/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Robert
 */
public class Persona {

    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        if (id <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un númeor positivo");
        }
        if (edad < 0 || edad > 150) {
            throw new IllegalArgumentException("No se puede crear una Persona con esa edad");
        }
        if (nombre == null || nombre.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 letras");
        }

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Id: " + id
                + "\nNombre: " + nombre
                + "\nEdad: " + edad;
    }

}
