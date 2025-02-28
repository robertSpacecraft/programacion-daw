/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class InvalidVideoconsolaException extends Exception{
    private int errorCode;
    
    public InvalidVideoconsolaException(String message, int errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
