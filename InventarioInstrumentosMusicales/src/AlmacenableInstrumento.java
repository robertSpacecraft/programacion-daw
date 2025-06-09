
import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Robert
 */
public interface AlmacenableInstrumento<T extends Instrumento>{
    void agregar(T instrumento);
    boolean eliminar(T instrumento);
    int contar();
    
    void copiarEn(Collection<? super T> destino);
    Collection<T> obtenerElementos();
    
}
