/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Alumno implements Comparable<Alumno> {

    private int nia;
    private String nombre;

    public Alumno(int nia, String nombre) {
        this.nia = nia;
        this.nombre = nombre;
    }

    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Alumno otro) {
        return Integer.compare(this.nia, otro.nia);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.nia;
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
        final Alumno other = (Alumno) obj;
        return this.nia == other.nia;
    }
    

    @Override
    public String toString() {
        return """
               Alumno:
               Nia: """ + nia
                + "\nNombre: " + nombre;
    }
}
