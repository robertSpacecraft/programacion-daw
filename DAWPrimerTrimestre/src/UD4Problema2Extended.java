//Roberto Amorós Linares
package programacionProblemas;

import java.util.Scanner;
import java.util.Random;

public class UD4Problema2Extended {

    public static Scanner input = new Scanner(System.in);//Inicializamos Scanner

    public static int wordSize = 0;

    //Inicio método main
    public static void main(String[] args) {
         
        wordSize = dificultad(input);
        //Generamos una palabra aleatoria:
        String gameWord = createWord();

        endGame(gameWord);

        //Si la palabra es cocrecta felicitamos y termina el juego si no volvemos a pedir la palabra.
        //Cerramos el Scanner
        input.close();
    }
    //Fin método main

    //Método para generar un caracter aleatorio;
    public static char aleatoryChar() {
        char aleatoryChar;
        Random aleatory = new Random();

        aleatoryChar = (char) (aleatory.nextInt(122 - 97) + 97);

        return aleatoryChar;
    }

    //Método para formar una palabra usando el método aleatoryChar
    public static String createWord() {
        String word = "";
        for (int i = 0; i < wordSize; i++) {

            word += (aleatoryChar());

        }

        return word;
    }

    //Método para comparar las dos cadenas:
    public static String compareWords(String gameWord, String userInput) {
        char green = '0';
        char yellow = 'x';
        char red = '-';
        char[] arrayClue = new char[wordSize];
        int index = 0;
        String clue;

        for (int i = 0; i < wordSize; i++) {
            if (gameWord.charAt(i) == userInput.charAt(i)) {
                arrayClue[i] = green;
            }

            if (gameWord.charAt(i) != userInput.charAt(i)) {
                arrayClue[i] = red;
            }
        }
        for (int i = 0; i < wordSize; i++) {
            if (arrayClue[i] == red) {
                index = gameWord.indexOf(userInput.charAt(i));
                if (index != -1) {
                    arrayClue[i] = yellow;
                }
            }

        }
        clue = new String(arrayClue);

        return clue;
    }

    //Método para validar una cadena de texto
    public static String correctText(String text) {
        while (text.length() != wordSize) {
            System.out.println("Por favor, debe ser una palabra de " + wordSize + " letras.");
            text = inputText(input);
        }

        while (!text.matches("[a-z]+")) {
            System.out.println("Ha introducido un caracter no válido");
            text = inputText(input);
        }

        return text;
    }

    //Método que lee un texto introducido por el usuario
    public static String inputText(Scanner input) {//pasamos el Scanner como parámetro
        System.out.print("Introduce la palabra: ");
        return input.nextLine();
    }

    //Ejecuta los métodos de entrada, de pruba y decide si continua el juego o termina:
    public static void endGame(String gameWord) {
        String clue = "";
        String perfectClue = "0".repeat(wordSize);
        while (!clue.equals(perfectClue)) {
            
            String userInput = inputText(input);
            userInput = correctText(userInput);

            clue = compareWords(gameWord, userInput);
            
            if(!perfectClue.equals(clue)){
            System.out.println("La respuesta es " + clue + " Continua intentándolo");
            }
            else {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + gameWord);
            System.exit(0);
                
            }
        }
   
    }
    //Función para seleccionar la dificultad.
    public static int dificultad(Scanner input){
    int nivel = 0;
        System.out.print("Selecciona el nivel del juego: ");
    while (!input.hasNextInt() || (nivel = input.nextInt()) <= 1 || nivel > 10){
        System.out.println("Por favor, introduce un entero entre 1 y 10");
        System.out.print("Selecciona el nivel del juego: ");
        input.nextLine();
    
    }
    
    
    return nivel;
    }

}
    
