
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 * @param <T>
 */
public class InventarioInstrumentos<T extends Instrumento> implements AlmacenableInstrumento<T>{
    
    private ArrayList<Instrumento> instrumentos = new ArrayList<>();
    
    @Override
    public void agregar(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    @Override
    public boolean eliminar(Instrumento instrumento) {
        instrumentos.remove(instrumento);
        return instrumentos.contains(instrumento);
    }

    @Override
    public int contar() {
        return instrumentos.size();
    }

    @Override
    public Collection obtenerElementos() {
        return new ArrayList<>(instrumentos);
    }

    @Override
    public void copiarEn(Collection destino) {
        destino.addAll(instrumentos);
    }
    
    @Override
    public String toString(){
        return instrumentos.toString();
    }
    
}
