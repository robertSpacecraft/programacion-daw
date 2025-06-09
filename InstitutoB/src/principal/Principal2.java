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
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Muestra todos los profesores que imparten exactamente una asignatura.
        System.out.println("Ejercicio 1");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getAsignaturas().size() == 1)
                .forEach(System.out::println);

//Muestra el nombre de los profesores que imparten asignaturas en el curso 1.
        System.out.println("Ejercicio 2");
        System.out.println("---------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getAsignaturas().stream()
                .anyMatch(a -> a.getCurso() == 1))
                .map(Profesor::getNombre)
                .forEach(System.out::println);

//Muestra las asignaturas impartidas por Linus Torvalds.
        System.out.println("Ejercicio 3");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getNombre().equalsIgnoreCase("Linus Torvalds"))
                .flatMap(a -> a.getAsignaturas().stream())
                .map(a -> a.getNombre())
                .forEach(System.out::println);

//Muestra los nombres de las asignaturas que se imparten en cursos pares (2 y 4), sin duplicados.
        System.out.println("Ejercicio 4");
        System.out.println("-------------");
        ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .filter(a -> a.getCurso() == 2 || a.getCurso() == 4)
                .map(a -> a.getNombre())
                .distinct()
                .forEach(System.out::println);

//Muestra los nombres de los profesores imparten asignaturas con más de 5 horas semanales.
        System.out.println("Ejercicio 5");
        System.out.println("--------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getAsignaturas().stream()
                .anyMatch(a -> a.getHorasSemanales() > 5))
                .map(p -> p.getNombre())
                .forEach(System.out::println);

// Muestra los nombres de los profesores cuyo nombre comienza con la letra "A".
        System.out.println("Ejercicio 6");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getNombre().startsWith("A"))
                .forEach(System.out::println);

// Muestra el número total de asignaturas que existen en la lista de AsignaturaDAO.
        System.out.println("Ejercicio 7");
        System.out.println("----------------");
        long numAsignaturas = ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .distinct()
                .count();
        System.out.println("Numero de asignaturas: " + numAsignaturas);

// Muestra los nombres de las asignaturas que tienen más de 5 horas semanales.
        System.out.println("Ejercicio 8");
        System.out.println("----------------");
        AsignaturaDAO.getAll().stream()
                .filter(a -> a.getHorasSemanales() < 5)
                .map(a -> a.getNombre())
                .forEach(System.out::println);

// Muestra todos los profesores que imparten exactamente 2 asignaturas.
        System.out.println("Ejercicio 9");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getAsignaturas().size() == 2)
                .forEach(System.out::println);

// Muestra los nombres de las asignaturas impartidas por Ada Lovelace.
        System.out.println("Ejercicio 10");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getNombre().equalsIgnoreCase("Ada Lovelace"))
                .flatMap(p -> p.getAsignaturas().stream())
                .map(a -> a.getNombre())
                .forEach(System.out::println);

// Muestra las asignaturas del curso 3 ordenadas alfabéticamente.
        System.out.println("Ejercicio 11");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .filter(a -> a.getCurso() == 3)
                .sorted(Comparator.comparing(a -> a.getNombre()))
                .forEach(System.out::println);

// Muestra el nombre de todos los profesores que imparten alguna asignatura en el curso 4.
        System.out.println("Ejercicio 12");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .filter(p -> p.getAsignaturas().stream()
                .anyMatch(a -> a.getCurso() == 4))
                .map(p -> p.getNombre())
                .forEach(System.out::println);

// Muestra el total de horas semanales que suman todas las asignaturas de la lista AsignaturaDAO.
        System.out.println("Ejercicio 13");
        System.out.println("----------------");
        int horas = ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .mapToInt(a -> a.getHorasSemanales())
                .sum();
        System.out.println("Horas: " + horas);
// Muestra los nombres de las asignaturas únicas (sin duplicados) de todos los profesores, ordenadas inversamente (de la Z a la A).
        System.out.println("Ejercicio 14");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .map(a -> a.getNombre())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

// Muestra los nombres de las asignaturas que tienen exactamente 5 horas semanales y que pertenecen al curso 2.
        System.out.println("Ejercicio 15");
        System.out.println("----------------");
        ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .filter(a -> a.getHorasSemanales() == 5)
                .filter(a -> a.getCurso() == 2)
                .forEach(System.out::println);
//Muestra los nombres de las asignaturas que son impartidas por más de un profesor (asignaturas compartidas).
        System.out.println("Ejercicio 16");
        System.out.println("----------------");
        Map<String, Long> asignaturasCompartidas = ProfessorDAO.getAll().stream()
                .flatMap(p -> p.getAsignaturas().stream())
                .collect(Collectors.groupingBy(
                        Asignatura::getNombre, // clave: nombre de la asignatura
                        Collectors.counting() // valor: cuántas veces aparece
                ));

        asignaturasCompartidas.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // más de un profesor
                .map(Map.Entry::getKey) // quedarse solo con el nombre
                .forEach(System.out::println);

//Recolecta un mapa que relacione cada profesor con el total de horas que imparte en cursos 2 y 3.
        System.out.println("Ejercicio 17");
        System.out.println("----------------");
        Map<String, Integer> mapa17 = ProfessorDAO.getAll().stream()
                .collect(Collectors.toMap(
                        p -> p.getNombre(),
                        p -> p.getAsignaturas().stream().mapToInt(a -> a.getHorasSemanales())
                                .sum()
                ));
        mapa17.forEach((p, a) -> System.out.println("Clave: " + p + " Valor: " + a));

//Recolecta un mapa que relacione cada curso con la cantidad total de horas que suman sus asignaturas.
//Recolecta un mapa que relacione cada asignatura con la lista de nombres de los profesores que la imparten.
//Para cada profesor, obtiene el curso más alto en el que da clase y, solo si ese curso es mayor que 2, muestra su nombre y ese curso.
    }

}
