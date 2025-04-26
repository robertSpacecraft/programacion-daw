/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

/**
 *
 * @author Robert
 */
public class Deportiva extends Embarcacion {
    
    private double potencia;
    
    public Deportiva(double potencia, String matricula, double metrosEslora, int fabricacionYear){
        super(matricula, metrosEslora, fabricacionYear);
        if (potencia < 0){
            System.out.println("La potencia debe ser un valor positivo");
            this.potencia = 1;
        } else this.potencia = potencia;
    }
    
    @Override
    public double calcularFactor(){
        return (super.getMetrosEslora() * 10) + (this.potencia / 2);
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nPotencia: " + this.potencia;
    }
    
}
