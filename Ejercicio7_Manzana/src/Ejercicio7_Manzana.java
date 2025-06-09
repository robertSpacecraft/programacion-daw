
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Robert
 */
public class Ejercicio7_Manzana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Manzana> manzanas = new ArrayList<>(List.of(
                new Manzana(),
                new Manzana(3),
                new Manzana(8),
                new Manzana(10),
                new Manzana(2)
            )
        );
        
        Manzana apple = new Manzana(4);
        manzanas.add(apple);
        
        manzanas.add(new Manzana(7));

        manzanas.forEach(System.out::println);
        System.out.println("----------------");

        Collections.sort(manzanas);
        for (Manzana m : manzanas) {
            System.out.println(m);
        }

    }

}
