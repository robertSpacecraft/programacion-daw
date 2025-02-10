/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */

import matriugenerica.MatriuEnters;
import matriugenerica.MatriuException;

public class TestMatriuEnters {

    public static void main(String[] args) {
        MatriuEnters mEa = new MatriuEnters(3);
        
        MatriuEnters mEb = new MatriuEnters(3);
        
        mEa.mostrarMatriu();
        System.out.println("-------");
        mEb.mostrarMatriu();
        System.out.println("SUMA:");
        try{
        mEa.sumar(mEb.getMatriu());
        } catch (MatriuException e){
            System.out.println("Error: " + e.getMessage());
        }                
        mEa.imprimirUltimaOperacion();
    }
    
}
