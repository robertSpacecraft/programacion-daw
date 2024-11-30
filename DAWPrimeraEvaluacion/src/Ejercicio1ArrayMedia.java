/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDeExamen;

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class Ejercicio1ArrayMedia {

    public static void main(String[] args) {

        int size = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        while (!input.hasNextInt() || (size = input.nextInt()) < 0 || size > 10) {

            System.out.println("Error, introduce un valor correcto.");
            System.out.print("Introduce el tamaño del array: ");
            input.next();

        }

        float[] array = new float[size];

        for (int i = 0; i < array.length; i++) {

            System.out.print("Introduce el número de la posición " + i + " del Array: ");
            while (!input.hasNextFloat() || (array[i] = input.nextFloat()) < 0 || array[i] > 100) {
                System.out.println("Error, ese válor no es válido");
                System.out.print("Introduce el número de la posición " + i + " del Array: ");
                input.next();
            }

        }
        float suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            suma += array[i];
           
        }
        float media = suma / size;
        
        System.out.println("Media = " + media);
    }

}
