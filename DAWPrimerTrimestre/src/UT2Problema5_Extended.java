package programacionProblemas;

//Roberto Amorós

import java.util.Scanner;

public class UT2Problema5_Extended {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables que vamos a necesitar así como el Scanner:
        int numAlum = 0;
        int alumAprobado = 0;
        int alumSuspenso = 0;
        float notaMedia = 0.0f;
        float tasaAprobado = 0.0f;
        float tasaSuspenso = 0.0f;
        float totalAprobado = 0.0f;
        float totalSuspenso = 0.0f;
        float mediaAprobado = 0.0f;
        float mediaSuspenso = 0.0f;
        float mejorNota = 0.0f;
        float peorNota = -1f;

        //Variables parte extendida:
        int sobresaliente = 0; //Nota entre 10 y 8
        int notable = 0; //Nota entre menos de 8 y 7
        int bien = 0; //Nota entre menos de 7 y 6
        int suficiente = 0; //nota entre menos de 6 y 5
        int insuficiente = 0; //Nota por debajo de 5

        Scanner input = new Scanner(System.in);

        //Vista del programa
        System.out.println("----------------------------------------");
        System.out.println("--\tESTADÍSTICA DE NOTAS\t--");
        System.out.println("----------------------------------------");

        //Iniciamos el bucle que pedirá notas hasta que se introduzca un valor negativo
        //Declaro una variable de control que me puede servir de contador y otra para el valor introducido
        boolean introNum = true;
        float inputValue = 0.0f;

        while (introNum) {

            //Declaro una variable boleana para controlar la entrada y salida del bucle de validación      
            boolean valido = true;
            while (valido) {
                System.out.print("Introduce una nota (valor negativo para afinalizar): ");
                if (input.hasNextFloat()) {
                    inputValue = input.nextFloat();
                    input.nextLine();
                    valido = false;
                } else {
                    inputValue = 11;
                    input.nextLine();
                }
                //Esta condición no permite que se introduzcan números mayores que 10
                if (inputValue > 10) {
                    System.out.println("ERROR: Nota inválida");

                } else {
                    valido = false;
                }
            }//Fin del while de validación

            if (inputValue >= 5 && inputValue <= 10) {
                numAlum++;
                alumAprobado++;

                //Asignamos la escala de aprobados 
                if (inputValue < 10 && inputValue >= 8) {
                    sobresaliente++;

                } else if (inputValue < 8 && inputValue >= 7) {
                    notable++;

                } else if (inputValue < 7 && inputValue >= 6) {
                    bien++;

                } else {
                    suficiente++;
                }

                //sumamos cada nota aprobada
                totalAprobado = totalAprobado + inputValue;

                //Asignamos el valor más alto a la variable:
                if (mejorNota < inputValue && inputValue <= 10) {
                    mejorNota = inputValue;
                }

            } else if (inputValue < 5 && inputValue >= 0) {
                numAlum++;
                alumSuspenso++;
                peorNota = inputValue;
                //Sumamos cada nota suspendida
                totalSuspenso = totalSuspenso + inputValue;

                //Asignamos la escala de suspensos, solo un caso
                insuficiente++;

                //Asignamos el valor más bajo a la variable
                if (peorNota > inputValue) {
                    peorNota = inputValue;
                }

            }

            //Hace que cuando el valor introducido sea menor a cero, contador sea negativo y salga del bucle
            if (inputValue < 0) {
                introNum = false;
            }

        }//fin del while principal

        //Realizamos los cálculos para cada caso, las notas medias y las tasas.
        //Condicionamos los resultados a que el divisor sea mayor que 0, si no lo fuese no variaría el valor de la variable.
        if (numAlum > 0) {
            notaMedia = (totalAprobado + totalSuspenso) / numAlum;
        }
        if (alumAprobado > 0) {
            mediaAprobado = totalAprobado / alumAprobado;
        }
        if (alumSuspenso > 0) {
            mediaSuspenso = totalSuspenso / alumSuspenso;
        }

        //Si no hay ningún suspenso entonces debo modifiacar el valor de peorNota a 0
        if (peorNota == -1) {
            peorNota = 0;
        }

        tasaAprobado = alumAprobado * 100 / numAlum;
        tasaSuspenso = alumSuspenso * 100 / numAlum;

        System.out.printf("-Se han evaluado un total de: %d alumnos.", numAlum);

        System.out.printf("\n-Nota media curso  =  %.2f", notaMedia);

        System.out.printf("\n-Han aprobado %d alumnos, lo que supone un %.2f%% del total", alumAprobado, tasaAprobado);
        System.out.printf("\n-La nota media de los alumnos aprobados ha sido: %.2f", mediaAprobado);

        System.out.printf("\n-Han suspendido %d alumnos, lo que supone un %.2f%% del total", alumSuspenso, tasaSuspenso);
        System.out.printf("\n-La nota media de los alumnos suspendidos ha sido: %.2f", mediaSuspenso);

        System.out.printf("\n-La nota más alta es: %.2f", mejorNota);
        System.out.printf("\n-La nota más baja es: %.2f", peorNota);
        
        //Estadísticas de la parte extra:
        System.out.println("\n------------------------------------------");
        System.out.println("------------------------------------------");
        
        System.out.printf("\n- %d de %d Alumno/s han obtenido un SOBRESALIENTE", sobresaliente, numAlum);
        System.out.printf("\n- %d de %d Alumno/s han obtenido un NOTABLE", notable, numAlum);
        System.out.printf("\n- %d de %d Alumno/s han obtenido un BIEN", bien, numAlum);
        System.out.printf("\n- %d de %d Alumno/s han obtenido un SUFICIENTE", suficiente, numAlum);
        System.out.printf("\n- %d de %d Alumno/s han obtenido un INSUFICIENTE", insuficiente, numAlum);
    }

}
