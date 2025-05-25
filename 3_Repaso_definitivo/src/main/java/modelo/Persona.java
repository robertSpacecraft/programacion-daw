/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robert
 */
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private List<Double> notas;

    public Persona(int id, String nombre, String apellido, int edad, List<Double> notas) {
        if (id <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un númeor positivo");
        }
        if (edad < 0 || edad > 150) {
            throw new IllegalArgumentException("No se puede crear una Persona con esa edad");
        }
        if (nombre == null || nombre.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 letras");
        }
        if (apellido == null || apellido.length() < 2) {
            throw new IllegalArgumentException("El apellido debe contener al menos 2 letras");
        }
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = (notas != null) ? notas : new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public List<Double> getNotas() {
        return notas;
    }
    
    public void addNotas(Double nota){
        this.notas.add(nota);
    }

    @Override
    public String toString() {
        return "Id: " + id
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nEdad: " + edad
                + "\nNotas: " + notas;
    }

}
