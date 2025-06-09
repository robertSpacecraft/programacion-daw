
import java.util.ArrayList;
import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class InventarioInstrumento<T extends Instrumento> implements AlmacenableInstrumento<T> {
    private ArrayList<T> instrumentos;
    
    public InventarioInstrumento(){
        instrumentos = new ArrayList<T>();
    }
    
    @Override
    public void agregar(T instrumento) {
        instrumentos.add(instrumento);
    }

    @Override
    public boolean eliminar(T instrumento) {
        return instrumentos.remove(instrumento);
    }

    @Override
    public int contar() {
        return instrumentos.size();
    }

    @Override
    public void copiarEn(Collection<? super T> destino) {
        for (T elemento : instrumentos){
            destino.add(elemento);
        }
    }

    @Override
    public Collection<T> obtenerElementos() {
        return instrumentos;
    }
    
}
