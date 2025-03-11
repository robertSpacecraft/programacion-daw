
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class TestTablaJoseRamon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1 Predicate (filtrado de datos)
        System.out.println("Ejercicio 1");
        List<Integer> listaEnteros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Predicate<Integer> pares = x -> x % 2 == 0;
        
        listaEnteros.stream()
                .filter(pares)
                .forEach(System.out::println);
        
        
        //Ejercicio 2 Consumer (Efectos colaterales)
        System.out.println("------------");
        System.out.println("Ejercicio 2");
        List<String> listaStrings = new ArrayList<>(List.of("roberto", "pedro", "paco", "erique", "edu"));
        Consumer<String> mayusculas = s -> System.out.println(s.toUpperCase());
        
        listaStrings.forEach(mayusculas);
        
        //Ejercicio 3 Function (Transformación de datos)
        System.out.println("------------");
        System.out.println("Ejercicio 3");
        //Uso la lista del ejercicio anterior
        Function<String, Integer> midePalabras = s -> s.length();
        
        listaStrings.stream()
                .map(midePalabras)
                .forEach(System.out::println);
        
        //Ejercicio 4 Supplier (Generación de datos)
        System.out.println("-----------");
        System.out.println("Ejercicio 4");
        
        Supplier<Double> aleatorio = () -> Math.random() * 100;      
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());
        System.out.println(aleatorio.get());
        
        //Uso Function para convertirlo a Integer:
        Function<Double, Integer> doubleAEntero = d -> d.intValue();        
        System.out.println(doubleAEntero.apply(aleatorio.get()));
        System.out.println(doubleAEntero.apply(aleatorio.get()));
        System.out.println(doubleAEntero.apply(aleatorio.get()));
        System.out.println(doubleAEntero.apply(aleatorio.get()));
        
        //Ejercicio 5 UnaryOperator<T> (Modificación de datos preservando el tipo)
        System.out.println("--------");
        System.out.println("Ejercicio 5");
        
        UnaryOperator<Double> extra = x -> x * 1.1;
        System.out.println("Nuevo precio con el 10% más: " + extra.apply(100.00));
        System.out.println("Nuevo precio con el 10% más: " + extra.apply(150.00));
        System.out.println("Nuevo precio con el 10% más: " + extra.apply(200.00));
        System.out.println("Nuevo precio con el 10% más: " + extra.apply(550.00));
        
        
        //Ejercicio 6 BinaryOperator<T> (Combinación de datos)
        System.out.println("-----------");
        System.out.println("Ejercicio 6");
        
        BinaryOperator<Integer> operacion = (a, b) -> a + b;      
        System.out.println("Suma de 5 + 5 = " + operacion.apply(5, 5));
        
        //Ejercicio 7 BiPredicate (validación de condiciones con dos datos)
        System.out.println("-----------");
        System.out.println("Ejercicio 7");
        

                BiPredicate<String, Integer> palabra = (s, i) -> s.length() > i;
        System.out.println("Palabra más larga: (true): " + palabra.test("hola", 3));
        System.out.println("Palabra más corta: (false): " + palabra.test("hola", 5));
        
        //Ahora uso Lista Strings para comprobar si tiene más palabras que un número dado:
        int longitudMinima = 5;
        Predicate<String> filtroLongitud = s -> palabra.test(s, longitudMinima);
        List<String> listaFiltrada = listaStrings.stream()
                .filter(filtroLongitud)
                .collect(Collectors.toList());
        
        System.out.println("Palabras con mas de " + longitudMinima +
                " caracteres " +
                listaFiltrada);
    }
    
}
