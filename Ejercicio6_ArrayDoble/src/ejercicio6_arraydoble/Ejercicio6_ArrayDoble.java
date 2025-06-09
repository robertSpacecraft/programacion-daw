/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_arraydoble;

/**
 *
 * @author Robert
 */
public class Ejercicio6_ArrayDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDouble<Integer, String> a = new ArrayDouble<>();
        
        a.add(3, "tres");
        a.add(4, "cuatro");
        
        a.imprimir();
        a.imprimirIndex(1);
    }
    
}
