/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class MiEjercicio1 {
    
    public static String matrixSize = "Por favor, establezca el tamaño de la matriz:";
    public static String menuSelection = "¿Qué deseas hacer?: ";

    public static Scanner input = new Scanner(System.in);
    
    public static int[][] matrix;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();

    }//Fin de main()
    
    //Menu Principal
    public static void menuPrincipal() {

        System.out.println("-----------------------------");
        System.out.println("------------MENU-------------");
        System.out.println("-----------------------------");
        System.out.println("1- Genarar Matriz aleatoria");
        System.out.println("2- Generar patrones");
        System.out.println("3- Opera con arrays");

        System.out.print("¿Qué deseas hacer?: ");
        
        int option = 0;
        while (!input.hasNextInt() || (option = input.nextInt()) < 0 || option > 3) {
            System.out.println("Por favor, introduce una opción válida...");
            System.out.print("¿Qué deseas hacer: ");
            input.nextLine();
        }

        switch (option) {
            case 1:
                matrix();
                menu1();
                break;
            case 2:
                menuFormas();
                break;
            case 3:
                break;

        }

    }

    //Menu 1
    public static void menu1() {
        
        System.out.println("1- Sumar una fila");
        System.out.println("2- Sumar una columna");
        System.out.println("3- sumar la diagonal");
        System.out.println("4- sumar la subdiagonal");
        System.out.println("5- Sumar todos los valores");
        System.out.println("6- Volver al menú principal");
        
        int option = validation(input, 0, 6, menuSelection);
        
        switch (option){
            case 1:
                sumaFila(input);
                menu1();
                break;
            case 2:
                sumaColum(input);
                menu1();
                break;
            case 3:
                sumaDiag();
                menu1();
                break;
            case 4:
                sumaSubdiag();
                menu1();
            case 5:
                sumaTotal();
                menu1();
            case 6:
                menuPrincipal();
              
        }

    }
    public static void menuFormas(){
        
        System.out.println("1- Cuadrado");
        System.out.println("2- Triángulo");
        System.out.println("3- Triángulo Invertido");
        System.out.println("4- Triángulo espejo");
        System.out.println("5- Pirámide");
        System.out.println("6- Pirámide Invertida");
        System.out.println("7- Volver al menú principal");
        
        int option = validation(input, 0, 7, menuSelection);
        
        switch (option){
            case 1: 
                cuadrado(input);
                menuFormas();
                break;
            case 2:
                triangulo(input);
                menuFormas();
                break;
            case 3:
                trianguloInvert(input);
                menuFormas();
                break;
            case 4:
                trianguloEspejo(input);
                menuFormas();
            case 5:
                piramide(input);
                menuFormas();
                break;
            case 6:
                piramideInvertida(input);
                menuFormas();
                break;
            case 7:
                menuPrincipal();
                break;
        
        }
    
    }
    
    
    
    //Suma una fila de la matriz
    public static void sumaFila(Scanner input){
        System.out.print("¿Qué fila desea sumar: ");
        int fila = input.nextInt();
        int suma = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            suma += matrix[fila][i];
            
        }
        System.out.println("La fila " + fila + " suma: " + suma);
    }
    
    //Suma un columna de la matriz
    public static void sumaColum(Scanner input){
        System.out.print("¿Qué columna deseas sumar?: ");
        int columna = input.nextInt();
        int suma = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            suma += matrix[i][columna];            
        }
        System.out.println("La columna " + columna + " suma " + suma);
    }
    
    //suma la diagonal
    public static void sumaDiag(){
    int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
                suma += matrix[i][i];
            
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }
    
    //suma subdiagonal
    public static void sumaSubdiag(){
    int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
            suma += matrix[i][matrix[i].length -1 -i];
            
        }
        System.out.println("La suma de la subdiagonal es: " + suma);
    }
    
    //Suma todos los valores
    public static void sumaTotal(){
    int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                suma += matrix[i][j]; 
                
            }
            
        }
        System.out.println("La suma de todos los elementos es: " + suma);
    }
    
    //Validación
    public static int validation(Scanner input, int min, int max, String message){
        int valor = 0;
        System.out.print(message);
        while (!input.hasNextInt() || (valor = input.nextInt()) < min || valor > max) {
            System.out.println("Por favor, introduzca un valor válido...");
            System.out.print("Intentalo de nuevo: ");
            input.nextLine();
        }
        return valor;
    }
    
    public static int[][] matrix(){
            int size = validation(input, 0, 10, matrixSize);
        matrix = new int[size][size];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print("  " + matrix[i][j]);
            }
            System.out.println(" ");
            
        }
    return matrix;
    }
    
    //Genera un cuadrado con asteriscos
    public static void cuadrado(Scanner input){
        System.out.print("Selecciona el tamaño del cuadrado: ");
    int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("  *");
            }
            System.out.println(" ");
        }
    
    }
    
    //Genera un triangulo con asteriscos
    public static void triangulo(Scanner input){
        System.out.print("Indica la altura del triángulo: ");
    int size = input.nextInt();
    
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
    //Genera un triángulo invertido
    public static void trianguloInvert(Scanner input){
        System.out.print("Seleciones el tamaño del triángulo: ");
        int size = input.nextInt();
        
        for (int i = size; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
            
        }      
    }
    
    //Genera un triángulo en espejo
    public static void trianguloEspejo(Scanner input){
        System.out.print("Indica la altura del triángulo en espejo: ");
    int size = input.nextInt();
    
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {               
                System.out.print(j < size - i - 1 || j > size + i - 1 ? "  " : "* ");
            }
            System.out.println(" ");
        }
    }
    //Pirámide de asteriscos
    public static void piramide(Scanner input){
        System.out.print("Seleccione la altura de la prirámide: ");
        int size = input.nextInt();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(j < size - i -1 ? " " : "* ");
            }
            System.out.println(" ");
        }
    
    }
    
    public static void piramideInvertida(Scanner input){
        System.out.print("Seleccione la altura de la pirámide: ");
        int size = input.nextInt();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size -1 -i; j++) {
                System.out.print(j < i || j >= 2 * size -i -1 ? " " : "* ");
            }
            System.out.println(" ");
        }
        
    }

}
