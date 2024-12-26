/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p53.joc;
import p53.joc.enums.EstatCasella;
import p53.util.GestorIO;
import p53.joc.Coordenada;
import p53.joc.Tauler;
/**
 *
 * @author Robert
 */
public class Jugador {

    //Atributos
    private EstatCasella color;

    GestorIO io = new GestorIO();

    //Constructor
    public Jugador(EstatCasella id) {
        if (id != EstatCasella.OS && id != EstatCasella.XS) {
            io.out("Por favor, introduzca un color válido");
        } else {
            this.color = id;
        }
    }
    
    //Getter que no pide el Problema y que uso para obtener el color del jugador que tiene el turno
    public EstatCasella getColor(){
    return this.color;
    }
    
    //Métodos
    //Devuelve un mensaje de victoria
    public void cantarVictoria(){
    io.out("¡Has ganado el juego, bien hecho!");    
    }
    
    //Compueba si la casilla pasada por parámetro en formato coordenada esta disponible
    public String errorPosada(Tauler tauler, Coordenada coordenada){
        if(tauler.estaOcupada(coordenada)){
        return "Coordenada ocupada en el tauler";
        
        }
    return null;
    }
    
    //Recoge una coordenada válida y la devuelve 
    public Coordenada recollirCoordenadaPosadaValida(Tauler tauler){
        Coordenada coordenadaValida = new Coordenada();
        coordenadaValida.recogir();
        
        boolean valida = true;
        while (valida){
            if (tauler.estaOcupada(coordenadaValida)){
            io.out("La casilla está ocupada, introduzca una coordenada válida");
            coordenadaValida.recogir();
            } else {
            valida = false;
            }
        }
        
        return coordenadaValida;
    }
    
    //Recoge la coordenada válida en Tauler y despues pone la ficha
    public void posarFitxa(Tauler tauler){
    io.out("Posa el jugador amb: " + color.toString());
    
    Coordenada coordenadaPosar = recollirCoordenadaPosadaValida(tauler);
    tauler.posarFitxa(coordenadaPosar, color);
    
    }
    
}
