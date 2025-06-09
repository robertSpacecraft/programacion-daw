
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Ejercicio2_5_strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("primero");
        lista.add("Segundo");
        lista.add("tercero");
        lista.add("cuarto");
        lista.add("quinto");
        
        for (String s : lista){
            System.out.println("Orden normal: " + s);
            
        }
        System.out.println("------------------");
        Collections.reverse(lista);
        for (String s : lista){
            System.out.println("Orden inverso: " + s);
        }
    }
    
}
