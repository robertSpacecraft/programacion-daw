/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muestras
 */
import java.util.Scanner;

public class Ejercicio3RotaArray {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        int[] array = new int[ARRAY_SIZE];
        int anterior, actual;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Intorduce el número para la posición: " + i + " :");

            while (!input.hasNextInt() || (array[i] = input.nextInt()) < 0 || array[i] > 10) {

                System.out.println("Error, introduzca un número correcto");
                input.next();
                System.out.print("Intorduce el número para la posición: " + i + " :");
            }
        }
        
        anterior = array[0];
        array[0] = array[ARRAY_SIZE - 1];
        
        for (int i = 1; i < array.length; i++) {
            
            actual = array[i];
            array[i] = anterior;
            anterior = actual;
            
        }
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println(array[i] + " ");
            
        }
        
        
    }

}
