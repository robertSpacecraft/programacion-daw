
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class TestBiblioteca {

    public static void main(String[] args) {
        Libro libroA = new Libro("Sapiens", "Harari", 2016, 19.95);
        Libro libroB = new Libro("Principia", "Newton", 1665, 25.50);
        Libro libroC = new Libro("El mundo de Sophia", "Jostein Gaarder", 2010, 15.65);
        Libro libroD = new Libro("1984", "Orwell", 1949, 10.00);
        Libro libroE = new Libro("El Político", "Azorín", 1908, 30.00);
        Libro libroF = new Libro("Trafalgar", "Arturo Pérez Reverte", 2004, 10.50);
        Libro libroG = new Libro("Fundamentos de Cosmología", "Daniel Manrique", 2016, 32.95);
        Libro libroH = new Libro("El mundo y sus demonios", "Carls Sagan", 1997, 15.95);
        Libro libroI = new Libro("Michio Kaku", "La ecuación de Dios", 2016, 12.80);
        Libro libroJ = new Libro("Sobre la teoría de la relativida especial", "Albert Eintein", 1984, 38.85);
        
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.agregarLibro("Ciencia", libroB);
        biblioteca.agregarLibro("Historia", libroA);
        biblioteca.agregarLibro("Novela", libroC);
        biblioteca.agregarLibro("Novela", libroD);
        biblioteca.agregarLibro("Política", libroE);
        biblioteca.agregarLibro("Novela", libroF);
        biblioteca.agregarLibro("Ciencia", libroG);
        biblioteca.agregarLibro("Ciencia", libroH);
        biblioteca.agregarLibro("Ciencia", libroI);
        biblioteca.agregarLibro("Ciencia", libroJ);
        
        System.out.println("catálogo de libros completo: ");
        biblioteca.mostrarCatalogo();
        
        TreeSet<Libro> librosPorTitulo = new TreeSet<>();
        librosPorTitulo.add(libroE);
        librosPorTitulo.add(libroF);
        librosPorTitulo.add(libroA);
        librosPorTitulo.add(libroC);
        
        System.out.println("------------------------");
        System.out.println("Libros ordenados por título: ");
         for (Libro libro: librosPorTitulo){
             System.out.println(libro);
         }
         
         TreeSet<Libro> librosPorPrecio = new TreeSet<>(new PrecioComparator());
         librosPorPrecio.add(libroE);
         librosPorPrecio.add(libroG);
         librosPorPrecio.add(libroD);
         librosPorPrecio.add(libroF);
         librosPorPrecio.add(libroJ);
         
         System.out.println("--------------------------");
         System.out.println("Libros ordenados por precio: ");
         for (Libro libro: librosPorPrecio){
             System.out.println(libro);
         }
         
        
        
    }
    
}
