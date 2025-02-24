/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class TestAlmacenarInstrumentos {
    public static void main(String[] args) {
        
        InventarioInstrumentos<Guitarra> g = new InventarioInstrumentos<>();
        
        g.agregar(new Guitarra("Ibanez", "Jem 7v", 1200.00, "Eléctrica"));
        g.agregar(new Guitarra("Gibson", "Custom", 1000.00, "Acústica"));
        g.agregar(new Guitarra("Alhambra", "7P", 500.00, "Clásica"));
        
        System.out.println("Inventario de Guitarras:");
        System.out.println(g.obtenerElementos());
        
        InventarioInstrumentos<Instrumento> i = new InventarioInstrumentos<>();
        
        g.copiarEn(i);
        
        
        
    }
    
}
