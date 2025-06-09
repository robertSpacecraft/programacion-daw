/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Ejercicio3_ListaTemperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaTemperaturas lista = new ListaTemperaturas();
        
        lista.add(20.5);
        lista.add(25.5);
        lista.add(22.7);
        lista.add(19.60);
        lista.add(25.5);
        lista.add(27.2);
        lista.add(28.00);
        
        System.out.println("Acumulado: " + lista.acumulado());
        System.out.println("-------------------------------");
        System.out.println("Media: " + lista.media());
        System.out.println("-------------------------------");
        System.out.println("Frecuencia: " + lista.frecuencia(25.5));
        System.out.println("-------------------------------");
        lista.ordenar();
            System.out.println("Lista ordenada: ");
        for (Double temp : lista){
            System.out.println(temp);
        }
        System.out.println("--------------------------------");
        lista.desordenar();
        System.out.println("Lista desordenada: ");
        for (double temp : lista){
            System.out.println(temp);          
        }
        System.out.println("--------------------------------");
        lista.invertir();
        System.out.println("Lista invertida: ");
        for (Double temp : lista){
            System.out.println(temp);
        }
    }
    
}
