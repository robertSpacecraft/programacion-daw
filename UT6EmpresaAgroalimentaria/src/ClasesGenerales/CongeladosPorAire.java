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
public class CongeladosPorAire extends ProductosCongelados {
    int porcentajeNitrogeno;
    int porcentajeOxigeno;
    int porcentajeCO2;
    int porcentajeVaporAgua;
    
    public CongeladosPorAire(Date fecha, String numLote, Date fechaEnvasado, String paisOrigen, int temperaturaMax, int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeCO2, int porcentajeVaporAgua) {
        super(fecha, numLote, fechaEnvasado, paisOrigen, temperaturaMax);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeCO2 = porcentajeCO2;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }
    
}
