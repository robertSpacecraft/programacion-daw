
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
import java.util.Comparator;

public class ComparadorGenerosInverso implements Comparator<String> {
    @Override
    public int compare(String g1, String g2) {
        return g2.compareTo(g1); // Orden inverso
    }
}

