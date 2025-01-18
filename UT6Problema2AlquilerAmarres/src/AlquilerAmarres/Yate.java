/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
public class Yate extends Embarcacion{
    private final double potencia;
    private final int numeroCabinas;
    
    public Yate(String matricula, double metrosEslora, int anyoFabricacion, double potencia, int numeroCabinas){
        super(matricula, metrosEslora, anyoFabricacion);
        this.potencia = potencia;
        this.numeroCabinas = numeroCabinas;
    }
    
    @Override
    public double calcularFactor(){
        return (super.getMetrosEslora() * 10) + (this.potencia / 2) + (this.numeroCabinas * 10);
    }
    
}
