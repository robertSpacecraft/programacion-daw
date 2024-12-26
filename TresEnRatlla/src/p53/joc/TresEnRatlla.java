/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p53.joc;

/**
 *
 * @author Robert
 */

import p53.joc.Tauler;
import p53.joc.Torn;
import p53.joc.enums.EstatCasella;
import p53.joc.Jugador;
import p53.util.GestorIO;

public class TresEnRatlla {
    private Tauler tauler;
    private Jugador[] jugadors;
    private Torn torn;
    
    GestorIO io = new GestorIO();
    
   //constructores
    public TresEnRatlla(){
        this.tauler = new Tauler();
        this.jugadors = new Jugador[2];
        this.jugadors[0] = new Jugador(EstatCasella.OS);
        this.jugadors[1] = new Jugador(EstatCasella.XS);
        this.torn = new Torn();        
    }
    
    //Metodos
    public void jugar(){
        tauler.mostrar(); //muestra el tablero
        int juga = torn.toca(); //Decide que jugador empieza el juego
        
        //Muestra el jugador que empieza
        io.out("El jugador: " + jugadors[juga].getColor().toString() + " Tiene el turno.\n");
        Coordenada coordenada = jugadors[juga].recollirCoordenadaPosadaValida(tauler);//Pide la coordenada
        
        
        tauler.posarFitxa(coordenada, jugadors[juga].getColor());
        tauler.mostrar();
       
                               
    
    }
    
}
