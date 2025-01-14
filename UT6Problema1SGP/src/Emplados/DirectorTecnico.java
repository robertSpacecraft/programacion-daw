package Emplados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class DirectorTecnico extends Empleado {
    //Atributos
    private String departamento;
    private double bonusAnual;
    private double salarioTotal;
    
    //Constructores
    public DirectorTecnico(String departamento, double bonusAnual, double salarioTotal, String nombre, String apellido, int id, double salario, double puntuacionEvaluacion) {
        super(nombre, apellido, id, salario, puntuacionEvaluacion);
        this.departamento = departamento;
        this.bonusAnual = bonusAnual;
        this.salarioTotal = salarioTotal;
    }

    public DirectorTecnico(String departamento, double bonusAnual, double salarioTotal, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.departamento = departamento;
        this.bonusAnual = bonusAnual;
        this.salarioTotal = salarioTotal;
    }

    public DirectorTecnico() {
        super();
        this.departamento = "";
        this.bonusAnual = 0.0;
        this.salarioTotal = 0.0;
    }
    
    //Métodos
    @Override
    public void calcularSalario(){
        this.salarioTotal = super.getSalario() + this.bonusAnual;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(super.toString() + "\n Departamento: " + this.departamento
        + "\nBonus anual: " + this.bonusAnual
        + "\nSalario Total = " + this.salarioTotal);
    }
    
    //Getters
    public double getSalarioTotal(){
        return this.salarioTotal;
    }
    
}
