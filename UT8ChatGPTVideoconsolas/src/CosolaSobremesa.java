/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class CosolaSobremesa extends Videoconsola{
    public int almacenamiento;
    
    public CosolaSobremesa(String marca, String modelo, double precio, int almacenamiento) throws InvalidVideoconsolaException {
        super(marca, modelo, precio);
        this.almacenamiento = almacenamiento;
    }
    
    public void mostrarAlmacenamiento(){
        System.out.println("Almacenamiento: " + this.almacenamiento + "Gb");
    }

    @Override
    public String toString() {
        return "CosolaSobremesa{" + "almacenamiento=" + almacenamiento + '}';
    }
    
    
    
}
