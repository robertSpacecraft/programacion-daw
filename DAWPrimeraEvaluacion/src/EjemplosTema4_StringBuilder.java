/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class EjemplosTema4_StringBuilder {

    public static void main(String[] args) {
        
        //Creamos el objeto StringBuilder con un texto
        StringBuilder message = new StringBuilder("mensaje StringBuilder ");
        
        //Usamos append para agregar texto al final
        message.append("// y luego se imprime este mensaje pasado por append");
        System.out.println("despues de append: " + message);
        
        System.out.println("------------------------------------------");
        
        //Usamos insert para insertar texto en una posición específica:
        message.insert(8, "insertado ");
        System.out.println("Despues de insert: " + message);
        
        System.out.println("------------------------------------------");
        
        message.replace(0, 7, "texto");
        System.out.println("Despues de replace: " + message);
        
        System.out.println("------------------------------------------");
        
        message.delete(0,5);
        System.out.println("Después de delete: " + message);
        
        System.out.println("------------------------------------------");
        
        message.reverse();
        System.out.println("Despues de reverse: " + message);
        
    }
    
}
