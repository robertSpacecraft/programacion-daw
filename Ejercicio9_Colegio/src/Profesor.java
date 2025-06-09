
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Profesor implements Comparable<Profesor>{
    private String dni;
    private String nombre;
    private String apellido;
    private String departamento;

    public Profesor(String dni, String nombre, String apellido, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    
    @Override
    public int compareTo(Profesor otro) {
        return this.dni.compareTo(otro.dni);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return """
               Profesor: 
               Dni: """ + dni
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDepartamento: " + departamento;
    }
  
}
