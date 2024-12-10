/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1Fraccion;

/**
 *
 * @author Robert
 */
public class Fraccion {

    private int numerador;
    private int denominador;
    
    
    //Constructores:
    //Constructor numerador/denominador
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("Indeterminado...");
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }
    //Constructor numerador/1
    public Fraccion(int numerador) {
        this(numerador, 1);
    }
    //Constructor por defecto 0/1
    public Fraccion() {
        this(0,1);
    }
    //Constructor copia
    public Fraccion(Fraccion fraccionCopia){
    this(fraccionCopia.numerador, fraccionCopia.denominador);
    }
    //Metodos;
    //Suma
    public Fraccion suma(Fraccion userFraccion){
    int numeradorSumado = (this.numerador * denominador) + (this.denominador * numerador);
    int denominadorSumado = this.denominador * denominador;
    
    return new Fraccion(numeradorSumado, denominadorSumado);
    }
    
    //Resta
    public Fraccion resta(Fraccion userFraccion){
    int numeradorRestado = (this.numerador * denominador) - (this.denominador * numerador);
    int denominadorRestado =(this.denominador * denominador);
    
    return new Fraccion(numeradorRestado, denominadorRestado);
    }
    //Producto
    public Fraccion producto(Fraccion userFraccion){
        int numeradorMulti = (this.numerador * numerador);
        int denominadorMulti = (this.denominador * denominador);
        
        return new Fraccion(numeradorMulti, denominadorMulti);
    }
    //División
    public Fraccion division(Fraccion userFraccion){
    int numeradorDiv = (this.numerador * denominador);
    int denominadorDiv = (this.denominador * numerador);
    
    return new Fraccion(numeradorDiv, denominadorDiv);
    }
    //Invertir
    public Fraccion invertir(){
    int numeradorInver = this.denominador;
    int denominadorInver = this.numerador;
    
    return new Fraccion(numeradorInver, denominadorInver);
    }
    //Simplificar
    public Fraccion simplificar() {
        int numeradorSimp = this.numerador;
        int denominadorSimp = this.denominador;
        int resto = 1;
        int mcd = 1;

        if (numeradorSimp == denominadorSimp) {
            numeradorSimp = 1;
            denominadorSimp = 1;

        } else if (numeradorSimp == 1) {
            System.out.println("La fracción ya está simplificada");
        } else {
            //Aplico el algoritmo de Euclides:
            while (resto != 0) {
                if (numeradorSimp > denominadorSimp) {
                    resto = numeradorSimp % denominadorSimp;
                    if (resto != 0) {
                        numeradorSimp = denominadorSimp;
                        denominadorSimp = resto;
                    }
                }
                if (numeradorSimp < denominadorSimp) {
                    int aux = numeradorSimp;
                    numeradorSimp = denominadorSimp;
                    denominadorSimp = aux;
                }

            }
            mcd = denominadorSimp;
        }
        numeradorSimp = this.numerador / mcd;
        denominadorSimp = this.denominador / mcd;
        return new Fraccion(numeradorSimp, denominadorSimp);
    }
    
    @Override
    public String toString(){
        return this.numerador + "/" + this.denominador;
    }

}
