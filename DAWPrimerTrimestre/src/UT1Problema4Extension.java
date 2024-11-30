package programacionProblemas;

import java.util.Scanner;

public class UT1Problema4Extension {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Pedimos al usuario las constantes y las asignamos a las variables
        System.out.println("Introduce las constantes para un sistema 3x3");

        System.out.print("Introduzca el parámetro (aX): ");
        float aX = s.nextFloat();
        System.out.print("Introduzca el parámetro (bX): ");
        float aY = s.nextFloat();
        System.out.print("Introduzca el parámetro (cX): ");
        float aZ = s.nextFloat();
        System.out.print("Introduzca el resultado de la ecuación (a): ");
        
        float resultX = s.nextFloat();
        System.out.print("Introduzca el parámetro (aY): ");
        float bX = s.nextFloat();
        System.out.print("Introduzca el parámetro (bY): ");
        float bY = s.nextFloat();
        System.out.print("Introduzca el parámetro (cY): ");
        float bZ = s.nextFloat();
        System.out.print("Introduzca el resultado de la ecuación (b): ");
        float resultY = s.nextFloat();
        
        System.out.print("Introduzca el parámetro (aZ): ");
        float cX = s.nextFloat();
        System.out.print("Introduzca el parámetro (bZ): ");
        float cY = s.nextFloat();
        System.out.print("Introduzca el parámetro (cZ): ");
        float cZ = s.nextFloat();
        System.out.print("Introduzca el resultado de la ecuación (z): ");
        float resultZ = s.nextFloat();
        
        String ecuacionX = String.valueOf(aX) + "x + " + String.valueOf(aY) + "y + " +
                String.valueOf(aZ) + "z = " + String.valueOf(resultX);
        String ecuacionY = String.valueOf(bX) + "x + " + String.valueOf(bY) + "y + " +
                String.valueOf(bZ) + "z = " + String.valueOf(resultY);
        String ecuacionZ = String.valueOf(cX) + "x + " + String.valueOf(cY) + "y + " +
                String.valueOf(cZ) + "z = " + String.valueOf(resultZ);

        //Calculamos el determinante de la matriz (Usamos la matriz reducida)
        float determinanteA = aX * (bY * cZ - bZ * cY) - bX * (aY * cZ - aZ * cY) + cX * (aY * bZ - aZ * bY);

        //Calculamos los determinantes de X, Y y Z (usamos la matriz reducida)
        float determinanteX = resultX * (bY * cZ - bZ * cY) - bX *(resultY * cZ - resultZ * cY) + cX * (resultY * bZ - resultZ * bY);
        float determinanteY = aX * (resultY * cZ - resultZ * cY) - resultX * (aY * cZ - aZ * cY) + cX * (aY * resultZ - aZ * resultY);
        float determinanteZ = aX * (bY * resultZ - bZ * resultY) - bX * (aY * resultZ - aZ * resultY) + resultX * (aY * bZ - aZ * bY);

        //Aplicamos la regla de Cramer para obtener las soluciones (Dividimos el determinante de X, Y y Z entre el determinante de A)
        float x = determinanteX/determinanteA;
        float y = determinanteY/determinanteA;
        float z = determinanteZ/determinanteA;
        
        //Comprobamos los resultados
        double ecuacionXPrueba = (aX * x) + (aY * y) + (aZ * z);
        double ecuacionYPrueba = (bX * x) + (bY * y) + (bZ * z);
        double ecuacionZPrueba = (cX * x) + (cY * y) + (cZ * z);
        
        //Imprimimos la solución por pantalla
        System.out.println("SISTEMA D'ECUACIONS LINEALS");
        System.out.println("----------------------------");
        
        System.out.println(ecuacionX);
        System.out.println(ecuacionY);
        System.out.println(ecuacionZ);
        
        System.out.println("\nSOLUCIÓ PER CRAMER");
        System.out.println("------------------");
        
        System.out.printf("x = %.2f", x);
        System.out.printf("\ny = %.2f", y);
        System.out.printf("\ny = %.2f", z);
        
        System.out.println("\n\nCOMPROVACIÓ DONADA LA 'X'");
        System.out.println("----------------------------");
        
        System.out.printf("x = %.2f", ecuacionXPrueba);
        System.out.printf("\ny = %.2f", ecuacionYPrueba);
        System.out.printf("\nz = %.2f", ecuacionZPrueba);        

    }
}
