
import java.time.LocalDate;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class MeteoroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu(input);

    }
    
    //Menú
    public static void menu(Scanner input) {
        //Llamo a getFecha para obtener y devolver la fecha del usuario
        getFecha(input);
        
        boolean persistenciaMenu = true;
        while (persistenciaMenu) {
            System.out.println("------------ TEMPERATURAS ------------");
            System.out.println("--------------------------------------");
            System.out.println("----   1. Mostrar Ciudad          ----");
            System.out.println("----   2. Máxima Temperatura      ----");
            System.out.println("----   3. Mínima Temperatura      ----");
            System.out.println("----   4. Máxima Precipitación    ----");
            System.out.println("----   5. Salir                   ----");
            System.out.println("--------------------------------------");
            System.out.print("Introduce la opción deseada: ");

            int opcion;
            while (!input.hasNextInt() || (opcion = input.nextInt()) < 0 || opcion > 5) {
                input.nextLine();
                System.out.println("Opción inválida");
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ciudad: ");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Gracias por usar el servicio MeteorApp");
                    System.out.println("¡ADIOS!");
                    persistenciaMenu = false;
                    input.close();
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
        }
    }
    
    //Recoge y devuelve la fecha del usuario:  
   public static String getFecha(Scanner input){
        int dia;
        int mes;
        int anyo;
        String fecha;
        System.out.println("Bienvenido/a al sistema MeteorApp");
        System.out.println("A continuación establece la fecha que deseas consultar");
        System.out.print("Introduce el día: ");
        while (!input.hasNextInt() || (dia = input.nextInt()) < 1 || dia > 31) {
            input.nextLine();
            System.out.println("Día inválido, debe estar entre 1 y 31");
        }
        System.out.print("Introduce el mes: ");
        while (!input.hasNextInt() || (mes = input.nextInt()) < 1 || mes > 12) {
            input.nextLine();
            System.out.println("Mes inválido, debe estar entre 1 y 12");
        }
        System.out.print("Introduce el año: ");
        while (!input.hasNextInt() || (anyo = input.nextInt()) < 1900 || anyo > LocalDate.now().getYear()) {
            input.nextLine();
            System.out.println("Año no válido o sin registros");
        }
        
        fecha = String.format("%04d%02d%02d", anyo, mes, dia);
        input.close();
        return fecha;
   }

}
