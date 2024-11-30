/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class ValidacionDatosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arraySize = 10;
        float userInput = -1;
        float[] arrayMedia = new float[arraySize];
        
        for (int i = 0; i < arrayMedia.length; i++) {
            System.out.print("Introduce el número " + i + ": ");
        
        
        boolean validNumber = false;
        while (!validNumber){
            if (input.hasNextFloat()){
                userInput = input.nextFloat();
             
            if (userInput > 0 && userInput < 10){
                validNumber = true;
            } else {
                System.out.println("El númeor debe estar ente 0 y 10");
                input.nextLine();
            } 
            }else {
            
                System.out.println("El caracter no es válido");
                input.nextLine();
            }  
                
        
        }
        arrayMedia[i] = userInput;
        input.nextLine();
        }
        for (int i = 0; i < arrayMedia.length; i++) {
            System.out.println("El número en la posición " + i + " es: " + arrayMedia[i]);
        }
    }

}
