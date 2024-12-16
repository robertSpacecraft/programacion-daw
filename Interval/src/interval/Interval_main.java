/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interval;

/**
 *
 * @author Robert
 */
public class Interval_main {
    public static void main(String[] args) {
        Interval i = new Interval(5.2, 10.5);
        Interval i1 = new Interval(8.5);
        Interval i2 = new Interval(i);
        Interval i3 = new Interval();
        
        System.out.println("Constructor con limites usuario:" + i);
        System.out.println("Constructor limite superior: " + i1);
        System.out.println("Constructor copia: " + i2);
        System.out.println("constructor por defecto: " + i3);
        
        Interval clonado = i.clone();
        System.out.println("Clonado: " + clonado);
        
        System.out.println("Longitud = " + clonado.longitud());
        
        double moviment = 10.0;
        i.moure(moviment);
        System.out.println("Movimiento: " + i);
        
        
    }
    
}
