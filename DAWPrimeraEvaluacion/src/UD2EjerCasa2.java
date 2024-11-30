/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class UD2EjerCasa2 {
    public static void main(String[] args) {
        int userNumber;
        int sumando = 0;
        int total = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un número del 0 al 10: ");
        while (!input.hasNextInt() || (userNumber = input.nextInt()) < 0 || userNumber > 10){
        
            System.out.println("Error, introduzca un número válido");
            System.out.print("Introduzca un número del 0 al 10: ");
        }
        input.nextLine();
        
        while (userNumber > 0){
            
            System.out.println("Introduce los números a sumar: ");
            while (!input.hasNextInt() || (sumando = input.nextInt()) < 0 || sumando > 100){
                System.out.println("Error, introduce un número válido");
                System.out.println("Introduce los números a sumar: ");
            
            }
            
            total += sumando;
            userNumber--;
        }
        
        System.out.println("La suma es = " + total);
    }
    
}
