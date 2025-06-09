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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Robert
 */
public class PrincipalMaps1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1- Recolecta y muestra un mapa que relacione el nombre de cada profesor con su DNI.
        System.out.println("Ejercicio 1");
        Map<String, String> mapa1 = ProfessorDAO.getAll().stream()
                .collect(Collectors.toMap(
                        p -> p.getNombre(),
                        p -> p.getDni()));

        mapa1.forEach((n, d) -> System.out.println("Nombre: " + n + " -> DNI: " + d));
        System.out.println("-----------------------------");

//2- Recolecta y muestra un mapa que relacione el nombre de cada profesor con la cantidad de asignaturas que imparte.
        System.out.println("Ejercicio 2");
        Map<String, Integer> mapa2 = ProfessorDAO.getAll().stream()
                .collect(Collectors.toMap(
                        Profesor::getNombre,
                        p -> p.getAsignaturas().size()));
        mapa2.forEach((n, a) -> System.out.println(n + " " + a));
        System.out.println("-----------------------------");

//3- Recolecta y muestra un mapa que relacione el nombre de cada profesor con la lista de nombres de las asignaturas que imparte.
        System.out.println("Ejercicio 3");
        Map<String, List<String>> mapa3 = ProfessorDAO.getAll().stream()
                .collect(Collectors.toMap(
                        Profesor::getNombre,
                        p -> p.getAsignaturas().stream()
                                .map(a -> a.getNombre())
                                .collect(Collectors.toList())));
        mapa3.forEach((n, a) -> System.out.println(n + " " + a));
        System.out.println("---------------------");

//4- Recolecta y muestra un mapa que relacione el nombre de cada asignatura con la cantidad de veces que aparece (usando flatMap para ver todas las asignaturas).
        System.out.println("Ejercicio 4");
        Map<String, Long> mapa4 = ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .collect(Collectors.groupingBy(Asignatura::getNombre,
                        Collectors.counting()));
        
        mapa4.forEach((a, c) -> System.out.println(a + " " + c));
                
    
//5- Recolecta y muestra un mapa que agrupe a los profesores por la cantidad de asignaturas que imparten.
        System.out.println("Ejercicio 5");
        Map<Integer, List<Profesor>> mapa5 = ProfessorDAO.getAll().stream()
                .collect(Collectors.groupingBy(p -> p.getAsignaturas().size()));

//6- Recolecta y muestra un mapa que relacione el nombre de cada asignatura con la lista de profesores que la imparten.
//7- Recolecta y muestra un mapa que relacione el curso de cada asignatura (curso 1, 2 o 3) con la lista de nombres de las asignaturas de ese curso.
//8- Recolecta y muestra un mapa que agrupe las asignaturas por su número de horas semanales (clave: horas, valor: lista de nombres de asignaturas).
//9- Recolecta y muestra un mapa que relacione el nombre de cada profesor con el número total de horas semanales que imparte.
//10- Recolecta y muestra un mapa que agrupe a los profesores según el curso más alto que imparten (clave: curso más alto que imparte, valor: lista de nombres de profesores).
    }

}
