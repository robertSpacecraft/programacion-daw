package Empleados;

import Interfaces.Evaluable;
import Gestiones.CalculadoraSalario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Desarrollador extends Empleado implements Evaluable {
    //Atributos
    private String lenguaje;
    private int horasExtra;
    private double bonus;
    private double salarioTotal;
    
    //Constructores
    public Desarrollador(String nombre, String apellido, int id, double salario, String lenguaje, int horasExtra, double bonus){
    super(nombre, apellido, id, salario, 10);
    this.lenguaje = lenguaje;
    this.horasExtra = horasExtra;
    this.bonus = bonus;
    this.salarioTotal = 0.0;
    }
    
        //Constructores
    public Desarrollador(String nombre, String apellido, int id, double salario, String lenguaje){
    super(nombre, apellido, id, salario, 10);
    this.lenguaje = lenguaje;
    this.horasExtra = 0;
    this.bonus = 0;
    this.salarioTotal = 0.0;
    }
    
    
    public Desarrollador(){
    super();
    this.lenguaje = "";
    this.horasExtra = 0;
    this.bonus = 0.0;
    this.salarioTotal = 0.0;
    }
    
    //Métodos sobreescritos
    @Override
    public void calcularSalario(){
        this.salarioTotal = CalculadoraSalario.calculaBonusDesarrollador(this, this.horasExtra);
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(super.toString() + "\nLenguaje: " + lenguaje 
            + "\nHoras Extra: " + this.horasExtra 
            + "\nBonus: " + this.bonus
            + "\nSalario Total = " + this.salarioTotal);
    }
    
    //Getters & Setters
    public double getSalarioTotal(){
        return this.salarioTotal;
    }
    
    public double getBonus(){
        return this.bonus;
    }
    
    public int getHorasExtra(){
        return this.horasExtra;
    }
    
    //Métodos de interfaz
    @Override
    public void evaluar(int puntuacion) {
        if (puntuacion >= 0 || puntuacion <= 10) {
            super.setPuntuacionEvaluacion(puntuacion);
        } else {
            System.out.println("La puntuación debe estar entre 0 y 10");
        }
    }

    @Override
    public int obtenerEvaluacionActual() {
       return super.getPuntuacionEvaluacion();
    }
    
    
}
