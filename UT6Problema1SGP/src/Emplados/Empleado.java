package Emplados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public abstract class Empleado {
    
    //Atributos
    private String nombre, apellido;
    private final int id;
    private double salario, puntuacionEvaluacion;
    
    //Constructores
    public Empleado(String nombre, String apellido, int id, double salario, double puntuacionEvaluacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
        this.puntuacionEvaluacion = puntuacionEvaluacion;
    }
    public Empleado(String nombre, String apellido, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
        this.puntuacionEvaluacion = puntuacionEvaluacion;
    }
    public Empleado(){
        this.nombre = "";
        this.apellido = "";
        this.id = 0;
        this.salario = 0.0;
        this.puntuacionEvaluacion = 0.0;
    
    }
    
    //Getters and Setters
    public String getNombre(){
     return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return this.id;
    }

    public double getSalario() {
        return this.salario;
    }

    public double setPuntuacionEvaluacion() {
        return this.puntuacionEvaluacion;
    }
  
    //Métodos abstractos
    public abstract void calcularSalario();
    public abstract void mostrarDetalles();
    
    //Métodos concretos
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;   
    }
    
    //Otros métodos    
    public String toString(){
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nId: " + this.id 
                    + "\nSalario: " + this.salario + "\nPuntuación de la evaluación: " + this.puntuacionEvaluacion;
    }
      
}
