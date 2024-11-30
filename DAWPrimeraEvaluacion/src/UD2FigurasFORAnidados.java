import java.util.Scanner;


public class UD2FigurasFORAnidados {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        int size = 0;
        final String intro = "Introduzca el tamaño de las figuras (Entero entre 4 y 20): ";
        
        System.out.print(intro);
        
        while(!input.hasNextInt() || (size = input.nextInt()) < 4 || size >= 20) {
            input.nextLine();
            System.out.println("ERROR: Introduzca un entero válido");
            System.out.print(intro);
        
        }
        input.nextLine();
        
        //Cuadrado:
        for(int i = 1; i <= size; i++){
            for(int j = 1; j < size; j++){
            System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println("--------------------");
        
        //triángulo:
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        
        //Triángulo invertido
        for(int i = size; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
