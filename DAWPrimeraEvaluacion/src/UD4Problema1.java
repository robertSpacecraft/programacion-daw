//Roberto Amorós Linares
package programacionProblemas;

import java.util.Scanner;

public class UD4Problema1 {

    //variables de la clase
    public static Scanner input = new Scanner(System.in); //Scanner

    public static String[] bookList = new String[1000]; //Array para almacenar libros

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        System.out.println("GESTIÓN DE TÍTULOS DE BIBLIOTECA");
        System.out.println("----------------------------------");

        System.out.println("1. Agregar un título");
        System.out.println("2. Eliminar un título");
        System.out.println("3. Buscar un título");
        System.out.println("4. Listar todos los títulos");
        System.out.println("5. Salir");

        int feedback;
        System.out.print("¿Qué deseas hacer?: ");
        while (!input.hasNextInt() || (feedback = input.nextInt()) < 1 || feedback > 5) {
            System.out.println("Por favor, elige una opción correcta");
            System.out.print("¿Qué deseas hacer?: ");
            input.nextLine();
        }
        input.nextLine();

        switch (feedback) {
            case 1:
                System.out.print("Introduce el título de un libro: ");
                newBook();

                menu();
                break;

            case 2:
                System.out.print("Qué título deseas eliminar: ");
                eraseBook();

                menu();
                break;

            case 3:
                System.out.print("¿Qué libro estás buscando?");
                String userFindBook = input.nextLine();
                findBook(userFindBook);

                menu();
                break;

            case 4:
                System.out.println("Títulos en la colección: ");
                printBookList();

                menu();
                break;

            case 5: 
                String messageGoodBye = "Pulse Y/y para confirmar \"SALIR\" o N/n para \"CANCELAR\": ";
                System.out.print(messageGoodBye);
                char inputYesNo = input.nextLine().charAt(0);
                yesNo(inputYesNo, messageGoodBye);
                break;

        }

    }

    //este método añadirá un libro al array bookList
    public static void newBook() {
        String newBook = input.nextLine();
        if (!lookForBook(newBook)) {
            int freeIndex = findFirstSpace();
            bookList[freeIndex] = newBook;
            System.out.println("El libro: \"" + newBook + "\" se ha añadido correctamente");
        } else {
            System.out.println("Error, el libro: " + newBook + " ya existe");
        }
    }

    //Este método elimna un registro del array
    public static void eraseBook() {
        String eraseBook = input.nextLine();
        if (lookForBook(eraseBook)) {
            bookList[findBook(eraseBook)] = null;
            System.out.println("Libro eliminado Correctamente");
        } else {
            System.out.println("El libro NO fue encontrado");
        }
    }

    //Este método devuelve el primer índice de array que esté libre.
    public static int findFirstSpace() {
        int index = 0;//índice del array principal
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    //Esté método compara el string que introduce el usuario con los que ya existen en el array bookList
    public static boolean lookForBook(String toLookFor) {
        boolean exist = false;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null && bookList[i].equals(toLookFor)) {
                exist = true;
                break;
            }
        }

        return exist;
    }

    //Este método busca busca un libro concreto y devuelve el índice donde se encuentra
    public static int findBook(String bookToFind) {
        int findBookIndex = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookToFind.equals(bookList[i])) {
                System.out.println("Libro encontrado: " + bookList[i]);
                findBookIndex = i;
                break;
            } else if (i == bookList.length - 1) {
                System.out.println("Libro NO encontrado");
            }

        }
        return findBookIndex;
    }

    //Este método imprime la lista de registros
    public static void printBookList() {
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.println((i + 1) + " " + bookList[i]);
            }
        }

    }

    public static void yesNo(char inputYesNo, String message) {
        char yesNo = inputYesNo;
        while (yesNo != 'y' && yesNo != 'Y' && yesNo != 'n' && yesNo != 'N') {
            System.out.println(message);
            yesNo = input.nextLine().charAt(0);
        }
        if (yesNo == 'y' || yesNo == 'Y') {
            input.close();
            System.exit(0);

        } else if (yesNo == 'n' || yesNo == 'N') {
            menu();
        }

    }

}