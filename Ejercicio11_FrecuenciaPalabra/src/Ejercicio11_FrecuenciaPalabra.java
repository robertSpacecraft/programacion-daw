
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Ejercicio11_FrecuenciaPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Buenos días por la mañana mundo hoy el mundo es tuyo y mañana también";
        Map<String, Integer> resultado = frecPalabra(frase);
        
        for (Map.Entry<String, Integer> entry : resultado.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    }
    
    public static Map<String, Integer> frecPalabra(String frase){
        String[] fraseSep = frase.split(" ");
        ArrayList<String> listPalabra = new ArrayList<>(Arrays.asList(fraseSep));
        
        Map<String, Integer> mapaPalabras = new TreeMap<>();
        
        for (String palabra : listPalabra){
            palabra = palabra.trim();
            if (palabra.isEmpty()) continue;
            
            mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1);
        }
        return mapaPalabras;
    }
    
}
