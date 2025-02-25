
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
    
    private Map<String, List<Libro>> catalogo;
    
    public Biblioteca(){
        this.catalogo = new TreeMap<>(new ComparadorGenerosInverso());
    }
    
    public void agregarLibro(String genero, Libro libro){
        List<Libro> lista =  catalogo.get(genero);
        if (lista == null){
                lista = new ArrayList<>();
                catalogo.put(genero, lista);
        }
            lista.add(libro);    
    }   
    
    public List<Libro> obtenerLibrosPorGenero(String genero){
        List<Libro> lista = catalogo.get(genero);
        if (lista == null){
            lista = new ArrayList<>();
            }
        
        return lista;
    }
    
    public void mostrarCatalogo(){
        for (String genero: catalogo.keySet()){
            System.out.println("Género: " + genero);
            for (Libro libro: catalogo.get(genero)){
                System.out.println(" " + libro);
            }
        }
    }
    public Map<String, List<Libro>> getCatalogo(){
        return catalogo;
    }
    
}
