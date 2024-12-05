/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class EjemplosTema4_Wrapper {
    public static void main(String[] args) {
        
        //Autoboxing: convertir un primitivo a su clase wrapper
        Integer numeroWrapper = 42; //int se combierte en Integer automáticamente
        System.out.println("Autoboxing: " + numeroWrapper);
        
        System.out.println("-------------------------------");
        
        //Unboxing: Convertir un objeto wrapper a su tipo primitivo
        int numeroPrimitivo = numeroWrapper; //Interger se convierte en int automáticamente
        System.out.println("Unboxing; " + numeroPrimitivo);
        
        System.out.println("-------------------------------");
        
        // Usar métodos de la clase wrapper
        String numeroComoTexto = "123";
        int numeroConvertido = Integer.parseInt(numeroComoTexto);
        System.out.println("Conversión de String a int " + numeroConvertido);
        
        System.out.println("-------------------------------");
        
        //comparar dos objetos wrapper
        Integer num1 = 10;
        Integer num2 = 20;
        System.out.println("Comparación de dos Integer: " + num1.compareTo(num2));
        
        System.out.println("-------------------------------");
        
        //Obtener el valor máximo de Integer
        System.out.println("Valor máximo de integer: " + Integer.MAX_VALUE);
        
        System.out.println("-------------------------------");
        
        //Verificar si un valor es un númoer primo
        int valor = 7;
        System.out.println("¿Es " + valor + " un número primo? " + esPrimo(valor));
    }
    
    public static boolean esPrimo(int numero){
    
        if (numero <= 1) return false;
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
            
        }
        return true;
    }
    
}
