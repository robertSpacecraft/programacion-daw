/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Audio extends MedioMultimedia {
    private int volumen;
    
    public Audio(String titulo, double duracion, int volumen){
        super(titulo, duracion);
        this.volumen = volumen;
    }
    
    public void ajustarVolumen(int nuevoVolumen){
        if (nuevoVolumen <= 0 || nuevoVolumen <= 100){
            this.volumen = nuevoVolumen;
        } else {
            System.out.println("El volumen debe ser un valor entre 0 y 100");
        }
    }

    @Override
    public void reproducir() {
        super.mostrarDatos();
        System.out.println("Volumen: " + this.volumen);
    }
    
}
