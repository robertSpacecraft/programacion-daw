/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class ConsolaPortatil extends Videoconsola{
    
    private int horasBateria;
    
    public ConsolaPortatil(String marca, String modelo, double precio, int horasBateria) throws InvalidVideoconsolaException {
        super(marca, modelo, precio);
        this.horasBateria = horasBateria;
    }
    
    public void mostrarHorasBateria(){
        System.out.println("Horas de Bateria: " + this.horasBateria);
    }
    
}
