/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestionvehiculos;

import java.util.Collection;

/**
 *
 * @author Robert
 */
public interface Gestionable<T> {
    void agregar(T vehiculo) throws InvalidVehiculoException;
    boolean eliminar(T vehiculo);
    int contar();
    Collection<T> obtenerElementos();
    void copiarEn(Collection<? super T> destino);
    
}
