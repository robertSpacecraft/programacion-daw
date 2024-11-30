/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class UD3EjerExam4 {

    public static void main(String[] args) {

        float[][] matrixA = {
            {10, 20},
            {30, 40}
        };
        float[][] matrixB = {
            {5, 15},
            {25, 35}
        };

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixB[i][j] += matrixA[i][j];
            }

        }

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(" " + matrixB[i][j]);
            }
            System.out.println(" ");
        }
    }

}
