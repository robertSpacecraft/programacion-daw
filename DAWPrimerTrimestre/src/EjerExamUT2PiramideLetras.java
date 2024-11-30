/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;
public class EjerExamUT2PiramideLetras {
    public static void main(String[] args) {
        int size = 0;
        String abc = "abcdefghijklmnñopqrstuvwxyz";//Debe imprimirse solo la parte correspondiente.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce la altura: ");
        while (!input.hasNextInt() || (size = input.nextInt()) <= 0){
            System.out.println("Por favor, introduce un número entero mayor que 0");
            System.out.print("Introduce la altura: ");
            input.nextLine();
        }
        
        
        for (int i = 0; i < size; i++) {
                    //Claculo los indices de inicio y fin del substring:
        int indexInicio = (i*(i+1)) / 2;
        int indexFin = indexInicio + (i + 1);
        
            for (int j = 0; j < size; j++) {
                
        
                System.out.print(j < size -1 -i ? " " : abc.substring(indexInicio,indexFin));
            }
            System.out.println(" ");   
        }
        
    }
    
}
    
