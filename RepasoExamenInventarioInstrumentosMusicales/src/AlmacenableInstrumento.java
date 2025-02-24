
import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Robert
 * @param <T>
 */
public interface AlmacenableInstrumento<T extends Instrumento> {
    public void agregar(T instrumento);
    public boolean eliminar(T instrumento);
    public int contar();
    public Collection<T> obtenerElementos();
    public void copiarEn(Collection<? super T> destino);
    
}
