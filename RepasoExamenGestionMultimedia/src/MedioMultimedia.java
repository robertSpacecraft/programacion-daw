/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public abstract class MedioMultimedia implements Reproducible{
    private String titulo;
    private double duracion;
    
    public MedioMultimedia(String titulo, double duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    public void mostrarDatos(){
        System.out.println("Título: " + this.titulo +
                "\nDuración: " + this.duracion);
    }
    
    @Override
    public abstract void reproducir();

    
}
