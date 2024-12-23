/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class PruebaMatriz {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}        
        };
        
        //imprimo unafila
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Los números son: " + matrix[0][j]);
            
        }
    }
    
}
