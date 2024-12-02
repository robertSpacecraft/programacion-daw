//compara Si dos arrays son iguales

import java.util.Scanner;

public class Ejercicio3ComparaArraysIguales {

    public static void main(String[] args) {

        int[] arrayA = new int[5];
        int[] arrayB = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrayA.length; i++) {

            System.out.print("Introduce los números de la posición: " + i + " del array A: ");
            while (!input.hasNextInt() || (arrayA[i] = input.nextInt()) < 0 || arrayA[i] > 10) {

                System.out.println("Error, introduce un valor correcto");
                System.out.print("Introduce los números de la posición: " + i + " del array A: ");
                input.nextLine();

            }

        }

        for (int i = 0; i < arrayB.length; i++) {

            System.out.print("Introduce los números de la posición: " + i + " del array B: ");
            while (!input.hasNextInt() || (arrayB[i] = input.nextInt()) < 0 || arrayB[i] > 10) {

                System.out.println("Error, introduce un valor correcto");
                System.out.print("Introduce los números de la posición: " + i + " del array B: ");
                input.nextLine();
            }

        }
        
        for (int i = 0; i < arrayA.length; i++) {
            
            if(arrayA.length != arrayB.length){
            
                System.out.println("Los arrays son distintos");
            }else {
            
                if(arrayA[i] == arrayB[i]){
                    
                    System.out.println("Los arrays son iguales");
                    
                }else{
                    System.out.println("Los arrays NO son iguales");
                }
            
            }
            
        }

    }
}
