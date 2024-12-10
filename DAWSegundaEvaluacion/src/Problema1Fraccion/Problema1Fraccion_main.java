/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema1Fraccion;

/**
 *
 * @author Robert
 */
public class Problema1Fraccion_main {

    public static void main(String[] args) {
        Fraccion f = new Fraccion(10,5);
        Fraccion f2 = new Fraccion(13,13);
        
        
        Fraccion resultado = f.suma(f2);
        System.out.println("Fracción: " + resultado);
        System.out.println("Fracción simplificada: " + f2.simplificar());
    }
    
}
