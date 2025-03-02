/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionvehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Robert
 */
public class GestionVehiculosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo ferrari = new Coche("deportivo", 2, "ferrari", "F40", "2525FFF", 1995);
        Vehiculo lamborgini = new Coche("deprotivo", 4, "lamborgini", "diablo", "1515LLL", 1994);
        Vehiculo jeep = new Coche("4x4", 5, "jeep", "wrangler", "3366JJJ", 2001);
        Vehiculo toyota = new Coche("berlina", 5, "toyota", "camry", "7766TTT", 2024);
        Vehiculo bmw = new Coche("berlina", 5, "bmw", "M5", "7849BBB", 2020);
        Vehiculo mercedes = new Coche("4x4", 5, "mercedes", "clase g", "1234MMM", 2016);
        Vehiculo mazda = new Coche("deprotivo", 4, "mazda", "rx8", "3888", 2013);
        
        Vehiculo suzuki = new Moto(1000, "deportiva", "suzuki", "gsxr", "1787SSS", 2007);
        Vehiculo ktm = new Moto(1290, "trail", "ktm", "super adventure", "5544KKK", 2022);
        Vehiculo yamaha = new Moto(1000, "Naked", "yamaha", "Fazer", "0456YYY", 2018);
        Vehiculo ducati = new Moto(1000, "deportiva", "ducati", "panigale v4", "9896DDD", 2025);
        Vehiculo honda = new Moto(1000, "turismo", "honda", "goldwing", "3021HHH", 1994);
        
        Map<String, Vehiculo> mapVehiculos = new TreeMap<>();
        List<Vehiculo> copiaVehiculos = new ArrayList<>();
        
        Garaje garaje = new Garaje();
        
        try{
        garaje.agregar(ferrari);
        garaje.agregar(lamborgini);
        garaje.agregar(jeep);
        garaje.agregar(toyota);
        garaje.agregar(bmw);
        garaje.agregar(mercedes);
        garaje.agregar(mazda);
        
        garaje.agregar(suzuki);
        garaje.agregar(ktm);
        garaje.agregar(yamaha);
        garaje.agregar(ducati);
        garaje.agregar(honda);
        } catch (InvalidVehiculoException e){
            System.out.println("Año no válido: " + e.getMessage() + " año: " + e.getInvalidYear());
        }
        System.out.println("Cantidad: " + garaje.contar());
        
        System.out.println("Borro un elemento");
        
        garaje.eliminar(jeep);
        
        System.out.println("Cantidad despues de borrar: " + garaje.contar());
        
        System.out.println("--Copio garaje en copiaVehiculos--");
        garaje.copiarEn(copiaVehiculos); //ordena por matricula ascendente ¿por qué?
        
        System.out.println("Cantidad en copiaVehiculos: " + copiaVehiculos.size());
        
        System.out.println("\n---Imprimo los elementos de copiaVehiculos---");
        
        for (Vehiculo vehiculo : copiaVehiculos){
            vehiculo.mostrarDatos();
            System.out.println("----------------");
        }
        
        
        System.out.println("--Obtengo los elementos de garaje--");
        
        garaje.mostrarVehiculos();
        
        System.out.println("///////////////////////");
        
        System.out.println("--Obtengo los elementos del garage ORDENADOS POR AÑO---");
        Collections.sort(copiaVehiculos, new ComparadorPorYear());
        
        for (Vehiculo vehiculo : copiaVehiculos){
            vehiculo.mostrarDatos();
            System.out.println("----------------");
        }
        
        
    }
    
}
