package programacionProblemas;

//Roberto Amorós Linares

import java.util.Scanner;

public class UT2Problema4Excepciones {

    public static void main(String[] args) {
        //Inicializamos el escaner, definimos las variables y los textos iniciales
        Scanner input = new Scanner(System.in);

        int tryNum = 0; //Marca el número de intentos que puede tener el usuario
        double secretNum; //Número que se genera aleatoriamente
        int userNum = 0; //Número que introduce el usuario.
        int errorVariation; //Sirve para calcular la variación del error cuando el jugador introduce el número con respecto al numero que debe acertar.
        boolean inputControlTry = true;// para el control de entrada del número de intentos
        boolean inputControlUser = true; //Para el control de entrada de los intentos

        System.out.println("BIENVENIDO AL JUEGO: ADIVIDA EL NÚMERO SECRETO");
        //Generamos un numero aleatorio entre 1 y 99
        secretNum = (Math.random() * 99) + 1;
        int secretNumEntero = (int) secretNum; //Número entero generado aleatoriamente que debe adivinar el usuario

        System.out.println("Aleatorio: " + secretNumEntero);

        while (inputControlTry) {
            System.out.print("¿De cuantos intentos quieres dísponer?: ");
            tryNum = input.nextInt();

            if (tryNum > 1 && tryNum < 99) {
                inputControlTry = false;
                
            } else {
                System.out.println("ERROR: Debes elegir un número entre 1 y 99");

            }

        }

        //Variable para mostrar el número de intentos:
        int control = 1;

        while (tryNum > 0) {
            inputControlUser = true;
            while (inputControlUser) {
                System.out.println("Intento: " + (tryNum - tryNum) + control);
                userNum = input.nextInt();
                if (userNum < 1 || userNum > 99) {
                    System.out.println("ERROR: Introduzca un número entre 1 y 99");
                } else {
                    inputControlUser = false;
                    tryNum--;
                    control++;
                }
            }
            errorVariation = Math.abs(secretNumEntero - userNum);//Calcula la variación con valor absoluto

            //Comprobamos si el número introducido es igual al numero aleatorio:
            if (userNum == secretNumEntero) {

                System.out.println("¡Enhorabuena, has acertado el número!");
                tryNum = 0;

            } else if (userNum != secretNumEntero) {

                if (errorVariation >= 30) {
                    System.out.println("Frio");

                } else if (errorVariation < 30 && errorVariation > 10) {
                    System.out.println("Templado");

                } else if (errorVariation < 10) {
                    System.out.println("Caliente");

                }

            }

            if (userNum != secretNumEntero && tryNum == 0) {
                System.out.println("Has perdido, el númeor era: " + secretNumEntero);

            }

        }

    }

}
