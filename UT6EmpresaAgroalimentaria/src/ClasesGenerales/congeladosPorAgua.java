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
public class congeladosPorAgua extends ProductosCongelados {
    double salinidadAgua;
    
    public congeladosPorAgua(Date fecha, String numLote, Date fechaEnvasado, String paisOrigen, int temperaturaMax, double salinidadAgua) {
        super(fecha, numLote, fechaEnvasado, paisOrigen, temperaturaMax);
        this.salinidadAgua = salinidadAgua;
    }
    
}
