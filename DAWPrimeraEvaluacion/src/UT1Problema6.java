package programacionProblemas;

/**
 *
 * @author Robert Amorós Linares
 */

import java.util.Scanner;

public class UT1Problema6 {
    public static void main(String[] args){
        
        //Declarem els variables i constants necesaries
        int preuBeguda = 0;
        int dinesIntroduits = 0;
        int canvi = 0;
        
        final int moneda50 = 50;
        final int moneda20 = 20;
        final int moneda10 = 10;
        final int moneda5 = 5;
        final int moneda2 = 2;
        final int moneda1 = 1;
        
        //Presentem la visualizació de la màquina y demanem le dades de la beguda (preu).
        
        System.out.println("- MÀQUINA DE BEGUDES -");
        System.out.println("-----------------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Introeix el preu de la beguda que vols: ");
        preuBeguda = s.nextInt(); 
        
        //Preguntem per la quantitat de dines introduits
        System.out.println("Diners que introduixes a la màquina en cèntims (màxim 100): ");
        dinesIntroduits = s.nextInt();
        
        //Calculem el cambi i el mostrem per consola
        canvi = dinesIntroduits - preuBeguda;
        System.out.println("El seu canvi és: " + canvi);
        
        int canvi50 = canvi / moneda50;
        canvi = canvi % moneda50; //Amb astó actualitzem el canvi que mos queda
        int canvi20 = canvi / moneda20;
        canvi = canvi % moneda20;
        int canvi10 = canvi / moneda10;
        canvi = canvi % moneda10;
        int canvi5 = canvi / moneda5;
        canvi = canvi % moneda5;
        int canvi2 = canvi / moneda2;
        canvi = canvi % moneda2;
        int canvi1 = canvi / moneda1;
                
        System.out.println("La cantitat de monedes de" + moneda50 + "cèntims és: " + canvi50);
        System.out.println("La cantitat de monedes de" + moneda20 + "cèntims és: " + canvi20);
        System.out.println("La cantitat de monedes de" + moneda10 + "cèntims és: " + canvi10);
        System.out.println("La cantitat de monedes de" + moneda5 + "cèntims és: " + canvi5);
        System.out.println("La cantitat de monedes de" + moneda2 + "cèntims és: " + canvi2);
        System.out.println("La cantitat de monedes de" + moneda1 + "cèntims és: " + canvi1);
    
    }
}
