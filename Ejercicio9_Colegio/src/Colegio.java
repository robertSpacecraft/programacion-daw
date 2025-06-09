
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Profesor> profesores = new TreeSet<>();

        profesores.add(new Profesor("44112255D", "Fran", "Gómez", "Informática"));
        profesores.add(new Profesor("33554477N", "Amparo", "Martínez", "Matemáticas"));

        Profesor p1 = new Profesor("55223366D", "Antonio", "Fernandez", "Lenguaje");
        Profesor p2 = new Profesor("55223388S", "Robert", "Amorós", "Programación");
        Profesor p3 = new Profesor("55266789T", "José", "Pérez", "Física");
        Profesor p4 = new Profesor("55222211K", "Blanca", "Picó", "Química");
        
        profesores.add(p1);
        profesores.add(p2);
        

        for (Profesor p : profesores) {
            System.out.println(p);
            System.out.println("--------------");
        }
        
        //Con Map
        System.out.println("-----MAP-----");
        //Alumnos
        Alumno a1 = new Alumno(123456, "Paco");
        Alumno a2 = new Alumno(355667, "María");
        Alumno a3 = new Alumno(112233, "Francisco");
        Alumno a4 = new Alumno(321654, "Lola");
        
        Map<Alumno, Profesor> tutores = new HashMap<>();
        
        tutores.put(a1, p1);
        tutores.put(a2, p2);
        tutores.put(a3, p3);
        tutores.put(a4, p4);
        
        for (Alumno a : tutores.keySet()){
            System.out.println(a + ": -> \n" + tutores.get(a));
            System.out.println("-------------------------");          
        }
        
        System.out.println("---Recorriendo valores en lugar de claves ---");
        for (Profesor p : tutores.values()){
            System.out.println(p);
            System.out.println("--------------------------");
        }
        
        System.out.println("---Recorriendo pares clave-valor ---");
        for (Map.Entry<Alumno, Profesor> entry : tutores.entrySet()){
            System.out.println(entry.getKey() + ": -> \n" + entry.getValue());
            System.out.println("--------------------------------------");
        }
        
        System.out.println("La lista contiene: " + tutores.size() + " elementos");
        
        

    }

}
