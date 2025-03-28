/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.DepartamentsDAO;
import dao.EmpleatsDAO;
import dto.Departament;
import dto.Empleat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;


/**
 *
 * @author jmas
 */
public class Main {

    public static void main(String[] args) {
        // 1.- Imprimeix el primer empleat trobat amb més de 50 anys
        System.out.println("Ejercicio 1:");
        EmpleatsDAO.getEmpleats().stream()
                .filter(empleados -> empleados.getEdat() > 50)
                .findFirst()
                .ifPresent(System.out::println);

        // 2. Imprimeix true si tots els empleats son majors d'edat i false en cas contrari
        System.out.println("-----------");
        System.out.println("Ejercicio 2");
        final boolean mayores18 = EmpleatsDAO.getEmpleats().stream()
                .allMatch(empleado -> empleado.getEdat() > 18);
        System.out.println(mayores18);

        // 3. Imprimeix true si hi ha algun empleat major de 65 anys i false en cas contrari
        System.out.println("------------");
        System.out.println("Ejercicio 3");
        final boolean mayores65 = EmpleatsDAO.getEmpleats().stream()
                .anyMatch(empleado -> empleado.getEdat() > 65);
        System.out.println(mayores65);
                
        // 4. Imprimeix el número d'empleats que tenen més de 50 anys
        System.out.println("-------------");
        System.out.println("Ejercicio 4");
        final int numMayor50 = (int) EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getEdat() > 50)
                .count();
        System.out.println(numMayor50);

        // 5. Imprimeix el nom dels empleats del departament d'informàtica, en majúscules.
        System.out.println("--------------");
        System.out.println("Ejercicio 5");
        EmpleatsDAO.getEmpleats().stream()
                .filter(departamento -> departamento.getDepartament().getNom().equals("Informàtica"))
                .map(empleado -> empleado.getNom().toUpperCase())
                .forEach(System.out::println);
        
        // 6. Imprimeix la quantitat de lletres de l'empleat d'informàtica amb el nom més llarg.
        System.out.println("--------------");
        System.out.println("Ejercicio 6");
        EmpleatsDAO.getEmpleats().stream()
                .filter(departamento -> departamento.getDepartament().getNom().equals("Informàtica"))
                .map(empleado -> empleado.getNom().length())
                .reduce((a, b) -> a > b ? a : b)
                .ifPresent(System.out::println);

        // 7. Imprimeix el nom dels departaments que comencen per C
        System.out.println("--------------");
        System.out.println("Ejercicio 7");
        DepartamentsDAO.getDepartaments().stream()
                .filter(departamento -> departamento.getNom().startsWith("C"))
                .map(departamento -> departamento.getNom())
                .forEach(System.out::println);
        
        // 8. Imprimeix la suma de totes les edats dels empleats
        System.out.println("--------------");
        System.out.println("Ejercicio 8");
        final int totalEdad = EmpleatsDAO.getEmpleats().stream()
                .mapToInt(empleado -> empleado.getEdat())
                .sum();
        System.out.println(totalEdad);

        // 9 UTILITZA EL MÈTODE GETEMPLEATS DE LA CLASSE DEPARTAMENT (NOMÉS PER A L'EXERCICI 9 I 10)
        // Imprimeix la quantitat d'empleats de cada departament
        System.out.println("--------------");
        System.out.println("Ejercicio 9");
        
        DepartamentsDAO.getDepartaments().stream()
                .forEach(departamento -> System.out.println(departamento.getNom() + ": " + departamento.getEmpleats().size()));
        

        // 10. UTILITZANT EL MÈTODE GETEMPLEATS DE LA CLASSE DEPARTAMENT (NOMÉS PER A L'EXERCICI 9 I 10)
        // Imprimeix la llista de noms dels empleats del departament comercial i de comptabilitat (una única llista d'String)
        System.out.println("--------------");
        System.out.println("Ejercicio 10");
        final List<String> nombres = DepartamentsDAO.getDepartaments().stream()
                .filter(departamento -> departamento.getNom().equals("Comercial") || departamento.getNom().equals("Comptabilitat"))
                .flatMap(departamento -> departamento.getEmpleats().stream())
                .map(empleado -> empleado.getNom())
                .toList();       
        System.out.println(nombres);

