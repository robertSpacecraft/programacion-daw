package Empleados;

import Interfaces.Evaluable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public abstract class Empleado implements Evaluable {
    
    //Atributos
    private String nombre, apellido;
    private final int id;
    private double salario;
    private int puntuacionEvaluacion;
    
    //Constructores
    public Empleado(String nombre, String apellido, int id, double salario, int puntuacionEvaluacion){
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
        this.puntuacionEvaluacion = 0;
    
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
    
    public int getPuntuacionEvaluacion(){
        return this.puntuacionEvaluacion;
    }

    public void setPuntuacionEvaluacion(int puntuacion) {
        this.puntuacionEvaluacion = puntuacion;
    }
  
    //Métodos abstractos
    public abstract void calcularSalario();
    public abstract void mostrarDetalles();
    
    //Métodos concretos
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;   
    }
    
    //Otros métodos
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nId: " + this.id 
                    + "\nSalario Base: " + this.salario + "\nPuntuación de la evaluación: " + this.puntuacionEvaluacion;
    }
    
        @Override
    public void evaluar(int puntuacion) {
        if (puntuacion >= 0 || puntuacion <= 10) {
            this.puntuacionEvaluacion = puntuacion;
        } else {
            System.out.println("La puntuación debe estar entre 0 y 10");
        }
    }

    @Override
    public int obtenerEvaluacionActual() {
        return this.puntuacionEvaluacion;
    }
      
}
