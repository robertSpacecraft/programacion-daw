
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Object> listaObjetos = new ArrayList<>();
        
        listaObjetos.add("hola");
        listaObjetos.add(2.5);
        listaObjetos.add(false);
        listaObjetos.add("adeu");
        
        for (Object o : listaObjetos){
            System.out.println("Lista objetos: " + o);
            
            if (o instanceof String){
                System.out.println("Este objeto es un String: " + ((String) o).length());
            }
        }
    }
    
}