        // 11. El mateix d'abans però mostra els noms ordenats alfabèticament.
        System.out.println("--------------");
        System.out.println("Ejercicio 11");        
        final List<String> nombresAlf = DepartamentsDAO.getDepartaments().stream()
                .filter(departamento -> departamento.getNom().equals("Comercial") || departamento.getNom().equals("Comptabilitat"))
                .flatMap(departamento -> departamento.getEmpleats().stream())
                .map(empleado -> empleado.getNom())
                .sorted()
                .toList();
        System.out.println(nombresAlf);
        
        // 12. Mostra la mitjana d'edat dels empleats del departament d'informàtica.
        System.out.println("--------------");
        System.out.println("Ejercicio 12");
        final double mediaEdad = EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getDepartament().getNom().equals("Informàtica"))
                .mapToInt(empleado -> empleado.getEdat())
                .average()
                .orElse(0);
        System.out.println(mediaEdad);
                
                             
        // 13. Mostra un String que serà el resultat de concatenar la primera lletra de cada departament.
        System.out.println("--------------");
        System.out.println("Ejercicio 13");        
        DepartamentsDAO.getDepartaments().stream()
                .map(departamento -> departamento.getNom().charAt(0))
                .forEach(caracter -> System.out.print(caracter.toString() + "  "));
        
        // 14. Mostra el número de telèfon més alt dels departaments.
        System.out.println("--------------");
        System.out.println("Ejercicio 14");
        DepartamentsDAO.getDepartaments().stream()
                .mapToInt(departamento -> departamento.getTelefon())
                .reduce((a, b) -> a > b ? a : b)
                .ifPresent(System.out::println);
        
        // 15. Mostra el departament complet amb el número de telèfon més alt.
        System.out.println("--------------");
        System.out.println("Ejercicio 15");
        DepartamentsDAO.getDepartaments().stream()
                .max((a, b) -> Integer.compare(a.getTelefon(), b.getTelefon()))
                .ifPresent(System.out::println);            

        // 16. Sense fer ús del mètode "getEmpleats". Dels departament que tenen treballadors, mostrar el nom del departament i el nombre de treballadors que hi treballen.
        System.out.println("--------------");
        System.out.println("Ejercicio 16");
        EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(
                        empleado -> empleado.getDepartament().getNom(),
                        Collectors.counting()))
                .forEach((departamento, numTrabajadores) -> System.out.println(departamento 
                        + ": " + numTrabajadores + " trabajadores"));

        // 17A. Guarda en un Map un registre per a cada Departament (que tinga treballadors) que tinga associat com a valor la llista d'empleats d'eixe departament
        System.out.println("--------------");
        System.out.println("Ejercicio 17A");
        final Map<Departament, List<Empleat>> mapaDepartamentos = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(empleado -> empleado.getDepartament()));
        
                mapaDepartamentos.forEach((departamento, empleado) -> 
                System.out.println(departamento.getNom() 
                        + ": " + empleado 
                        + "\n-------------------------"));
        
        
        // 17B. Igual que l'anterior pero la llista no serà d'empleats sino del nom dels empleats
        System.out.println("--------------");
        System.out.println("Ejercicio 17B");
        final Map<Departament, List<String>> mapaNombres = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(Empleat::getDepartament,
                        Collectors.mapping(Empleat::getNom, Collectors.toList())));
        
        mapaNombres.forEach((departamento, empleado) -> 
        System.out.println(departamento + " :" 
                + empleado
                + "\n---------------------------------"));
        // 17C. Igual que l'anterior pero amb els empleats ordenats alfabèticament
        System.out.println("--------------");
        System.out.println("Ejercicio 17C");

        EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(
                        Empleat::getDepartament,
                        Collectors.mapping(
                                Empleat::getNom,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        lista -> lista.stream().sorted().toList()))))
                .forEach((depar, nom)
                        -> System.out.println(depar.getNom() + ": " + nom + "\n---------------------------------"));

        
        // 18A. Obtín un Map que continga per a cada departament una llista d'enters grans (BigInteger) que es corresponguen amb les edats dels empleats d'eixe departament
        System.out.println("--------------");
        System.out.println("Ejercicio 18A");
        final Map<Departament, List<BigInteger>> mapa18A = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(empleado -> empleado.getDepartament(),
                    Collectors.mapping(empleado -> BigInteger.valueOf(empleado.getEdat()),
                            Collectors.toList())));
        
        mapa18A.forEach((departamento, edad) -> System.out.println(departamento.getNom()
            + " :" + edad));
        

        // 18B. El mateix que abans però en comptes de l'edat, el probable següent número primer
        System.out.println("--------------");
        System.out.println("Ejercicio 18B");
        final Map<Departament, List<Integer>> mapa18B = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(empleado -> empleado.getDepartament(),
                        Collectors.mapping(empleado -> nextPrimo(empleado.getEdat()), // ✅ Aquí llamas a tu método correctamente
                                Collectors.toList())));
        
        mapa18B.forEach((departamento, primo) -> System.out.println(
        departamento.getNom() + ": " + primo)); 
        
        // 19. Obtín un Map que continga per a cada departament l'empleat més jove.
        System.out.println("--------------");
        System.out.println("Ejercicio 19");
        final Map<Departament, Empleat> mapa19 = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(empleado -> empleado.getDepartament(),
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(empleado -> empleado.getEdat())),
                                Optional::get)));
        mapa19.forEach((departamento, empleado) -> 
            System.out.println(departamento.getNom() + ": " + empleado.getEdat()));
        
        // 20. Obtín un String que continga el mateix que abans, amb el format "Departament1:Empleat1, Departament2:Empleat2 ..."
        System.out.println("--------------");
        System.out.println("Ejercicio 20");      
        final String formato20 = mapa19.entrySet().stream()
                .map(valores -> valores.getKey().getNom() + ": " + valores.getValue().getNom())
                .collect(Collectors.joining(", "));
        
        System.out.println(formato20);

        // 21. Obtín un Map que conté com a clau el DNI dels empleats i com a valor el nom d'eixe empleat
        System.out.println("--------------");
        System.out.println("Ejercicio 21");
        final Map<String, String> mapa21 = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.toMap(empleado -> empleado.getDni(),
                        empleado -> empleado.getNom()));
        System.out.println(mapa21);

        // 21. Obtín una llista d'Strings que continga DNI dels empleats i el nom d'eixe empleat amb el format DNI - Nom. Llista ordenada per DNI
        //Se repite el 21
        System.out.println("--------------");
        System.out.println("Ejercicio 21");
        final List<String> lista21 = EmpleatsDAO.getEmpleats().stream()
                .sorted(Comparator.comparing(empleado -> empleado.getDni()))
                .map(empleado -> empleado.getDni() + " - " + empleado.getNom())
                .collect(Collectors.toList());
        
        lista21.forEach(System.out::println);

        // 22A. Donat un array bidimensional d'Integer transformar-lo en un array unidimensional amb els mateixos valors:
        System.out.println("--------------");
        System.out.println("Ejercicio 22A");        
        Integer[][] matriuInteger = {{3, 2, 5}, {0, -8, 7}, {9, 9, 6}};
        final Integer[] arrayMatriu = Arrays.stream(matriuInteger)
                .flatMap(Arrays::stream)
                .toArray(Integer[]::new);
        
        System.out.println(Arrays.toString(arrayMatriu));
                
        // 22B. Versió amb int[] en comptes d'Integer[]
        System.out.println("--------------");
        System.out.println("Ejercicio 22B");   
        final int[] arrayMatriu22B = Arrays.stream(matriuInteger)
                .flatMapToInt(fila -> Arrays.stream(fila)
                    .mapToInt(Integer::intValue))
                .toArray();
        System.out.println(Arrays.toString(arrayMatriu22B));
                
        
        // 23. Guarda una llista amb els noms dels estudis de tots els empleats (de forma única), ordenats alfabèticament.
        System.out.println("--------------");
        System.out.println("Ejercicio 23");   
        final List<String> lista23 = EmpleatsDAO.getEmpleats().stream()
                .flatMap(empleado -> empleado.getTitols().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        lista23.forEach(empleado -> System.out.println(empleado));

        // 24. Imprimeix per pantalla aquells empleats que tinguen un CFGS
        System.out.println("--------------");
        System.out.println("Ejercicio 24"); 
        EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getTitols().contains("CFGS"))
                .forEach(empleado -> System.out.println(empleado.getNom() 
                        + ": " + empleado.getTitols()));

        // 25. Mostra un empleat qualsevol que tinga una llicenciatura
        System.out.println("--------------");
        System.out.println("Ejercicio 25");
        EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getTitols().contains("Llicenciatura"))
                .findAny()
                .ifPresent(System.out::println);
                
        // 26. Mostra per a cada nom d'empleat la suma de les lletres dels seus titols
        System.out.println("--------------");
        System.out.println("Ejercicio 26");
        EmpleatsDAO.getEmpleats().stream()
                .map(empleado -> empleado.getNom() + ": " +
                        empleado.getTitols().stream()
                            .mapToInt(titulo -> titulo.length())
                            .sum())
                .forEach(System.out::println);
        
        // 27. Mostra el total de lletres dels titols (incloent duplicats) dels empleats
        System.out.println("--------------");
        System.out.println("Ejercicio 27");
        final int numeroLetras27 = EmpleatsDAO.getEmpleats().stream()
                .flatMap(empleado -> empleado.getTitols().stream())
                .mapToInt(titulo -> titulo.length())
                .sum();
        
        System.out.println(numeroLetras27);

        // 28. Mostra l'empleat amb major quantitat de títols
        System.out.println("--------------");
        System.out.println("Ejercicio 28");
        EmpleatsDAO.getEmpleats().stream()
                .max(Comparator.comparingInt(titulos -> titulos.getTitols().size()))
                .ifPresent(System.out::println);
        
        // 29A. Obtín una llista que continga 5 aleatoris entre 0 i 9 en format String
        System.out.println("--------------");
        System.out.println("Ejercicio 29A");
        IntStream.generate(() -> new Random().nextInt(10))
                .limit(5)
                .mapToObj(Integer::toString)
                .forEach(numero -> System.out.println(numero));
        

        // 29B. El mateix d'abans, però ara sense valors repetits.
        System.out.println("--------------");
        System.out.println("Ejercicio 29B");
        IntStream.generate(() -> new Random().nextInt(10))
                .limit(5)
                .distinct()
                .mapToObj(Integer::toString)
                .forEach(numero -> System.out.println(numero));
                

        // 30. Crea un stream amb tots els números positius divisibles entre 3. Després filtra aquells que siguen quadrats perfectes. 
        // Després descarta els 5 primers valors obtinguts. Finalment mostra els 10 següents valors obtinguts
        System.out.println("--------------");
        System.out.println("Ejercicio 30");
        IntStream.iterate(1, numero -> numero + 1)
                .filter(numero -> numero % 3 == 0)
                .filter(numero -> Math.sqrt(numero) % 1 == 0)
                .skip(5)
                .limit(10)
                .forEach(numeros -> System.out.println(numeros));

        // 31. A partir dels cognoms dels empleats imprimeix amb una operació intermèdia els cognoms sense transformar i després transformats en majúscules.
        // Finalment retorna el nombre d'empleats.
        System.out.println("--------------");
        System.out.println("Ejercicio 31");
        EmpleatsDAO.getEmpleats().stream()
                .peek(empleado -> System.out.println(empleado.getCognoms()))
                .map(empleado -> empleado.getCognoms().toUpperCase())
                .forEach(empleado -> System.out.println(empleado));
                

        // 32. Imprimeix el cognom dels empleats ordenats en ordre alfabètic invers.
        System.out.println("--------------");
        System.out.println("Ejercicio 32");
        EmpleatsDAO.getEmpleats().stream()
                .map(empleado -> empleado.getCognoms())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // 33. Obtín la suma dels títols de tots els empleats
        System.out.println("--------------");
        System.out.println("Ejercicio 33");   
        final int sumaTitulos33 = EmpleatsDAO.getEmpleats().stream()
                .mapToInt(empleado -> empleado.getTitols().size())
                .sum();
        
        System.out.println(sumaTitulos33);

        // 34. Obtín un String amb la concatenació dels títols d'aquells empleats que tinguen menys de 30 anys, separats per espais (sense duplicats)
        System.out.println("--------------");
        System.out.println("Ejercicio 34");
        final String titulos34 = EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getEdat() < 30)
                .flatMap(empleado -> empleado.getTitols().stream())
                .distinct()
                .collect(Collectors.joining(" "));
        System.out.println(titulos34);
        
        
        // 35A. Mostra el cognom del primer dels empleats trobat que tinga menys de 30 anys i que tinga una llicenciatura. En cas de no trobar-lo mostra "No trobat"
        System.out.println("--------------");
        System.out.println("Ejercicio 35A");
        final String empleados35A = EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getEdat() < 30)
                .filter(empleado -> empleado.getTitols().stream()
                        .anyMatch(titulo -> titulo.contains("Llicenciatura")))
                .map(empleado -> empleado.getCognoms())
                .findFirst()
                .orElse("No encontrado");
        System.out.println(empleados35A);
        
        // ¿I si proves per a menors de 40?
        System.out.println("--------------");
        System.out.println("Ejercicio 35A_2");
        final String empleados35A2 = EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getEdat() < 40)
                .filter(empleado -> empleado.getTitols().stream()
                        .anyMatch(titulo -> titulo.contains("Llicenciatura")))
                .map(empleado -> empleado.getCognoms())
                .findFirst()
                .orElse("No encontrado");
        System.out.println(empleados35A2);

        // 35B. Mostra el primer dels empleats (complet) trobat que tinga menys de 30 anys i que tinga una llicenciatura. En cas de no trobar-lo mostra "No trobat"
        System.out.println("--------------");
        System.out.println("Ejercicio 35B");
        EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getEdat() < 30)
                .filter(empleado -> empleado.getTitols().stream()
                    .anyMatch(titulo -> titulo.contains("Llicenciatura")))
                .findFirst()
                .ifPresentOrElse(empleado -> System.out.println(empleado),
                        () -> System.out.println("No encontrado"));
                
        // ¿I si proves per a menors de 40?
        System.out.println("--------------");
        System.out.println("Ejercicio 36B_2");
        EmpleatsDAO.getEmpleats().stream()
                .filter(empleado -> empleado.getEdat() < 40)
                .filter(empleado -> empleado.getTitols().stream()
                    .anyMatch(titulo -> titulo.contains("Llicenciatura")))
                .findFirst()
                .ifPresentOrElse(empleado -> System.out.println(empleado),
                        () -> System.out.println("No encontrado"));
       
        // 36. Obtín un LinkedHashSet dels títols que tenen tots els empleats.
        System.out.println("--------------");
        System.out.println("Ejercicio 36B_2");
        final Set<String> linkedhashset36 = EmpleatsDAO.getEmpleats().stream()
                .flatMap(empleado -> empleado.getTitols().stream())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        
        System.out.println(linkedhashset36);

        // 37. Obtín un Map amb dos claus, la primera tindrá com a valors una llista dels empleats amb el títol de CFGS i l'altra clau tindrá una llista amb els que no el tenen.
        System.out.println("--------------");
        System.out.println("Ejercicio 37");
        final Map<Boolean, List<Empleat>> map37 = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.partitioningBy(empleado -> empleado.getTitols().stream()
                    .anyMatch(titulo -> titulo.equalsIgnoreCase("CFGS"))));
        
        System.out.println("Empleados con CFGS:");
        map37.get(true).forEach(System.out::println);
        
        System.out.println("\nEmpleados sin CFGS:");
        map37.get(false).forEach(System.out::println);
              
        
        // 38. A partir d'una llista d'String retorna la mateixa llista pero sense cadenes buides
        System.out.println("--------------");
        System.out.println("Ejercicio 38");
        List<String> elementsOriginals = List.of("aigua", "", "llet", "oli", "", "  ", "lletuga");
        final List<String> elementosSinEspacios = elementsOriginals.stream()
                .filter(lista -> !lista.trim().isEmpty())
                .collect(Collectors.toList());
        
        System.out.println(elementosSinEspacios);
        

        // 39. Obtín una cadena separada per comes basada en una llista determinada d'enters. 
        // Cada element ha d'anar precedit de la lletra 'p' si el nombre és parell i precedit de la lletra 'i' si el nombre és imparell. 
        // Per exemple, si la llista d'entrada és (3,44), la eixida hauria de ser 'i3, p44'.
        final List<Integer> llistaEnters = List.of(9,23,4,15);
        System.out.println("--------------");
        System.out.println("Ejercicio 39");    
        String listaEnteros = llistaEnters.stream()
                .map(numero -> (numero % 2 == 0 ? "p" : "i") + numero)
                .collect(Collectors.joining(", "));
        
        System.out.println(listaEnteros);
        
        // 40.A partir dels empleats. Obtín un mapa que tinga com a clau el nom del departament i com a valor un altre mapa
        // Este segon mapa tindrà com a clau el cognom de l'empleat y com a valor la llista de títols que té.
        System.out.println("--------------");
        System.out.println("Ejercicio 40"); 
        final Map<String, Map<String, List<String>>> mapa40 = EmpleatsDAO.getEmpleats().stream()
                .collect(Collectors.groupingBy(empleado -> empleado.getDepartament().getNom(),
                        Collectors.toMap(empleado -> empleado.getCognoms(),
                                empleado -> empleado.getTitols())));
        
        mapa40.forEach((departamento, apellidoTitulo) -> { System.out.println(
            "Departamento: " + departamento);
        apellidoTitulo.forEach((apellido, titulos) -> System.out.println(
            " " + apellido + ": " + titulos));
                });
        // EXTRA A: A partir d'un String retorna les lletres distintes que conté, separades per comes (només lletres, no espais ni números ni altres caracters)
        String frase1 = "Tinc un 8 en PROG";
        System.out.println("--------------");
        System.out.println("Ejercicio EXTRA A");
        final String frase1Resuelto = frase1.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println(frase1Resuelto);
        
        // EXTRA B: A partir d'un String retorna la quantitat de lletres distintes que conté (només lletres, no espais ni números ni altres caracters)
        System.out.println("--------------");
        System.out.println("Ejercicio EXTRA B");
        final int extraB = (int) frase1.chars()
                .mapToObj(caracter -> (char) caracter)
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count();
        
        System.out.println(extraB);
                
        
        // EXTRA C: Obtín un mapa que mostre com a clau cada lletra distinta del String, i com a valor la quantitat de vegades que apareix.
        System.out.println("--------------");
        System.out.println("Ejercicio EXTRA C"); 
        final Map<Character, Long> mapaExtraC = frase1.chars()
                .mapToObj(caracter -> (char) caracter)
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(caracter -> caracter, Collectors.counting()));
        
        mapaExtraC.forEach((caracter, cantidad) -> System.out.println(caracter 
                + ": " + cantidad));
                
        // EXTRA D: Mostra la lletra amb major freqüencia d'aparicions, i el nombre d'aparicions d'eixa lletra.
        System.out.println("--------------");
        System.out.println("Ejercicio EXTRA D");  
        frase1.chars()
                .mapToObj(caracter -> (char) caracter)
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(caracter -> caracter, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).ifPresentOrElse(
                    letra -> System.out.println("Letra con mayor frecuencia: " + letra.getKey() + ": " 
                                + letra.getValue()),
                        () -> System.out.println("No se han encontrado letras"));
        
        
        

    }
    //Para el ejercicio 18B: Función que, dado un número, calcula su siguiente número primo
    public static int nextPrimo(int primo){
        int siguiente = primo + 1;
        while (true){
            boolean esPrimo = true;
            if (siguiente <= 1){
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(siguiente); i++){
                    if (siguiente % i == 0){
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo){
                return siguiente;
            }
            siguiente++;
        }

    }

}
