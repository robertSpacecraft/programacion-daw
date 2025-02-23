
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class TestMultimedia {

    public static void main(String[] args) {
        ArrayList<MedioMultimedia> medio = new ArrayList<>();
        
        Video v1 = new Video("Terminator 2", 110, "4K");
        Video v2 = new Video("Regreso al futuro", 98, "1080");
        Video v3 = new Video("Indian Jones y la última cruzada", 108, "8K");
        
        Audio a1 = new Audio("Stair way to heaven", 7, 80);
        Audio a2 = new Audio("Shook me all night long", 3, 100);
        Audio a3 = new Audio("bohemian rhapsody", 8, 110);
        Audio a4 = new Audio("Sympathy for the Devil", 3, 35);
        
        medio.add(v1);
        medio.add(v2);
        medio.add(v3);
        medio.add(a1);
        medio.add(a2);
        medio.add(a3);
        medio.add(a4);
        
        for (MedioMultimedia multi: medio){
            multi.reproducir();
            if (multi instanceof Video){
                ((Video) multi).mostrarResolucion();
            } else if (multi instanceof Audio){
                ((Audio) multi).ajustarVolumen(50);
                System.out.println("-------");
                multi.reproducir();
            }
        }
        
        
    }
    
}
