/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlquilerAmarres;

/**
 *
 * @author Robert
 */
import java.time.LocalDate;

//SuperClase
public abstract class Embarcacion {
    //Atributos
    private final String matricula;
    private final double metrosEslora;
    private final int anyoFabricacion;
    
    //Consturctor
    protected Embarcacion(String matricula, double metrosEslora, int anyoFabricacion) {
        if (matricula.length() == 4) {
            this.matricula = matricula;
        } else {
            System.out.println("La matrícula debe ser de 4 caracteres");
            this.matricula = "XXXX";
        }
        if (metrosEslora > 0) {
            this.metrosEslora = metrosEslora;
        } else {
            System.out.println("Los metros de eslora deben ser mayores que 0");
            this.metrosEslora = 1.0;
        }
        if (anyoFabricacion <= LocalDate.now().getYear()) {
            this.anyoFabricacion = anyoFabricacion;
        } else {
            System.out.println("Un barco no puede viajar en el tiempo");
            this.anyoFabricacion = 0;
        }           
    }
    
    //Métodos
    public abstract double calcularFactor();
    
    //Getters
    public String getMatricula() {
        return matricula;
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }
    
}
