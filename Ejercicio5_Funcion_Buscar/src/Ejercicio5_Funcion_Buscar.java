/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Ejercicio5_Funcion_Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] a1 = {1, 2, 5, 7, 9, 25, 30};
        
        System.out.println("La lista no contiene el 8: " + buscar(a1, 8));
        System.out.println("La lista contiene el 25 en la posición: " + buscar(a1, 25));
        
        String[] as = {"hola", "adios", "bienvendio"};
        
        System.out.println("La lista no contiene: grande: " + buscar(as, "grande"));
        System.out.println("La lista contiene: hola en la posición: " + buscar(as, "hola"));
    }
    public static int buscar(int[] array, int objetivo){
        for (int i = 0; i < array.length; i++){
            if (array[i] == objetivo){
                return i;
            }
        }
        return -1;
    }
    
    public static <T> int buscar(T[] array, T objetivo){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(objetivo)){
                return i;
            }
        }
        return -1;
    }
    
}
