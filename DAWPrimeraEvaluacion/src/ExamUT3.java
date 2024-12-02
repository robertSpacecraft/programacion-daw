/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muestras
 */
public class ExamUT3 {
    public static void main(String[] args) {
        final int semana = 7;
        final String[] SEMANA = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        float[] elda = new float[semana];
        float[] noveldaMax = new float[semana];
        float[] noveldaMin = new float[semana];
        float[] petrer = new float[semana];


        float[][] tempNovelda = {
            {11, 22},
            {12, 21},
            {10, 19},
            {11, 18},
            {15, 20},
            {9, 11},
            {7, 9}

        };
        float[][] tempPetrer = {
            {3, 9},
            {2, 8},
            {1, 4},
            {2, 6},
            {4, 5},
            {7, 9},
            {8, 11}

        };

        float[][] tempElda = {
            {19, 25},
            {1, 3},
            {16, 24},
            {15, 23},
            {15, 24},
            {14, 22},
            {13, 20}

        };
        
        for (int i = 0; i < tempNovelda.length; i++) {
            for (int j = 0; j < 10; j++) {
                            if (i % 2 == 0){
            noveldaMin[i] = tempNovelda[i][j]; 
                
            }else {
                 noveldaMax[i] = tempNovelda[i][j];           
           }

            
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Min: " + noveldaMin[i]);
            System.out.println("Max: " + noveldaMax[i]);
        }


    }
    
}
