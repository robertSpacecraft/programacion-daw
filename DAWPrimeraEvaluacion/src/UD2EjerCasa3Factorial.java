/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class UD2EjerCasa3Factorial {
    public static void main(String[] args) {
        
        int num;
        int total = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        while (!input.hasNextInt() || (num = input.nextInt()) < 0 || num > 10 ){
            
            System.out.println("Error, escribe un número del 1 al 10");
            System.out.print("Introduce un número: ");
        }

        
        for (int i = num; i > 1; i--) {
            total *= i;
            System.out.println("Resultado = " + num + " x " + i);

        }
        
        System.out.println(total);
        
    }
    
}
