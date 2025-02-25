/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private int anyoPublicacion;
    private double precio;
    
    public Libro(String titulo, String autor, int anyoPublicacion, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nAño de Publicación: " + this.anyoPublicacion +
                "\nPrecio: " + this.precio;
    }
    
    
    
}
