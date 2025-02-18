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
public class ProductosCongelados extends Producto {
    Date fechaEnvasado;
    String paisOrigen;
    int temperaturaMax;
    
    public ProductosCongelados(Date fecha, String numLote, Date fechaEnvasado, String paisOrigen, int temperaturaMax) {
        super(fecha, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMax = temperaturaMax;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Fecha de Caducidad: " + super.fecha.toString());
        System.out.println("Número de Lote: " + super.numLote);
        System.out.println("Fecha Envasado: " + fechaEnvasado.toString());
        System.out.println("País origen: " + paisOrigen);
        System.out.println("Temperatura: " + temperaturaMax);
    }
    
}
