/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class EjerExamenUT3Temperaturas {

    public static void main(String[] args) {
        final int semana = 7;
        final int registrosTemp = 2;
        final String[] SEMANA = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
  


        float[][] tempNovelda = {
            {11, 22},
            {12, 21},
            {10, 19},
            {11, 18},
            {15, 20},
            {9, 30},
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
        
        //Variables Elda
        float tempMinElda = 100;
        float tempMaxElda = 0;
        int diaMinElda = 0; 
        int diaMaxElda = 0;
        
        //variables Novelda:
        float tempMinNovelda = 100;
        float tempMaxNovelda = 0;
        int diaMinNovelda = 0; 
        int diaMaxNovelda = 0;
        
        //Variables Petrer:
        float tempMinPetrer = 100;
        float tempMaxPetrer = 0;
        int diaMinPetrer = 0; 
        int diaMaxPetrer = 0;
        
        
        for (int i = 0; i < semana; i++) {
       
                if(tempElda[i][0] < tempMinElda){
                tempMinElda = tempElda[i][0];
                diaMinElda = i;                
                }
                if (tempElda[i][1] > tempMaxElda){
                tempMaxElda = tempElda[i][1];
                diaMaxElda = i;
                }
                if (tempNovelda[i][0] < tempMinNovelda){
                    tempMinNovelda = tempNovelda[i][0];
                    diaMinNovelda = i;
                }
                if (tempNovelda[i][1] > tempMaxNovelda) {
                    tempMaxNovelda = tempNovelda[i][1];
                    diaMaxNovelda = i;
                }
                if (tempPetrer[i][0] < tempMinPetrer){
                    tempMinPetrer = tempPetrer[i][0];
                    diaMinPetrer = i;
                }
                if(tempPetrer[i][1] > tempMaxPetrer){
                tempMaxPetrer = tempPetrer[i][1];
                diaMaxPetrer = i;
                }

        }
        //comparamos las variables para obtener la temperatura más baja:
        if (tempMinElda <= tempMinNovelda && tempMinElda <= tempMinPetrer){
            System.out.println("La temperatura más baja fue de: " + tempMinElda + " y se registró en Elda el día " + SEMANA[diaMinElda]);            
        
        } else if (tempMinNovelda <= tempMinElda && tempMinNovelda <= tempMinPetrer){
        System.out.println("La temperatura más baja fue de: " + tempMinNovelda + " y se registró en Novelda el día " + SEMANA[diaMinNovelda]);
        
        }else if (tempMinPetrer <= tempMinNovelda && tempMinPetrer <= tempMinElda){
        System.out.println("La temperatura más baja fue de: " + tempMinPetrer+ " y se registró en Petrer el día " + SEMANA[diaMinPetrer]);
        } 
        
        //comparamos las variables para obtener la temperatura más alta:
        if (tempMaxElda >= tempMaxNovelda && tempMaxElda >= tempMaxPetrer){
            System.out.println("La temperatura más alta fue de: " + tempMaxElda + " y se registró en Elda el día " + SEMANA[diaMaxElda]);            
        
        } else if (tempMaxNovelda >= tempMaxElda && tempMaxNovelda >= tempMaxPetrer){
        System.out.println("La temperatura más alta fue de: " + tempMaxNovelda + " y se registró en Novelda el día " + SEMANA[diaMaxNovelda]);
        
        }else if (tempMaxPetrer >= tempMaxNovelda && tempMaxPetrer >= tempMaxElda){
        System.out.println("La temperatura más alta fue de: " + tempMaxPetrer+ " y se registró en Petrer el día " + SEMANA[diaMaxPetrer]);
        } 
        
        
        
    }
}
