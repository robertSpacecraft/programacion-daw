/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

/**
 *
 * @author Robert
 */
public class Velero extends Embarcacion{
    private final int numeroMastiles;
    
    public Velero(int numeroMastiles, String matricula, double metrosEslora, int fabricacionYear){
        super(matricula, metrosEslora, fabricacionYear);
        if (numeroMastiles < 1){
            System.out.println("Un velero debe tener al menos un mastil");
            this.numeroMastiles = 1;
        } else this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public double calcularFactor(){
        return (super.getMetrosEslora() * 10) + (this.numeroMastiles * 5);
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nNúmero de mástiles: " + this.numeroMastiles;
    }
    
}
