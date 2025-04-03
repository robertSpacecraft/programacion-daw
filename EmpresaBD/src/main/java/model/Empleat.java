package model;

import java.sql.Date;

public class Empleat {
    
    private int numEmpleado;
    private String nombre;
    private int edad;
    private int oficina;
    private String profesion;
    private Date fechaContrato;
    
    public Empleat(int numEmpleado, String nombre, int edad, int oficina, String profesion, Date fechaContrato){
    this.numEmpleado = numEmpleado;
    this.nombre = nombre;
    this.edad = edad;
    this.oficina = oficina;
    this.profesion = profesion; 
    this.fechaContrato = fechaContrato;
    
    }
    public Empleat(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getNumEmpleado(){
        return this.numEmpleado;
    }
    
    public int getOficina(){
        return this.oficina;
    }
    
    public String getProfesion(){
     return this.profesion;
    }
    
    
}
