/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Robert
 */
public class UD3_3Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        int sumaFila = 0;
        int sumaColum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                sumaFila += matrix[i][j]; 
                System.out.print("  " + matrix[i][j]);

            }
            System.out.println(" | " + sumaFila);
        }
        System.out.println("----------------------------------");
        for (int j = 0; j < matrix[0].length; j++) {
            sumaColum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumaColum += matrix[i][j];               
            }
            System.out.print(" " + sumaColum);
            
        }
    }

}
