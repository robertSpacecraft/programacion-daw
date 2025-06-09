
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class EjercicioRepaso1_SignosZodiaco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> signos = new HashSet<>();

        signos.add("Áries");
        signos.add("Tauro");
        signos.add("Géminis");
        signos.add("Cáncer");
        signos.add("Leo");
        signos.add("Virgo");
        signos.add("Libra");
        signos.add("Escorpio");
        signos.add("Sagitario");
        signos.add("Capricornio");
        signos.add("Acuario");
        signos.add("Piscis");

        System.out.println("--- Signos del zodiaco ---");
        for (String s : signos) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        
        System.out.println("La lista contiene el signo Cáncer?");
        if (signos.contains("Cáncer")){
            System.out.println("La lista contiene el signo");
        } else System.out.println("La lista NO contiene el signo");
        
        System.out.println("--- Lista de Signos 2 ---");
        Set<String> signos2 = new HashSet<>();
        
        Collections.addAll(signos2, "Áries", "Escorpio");
            for (String s : signos2){
                System.out.println(s);
            }
            
        System.out.println("Los elementos de signos2 existen en signos?");
            
        if (signos.containsAll(signos2)){
            System.out.println("Los signos de signos2 están en signos");
        } else System.out.println("Los signos de signos2 NO están en signos");
        
        System.out.println("Agregamos el signo Dragón");
        signos2.add("Dragón");
        
        signos2.forEach(System.out::println);
        
        System.out.println("Creamos nuevo conjunto con ambos conjuntos juntos");
        Set<String> signos3 = new HashSet<>();
        
        signos3.addAll(signos);
        signos3.addAll(signos2);
        
        for (String s : signos3){
            System.out.println(s);
        }
        
        System.out.println("Eliminamos de signos, aquellos signos que están en signos2");
        
        signos.removeAll(signos2);
        signos.forEach(System.out::println);
  
        
        System.out.println("Eliminamos todos los elementos de signos2");
        System.out.println("Sigons2 contiene: " + signos2.size() + " elementos");
        signos2.removeAll(signos2);
        
        System.out.println("Ahora signos2 tiene " + signos2.size() + " elementos");
    }
}
