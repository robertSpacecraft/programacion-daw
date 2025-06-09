/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class InstrumentosMusicales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("Gibson", "Les Paul", 2500, 6);
        Guitarra g2 = new Guitarra("Fender", "Stratocaster", 1800, 6);
        
        Piano p1 = new Piano("Yamaya", "Piajama", 600, 24);
        Piano p2 = new Piano("Hammond", "Kanin", 3000, 52);
        
        InventarioInstrumento<Instrumento> instrumentos = new InventarioInstrumento<>();
        
        instrumentos.agregar(g1);
        instrumentos.agregar(g2);
        instrumentos.agregar(p1);
        instrumentos.agregar(p2);
        
        for (Instrumento i : instrumentos.obtenerElementos()){
            System.out.println(i);
            System.out.println("----------------");
        }
        
        InventarioInstrumento<Guitarra> guitarras = new InventarioInstrumento<>();
        InventarioInstrumento<Piano> pianos = new InventarioInstrumento<>();
        
        for (Instrumento i : instrumentos.obtenerElementos()){
            if (i instanceof Guitarra){
                guitarras.agregar((Guitarra)i);
            }
            
            if (i instanceof Piano){
                pianos.agregar((Piano) i);
            }
        }
        
        System.out.println("Guitarras:");
        for (Guitarra g : guitarras.obtenerElementos()){
            System.out.println(g);
            System.out.println("----------------");
        }
        System.out.println("Hay " + guitarras.obtenerElementos().size() + " guitarras");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        
        
        System.out.println("Pianos:");
        for (Piano p : pianos.obtenerElementos()){
            System.out.println(p);
            System.out.println("-----------------");
        }
        System.out.println("Hay " + pianos.obtenerElementos().size() + " pianos");
    }
    
}
