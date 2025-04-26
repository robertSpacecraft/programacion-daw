/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

/**
 *
 * @author Robert
 */
public class Alquiler {
    private String nombre;
    private String dni;
    private int diasAlquilado;
    private String ubicacionAmarre;
    private Embarcacion embarcacion;
    
    public Alquiler(String nombre, String dni, int diasAlquilado, String ubicacionAmarre, Embarcacion embarcacion){
        this.nombre = nombre;
        this.dni = dni;
        this.diasAlquilado = diasAlquilado;
        this.ubicacionAmarre = ubicacionAmarre;
        this.embarcacion = embarcacion;
    }
    
    //Devuelve un string del precio calculado
    public String getPrecio(){
        double precio = embarcacion.calcularFactor() * diasAlquilado;
        return String.format("%.2f", precio);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDiasAlquilado() {
        return String.valueOf(diasAlquilado);
    }

    public String getUbicacionAmarre() {
        return ubicacionAmarre;
    }

    public String getEmbarcacion() {
        return embarcacion.toString();
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre
                + "\nDNI: " + this.dni
                + "Días de alquiler: " + this.diasAlquilado
                + "Ubicación del amarre: " + this.ubicacionAmarre
                + "Embarcación: " + this.embarcacion;
    }
        
}
