
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class PrecioComparator implements Comparator<Libro>{

    @Override
    public int compare(Libro l1, Libro l2) {
        if (l1.getPrecio() < l2.getPrecio()){
            return -1;
        } else if (l1.getPrecio() > l2.getPrecio()){
            return 1;
        } else {
            return 0;
        }
    }
}
