/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */

import java.util.Scanner;
public class UD2ActividadExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un número del 1 al 7: ");
        while (!input.hasNextInt() || (dia = input.nextInt()) < 1 || dia > 7){
            System.out.println("Por favor, introduzca un valor correcto");
            System.out.print("Introduzca un número del 1 al 7: ");
            input.nextLine();
        
        }
        
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        main(args);
    }
    
}
