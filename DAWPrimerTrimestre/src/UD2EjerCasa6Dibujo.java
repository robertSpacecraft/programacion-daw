/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class UD2EjerCasa6Dibujo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.print("Introduce un número: ");
        while (!input.hasNextInt() || (num = input.nextInt()) < 0 || num > 20) {
            System.out.println("Error, introduce un número entre 0 y 20");
            input.nextLine();

        }
        //Cuadrado
        System.out.println("Cuadrado: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        //Triángulo:
        System.out.println("");
        System.out.println("Triángulo: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        
        //Triángulo invertido:
        System.out.println("");
        System.out.println("Triángulo Invertido");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        
                System.out.println("");
        System.out.println("Triángulo espejo");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(j < num - i - 1 ? "  " : "* ");
            }
            System.out.println(" ");
        }
    }

}
