//De dos arrays a uno mezclado intercalando posiciones:

import java.util.Scanner;

public class Ejercicio2ArrayMezclado {

    public static void main(String[] args) {

        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayAB = new int[arrayA.length + arrayB.length];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrayA.length; i++) {

            System.out.print("Introduzca los números de las posiciones " + i + " del arrayA: ");
            while (!input.hasNextInt() || (arrayA[i] = input.nextInt()) < 0 || arrayA[i] > 10) {

                System.out.println("Error, introduzca un valor correcto");
                System.out.print("Introduzca los números de las posiciones " + i + " del arrayA: ");
                input.nextLine();
            }
        }

        for (int i = 0; i < arrayB.length; i++) {

            System.out.print("Introduzca los números de las posiciones " + i + " del arrayB: ");
            while (!input.hasNextInt() || (arrayB[i] = input.nextInt()) < 0 || arrayB[i] > 10) {
                System.out.println("Error, introduzca un valor correcto");
                System.out.print("Introduzca los números de las posiciones " + i + " del arrayB: ");
                input.nextLine();

            }
        }
        int j = 0;
        for (int i = 0; i < arrayA.length; i++) {

            arrayAB[j++] = arrayA[i];
            arrayAB[j++] = arrayB[i];
        }

        for (int i = 0; i < arrayAB.length; i++) {

            System.out.println("El arrayAB en la posición: " + i + " tiene el valor " + arrayAB[i]);

        }
    }
}
