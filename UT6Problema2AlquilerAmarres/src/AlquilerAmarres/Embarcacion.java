/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
public abstract class Embarcacion {
    //Atributos
    private final String matricula;
    private final double metrosEslora;
    private final int anyoFabricacion;
    
    //Consturctor
    protected Embarcacion(String matricula, double metrosEslora, int anyoFabricacion){
    this.matricula = matricula;
    this.metrosEslora = metrosEslora;
    this.anyoFabricacion = anyoFabricacion;
    }
    
    //Métodos
    public abstract double calcularFactor();
    
    //Getters
    public String getMatricula() {
        return matricula;
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }
    
}
