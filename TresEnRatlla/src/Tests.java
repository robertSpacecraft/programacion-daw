/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
import p53.joc.Coordenada;
import p53.util.GestorIO;
import p53.joc.Torn;
import p53.joc.Tauler;
import p53.joc.enums.EstatCasella;
        
public class Tests {
    public static void main(String[] args) {
        GestorIO input = new GestorIO();
        
        Coordenada c = new Coordenada();
        Coordenada usuarioInput = c.regogir();
        
        System.out.println("Usuario input: \nFila: " + usuarioInput.getFila() + "\nColumna: " + usuarioInput.getColumna());
        
        Torn turno = new Torn();
        
        System.out.println("valor: " + turno.toca());
        System.out.println("noToca: " + turno.noToca());
        turno.canviar();
        System.out.println("valor: " + turno.toca());
        
        Tauler t1 = new Tauler();
        t1.mostrar();
        
        
      
    }
    
}
