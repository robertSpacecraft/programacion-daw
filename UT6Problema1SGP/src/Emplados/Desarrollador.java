package Emplados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Desarrollador extends Empleado {
    //Atributos
    private String lenguaje;
    private int horasExtra;
    private double bonus;
    private double salarioTotal;
    
    //Constructores
    public Desarrollador(String nombre, String apellido, int id, String lenguaje, int horasExtra, double bonus){
    super(nombre, apellido, id);
    this.lenguaje = lenguaje;
    this.horasExtra = horasExtra;
    this.bonus = bonus;
    this.salarioTotal = 0.0;
    }
    
    public Desarrollador(String nombre, String apellido, int id, double salario, double puntuacionEvaluacion, String lenguaje, int horasExtra, double bonus){
    super(nombre, apellido, id, salario, puntuacionEvaluacion);
    this.lenguaje = lenguaje;
    this.horasExtra = horasExtra;
    this.bonus = bonus;
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
         this.salarioTotal = super.getSalario() + (this.bonus * this.horasExtra);    
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(super.toString() + "\nLenguaje: " + lenguaje 
            + "\nHoras Extra: " + this.horasExtra + "\nBonus: " + this.bonus 
            + "\nSalario Total = " + this.salarioTotal);
    }
    
    public double getSalarioTotal(){
        return this.salarioTotal;
    }
    
}
