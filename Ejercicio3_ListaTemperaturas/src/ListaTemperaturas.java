
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class ListaTemperaturas extends ArrayList<Double> {
    
    public double acumulado(){
        double suma = 0;
        for (double temp : this){
            suma += temp;
        }
        return suma;
    }
    
    public double media(){
        double media = 0;
        if(this.isEmpty()){
            return 0;
        }
        return acumulado() / this.size();
        }
    
    public int frecuencia(double temperatura){
        int freq = 0;
        for (double temp : this){
            if (temp == temperatura){
                freq++;
            }
        }
        return freq;
    }
    
    public void ordenar(){
        Collections.sort(this);
    }
    
    public void desordenar(){
        Collections.shuffle(this);
    }
    
    public void invertir(){
        Collections.reverse(this);
    }
}
