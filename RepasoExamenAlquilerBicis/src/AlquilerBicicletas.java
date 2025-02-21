
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class AlquilerBicicletas {

    public static void main(String[] args) {
        ArrayList<Bicicleta> scott = new ArrayList<>();
        
        Bicicleta be1 = new BiciElectrica("Speed", 1, 80);
        Bicicleta be2 = new BiciElectrica("Speed", 2, 50);
        Bicicleta be3 = new BiciElectrica("Tractor", 3, 100);
        Bicicleta be4 = new BiciElectrica("Tractor", 4, 80);
        
        Bicicleta bm1 = new BiciMecanica("Tractor", 5, "disco");
        Bicicleta bm2 = new BiciMecanica("Speed", 6, "disco");
        Bicicleta bm3 = new BiciMecanica("Speed", 7, "hidraulico");
        
        scott.add(be1);
        scott.add(be2);
        scott.add(be3);
        scott.add(be4);
        scott.add(bm1);
        scott.add(bm2);
        scott.add(bm3);
        
        for (Bicicleta bici: scott){
            if (scott.instaceof()){}
            bici.mostrarInfo();
            System.out.println("Tarifa: " + bici.calcularTarifas(5));                    
        }               
    }
    
}
