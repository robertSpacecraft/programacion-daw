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
    private final int numeroCamarotes;
    
    public Yate(double potencia, int numCamarotes, String matricula, double metrosEslora, int fabricacionYear){
        super(matricula, metrosEslora, fabricacionYear);
        if (potencia < 0){
            System.out.println("La potencia debe ser un valor positivo");
            this.potencia = 1;
        } else this.potencia = potencia;
        
        if (numCamarotes < 0){
            System.out.println("Un yate tiene al menos una cabina");
            this.numeroCamarotes = 1;
        } else this.numeroCamarotes = numCamarotes;
    }
    
    @Override
    public double calcularFactor(){
        return (super.getMetrosEslora() * 10) 
                + (this.potencia / 2)
                + (this.numeroCamarotes * 10);
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nPotencia: " + this.potencia
                + "\nNúmero de cabinas: " + this.numeroCamarotes;
    }
}
