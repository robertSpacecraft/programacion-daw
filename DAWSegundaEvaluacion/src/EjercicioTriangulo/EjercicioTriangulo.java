/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioTriangulo;

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class EjercicioTriangulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca el lado 1: ");
        lado1 = input.nextDouble();
        input.nextLine();
        System.out.print("\nIntroduzca el lado 2: ");
        lado2 = input.nextDouble();
        input.nextLine();
        System.out.print("\nIntroduzca el lado 3: ");
        lado3 = input.nextDouble();
        input.nextLine();
        
       Triangulo a = new Triangulo(lado1, lado2, lado3);
       
        System.out.println("Triangulo: " + a.ladoMayor());
        System.out.println("Area: " + a.area());
        System.out.println("Tipo: " + a.tipoTriangulo());
    }
    
}
