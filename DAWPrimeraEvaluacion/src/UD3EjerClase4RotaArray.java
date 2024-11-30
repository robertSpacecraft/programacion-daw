/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class UD3EjerClase4RotaArray {
    public static void main(String[] args) {
        
        final int SIZE = 10;
        
        int[] array = new int[SIZE];
        
        int previo, actual;
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduzca la posición: " + i + " de Array: ");
            
            while(!input.hasNextInt() || (array[i] = input.nextInt()) < 0 || array[i] > 10){
                
                System.out.println("Error, intruduzca un valor correcto");
                System.out.print("Introduzca la posición: " + i + " de Array: ");
                input.nextLine();
                
            }
        }
            
            previo = array[0];
            array[0] = array[SIZE -1];
            
            for (int i = 1; i < array.length; i++) {
                
                actual = array[i];
                array[i] = previo;
                previo = actual;
                
            }
            
            for (int i = 0; i < 10; i++) {
                
                System.out.println(array[i]);
                
            }
        }
        
    }
    

