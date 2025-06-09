
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class EjercicioRepaso2_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("11111111A", "Anna", 28);
        Persona persona2 = new Persona("22222222B", "Pau", 18);
        Persona persona3 = new Persona("33333333C", "Jordi", 16);
        Persona persona4 = new Persona("44444444D", "Maria", 17);
        Persona persona5 = new Persona("55555555E", "Laura", 25);
        
        TreeSet<Persona> personas = new TreeSet<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);
        
        personas.forEach(System.out::println);
        
        Persona menor18 = personas.lower(new Persona("","", 18));
        System.out.println("Ultima persona menor a 18 años:\n" + menor18);
        
        Persona mayor18 = personas.ceiling(new Persona("", "", 18));
        System.out.println("Primera persona mayor de 18: \n" + mayor18);
        
        Persona mayor25 = personas.higher(new Persona("", "", 25));
        System.out.println("Persona mayor a 25: \n" + mayor25);
        
        ArrayList<Persona> listaDuplicados = new ArrayList<>(Arrays.asList(
                persona1, persona2, persona3, persona4, persona5, persona3, persona2));
        
        personas.addAll(listaDuplicados);
        
        listaDuplicados.forEach(System.out::println);
    }

}
