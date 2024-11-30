/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;
public class UD2ActividadExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Elija la altura deseada: ");
        altura = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < altura; i++) {
            System.out.println("*    *");
        }
        
        System.out.println(" **** ");
    }
    
}
