/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
public class Deportiva extends Embarcacion {

    private double potencia;

    public Deportiva(String matricula, double metrosEslora, int anyoFabricacion, double potencia) {
        super(matricula, metrosEslora, anyoFabricacion);
        this.potencia = potencia;
    }
    
    @Override
    public double calcularFactor(){
     return (super.getMetrosEslora() * 10) + (this.potencia / 2);
    }

}
