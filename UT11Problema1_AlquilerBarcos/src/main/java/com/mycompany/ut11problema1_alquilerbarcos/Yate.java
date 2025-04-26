/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

/**
 *
 * @author Robert
 */
public class Yate extends Embarcacion{
    private final double potencia;
    private final int numCamarotes;
    
    public Yate(double potencia, int numCabinas, String matricula, double metrosEslora, int fabricacionYear){
        super(matricula, metrosEslora, fabricacionYear);
        if (potencia < 0){
            System.out.println("La potencia debe ser un valor positivo");
            this.potencia = 1;
        } else this.potencia = potencia;
        
        if (numCabinas < 0){
            System.out.println("Un yate tiene al menos una cabina");
            this.numCamarotes = 1;
        } else this.numCamarotes = numCabinas;
    }
    
    @Override
    public double calcularFactor(){
        return (super.getMetrosEslora() * 10) 
                + (this.potencia / 2)
                + (this.numCamarotes * 10);
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nPotencia: " + this.potencia
                + "\nNúmero de cabinas: " + this.numCamarotes;
    }
}
