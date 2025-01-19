package Empleados;

import Gestiones.CalculadoraSalario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Disenador extends Empleado {
    
    private String herramientasDisenyoUsadas;
    private int bonusCantidadProyectos;
    private double salarioTotal;

    public Disenador(String nombre, String apellido, int id, double salario, int puntuacionEvaluacion, int bonusProyecto, String herramientasDisenyoUsadas) {
        super(nombre, apellido, id, salario, puntuacionEvaluacion);
        this.herramientasDisenyoUsadas = herramientasDisenyoUsadas;
        this.bonusCantidadProyectos = bonusProyecto;
        this.salarioTotal = 0;
    }


    public Disenador() {
        super();
        this.bonusCantidadProyectos = 0;
        this.salarioTotal = 0;
    }
    
    @Override
    public void calcularSalario(){
        this.salarioTotal = CalculadoraSalario.calcularBonusDisenador(this, this.bonusCantidadProyectos);
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(super.toString() + "\nHerramientas de Diseño utilizadas: " + herramientasDisenyoUsadas
            + "\nBonus del Proyecto: " + this.bonusCantidadProyectos
            + "\nSalario Total = " + this.salarioTotal);
    }
    
    //Getters and Setters
    public Double getSalarioTotal(){
        return this.salarioTotal;
    }
    
    public double getBonusCantidadProyecto(){
        return this.bonusCantidadProyectos;
    }
       
}
