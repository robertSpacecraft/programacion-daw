/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Guitarra extends Instrumento {
    private String tipo; //Electrica, acústica, clasica
    
    public Guitarra(String nombre, String marca, double precio, String tipo){
        super(nombre, marca, precio);
        this.tipo = tipo;
    }
    
    @Override
    public String mostrarDatos(){
       return super.mostrarDatos() + "\nTipo: " + this.tipo;
    }
    
    @Override
    public String toString(){
        return "Tipo: " + this.tipo;
    }
    
}
