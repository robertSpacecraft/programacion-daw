
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class ComparadorGenerosInverso implements Comparator<String> {

    @Override
    public int compare(String genero1, String genero2) {
        return genero2.compareTo(genero1);
    }



    
}
