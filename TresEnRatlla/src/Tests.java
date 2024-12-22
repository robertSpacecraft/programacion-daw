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
        
public class Tests {
    public static void main(String[] args) {
        GestorIO input = new GestorIO();
        
        Coordenada c = new Coordenada();
        Coordenada usuarioInput = c.regogir();
        
        System.out.println("Usuario input: \nFila: " + usuarioInput.getFila() + "\nColumna: " + usuarioInput.getColumna());
        
      
    }
    
}
