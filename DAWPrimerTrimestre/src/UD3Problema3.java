package programacionProblemas;

//Roberto Amorós Linares
import java.util.Scanner;

public class UD3Problema3 {

    public static void main(String[] args) {
        //Declaramos las variables que necesitamos:
        int filas = 0;
        int columnas = 0;

        Scanner input = new Scanner(System.in);

        //Pedimos el tamaño de la matriz, asumimos que se trata de una matriz cuadrada por lo que asignamos el mismo valor a las columnas, evitamos que se introduzcan valores menores a 0
        System.out.print("Introduzca el tamaño de la matriz: ");
        while (!input.hasNextInt() || (filas = input.nextInt()) < 2) {
            System.out.print("Introduce un entero mayor de 0");
            System.out.print("Introduzca el tamaño de la matriz: ");
            input.next();
        }

        columnas = filas;

        //Creamos el array, lo recorremos y le asignamos un valor aleatorio Math.random() * 2 da como resultado 0 o 1
        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int aleatory = (int) (Math.random() * 2);
                matrix[i][j] = aleatory;

            }

        }
        //Imprimimos la matriz para ver los datos
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);
                System.out.print("  ");

            }
            System.out.println(" ");

        }
        //sumo todos los elementos de la matriz
        int sumaTotal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                sumaTotal += matrix[i][j];

            }

        }
        if (sumaTotal == matrix.length * 2) {
            System.out.println("La matriz no contiene 0s");
        } else if (sumaTotal == 0) {
            System.out.println("La matriz no contiene 1s");
        }



        System.out.println("-------------------------------------------");
        
        //Estás dos variables se usan para comparar y obtener el valor máximo
        int valorMax = 0;
        int contador = 0;
        //Estós arrys almacenarán los indices de filas y columnas con más o menos 1s
        int[] indiceFilas = new int[filas];
        int[] indiceColumnas = new int[columnas];
        //Estos arryas almacenan los índices de las filas y columnas compuestas por 1s o 0s
        int[] indiceUnosF = new int[filas]; //Filas
        int[] indiceCerosF = new int[columnas]; //Filas
        int[] indiceUnosC = new int[filas]; //Columnas
        int[] indiceCerosC = new int[columnas]; //Columnas
        int iUnos = 0;
        int iCeros = 0;

        //sumamos las filas
        for (int i = 0; i < matrix.length; i++) {
            int sumaFila = 0;//la ubico en este punto para que se reinicie en cada interacción
            for (int j = 0; j < matrix[i].length; j++) {

                sumaFila += matrix[i][j];

            }
            //voy a necesitar un array en el que almacenar los índices de las filas que más 1s tengan, lo creo más arriba
            //Compara las filas y guarda las que tienen más 1s
            if (sumaFila > valorMax) {
                valorMax = sumaFila;
                contador = 0;
                indiceFilas[contador] = i;
                contador++;
            } else if (sumaFila == valorMax) {
                indiceFilas[contador] = i;
                contador++;
            }
            //Calcula las filas que están compuestas íntegramente por 1s o 0s
            if (sumaFila == filas) {

                indiceUnosF[iUnos] = i;
                iUnos++;

            } else if (sumaFila == 0) {

                indiceCerosF[iCeros] = i;
                iCeros++;
            }

        }
        //imprimo las filas con más 1s
        for (int i = 0; i < contador; i++) {
            System.out.println("La fila con más 1s es: " + indiceFilas[i]);
        }
        System.out.println("---------------------------------------------");
        //imprimo las filas hechas de 1s y 0s
        for (int i = 0; i < iUnos; i++) {
            System.out.println("La fila " + indiceUnosF[i] + " está toda formada por 1s");

        }

        for (int i = 0; i < iCeros; i++) {

            System.out.println("La fila " + indiceCerosF[i] + " está toda formada por 0s");

        }

        //ponemos las variables a 0 por si acaso:
        valorMax = 0;
        contador = 0;
        iUnos = 0;
        iCeros = 0;

        //sumamos las columanas
        for (int i = 0; i < matrix.length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                sumaColumna += matrix[j][i];

            }

            if (sumaColumna > valorMax) {
                valorMax = sumaColumna;
                contador = 0;
                indiceColumnas[contador] = i;
                contador++;
            } else if (sumaColumna == valorMax) {
                indiceColumnas[contador] = i;
                contador++;
            }
            //Calcula las columnas compuestas íntegramente por 1s o 0s
            if (sumaColumna == filas) {

                indiceUnosC[iUnos] = i;
                iUnos++;

            } else if (sumaColumna == 0) {

                indiceCerosC[iCeros] = i;
                iCeros++;
            }

        }
        for (int i = 0; i < contador; i++) {
            System.out.println("La columna con más 1s es: " + indiceColumnas[i]);
        }

        System.out.println("---------------------------------------------");

        //imprimo las columnas hechas de 1s y 0s
        for (int i = 0; i < iUnos; i++) {
            System.out.println("La columna " + indiceUnosC[i] + " está toda formada por 1s");
        }
        for (int i = 0; i < iCeros; i++) {
            System.out.println("La columna " + indiceCerosC[i] + " está toda formada por 0s");

        }
        System.out.println("---------------------------------------------");

        //Sumo la diagonal
        int sumaDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {

            sumaDiagonal += matrix[i][i];
        }
        if (sumaDiagonal == matrix.length) {
            System.out.println("La diagonal principal está completamente compuesta por 1s");

        } else if (sumaDiagonal == 0) {
            System.out.println("La diagonal principal está totalmente compuesta por 0s");
        }
        //Sumo la Subdiagonal con la fórmula matrix[i][matrix.lenght -1 -i]
        sumaDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {

            sumaDiagonal += matrix[i][matrix.length - 1 - i];

        }
        if (sumaDiagonal == matrix.length) {
            System.out.println("La Subdiagonal está completamente compuesta por 1s");

        } else if (sumaDiagonal == 0) {
            System.out.println("La Subdiagonal está totalmente compuesta por 0s");
        }
        input.close();
    }
}
