/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author Robert
 */
public class InvalidVehiculoException extends Exception {
    private int invalidYear;

    
    public InvalidVehiculoException(String message, int invalidYear) {
        super(message);
        this.invalidYear = invalidYear;
    }

    public int getInvalidYear() {
        return invalidYear;
    }
}
