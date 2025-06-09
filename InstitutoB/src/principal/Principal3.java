/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import dao.AsignaturaDAO;
import dao.ProfessorDAO;
import dto.Asignatura;
import dto.Profesor;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author Robert
 */
public class Principal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1- Muestra los nombres de todos los profesores.
System.out.println("Ejercicio 1");
ProfessorDAO.getAll().stream()
        .map(p -> p.getNombre())
        .forEach(System.out::println);
        System.out.println("-------------------");

//2- Muestra los nombres de todas las asignaturas que imparten los profesores (sin aplanar listas).
System.out.println("Ejercicio 2");
    ProfessorDAO.getAll().stream()
            .map(p -> p.getAsignaturas().stream()
                    .map(a -> a.getNombre())
            .collect(Collectors.toList()))
            .forEach(System.out::println);
            System.out.println("-----------------");

//3- Muestra los nombres de todas las asignaturas impartidas por los profesores (usando flatMap para aplanar).
    System.out.println("Ejercicio 3");
    ProfessorDAO.getAll().stream()
            .flatMap(p -> p.getAsignaturas().stream()
            .map(a -> a.getNombre()))
            .distinct()
            .forEach(System.out::println);
        System.out.println("-----------------------");

//4- Muestra el nombre y el número total de asignaturas que imparte cada profesor.
        System.out.println("Ejercicio 4");
        Map<String, Integer> mapa4 = ProfessorDAO.getAll().stream()
                .collect(Collectors.toMap(
                        Profesor::getNombre,
                        p -> p.getAsignaturas().size()));
        
        mapa4.forEach((p, t) -> System.out.println(p + " " + t));
        System.out.println("---------------------------");

//5- Muestra los nombres de las asignaturas que tienen exactamente 4 horas semanales.
        System.out.println("Ejercicio 5");
        ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .filter(a -> a.getHorasSemanales() > 4)
                .map(a -> a.getNombre())
                .forEach(System.out::println);
        System.out.println("--------------------");
                       

//6- Muestra los nombres de las asignaturas que se imparten en el curso 3, ordenadas alfabéticamente.
        System.out.println("Ejercicio 6");
        ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .filter(a -> a.getCurso() == 3)
                .map(a -> a.getNombre())
                .forEach(System.out::println);
        System.out.println("-----------------------------");
        
//7- Muestra los nombres de los profesores que imparten más de una asignatura.

//8- Muestra los nombres de las asignaturas impartidas por más de un profesor (asignaturas compartidas).

//9- Crea un mapa que relacione el nombre de cada profesor con la lista de nombres de asignaturas que imparte.

//10- Crea un mapa que relacione cada asignatura (por nombre) con el número de profesores que la imparten.

    }
    
}
