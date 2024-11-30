/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class UD3EjerExam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userNum = 0;
        int suma = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        while(!input.hasNextInt() || (userNum = input.nextInt()) < 0 || userNum > 10){
            System.out.println("Por favor, introduzca un número válido");
            System.out.print("Introduzca un número: ");
        }
        
        for (int i = 0; i < userNum; i++) {
            for (int j = 0; j < userNum; j++) {
                
                System.out.print(suma + " ");
                suma++;
                
            }
            System.out.println(" ");
        }
    }
    
}
