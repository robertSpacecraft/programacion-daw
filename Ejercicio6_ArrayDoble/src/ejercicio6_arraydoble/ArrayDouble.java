/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6_arraydoble;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class ArrayDouble<T, U> {
    private ArrayList<T> arrayT;
    private ArrayList<U> arrayU;
    
    public ArrayDouble(){
        arrayT = new ArrayList<>();
        arrayU = new ArrayList<>();
    }
    
    public void add(T t, U u){
        arrayT.add(t);
        arrayU.add(u);
    }
    
    public void eliminar(T t, U u){
        arrayT.remove(t);
        arrayU.remove(u);
    }
    
    public void eliminarIndex(int index){
        arrayT.remove(index);
        arrayU.remove(index);
    }
    
    public void imprimirIndex(int index){
        if (index >= 0 && index < arrayT.size()){
            System.out.println("ArrayDoble: " + arrayT.get(index) + " " + arrayU.get(index));
        } else{
            System.out.println("Índice fuera de rango");
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < arrayT.size(); i++){
        System.out.println("ArrayDoble: " + arrayT.get(i) + " " + arrayU.get(i));
        }
    }
        
    
}
