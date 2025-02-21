/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class BiciElectrica extends Bicicleta {
    private int nivelBateria;
    
    //Constructor
    public BiciElectrica(String modelo, int id, int nivelBateria){
        super(modelo, id);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public double calcularTarifas(int horas) {
        //El cálculo que se me ha ocurrido son 10€ la hora mas 1€ adicional por cada 10% de batería
        final double precioHoras = 10;
        double extraBateria = this.nivelBateria / 10;
        
        return horas * (precioHoras + extraBateria);
    }
    
    public void nivelBateria(){
        System.out.println(this.nivelBateria + "%");
    }
    
}
