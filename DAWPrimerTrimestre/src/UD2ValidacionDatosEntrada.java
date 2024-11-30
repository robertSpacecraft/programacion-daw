import java.util.Scanner;


public class UD2ValidacionDatosEntrada {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        
        System.out.print("Introduzca un entero entre 0 y 10:");
        
        while(!input.hasNextInt() || (num = input.nextInt()) < 0 || num > 10){
            input.nextLine();
            System.out.println("ERROR: Introduzca un valor válido...");
            
            System.out.print("Introduzca un entero entre 0 y 10:");
        
        }
        input.nextLine();
        System.out.printf("\nEl número introducido es: %d", num);
       
    }
    
}
