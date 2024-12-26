/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p53.joc;

/**
 *
 * @author Robert
 */
import p53.util.GestorIO;
import p53.joc.enums.EstatCasella;

public class Tauler {

    //Atributos
    private final int DIMENSIO = 3;
    private EstatCasella[][] caselles; 

    GestorIO io = new GestorIO();//Inicializo el gestor de entradas y salidas

    //Constructores
    public Tauler() {
        this.caselles = new EstatCasella[DIMENSIO][DIMENSIO];
        this.buidar();
    }

    //Métodos
    public void mostrar() {
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[i].length; j++) {

                io.out(caselles[i][j].toString());
                io.out(" ");
            }
            io.out("\n");
        }
    }
    //Compueba si un jugador tiene tres en raya
    public boolean hiHaTresEnRatlla(EstatCasella jugador) {
        //Recorro las filas y compruebo si alguna no coincide con el color del jugador
        for (int i = 0; i < caselles.length; i++) {
            boolean tres = true;
            for (int j = 0; j < caselles[i].length; j++) {
                if (caselles[i][j] != jugador) {
                    tres = false;
                    break;
                }
            }
            if (tres) {
                return true;
            }
        }
        //Recorro las columnas y compuebo si algún símbolo no coincide con el del jugador
        for (int i = 0; i < caselles.length; i++) {
            boolean tres = true;
            for (int j = 0; j < caselles[i].length; j++) {
                if (caselles[j][i] != jugador) {
                    tres = false;
                    break;
                }
            }
            if (tres) {
                return true;
            }
        }

        //Recorro la diagonal principal
        boolean tresDiagonal = true;
        for (int i = 0; i < caselles.length; i++) {
            if (caselles[i][i] != jugador) {
                tresDiagonal = false;
                break;
            }
        }
        if (tresDiagonal) {
            return true;
        }

        //Recorro la diagonal secundaria
        boolean tresSecundaria = true;
        for (int i = 0; i < caselles.length; i++) {
            if (caselles[i][caselles.length - 1 - i] != jugador) {
                tresSecundaria = false;
                break;
            }
        }
        if (tresSecundaria) {
            return true;
        }
        return false;
    }
    
    //comprueba si en el tablero hay tres en raya.
    public boolean hiHaTresEnRatlla(){       
       if (hiHaTresEnRatlla(EstatCasella.OS) || hiHaTresEnRatlla(EstatCasella.XS)){
           return true;      
       } 
       return false;
    }
    
    //Verifica si una casilla está ocupada por un jugador
    public boolean estaOcupada(Coordenada coordenada){
        if (coordenada.validar()){
            if (caselles[coordenada.getFila()][coordenada.getColumna()] != EstatCasella.BUIDA){
                return true;
            }
        
        }
        return false;      
    }
    //Verifica si la casilla esta ocupada por un jugador concreto
    public boolean estaOcupada(Coordenada coordenada, EstatCasella jugador){
        if (estaOcupada(coordenada)){
            if (caselles[coordenada.getFila()][coordenada.getColumna()] == jugador){
            return true;
            }
        }
        return false;
    }
    
    //Cambia el estado de una casilla vacía por el del jugador que se pasa como parámetro
    public void posarFitxa(Coordenada coordenada, EstatCasella jugador){
        if (!estaOcupada(coordenada)){
        caselles[coordenada.getFila()][coordenada.getColumna()] = jugador;
        } //else {
        //io.out("La casilla la casilla ya está ocupada");
        //}
    }
      
    public void buidar(){
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[i].length; j++) {
                caselles[i][j] = EstatCasella.BUIDA;                
            }   
        }   
    }
    
    public boolean estaPle() {
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[i].length; j++) {
                if (caselles[i][j] == EstatCasella.BUIDA) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}
