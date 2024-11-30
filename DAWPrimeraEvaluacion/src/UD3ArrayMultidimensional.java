
import java.util.Scanner;

public class UD3ArrayMultidimensional {

    public static void main(String[] args) {

        int x = 5;
        int y = 2;

        int[][] arrayMulti = new int[x][y];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                
                System.out.print("Introduce un valor para arrayMulti[" + i + "][" + j + "]: ");
                arrayMulti[i][j] = input.nextInt();

            }

        }

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {

                System.out.print("El valor de arrayMulti en la posición: [" + i + "][" + j + "] es: " + arrayMulti[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
