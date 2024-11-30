/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;
import java.util.Random;

public class EjerExamWhatsapp1 {

    /**
     * @param args the command line arguments
     */
    final static int MATRIX_SIZE = 4;
    static int[][] matrix;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
        

    }

    //Menú
    public static void menu() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------MENÚ------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("1- Rellenar la Matriz.");
        System.out.println("2- Sumar los valores de la fila: ");
        System.out.println("3- Sumar los valores de la columna: ");
        System.out.println("4- Obtener la media aritmética de los valores pares");
        System.out.println("5- Muestra la cantidad de veces que aparece el valor: ");
        System.out.println("0- Pulse 0 para salir: ");
        System.out.println("-------------------------------------------------------");
        System.out.print("Esperando entrada: ");

        int optionMenu = -1;

        while (!input.hasNextInt() || (optionMenu = input.nextInt()) < 0 || optionMenu > 5) {
            System.out.println("Introduce un valor una opción correcta...");
            System.out.print("Esperando entrada: ");
            input.nextLine();
            menu();
        }

        switch (optionMenu) {
            case 1:
                System.out.println("La matriz generada es: ");
                matrix();
                menu();
                break;
            case 2:
                sumaFila(input);
                menu();
                break;
            case 3:
                sumaColum(input);
                menu();
                break;
            case 4:
                media();
                menu();
                break;
            case 5:
                repeat();
                menu();
                break;
            case 0:
                System.out.println("Saliendo del programa... ¡hasta pronto!");
                System.exit(0);
                break;

        }

    }

    //Genera una matriz aleatoria con números entre 0 y 9
    public static int[][] matrix() {
        matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(" " + matrix[i][j]);

            }
            System.out.println(" ");
        }
        return matrix;
    }
    
    //Suma la fila que elija el usuario
    public static int sumaFila(Scanner input){
        System.out.print("¿Qué fila deseas sumar?: ");
        int fila = input.nextInt();
        input.nextLine();
        int suma = 0;
        if (fila > matrix.length || fila < 0){
            System.out.println("La fila selecionada no existe.");
            sumaFila(input);
        }else {
        for (int i = 0; i < matrix.length; i++) {
                suma += matrix[fila][i];       
        }
        System.out.println("La suma de la fila " + fila + " es: " + suma);
        }
        return suma;
    }

    //suma la columna que elija el usuario
    public static int sumaColum(Scanner input){
        System.out.println("¿Qué columna deseas sumar?: ");
    int colum = input.nextInt();
    int suma = 0;
        if(colum > matrix.length || colum < 0){
            System.out.println("La columna seleccionada no existe.");
            sumaColum(input);
        } else {
        for (int i = 0; i < matrix.length; i++) {    
                suma += matrix[i][colum];                
        }
        System.out.println("La suma de la columan " + colum + " es: " + suma);
        }
    return suma;
    }
    
    //Calcula la media de todos los valores
    public static void media(){
    int suma = 0;
    float result;
    int contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2 == 0){
                suma += matrix[i][j];
                contador++;
                }
            }            
        }
        result = (float) suma/contador;
        System.out.println("La meida de los valores de la matriz es: " + result);        
    }
    
    //Calcula las veces que se repite un valor:
    public static void repeat(){
    int[] index = new int[10];
    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    index[0] += 1;                   
                }
               if (matrix[i][j] == 1){
                    index[1] += 1;                   
                }
               if (matrix[i][j] == 2){
                    index[2] += 1;                   
                }
               if (matrix[i][j] == 3){
                    index[3] += 1;                   
                }
               if (matrix[i][j] == 4){
                    index[4] += 1;                   
                }
                if (matrix[i][j] == 5){
                    index[5] += 1;                   
                }
                if (matrix[i][j] == 6){
                    index[6] += 1;                   
                }
                if (matrix[i][j] == 7){
                    index[7] += 1;                   
                }
                if (matrix[i][j] == 8){
                    index[8] += 1;                   
                }
                if (matrix[i][j] == 9){
                    index[9] += 1;                   
                }
            }
            
        }
        for (int i = 0; i < index.length; i++) {
            System.out.println("Cantidad de veces que se repite el valor " + i + ": " + index[i]);
        }
        
    }
    
}
