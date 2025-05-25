/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robert
 */
public class PersonaDAO {
    private List<Persona> personas;
    
    public PersonaDAO(){
        personas = new ArrayList<>();
        
        personas.add(new Persona(1, "José Ramón", 35));
        personas.add(new Persona(2, "Roberto", 41));
    }
    
    public List<Persona> getAll(){
        return personas;
    }
    
    public void addPersona(Persona persona){
        personas.add(persona);
    }

}
