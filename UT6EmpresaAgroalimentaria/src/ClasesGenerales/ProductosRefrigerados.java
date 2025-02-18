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
public class ProductosRefrigerados extends Producto {
    String codigo;
    Date fechaEnvasado;
    int temperatura;
    String paisOrigen;
    
    public ProductosRefrigerados(Date fecha, String numLote, String codigo, Date fechaEnvasado, int temperatura, String paisOrigen) {
        super(fecha, numLote);
        this.codigo = codigo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperatura = temperatura;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Fecha de Caducidad: " + super.fecha.toString());
        System.out.println("Número de Lote: " + super.numLote);
        System.out.println("Código: " + this.codigo);
        System.out.println("Fecha de Envasado: " + this.fechaEnvasado.toString());
        System.out.println("Temperatura: " + this.temperatura);
        System.out.println("País de origen: " + this.paisOrigen);
    }
    
}
