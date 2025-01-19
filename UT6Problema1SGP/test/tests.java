
import Empleados.*;
import java.time.LocalDate;
import Gestiones.*;
import java.time.Month;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorPersonal gestor = new GestorPersonal();
        
        Desarrollador dev = new Desarrollador("Joan", "Garcia", 1, 3000.0, "java");
        gestor.agregarEmpleado(dev);
        gestor.realizarEvaluacion(dev, 5);
        
        GerenteProyecto gerente = new GerenteProyecto("María", "Lopez", 2, 5000.0, 3);
        gestor.agregarEmpleado(gerente);
        gestor.realizarEvaluacion(gerente, 9);
        
        Proyecto proy = new Proyecto("App Movil", LocalDate.of(2023,1 , 1), LocalDate.of(2023 ,6 ,30), 100000);
        gestor.asignarEmpleadoProyecto(1, proy);
        
        gestor.calcularSalario();
        gestor.mostrarDetallesEmpleados();
        
        System.out.println("-------------------");
        proy.listarEmpleados();
        
        
 
    }
    
}
