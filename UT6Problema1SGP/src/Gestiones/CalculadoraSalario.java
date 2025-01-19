/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestiones;

import Empleados.Desarrollador;
import Empleados.DirectorTecnico;
import Empleados.Disenador;
import Empleados.GerenteProyecto;

/**
 *
 * @author Robert
 */
public class CalculadoraSalario {   
    //Constructor vacío que impide que la clase pueda ser instanciada
    private CalculadoraSalario(){
    }
    
    //Salario desarrollador
    public static double calculaBonusDesarrollador(Desarrollador d, int horasExtra){
        return d.getSalario() + (d.getBonus() * d.getHorasExtra());
    }
    
    //Salario Diseñador
    public static double calcularBonusDisenador(Disenador d, int proyectosCompletados){
        return d.getSalario() + (d.getPuntuacionEvaluacion() * proyectosCompletados) * 10.0;
    }
    
    //Salario Gerete
    public static double calcularBonusGerente(GerenteProyecto g, int proyectosGestionados){
        return g.getSalario() + (proyectosGestionados * 100);
    }
    
    //Salario Director
    public static double calcularBonusDirector(DirectorTecnico dt, double rendimientoDepartamento){
        return dt.getSalario() + ((dt.getBonusAnual() / 12) * rendimientoDepartamento);
    
    }
    
    
}
