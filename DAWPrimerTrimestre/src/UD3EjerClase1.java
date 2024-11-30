
import java.util.Scanner;

public class UD3EjerClase1 {

    public static void main(String[] args) {

        int filas = 0;
        int columnas = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz: ");
        while (!input.hasNextInt() || (filas = input.nextInt()) < 0 || filas > 10) {
            input.nextLine();
        }
        columnas = filas;

        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        System.out.println("Imprimimos diagonal principal en formato diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    "); // Ajusta los espacios según prefieras
            }
            System.out.println(matrix[i][i]); // Imprime solo una vez el elemento de la diagonal
        }

    }

}
