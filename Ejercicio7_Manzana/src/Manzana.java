/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Manzana implements Comparable<Manzana> {
    private int sabor;
    
    public Manzana(int sabor){
        if (sabor >= 0 && sabor <= 10){
        this.sabor = sabor;
        } else throw new IllegalArgumentException("Sabor fuera de rango");
    }
    
    public Manzana(){
        this.sabor = 5;
    }
    
    public int getSabor(){
        return sabor;
    }

    @Override
    public int compareTo(Manzana m) {
        return Integer.compare(this.sabor, m.sabor);
    }
    
    @Override
    public String toString(){
        return "Sabor: " + sabor;
    }
        
}
