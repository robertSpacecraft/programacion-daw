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
        if (potencia >= 0) {
            this.potencia = potencia;
        } else {
            System.out.println("La potencia no puede un valor negativo");
            this.potencia = 0;
        }
    }
    
    @Override
    public double calcularFactor(){
     return (super.getMetrosEslora() * 10) + (this.potencia / 2);
    }

}
