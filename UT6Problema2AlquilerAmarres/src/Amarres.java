/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */

import AlquilerAmarres.*;

public class Amarres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Velero velero1 = new Velero("4455", 20, 1995, 3);
        Deportiva deportiva1 = new Deportiva("5588", 30, 2022, 800);
        Yate yate1 = new Yate("1122", 25, 2015, 180, 5);
        
        AlquilerAmarres alquilerVelero1 = new AlquilerAmarres("Jose", "44775577D", 5, "A3", velero1);
        AlquilerAmarres alquilerDeportiva1 = new AlquilerAmarres("Robert", "44778855M", 7, "A7", deportiva1);
        AlquilerAmarres alquilerYate1 = new AlquilerAmarres("María", "44744755T", 3, "A1", yate1);
        
        System.out.println("Precio velero1: " + alquilerVelero1.calcularPrecio() + " euros");
        System.out.println("-----------------");
        System.out.println("Precio Yate1: " + alquilerYate1.calcularPrecio() + " euros");
        System.out.println("-----------------");
        System.out.println("Precio Deportiva1; " + alquilerDeportiva1.calcularPrecio() + " euros");
        
        
        
    }
    
}
