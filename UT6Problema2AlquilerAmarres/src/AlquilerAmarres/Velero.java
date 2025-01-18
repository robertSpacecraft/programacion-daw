/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
public class Velero extends Embarcacion {
    //Atributos
    private final int numeroMastiles;

    
    //Constructor
    public Velero(String matricula, double metrosEslora, int anyoFabricacion, int numeroMastiles){
    super(matricula, metrosEslora, anyoFabricacion);
    this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularFactor() {
        return (super.getMetrosEslora() * 10) + (this.numeroMastiles *5);
    }
    
    
}
