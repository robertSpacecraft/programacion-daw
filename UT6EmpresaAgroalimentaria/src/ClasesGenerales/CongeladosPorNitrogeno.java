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
public class CongeladosPorNitrogeno extends ProductosCongelados {
    String metodoCongelacion;
    int tiempoExpoNitro;
    
    public CongeladosPorNitrogeno(Date fecha, String numLote, Date fechaEnvasado, String paisOrigen, int temperaturaMax, String metodoCongelacion, int tiempoExpoNitro) {
        super(fecha, numLote, fechaEnvasado, paisOrigen, temperaturaMax);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExpoNitro = tiempoExpoNitro;
    }
    
}
