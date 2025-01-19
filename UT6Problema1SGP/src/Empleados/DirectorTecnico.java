package Empleados;

import Gestiones.*;
import Interfaces.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class DirectorTecnico extends Empleado implements Gestionable, Evaluable {

    //Atributos
    private String departamento;
    private double bonusAnual;
    private double salarioTotal;

    private Proyecto[] proyectosActuales;

    //Constructores
    public DirectorTecnico(String nombre, String apellido, int id, double salario, int puntuacionEvaluacion, String departamento, double bonusAnual) {
        super(nombre, apellido, id, salario, puntuacionEvaluacion);
        this.departamento = departamento;
        this.bonusAnual = bonusAnual;
        this.salarioTotal = 0.0;
    }

    public DirectorTecnico() {
        super();
        this.departamento = "";
        this.bonusAnual = 0.0;
        this.salarioTotal = 0.0;
    }

    //Métodos
    @Override
    public void calcularSalario() {
        this.salarioTotal = CalculadoraSalario.calcularBonusDirector(this, super.getPuntuacionEvaluacion());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(super.toString() + "\nDepartamento: " + this.departamento
                + "\nBonus anual: " + this.bonusAnual
                + "\nSalario Total = " + this.salarioTotal);
    }

    //Getters
    public double getSalarioTotal() {
        return this.salarioTotal;
    }

    public double getBonusAnual() {
        return this.bonusAnual;
    }

    //Métodos de Interfaz
    @Override
    public void asignarProyecto(Proyecto p) {
        for (int i = 0; i < proyectosActuales.length; i++) {
            if (this.proyectosActuales[i] == null) {
                this.proyectosActuales[i] = p;
                System.out.println("Proyecto agregado correctamente");
                return;
            }
        }
        System.out.println("No se ha podido añadir el proyecto");
    }

    @Override
    public void eliminarProyecto(Proyecto p) {
        for (int i = 0; i < proyectosActuales.length; i++) {
            if (this.proyectosActuales[i] == p) {
                this.proyectosActuales[i] = null;
                System.out.println("Proyecto eliminado correctamente");
                return;
            }
        }
        System.out.println("Proyecto no encontrado");
    }

    @Override
    public void listarProyectos() {
        for (int i = 0; i < this.proyectosActuales.length; i++) {
            if (this.proyectosActuales[i] != null) {
                System.out.println("Proyectos: " + this.proyectosActuales[i].toString());
            }
        }
    }

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

    @Override
    public String toString() {
        return "DirectorTecnico{" + "proyectosActuales=" + proyectosActuales + '}';
    }
}
