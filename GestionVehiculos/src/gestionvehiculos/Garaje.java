/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Robert
 */
public class Garaje<T extends Vehiculo> implements Gestionable<T> {

    private List<T> listaVehiculos;
    private Map<String, T> mapVehiculos;

    public Garaje() {
        this.listaVehiculos = new ArrayList<>();
        this.mapVehiculos = new TreeMap<>();
    }
    
    public void mostrarVehiculos(){
        for (Vehiculo v : listaVehiculos){
            if (v instanceof Coche){
                v.mostrarDatos();
                System.out.println("Impuesto: " + ((Coche) v).calcularImpuesto());
                System.out.println("----------------------");
            }
            if (v instanceof Moto){
                v.mostrarDatos();
                System.out.println("Impuesto: " + ((Moto) v).calcularImpuesto());
                System.out.println("------------------------");
            }
        
        }
    
    }

    @Override
    public void agregar(T vehiculo) throws InvalidVehiculoException {
        if (vehiculo == null){
            throw new InvalidVehiculoException("El vehículo no puede ser null ", 100);
        }
        int actualYear = java.time.Year.now().getValue();
        if (vehiculo.getYear() > actualYear || vehiculo.getYear() < 1900){
            throw new InvalidVehiculoException("Año fuera de rango", vehiculo.getYear());
        }  
        listaVehiculos.add(vehiculo);
        mapVehiculos.put(vehiculo.getMatricula(), vehiculo);
    }

    @Override
    public boolean eliminar(T vehiculo) {
        if (listaVehiculos == null) { //Si una es null la otra tambien debería serlo
            System.out.println("No hay vehículos en las listas");
            return false;
        } else {
            listaVehiculos.remove(vehiculo);
            mapVehiculos.remove(vehiculo.getMatricula());
            return true;
        }
    }

    @Override
    public int contar() {
        return listaVehiculos.size(); //ambas tendrán el mismo tamaño
    }

    @Override
    public Collection<T> obtenerElementos() {
        return new ArrayList<>(mapVehiculos.values());
    }

    @Override
    public void copiarEn(Collection<? super T> destino) {
        if (destino == null) {
            throw new IllegalArgumentException("La colección destino no puede ser null");
        }
        destino.addAll(mapVehiculos.values());
    }
}
    
