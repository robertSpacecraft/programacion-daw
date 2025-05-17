/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String nombre, String provincia){
        this.nombre = nombre;
        this.provincia = provincia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    @Override
    public String toString(){
        return "Ciudad: " + this.nombre
                + "\nProvincia: " + this.provincia;
    }
    
}
