/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

import java.util.ArrayList;

/**
 *
 * @author Robert
 */
public class ClienteDAO {
    private static final ArrayList<ClienteDTO> listaClientes = new ArrayList<>();
    
    public static ArrayList<ClienteDTO> getListaClientes(){
        return listaClientes;   
    }
    
    public static boolean addCliente(ClienteDTO cliente){
        boolean comprobarDni = listaClientes.stream()
                .anyMatch(c -> c.getDni().equalsIgnoreCase(cliente.getDni()));
        
        if (comprobarDni){
            return false;
        
        } else {
        listaClientes.add(cliente);
        return true;
        }       
    }  
}
