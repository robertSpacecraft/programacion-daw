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
public abstract class Producto {
    Date fecha;
    String numLote;
    
    
    public Producto(Date fecha, String numLote){
        this.fecha = fecha;
        this.numLote = numLote;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNumLote() {
        return numLote;
    }
    
    public abstract void mostrarInfo();
    
}
