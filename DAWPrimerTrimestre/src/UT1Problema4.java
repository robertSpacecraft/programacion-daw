package programacionProblemas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class UT1Problema4 {
    public static void main(String[] args){
        
        //Empezamos declarando las variables que conocemos
    
        float numX1 = 3.4f;
        float numX2 = 2.1f;
        float numY1 = 50.2f;
        float numY2 = 0.55f;
        
        float res1 = 44.5f;
        float res2 = 5.9f;
        
        String ecuacion1 = "3.4x + 50.2y = 44.5";
        String ecuacion2 = "2.1x + 0.55y = 5.9";
        
        //debemos convertir el sistema de ecuaciones en una matriz y calcular su determinante
        float determinanteA = (numX1 * numY2) - (numX2 * numY1);
        float determinanteX = (res1 * numY2) - (res2 * numY1);
        float determinanteY = (numX1 * res2)-(numX2 * res1);
        
        //Aplicamos la regla de Cramer
        float x = determinanteX / determinanteA;
        float y = determinanteY / determinanteA;
        
        //Comprobamos los resultados
        double ecuacion1Prueba = (3.4*x) + (50.2*y);
        double ecuacion2Prueba = (2.1*x) + (0.55*y);
        
        //Imprimimos la solución por pantalla
        System.out.println("SISTEMA D'ECUACIONS LINEALS");
        System.out.println("----------------------------");
        
        System.out.println(ecuacion1);
        System.out.println(ecuacion2);
        
        System.out.println("\nSOLUCIÓ PER CRAMER");
        System.out.println("------------------");
        
        System.out.printf("x = %.2f", x);
        System.out.printf("\ny = %.2f", y);
        
        System.out.println("\n\nCOMPROVACIÓ DONADA LA 'X'");
        System.out.println("----------------------------");
        
        System.out.printf("x = %.2f", ecuacion1Prueba);
        System.out.printf("\ny = %.2f", ecuacion2Prueba);
    }
    
}
