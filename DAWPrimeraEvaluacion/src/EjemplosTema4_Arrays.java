/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Arrays;
public class EjemplosTema4_Arrays {

    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 40, 50};
        
        //Uso del for-each
        System.out.println("Elemntos del array: ");
        for (int numero : array){
            System.out.println(numero);
        }
        
        System.out.println("-------------------------");
        
        //Uso del for-each imprimiendo tambiéne el índice: NO RECOMENDADO
        int indice = 0;
        for (int numero : array){
            System.out.println("Índice " + indice + ": " + numero);
            indice++;
        }
        
        System.out.println("-------------------------");
        
        //Con matrices de 2D
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Elementos de la matriz: ");
        int fila = 0;
        for (int[] filaMatriz : matrix){
            int columna = 0;
            for (int elemento : filaMatriz) {
                System.out.println("Posición [" + fila + "][" + columna + "]: " + elemento);
                columna++;
            }
            fila++;
        }
        
        System.out.println("-------------------------");
        
        //Imprimo arrays con Array.toString()
        System.out.println("Array unidimensional: ");
        System.out.println(Arrays.toString(array));
        
        System.out.println("-------------------------");
        
        //Imprimo matricez con Array.deepToString()
        System.out.println("Matriz: ");
        System.out.println(Arrays.deepToString(matrix));      
    }
    
}
