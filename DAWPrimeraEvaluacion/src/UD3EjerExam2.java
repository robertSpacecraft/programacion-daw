/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class UD3EjerExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userNum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Elija un número del 1 al 10: ");
        while (!input.hasNextInt() || (userNum = input.nextInt()) < 0 || userNum > 10 ){
            System.out.println("Por favor, introduzca un valor válido");
            System.out.print("Elija un número del 1 al 10: ");
  
        }
        for (int i = 0; i < userNum; i++) {
            for (int j = 0; j < userNum; j++) {
                if(i%2 == 0){
                System.out.print("+- ");
                }else{
                    System.out.print("-+ ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
}
