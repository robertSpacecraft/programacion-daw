//Roberto Amorós Linares

import java.util.Scanner;

public class UD3Problema1 {

    public static void main(String[] args) {

        //Aquí declararemos las variables, constantes y objetos que necesitemos
        float[][] sistoDiasto = new float[3][2];

        //Según los datos médicos, estás son las medidas mínimas y máximas esperadas cuando se toma la tensión.
        final int sistoMin = 9;
        final int sistoMax = 18;
        final int diastoMin = 6;
        final int diastoMax = 9;

        Scanner input = new Scanner(System.in);

        //Esta estructura repetitiva anidada pasará por todos los espacios del array bidimensional para rellenarlo con datos
        for (int i = 0; i < sistoDiasto.length; i++) {
            for (int j = 0; j < sistoDiasto[i].length; j++) {

                System.out.print("Introduce los Datos: ");

                //Validamos que los datos que se introducen sean correctos
                boolean verify = false;
                int contadorMedidas = 0;
                while (!verify) {

                    //Primero comprobamos que el valor sea del tipo float
                    if (input.hasNextFloat()) {

                        float valor = input.nextFloat(); //Le asigno el valor a una variable para comprobar si está dentro de los límites adecuados

                        //Si está dentro de los límites el valor de "valor" pasará al array y "verify" pasará a ser true
                        if (valor > diastoMin && valor < sistoMax && valor != 0) {

                            sistoDiasto[i][j] = valor;
                            verify = true;
                            contadorMedidas++;
                            
                        } else {

                            System.out.println("Valor inválido, introduzca un número correcto");
                            System.out.print("Introduce los datos: ");
                            
                        }
                    } else {

                        System.out.println("Debes introducir un valor numérico");
                        System.out.print("Introduce los datos: ");
                        input.nextLine();
                    }
                    input.nextLine(); //borramos los datos de buffer para una nueva interacción
                }

            }

        }
        System.out.println("TENSIÓN ARTERIAL\n-----------------");

        for (int i = 0; i < sistoDiasto.length; i++) {

            System.out.print("Medida " + (i + 1) + ":\nSistolica = " + sistoDiasto[i][0] + "\nDiastólica = " + sistoDiasto[i][1]);

            System.out.println("\n--------------------------");
        }

    }

}
