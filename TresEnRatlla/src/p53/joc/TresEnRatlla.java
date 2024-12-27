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
    
    private int turno;//Controla cuantos turnos han pasado
    
    GestorIO io = new GestorIO();
    
   //constructores
    public TresEnRatlla(){
        this.tauler = new Tauler();
        this.jugadors = new Jugador[2];
        this.jugadors[0] = new Jugador(EstatCasella.OS);
        this.jugadors[1] = new Jugador(EstatCasella.XS);
        this.torn = new Torn();
        
        this.turno = 0;
    }
    
    //Metodos
    public void jugar() {
        tauler.mostrar(); //muestra el tablero
        int juga = torn.toca(); //Decide que jugador empieza el juego

        boolean ganar = false;
        while (!ganar) {
            //Primera parte
            juga = gestioTorns(juga);

            //Si ya hay posibilidades de que haya tres en raya
            if (turno > 4) {
                if (tauler.hiHaTresEnRatlla()) {
                    jugadors[juga].cantarVictoria();
                    ganar = true;
                }
            }

        }

    }
    
    private int gestioTorns(int juga){
        //Muestra el jugador que empieza
        io.out("El jugador: " + jugadors[juga].getColor().toString() + " Tiene el turno.\n");
        
        //Pide la coordenada válida
        Coordenada coordenada = jugadors[juga].recollirCoordenadaPosadaValida(tauler);
                  
        //El jugador pone la primera ficha
        tauler.posarFitxa(coordenada, jugadors[juga].getColor());
               
        //Muestra el tablero despues de poner la ficha:
        tauler.mostrar();
        
        //Cambia el turno:
        torn.canviar();
        
        //Suma uno a turno
        this.turno++;
        
        //Devuelvae el turno actualizado
        return torn.toca();
    
    }
    
}
