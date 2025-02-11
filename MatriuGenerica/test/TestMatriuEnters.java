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
        MatriuEnters m1 = new MatriuEnters(3);
        try {
            Integer[][] m2 = {{1, 5, 8}, {3, 9, 3}, {4, 6, 8}};
            Integer[][] m3 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
            m1.sumar(m2);
            m1.imprimirUltimaOperacion();
            m1.multiplicar(m3);
            m1.imprimirUltimaOperacion();
            m1.zero();
            m1.sumar(m3);
            m1.imprimirUltimaOperacion();
            m1.zero();
            m1.multiplicar(m3);
            m1.imprimirUltimaOperacion();
            
        } catch (MatriuException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
