/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Videoconsola {
    private String marca;
    private String modelo;
    private double precio;
    
    public Videoconsola(String marca, String modelo, double precio) throws InvalidVideoconsolaException{
        if (precio < 0){
            throw new InvalidVideoconsolaException("El precio no puede ser menor a 0", 101);
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nPrecio: " + this.precio);
    }
    
    
}
