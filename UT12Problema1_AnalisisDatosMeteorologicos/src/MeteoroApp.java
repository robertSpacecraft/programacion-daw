
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
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
        String fecha = getFecha(input);
        
        //Llamo a getDatos y los almaceno en un Map:
        Map<Ciudad, DatosMeteorologicos> datos = getDatos(fecha);

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
                    System.out.print("Introduzca la ciudad: ");
                    String ciudad = input.nextLine();
                    
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
    public static String getFecha(Scanner input) {
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
        return fecha;
    }
    
    //Recibe la fecha y devuelve un Map con los datos
    public static Map<Ciudad, DatosMeteorologicos> getDatos(String fecha){
        Map<Ciudad, DatosMeteorologicos> datos = new HashMap<>();
        
        Path fichero = Paths.get("datos/Aemet" + fecha + ".csv");
        System.out.println("Buscando archivo en: " + fichero.toAbsolutePath());
        if (!Files.exists(fichero)){
            System.out.println("Fichero no encontrado");
            return datos;
        } else {
           try (BufferedReader br = new BufferedReader(Files.newBufferedReader(fichero))){
               String linea;
               while ((linea = br.readLine()) != null){
                   String[] campos = linea.split(";");
                   
                   //Datos Ciudad
                   String nombre = campos[0].trim();
                   String provincia = campos[1].trim();
                   
                   //Datos meteorológicos
                   double maxTemp = Double.parseDouble(campos[2].trim());
                   String maxHora = campos[3].trim();
                   double minTemp = Double.parseDouble(campos[4].trim());
                   String minHora = campos[5].trim();
                   
                   double precipitaciones = Double.parseDouble(campos[6].trim());
                   
                   //Instancio los objetos Ciudad y DatosMeteorológicos
                   Ciudad ciudad = new Ciudad(nombre, provincia);
                   DatosMeteorologicos datosMet = new DatosMeteorologicos(maxTemp, minTemp, maxHora, minHora, precipitaciones);
                   
                   //Los meto en el HashMap
                   datos.put(ciudad, datosMet);                  
               }
               
            return datos;                     
           
           } catch (IOException e){
               System.out.println("No se ha podido leer el archivo: " + e.getMessage());
               return datos;
           }
        }
    }

}
