/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Trigonometria {
    public static void main(String[] args) {
        
        Angulo a = new Angulo(90);
        Angulo b = new Angulo(750);
        Angulo c = new Angulo(-77);
        
        Angulo d = new Angulo(a);
        d.setGrados(100);
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        System.out.println("Radianes de a: " + a.toRadians());
        
        System.out.println("Probando getGrados de b: " + b.getGrados());
        
        b.setGrados(80);
        System.out.println("Probando setGrados de b: " + b);
        
        System.out.println("El seno de b es: " + b.getSinus());
        System.out.println("El coseno de b es: " + b.getCosinus());
        System.out.println("La tangente de b es: " + b.getTangent());
        
        System.out.println("Probando esAgudo: " + b.esAgudo());
        
        a.setGrados(850);
        System.out.println("Angulo a antes de simplificar: " + a);
        a.simplificar();
        System.out.println("Despues de Simplificar: " + a);
        
        a.setGrados(90);
        b.visualizar();
        d.visualizar();
        a.visualizar();
        
        d.setGrados(90);
        System.out.println("Prueba equals a y d: " + a.equals(d));
        System.out.println("Prueba equals a y c: " + a.equals(c));
        
        System.out.println("hashCode a: " + a.hashCode());
        
        
        System.out.println(a.getSinus());
        System.out.println(b.getSinus());
        
        Angulo e = Angulo.asin(b.getSinus());
        System.out.println("La nueva instancia e = " + e);
        
        System.out.println("b = e " + b.equals(e));
        
        b = e;
        
        System.out.println("b = e " + b.equals(e));
        System.out.println("Referencia de b: " + b.hashCode());
        System.out.println("Referencia de e: " + e.hashCode());
        
        b.setGrados(120);
        
        System.out.println("Modifico los grados de b a 120 los de e son: " + e.getGrados());
        
        //Aquí claramente vemos como en b = e lo que hemos hecho es cambiar la refrencia del objeto e y
        //le hemos puesto la del objeto b
        
        
        
        
    }
    
}
