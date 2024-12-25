/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p53.joc;
import p53.joc.enums.EstatCasella;
import p53.util.GestorIO;
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
    
    //Métodos
    public void cantarVictoria(){
    io.out("¡Has ganado el juego, bien hecho!");    
    }
    
    public String errorPosada(Tauler tauler, Coordenada coordenada){
    String mensaje = "mensaje";
    return mensaje;
    }
    
}
