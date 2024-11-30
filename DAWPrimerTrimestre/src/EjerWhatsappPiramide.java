import java.util.Scanner;

public class EjerWhatsappPiramide {

    public static void main(String[] args) {
        int size = 0;
        String abc = "abcdefghijklmnñopqrstuvwxyz";

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");

        while (!input.hasNextInt() || (size = input.nextInt()) < 0) {
            System.out.println("Por favor, introduce un valor correcto");
            input.nextLine(); // Limpiar entrada
            System.out.print("Introduce la altura de la pirámide: ");
        }

        // Construcción de la pirámide
        int currentCharIndex = 0; // Índice actual en el alfabeto
        for (int i = 0; i < size; i++) {
            // Calcular espacios iniciales para centrar
            int espacios = size - i - 1;

            // Imprimir espacios iniciales
            for (int s = 0; s < espacios; s++) {
                System.out.print(" ");
            }

            // Generar la fila de caracteres
            StringBuilder fila = new StringBuilder();
            for (int j = 0; j < (2 * i + 1); j++) { // Cada fila tiene 2*i+1 caracteres
                fila.append(abc.charAt(currentCharIndex));
                currentCharIndex = (currentCharIndex + 1) % abc.length(); // Avanzar y reiniciar si llega al final
            }

            // Imprimir la fila
            System.out.println(fila.toString());
        }
    }
}

