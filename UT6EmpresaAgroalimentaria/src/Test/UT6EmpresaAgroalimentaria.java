/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import ClasesGenerales.CongeladosPorNitrogeno;
import ClasesGenerales.Producto;
import ClasesGenerales.ProductosFrescos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Robert
 */
public class UT6EmpresaAgroalimentaria {

    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fechaCaducidad = formato.parse("30/05/2025");

            Date fechaEnvasado = new Date();

            Producto p = new ProductosFrescos(fechaCaducidad, "1", fechaEnvasado, 2, "España");
            p.mostrarInfo();
            System.out.println("--------------------------");
            Producto p1 = new CongeladosPorNitrogeno(fechaCaducidad, "2", fechaEnvasado, "Francia", 5, "Nitrógeno", 120);
            p1.mostrarInfo();
        } catch (ParseException e) {
            System.out.println("Error" + e.getMessage());

        }
    }

}
