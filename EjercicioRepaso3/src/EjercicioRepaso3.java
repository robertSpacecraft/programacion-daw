
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class EjercicioRepaso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Jose Antonio", 7);
        notas.put("Francisco", 5);
        notas.put("Enrique", 4);
        notas.put("Robert", 5);
        notas.put("María", 7);
        notas.put("Graciela", 5);

        for (Map.Entry<String, Integer> e : notas.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        boolean nota5 = notas.containsValue(5);
        System.out.println("Hay alumnos con un 5? " + nota5);

        boolean alumnoNombre = notas.containsKey("Francisco");
        System.out.println("Hay algún alumno llamado Francisco?" + alumnoNombre);

        System.out.println("La nota de Robert es: " + notas.get("Robert"));

        for (String s : notas.keySet()) {
            System.out.println(s);
        }

        for (int i : notas.values()) {
            System.out.println(i);
        }
        for (Map.Entry<String, Integer> e : notas.entrySet()) {
            System.out.println(e.getKey() + " " + "(" + e.getValue() + ")");

        }
    }

}
