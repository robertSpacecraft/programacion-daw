/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */

import java.util.Scanner;
public class UD3EjerExam1ArrayMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int size = 5;
        float[] array = new float[size];
        float media = 0;
        float suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el " + i + " numero: ");
            array[i] = input.nextFloat(); 
        }
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        
        media = suma/array.length;
        
        System.out.printf("\nLa media es: %f2", media);
    }
    
}
