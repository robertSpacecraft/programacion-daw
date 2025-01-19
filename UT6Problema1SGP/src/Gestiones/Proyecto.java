/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestiones;

import Empleados.Empleado;
import java.time.LocalDate;

/**
 *
 * @author Robert
 */
public class Proyecto {

    //Atributos
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double presupuesto;
    private Empleado[] empleados;

    private int numEmpleados;

    //Constructores
    public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, double presupuesto, Empleado empleados, int numEmpleados) {
        if (nombre != null && fechaInicio.isBefore(fechaFin) && presupuesto >= 0 && numEmpleados > 0) {
            this.nombre = nombre;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.presupuesto = presupuesto;
            this.empleados = new Empleado[numEmpleados];
            this.numEmpleados = numEmpleados;
        } else {
            System.out.println("Algún dato introducido no es correcto, por favor, compruébalo");
            System.out.println("Se ha inicializado un objeto con valores predeterminados");

            this.nombre = "Error de Inicialización";
            this.fechaInicio = LocalDate.now();
            this.fechaFin = LocalDate.now().plusDays(1);
            this.empleados = null;
            this.numEmpleados = 4;

        }
    }

    public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, double presupuesto) {
        if (nombre != null && fechaInicio.isBefore(fechaFin) && presupuesto >= 0) {
            this.nombre = nombre;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.presupuesto = presupuesto;
            this.empleados = new Empleado[numEmpleados];
            this.numEmpleados = 4;
        } else {
            System.out.println("Algún dato introducido no es correcto, por favor, compruébalo");
            System.out.println("Se ha inicializado un objeto con valores predeterminados");

            this.nombre = "";
            this.fechaInicio = LocalDate.now();
            this.fechaFin = LocalDate.now().plusDays(1);
            this.empleados = null;
            this.numEmpleados = 4;

        }
    }

    //Métodos
    //Añadir empleado
    public void addEmpleado(Empleado e) {
        for (int i = 0; i < empleados.length; i++) {
            if (this.empleados[i] == null) {
                this.empleados[i] = e;
                return;
            }
        }
        System.out.println("El empleado no se ha podido añadir");
    }
    
    //Eliminar empleado
    public void eliminarEmpleado(Empleado e){
        for (int i = 0; i < empleados.length; i++) {
            if(this.empleados[i] == e){
                this.empleados[i] = null;
                System.out.println("Empleado Eliminado");
                return;
            }
        }
        System.out.println("El empleado no se ha encontrado");
    }
    
    //Listar empleados
    public void listarEmpleados(){
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado " + (i + 1) + ": " + empleados[i].toString());
            
        }
    }
    
    @Override
    public String toString() {

        return "Nombre: " + this.nombre;
    }

}
