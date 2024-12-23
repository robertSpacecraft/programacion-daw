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
    
    public boolean hiHaTresEnRatlla(EstatCasella jugador) {
        for (int i = 0; i < caselles.length; i++) {
            boolean tres = true;
            for (int j = 0; j < caselles[i].length; j++) {
                if (caselles[i][j] != jugador) {
                    tres = false;
                    break;
                }
            }
            if (tres){
            return true;
            }
        }
        return false;
    }
    
    public void buidar(){
        for (int i = 0; i < caselles.length; i++) {
            for (int j = 0; j < caselles[i].length; j++) {
                caselles[i][j] = EstatCasella.BUIDA;                
            }
            
        }
    
    }
    
}
