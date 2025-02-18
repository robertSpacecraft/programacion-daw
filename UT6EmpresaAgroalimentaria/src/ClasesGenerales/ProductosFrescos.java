/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesGenerales;

import java.util.Date;

/**
 *
 * @author Robert
 */
public class ProductosFrescos extends Producto {
    Date fechaEnvasado;
    int horasSinNevera;
    String paisOrigen;
    
    public ProductosFrescos(Date fecha, String numLote, Date fechaEnvasado, int horasSinNevera, String paisOrigen) {
        super(fecha, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.horasSinNevera = horasSinNevera;
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Fecha Caducidad: " + super.fecha.toString());
        System.out.println("Número de Lote: " + super.numLote);
        System.out.println("Fecha Envasado: " + this.fechaEnvasado.toString());
        System.out.println("Horas sin nevera: " + this.horasSinNevera);
        System.out.println("País de Origen: " + this.paisOrigen);
    }
    
}
