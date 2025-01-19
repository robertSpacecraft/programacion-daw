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
    
    public Yate(String matricula, double metrosEslora, int anyoFabricacion, double potencia, int numeroCabinas) {
        super(matricula, metrosEslora, anyoFabricacion);
        if (potencia >= 0) {
            this.potencia = potencia;
        } else {
            System.out.println("El valor de la potencia no puede ser negativo");
            this.potencia = 0;
        }
        if (numeroCabinas >= 0) {
            this.numeroCabinas = numeroCabinas;
        } else {
            System.out.println("El número de cabinas no puede ser negativo");
            this.numeroCabinas = 0;
        }
    }
    
    @Override
    public double calcularFactor(){
        return (super.getMetrosEslora() * 10) + (this.potencia / 2) + (this.numeroCabinas * 10);
    }
    
}
