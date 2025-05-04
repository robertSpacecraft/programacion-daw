/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

/**
 *
 * @author Robert
 */
public class ClienteDTO {
    private String nombre;
    private String dni;
    private String ciudad;
    
    public ClienteDTO(String nombre, String dni, String ciudad){
        this.nombre = nombre;
        this.dni = dni;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre
                + "\nDNI: " + this.dni
                + "\nCiudad: " + this.ciudad;
    }
}
