/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTriangulo;

/**
 *
 * @author Robert
 */
public class Triangulo {
    //Atributos
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Constructor
    public Triangulo(double lado1, double lado2, double lado3){
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    }
    
    //Métodos
    public double ladoMayor(){
        
        if(lado1 > lado2 && lado1 > lado3){
            return lado1;
        }else if (lado2 > lado1 && lado2 > lado3 ){
            return lado2;
        }else {
            return lado3;
                    }           
    }
    
    public double area(){
    
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
            
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) *
                         (semiperimetro - lado2) * (semiperimetro - lado3));
    }
    
    public String tipoTriangulo(){
        String equilatero = "Equilátero";
        String escaleno = "Escaleno";
        String isosceles = "Isósceles";
        
        if (lado1 == lado2 && lado1 == lado3){
        return equilatero;
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        return isosceles;
        }else {
        return escaleno;
        }
        
    }
    
           
}
