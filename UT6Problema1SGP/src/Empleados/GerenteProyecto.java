package Empleados;

import Gestiones.Proyecto;
import Interfaces.Gestionable;
import Gestiones.CalculadoraSalario;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class GerenteProyecto extends Empleado implements Gestionable {

    //Atributos
    private int bonusProyectosGestionados;
    private double salarioTotal;

    private Proyecto[] proyectosActuales;

    //Constructores
    public GerenteProyecto(String nombre, String apellido, int id, double salario, int puntuacionEvaluacion, int bonusProyectosGestionados) {
        super(nombre, apellido, id, salario, puntuacionEvaluacion);
        this.bonusProyectosGestionados = bonusProyectosGestionados;
        this.salarioTotal = 0.0;
        this.proyectosActuales = new Proyecto[0];
    }
    
        public GerenteProyecto(String nombre, String apellido, int id, double salario, int puntuacionEvaluaion) {
        super(nombre, apellido, id, salario, puntuacionEvaluaion);
        this.bonusProyectosGestionados = 0;
        this.salarioTotal = 0.0;
        this.proyectosActuales = new Proyecto[0];
    }

    public GerenteProyecto() {
        this.bonusProyectosGestionados = 0;
        this.salarioTotal = 0.0;
        this.proyectosActuales = new Proyecto[0];
    }

    //Metodos
    @Override
    public void calcularSalario() {
        this.salarioTotal = CalculadoraSalario.calcularBonusGerente(this, bonusProyectosGestionados);
    }

    @Override
    public void mostrarDetalles() {
        listarProyectos();
        System.out.println(super.toString()
                + "\nBonus por proyecto gestionado: " + this.bonusProyectosGestionados
                + "\nSalario total = " + this.salarioTotal);
    }

    //Getters
    public double getSalarioTotal() {
        return this.salarioTotal;
    }

    public double getBonusProyectoGestionado() {
        return this.bonusProyectosGestionados;
    }

    //Métodos de interfaz
    @Override
    public void asignarProyecto(Proyecto p) {
        for (int i = 0; i < this.proyectosActuales.length; i++) {
            if (this.proyectosActuales[i] == null) {
                this.proyectosActuales[i] = p;
                System.out.println("Proyecto añadido correctamente");
                return;
            }
        }
        System.out.println("No se ha podido añadir el proyecto");
    }

    @Override
    public void eliminarProyecto(Proyecto p) {
        for (int i = 0; i < this.proyectosActuales.length; i++) {
            if (proyectosActuales[i] == p) {
                proyectosActuales[i] = null;
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
    public String toString() {
        return "GerenteProyecto{" + "proyectosActuales=" + Arrays.toString(this.proyectosActuales) + '}';
    }

}
