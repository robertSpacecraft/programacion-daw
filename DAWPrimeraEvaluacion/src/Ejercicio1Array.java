//Validación entrada datos Array


import java.util.Scanner;

public class Ejercicio1Array {
    public static void main(String[] args) {
        
        int[] array = new int[5];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print("Introduce el numero en la posición: " + i + ": ");
            while(!input.hasNextInt() || (array[i] = input.nextInt()) < 0 || array[i] > 10 ){
            
                System.out.println("Entrada inválidad");
                System.out.print("Introduce el numero en la posición: " + i + ": ");
                input.nextLine();
            }
            
        }
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Array: " + array[i]);
            
        }
    }
    
}
