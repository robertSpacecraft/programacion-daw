package Emplados;

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
    private double bonusProyecto;
    private double salarioTotal;

    public Disenador(String nombre, String apellido, int id, double salario, double puntuacionEvaluacion) {
        super(nombre, apellido, id, salario, puntuacionEvaluacion);
        this.bonusProyecto = 0;
        this.salarioTotal = 0;
    }

    public Disenador(String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.bonusProyecto = 0;
        this.salarioTotal = 0;
    }

    public Disenador() {
        super();
        this.bonusProyecto = 0;
        this.salarioTotal = 0;
    }
    
    @Override
    public void calcularSalario(){
        this.salarioTotal = super.getSalario() + this.bonusProyecto;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(super.toString() + "\nHerramientas de Diseño utilizadas: " + herramientasDisenyoUsadas
            + "\nBonus del Proyecto: " + this.bonusProyecto
            + "\nSalario Total = " + this.salarioTotal);
    }
    
    public Double getSalarioTotal(){
        return this.salarioTotal;
    }
    
}
