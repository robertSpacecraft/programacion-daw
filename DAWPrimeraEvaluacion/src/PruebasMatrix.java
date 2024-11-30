import java.util.Scanner;

public class PruebasMatrix {
    public static void main(String[] args) {
        int matrixSize = 0;
        boolean validar = false;
        int filas = 0;
        int columnas = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (!validar){
            System.out.print("Introduce el tamaño de la Matriz cuadrada: ");
            if (!input.hasNextInt() || (matrixSize = input.nextInt()) < 0 || matrixSize > 10){
                System.out.println("Error, introduzca un número válido");
            }else {
            input.nextLine();
            validar = true; 
            
            }
        
        }
        
        int[][] matrix = new int[matrixSize][matrixSize];
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Introduce los datos: " + "i: " + i + " y " + "j: " + j + "\t");
         
                   matrix[j][i] = input.nextInt();         
            }
            input.nextLine();
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
