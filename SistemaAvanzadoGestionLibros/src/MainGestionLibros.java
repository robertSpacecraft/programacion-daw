
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class MainGestionLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Quijote", "Cervantes", 1605, 50.0);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 40.0);
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 2001, 35.0);
        Libro libro4 = new Libro("1984", "George Orwell", 1949, 30.0);
        Libro libro5 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953, 25.0);

        biblioteca.agregarLibro("Novela", libro1);
        biblioteca.agregarLibro("Novela", libro2);
        biblioteca.agregarLibro("Misterio", libro3);
        biblioteca.agregarLibro("Ciencia Ficción", libro4);
        biblioteca.agregarLibro("Ciencia Ficción", libro5);

        System.out.println("Biblioteca completa (orden inverso)");
        biblioteca.mostrarBiblioteca();

        TreeSet<Libro> librosPorTitulo = new TreeSet<>();

        librosPorTitulo.add(libro1);
        librosPorTitulo.add(libro2);
        librosPorTitulo.add(libro3);
        librosPorTitulo.add(libro4);
        librosPorTitulo.add(libro5);

        TreeSet<Libro> librosPorPrecio = new TreeSet<Libro>(new PrecioComparator());
        librosPorPrecio.add(libro1);
        librosPorPrecio.add(libro2);
        librosPorPrecio.add(libro3);
        librosPorPrecio.add(libro4);
        librosPorPrecio.add(libro5);

        System.out.println("\nLibros ordenados por título:");
        for (Libro libro : librosPorTitulo) {
            System.out.println(libro);
        }

        System.out.println("\nLibros ordenados por precio:");
        for (Libro libro : librosPorPrecio) {
            System.out.println(libro);
        }

    }

}
