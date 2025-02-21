/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public abstract class Bicicleta implements Rentable{
    private String modelo;
    private int id;
    
    public Bicicleta(String modelo, int id){
        this.modelo = modelo;
        this.id = id;
    }
    
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.modelo
                                + "\nId: " + this.id);
    }
    
    @Override
    public abstract double calcularTarifas(int horas);
}
