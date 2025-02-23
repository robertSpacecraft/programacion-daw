/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Video extends MedioMultimedia{
    private String resolucion;
    
    public Video(String titulo, double duracion, String resolucion){
        super(titulo, duracion);
        this.resolucion = resolucion;
    }
    
    public void mostrarResolucion(){
        System.out.println("Resolución de Vídeo: " + this.resolucion);
    }
    
    @Override
    public void reproducir() {
        super.mostrarDatos();
        this.mostrarResolucion();
    }
    
}
