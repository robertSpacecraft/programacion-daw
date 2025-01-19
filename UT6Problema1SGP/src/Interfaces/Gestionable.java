/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Gestiones.Proyecto;

/**
 *
 * @author Robert
 */
public interface Gestionable {
    void asignarProyecto(Proyecto p);
    void eliminarProyecto(Proyecto p);
    void listarProyectos();
    
}
