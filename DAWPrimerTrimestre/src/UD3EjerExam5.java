/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class UD3EjerExam5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] matrixA = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int[][] matrixB = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] += matrixB[matrixA.length -1 - i][matrixA.length - 1 - j];
                
            }
            
        }
        
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(" " + matrixA[i][j]);
                
            }
            System.out.println(" ");
        }
        
    }
    
}
