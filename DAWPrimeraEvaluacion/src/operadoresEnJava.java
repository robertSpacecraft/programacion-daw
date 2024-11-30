
public class operadoresEnJava {
    public static void main(String[] args) {
      
        double num1 = 10.5;
        double num2 = 3.2;
        double num3 = -2.8;
        double num4 = 0.0;

        // Operadores aritméticos
        double sum = num1 + num2;
        double rest = num1 - num3;
        double produc = num1 * num2;
        double div = num1 / num2;
        double resto = num1 % num2;

        // Operadores de asignación
        num1 += num2;
        num2 *= 2;

        // Operadores unitarios
        double positivo = +num3;  
        double negativo = -num3; 
        num4++;  // Incremento
        num3--;  // Decremento 

        // Operadores de comparación
        boolean mayor = num1 > num2;
        boolean menor = num3 < num4;
        boolean igual = num1 == num4;
        boolean desIgual = num2 != num3;

        // Operadores lógicos
        boolean logico1 = mayor && menor;
        boolean logico2 = igual || desIgual;

        // Impirmimos por la consola
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + rest);
        System.out.println("Multiplicación: " + produc);
        System.out.println("División: " + div);
        System.out.println("Resto: " + resto);
        System.out.println("num1 con asignación: " + num1);
        System.out.println("num2 con asignación: " + num2);
        System.out.println("Valor positivo: " + positivo);
        System.out.println("Valor negativo: " + negativo);
        System.out.println("num4 Incrementado: " + num4);
        System.out.println("num3 decrementado: " + num3);
        System.out.println("Es num1 mayor que num2? " + mayor);
        System.out.println("Es num3 menor que num4? " + menor);
        System.out.println("Es num1 igual a num4? " + igual);
        System.out.println("Es num2 distinto de num3? " + desIgual);
        System.out.println("Operador AND: " + logico1);
        System.out.println("Operador OR: " + logico2);
    }
}