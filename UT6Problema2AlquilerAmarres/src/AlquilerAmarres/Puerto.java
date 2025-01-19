/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
public class Puerto {
    //Atributos
    private AlquilerAmarres[] amarres;
    private final int numeroAmarres = 20;
    private int amarresDisponibles;
    
    public Puerto(){
    this.amarres = new AlquilerAmarres[numeroAmarres];
    this.amarresDisponibles = numeroAmarres;
    }
    
    public void addAlquilerAmarre(AlquilerAmarres amarre){
        for (int i = 0; i < this.amarres.length; i++) {
            if (this.amarres[i] == null){
                this.amarres[i] = amarre;
                this.amarresDisponibles--;
                System.out.println("El amarre ha sido ocupado correctamente");
                calcularOcupacion();
                return;
            }            
        }
        System.out.println("No hay amarres disponibles");    
    }
    
    public void eliminarAlquilerAmarre(AlquilerAmarres amarre){
        for (int i = 0; i < this.amarres.length; i++) {
            if (this.amarres[i].getEmbarcacion().getMatricula().equals(amarre.getEmbarcacion().getMatricula())){
                this.amarres[i] = null;
                this.amarresDisponibles++;
                System.out.println("El amarre ha sido eliminado correctamente");
                calcularOcupacion();
                return;
            }
        }
        System.out.println("Amarre no encontrado");
    }
    
    public void calcularOcupacion(){
        System.out.println("Amarres disponibles: " + amarresDisponibles
                    + " de " + numeroAmarres);                   
    }
    
    public void calcularIngresosTotales(){
        double ingresosTotales = 0;
        for (int i = 0; i < this.amarres.length; i++) {
            if (this.amarres[i] != null){
                ingresosTotales = ingresosTotales + (this.amarres[i].calcularPrecio());
            }          
        }
        System.out.println("El ingreso total de los alquileres actuales es de: " + ingresosTotales);
    }   
}
