/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public abstract class Embarcacion {
    private final String matricula;
    private final double metrosEslora;
    private final int fabricacionYear;
    
    protected Embarcacion(String matricula, double metrosEslora, int fabricacionYear){
        if (matricula.length() != 4){
            System.out.println("La matricula debe se de 4 caracteres");
            this.matricula = "XXXX";
        } else {
            this.matricula = matricula;
        }
        
        if (metrosEslora <= 0){
            System.out.println("La eslora debe ser un valor positivo");
            this.metrosEslora = 1.0;
        } else {
        this.metrosEslora = metrosEslora;
        }
        
        if (fabricacionYear > LocalDate.now().getYear()){
            System.out.println("Un barco no puede viajar al futuro");
            this.fabricacionYear = LocalDate.now().getYear();
        } else {
        this.fabricacionYear = fabricacionYear;
        }
    }
    
    public static Embarcacion buscar(ArrayList<Embarcacion> listaEmbarcaciones, String matricula){
        return listaEmbarcaciones.stream()
                .filter(e -> e.matricula.equalsIgnoreCase(matricula))
                .findFirst()
                .orElse(null);
    }
    
    public abstract double calcularFactor();
    
    @Override
    public String toString(){
        return  "Tipo de embarcación: " + this.getClass().getSimpleName()
                + "\nMatrícula: " + this.matricula 
                + "\nMetro de Eslora: " + this.metrosEslora
                + "\nAño de Fabricación: " + this.fabricacionYear;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public int getFabricacionYear() {
        return fabricacionYear;
    }
    
    
}
