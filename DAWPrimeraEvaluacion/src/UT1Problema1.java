package programacionProblemas;

import java.util.Scanner;

public class UT1Problema1 {
    public static void main(String[] args) {
        
        //Creamos las variables necesarías para el calculo de los problemas:
        //Circulo:
        double pi = 3.14;
        double radio;
        double perimetroCirculo;
        
        //Declaramos s del objeto Scanner
        Scanner s = new Scanner(System.in);
        
        System.out.println("Dame el rádio del círculo en metros: ");
        radio = s.nextDouble();
        
        //Calculamos el perímetro usando su fórmula:
        perimetroCirculo = 2*pi*radio;
        
        System.out.printf("El perímetro del círculo con radio: %.2f m es: %.2f m\u00b2 ", radio, perimetroCirculo); 
        
        //Rectángulo
        double base = 0;
        double altura = 0;
        double perimetroRectangulo = 0;
        
        System.out.println("\n\nDame la medida de la base del rectángulo en metros: ");
        base = s.nextDouble();
        System.out.println("Dame la medida de la altura del rectángulo en metros: ");
        altura = s.nextDouble();
        
       //Calculamos el perimetro usando su fórmula:
       perimetroRectangulo = 2*(base + altura); 
       
       System.out.printf("El perímetro del rectángulo con base: %.2f m y altura: %.2f m es: %.2f m\u00b2", base, altura, perimetroRectangulo);
       
       System.out.printf("\n\nHasta el momento hemos calculado el círculo con P= %.2f m\u00b2 y el rectangulo con p= %.2f m\u00b2", perimetroCirculo, perimetroRectangulo);
       
       //Triángulo:
       double cateto1;
       double cateto2;
       double hipotenusa;
       double perimetroTriangulo;
       
       System.out.println("\n\nMe gusta el teorema de Pitágoras. Dame el valor del cateto 1: ");
       cateto1 = s.nextDouble();
       System.out.println("\nMe gusta el teorema de Pitágoras. Dame el valor del cateto 1: ");
       cateto2 = s.nextDouble();
       
       //Calculamos la hipotenusa con el teorema de pitágoras:
       hipotenusa = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
       
       //Calculamos el perímetro ahora que disponemos de todos los datos:
       perimetroTriangulo = cateto1 + cateto2 + hipotenusa;
       
       System.out.printf("\nDe acuerdo al valor de la hipotenusa al cuadrado %.2f m, el perímetro del triángulo es de %.2f m\u00b2 ", hipotenusa, perimetroTriangulo);
               
    }
    
}
