package programacionProblemas;

//Roberto Amorós Linares

import java.util.Scanner;

public class UT2Problema4Extended {

    public static void main(String[] args) {
        //Inicializamos el escaner, definimos las variables y los textos iniciales
        Scanner input = new Scanner(System.in);

        int tryNum = 0; //Marca el número de intentos que puede tener el usuario
        double secretNum; //Número que se genera aleatoriamente
        int userNum = 0; //Número que introduce el usuario.
        int errorVariation; //Sirve para calcular la variación del error cuando el jugador introduce el número con respecto al numero que debe acertar.
        boolean inputControlTry = true;// para el control de entrada del número de intentos
        boolean inputControlUser = true; //Para el control de entrada de los intentos
        boolean inputControlRange = true; //Para el control de entrada del rango de números
        final int ten = 10;
        final int hundret = 100;
        final int thousand = 1000;
        int numMax = 0; //Numero máximo del rango
        int numMin = 0;//Numero mínimo del rango
        int range = 0; //Valor absoluto de la variación del rango

        System.out.println("BIENVENIDO AL JUEGO: ADIVIDA EL NÚMERO SECRETO");
        System.out.println("-----------------------------------------------");


        System.out.println("Selecciona el número de intentos teniendo en cuenta que: ");
        System.out.println("FÁCIL: 15 intentos o más\nMEDIO: Entre 5 y 15 intentos\nDIFÍCIL: 5 intentos o menos ");
        System.out.println("-----------------------------");

        //Controlamos que el usuario introduzca un número de intentos válido
        while (inputControlTry) {
            System.out.println("¿De cuantos intentos quieres dísponer?");
            System.out.print("Elije el número de intentos: ");
            if(input.hasNextInt()){
            tryNum = input.nextInt();
            input.nextLine();
            } else {
            input.nextLine();
            continue;
            }
            
            if (tryNum > 1 && tryNum < 99) {
                inputControlTry = false;

            } else {
                System.out.println("ERROR: Debes elegir un número entre 1 y 99");

            }

        }
        System.out.println("--------------------------");
        //Controlamos que el usuario inserte un rango válido
        while (inputControlRange) {
            System.out.printf("¿Con cuantos números desea jugar?\nIntroduzca %d para jugar con %d números\nIntroduzca %d para jugar con %d números\nIntroduzca %d para jugar con %d números\n",
                    ten, ten, hundret, hundret, thousand, thousand);
            System.out.print("Elije sabiamente: ");
            if(input.hasNextInt()){
            range = input.nextInt();
            input.nextLine();
            } else{
                System.out.println("ERROR: Debes elegir un número válido");
            input.nextLine();
            continue;
            }
            if (range == ten) {
                numMax = 9;
                numMin = 0;
                inputControlRange = false;
            } else if (range == hundret) {
                numMax = 99;
                numMin = 0;
                inputControlRange = false;
            } else if (range == thousand) {
                numMax = 999;
                numMin = 0;
                inputControlRange = false;
            } else {
                System.out.printf("ERROR: Debes elegir un número entre: %d, %d y %d: ", ten, hundret, thousand);

            }

        }

        //Dificultad del juego
        if (tryNum >= 15 && range == 10) {
            System.out.println("La dificultad seleccinada es: FÁCIL");
        } else if (tryNum >= 15 && range == 100) {
            System.out.println("La dificultad seleccinada es: FÁCIL +");
        } else if (tryNum >= 15 && range == 1000) {
            System.out.println("La dificultad seleccinada es: FÁCIL ++");

        } else if (tryNum > 5 && tryNum < 15 && range == 10) {
            System.out.println("La dificultad seleccionada es: MEDIO");
        } else if (tryNum > 5 && tryNum < 15 && range == 100) {
            System.out.println("La dificultad seleccionada es: MEDIO +");
        } else if (tryNum > 5 && tryNum < 15 && range == 1000) {
            System.out.println("La dificultad seleccionada es: MEDIO ++");
            
        } else if (tryNum <= 5 && range == 10) {
            System.out.println("La dificultad seleccionada es: DIFÍCIL");
        } else if (tryNum <= 5 && range == 100) {
            System.out.println("La dificultad seleccionada es: DIFÍCIL +");
        } else {
            System.out.println("----------------------------");
            System.out.println("---MODO LOCURA ACTIVADO---");
            System.out.println("----------------------------");
        }
        
        //Mostramos los datos introducidos:
        System.out.printf("\nJugarás con números del %d al %d y tendrás %d intentos ", numMin, numMax, tryNum);
        
        //Generamos un numero aleatorio respecto al rango seleccionado
        secretNum = (Math.random() * numMax) + 1;
        int secretNumEntero = (int) secretNum; //Número entero generado aleatoriamente que debe adivinar el usuario

        //La línea siguiente muestra el número aleatorio
        //System.out.println("Aleatorio: " + secretNumEntero);
        
        //Variable para mostrar el número de intentos:
        int control = 1;

        while (tryNum > 0) {
            inputControlUser = true;
            while (inputControlUser) {
                System.out.println("Intento: " + (tryNum - tryNum) + control);
                if(input.hasNextInt()){
                userNum = input.nextInt();
                input.nextLine();
                } else{
                    System.out.printf("\nERROR: Introduzca un número entre %d y %d ", numMin, numMax);
                    input.nextLine();
                    continue;
                }
                if (userNum < numMin || userNum > numMax) {
                    System.out.printf("\nERROR: Introduzca un número entre %d y %d ", numMin, numMax);
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
