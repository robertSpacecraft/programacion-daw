
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Biblioteca {
    private Map<String, List<Libro>> biblioteca;
    
    public Biblioteca(){
        biblioteca = new TreeMap<String, List<Libro>>(new ComparadorGenerosInverso());
    }
    
    public void agregarLibro(String genero, Libro libro){
        List<Libro> lista = biblioteca.get(genero);
        if (lista == null){
            lista = new ArrayList<Libro>();
            biblioteca.put(genero, lista);
        }
        lista.add(libro);
    }
    
    public List<Libro> obtenerLibrosPorGenero(String genero){
        List<Libro> lista = biblioteca.get(genero);
        if (lista == null){
            lista = new ArrayList<Libro>();
        }
        return lista;
    }
    
    public void mostrarBiblioteca(){
        for (String genero : biblioteca.keySet()){
            System.out.println("Género: " + genero);
            for (Libro libro : biblioteca.get(genero)){
                System.out.println(" " + libro);
            }
        }
    }
    
    public Map<String, List<Libro>> getBiblioteca(){
        return biblioteca;
    }
}
