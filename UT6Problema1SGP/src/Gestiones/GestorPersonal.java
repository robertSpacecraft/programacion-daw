/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestiones;


/**
 *
 * @author Robert
 */
import Empleados.*;
import Interfaces.Gestionable;

public class GestorPersonal {

    //Atributos
    private Empleado[] empleados;
    private int numEmpleados;
    private static final int MAX_NUM_EMPLEADOS = 10;

    //Constructor
    public GestorPersonal(){
        this.empleados = new Empleado[MAX_NUM_EMPLEADOS];
        this.numEmpleados = 0;
    }
    
    //Métodos
    //Agruegar empleados
    public void agregarEmpleado(Empleado empleado){
        if (numEmpleados < MAX_NUM_EMPLEADOS){
            for (int i = 0; i < empleados.length; i++) {
                if (empleados[i] == null){
                    empleados[i] = empleado;
                    numEmpleados++;
                    System.out.println("El empleado " + empleado.getNombre() 
                            + " " + empleado.getApellido() 
                            + " ha sido agregado correctamente" );
                    return;
                }
            } 
        } else {
            System.out.println("El proyecto ya no admite más empleados");
        }
    
    }
    //Eliminar empleado
    public void eliminarEmpleado(Empleado empleado){
        for (int i = 0; i < empleados.length; i++) {
            if (empleados != null && empleados[i].getId() == empleado.getId()){
                empleados[i] = null;
                numEmpleados--;
                System.out.println("Empleado " + empleado.getNombreCompleto()
                        + " ha sido eliminado correctamente");
                return;
            }                       
        }
        System.out.println("Empleado no encontrado");
    }
    
    //Buscar empleado
    public String buscarEmpleado(Empleado empleado){
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].getId() == empleado.getId()){
                return empleados[i].toString();
            }
        }
        return "El empleado " + empleado.getId() 
                + " " + empleado.getNombreCompleto() 
                + " no ha sido encontrado";
    }
    
    //Asignar empelado a un proyecto (Solo gestionables)
    public void asignarEmpleadoProyecto(int idEmpleado, Proyecto proyecto){
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i] instanceof Gestionable && empleados[i].getId() == idEmpleado){
                proyecto.addEmpleado(empleados[i]);
                System.out.println("El empleado " + empleados[i].getNombreCompleto()
                    + " ha sido añadido correctamente");
                return;
            }
            
        }
        System.out.println("El empleado " + idEmpleado + " no ha podio añadirse");
    }
    
    //Realizar evaluacion
    public void realizarEvaluacion(Empleado empleado, int puntuacion){
        if (puntuacion >= 0 && puntuacion <=10){
            empleado.evaluar(puntuacion);
        } else {
            System.out.println("El valor introducido debe estar entre 0 y 10");
        }
    }
    
    public void calcularSalario(){
        for (int i = 0; i < numEmpleados; i++) {
            empleados[i].calcularSalario();            
        }    
    }
    
    public void mostrarDetallesEmpleados(){
        System.out.println("Detalles de los empleados: ");
        for (int i = 0; i < numEmpleados; i++) {
            empleados[i].mostrarDetalles();
        }
    }
}
