/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
public class AlquilerAmarres {
    //Atributos
    private String nombreCliente;
    private String dniCliente;
    private int diasAlquiler;
    private String ubicacionAmarre;
    private Embarcacion embarcacion;
    
    //Constructor
    public AlquilerAmarres(String nombreCliente, String dniCliente, int diasAlquiler, String ubicacionAmarre, Embarcacion embarcacion){
    this.dniCliente = nombreCliente;
    this.dniCliente = dniCliente;
    this.diasAlquiler = diasAlquiler;
    this.ubicacionAmarre = ubicacionAmarre;
    this.embarcacion = embarcacion;
    }
    
    //Métodos
    public double calcularPrecio(){
        return this.diasAlquiler * embarcacion.calcularFactor();
    }
    
    
}
