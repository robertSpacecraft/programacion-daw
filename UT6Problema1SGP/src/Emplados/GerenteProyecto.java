package Emplados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class GerenteProyecto extends Empleado {
    //Atributos
    private String proyectoActual;
    private double bonusProyectoGestionado;
    private double salarioTotal;
    //Constructores
    public GerenteProyecto(String proyectoActual, double bonusProyectoGestionado, String nombre, String apellido, int id, double salario, double puntuacionEvaluacion) {
        super(nombre, apellido, id, salario, puntuacionEvaluacion);
        this.proyectoActual = proyectoActual;
        this.bonusProyectoGestionado = bonusProyectoGestionado;
        this.salarioTotal = 0.0;
    }

    public GerenteProyecto(String proyectoActual, double bonusProyectoGestionado, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.proyectoActual = proyectoActual;
        this.bonusProyectoGestionado = bonusProyectoGestionado;
        this.salarioTotal = 0.0;
    }

    public GerenteProyecto(String proyectoActual, double bonusProyectoGestionado) {
        this.proyectoActual = proyectoActual;
        this.bonusProyectoGestionado = bonusProyectoGestionado;
        this.salarioTotal = 0.0;
    }
    //Metodos
    @Override
    public void calcularSalario(){
        this.salarioTotal = super.getSalario() + this.bonusProyectoGestionado;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(super.toString() + "\nProyecto actual: " + this.proyectoActual
        + "Bonus por proyecto gestionado: " + this.bonusProyectoGestionado
        + "Salario total = " + this.salarioTotal);
    }
    
    //Getters
    public double getSalarioTotal(){
        return this.salarioTotal;
    }
    
}
