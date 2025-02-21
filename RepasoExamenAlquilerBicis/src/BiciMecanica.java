/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class BiciMecanica extends Bicicleta{
    private String tipoFreno;
    
    public BiciMecanica(String modelo, int id, String tipoFreno){
        super(modelo, id);
        this.tipoFreno = tipoFreno;
    }

    @Override
    public double calcularTarifas(int horas) {
        //Aquí, puesto que hemos incluido el atributo tipo de freno, lo tendré en cuenta para la tarifa.
        //El precio por horas será de 7€ y se incrementarán 3 si es freno de disco
        final int precioHora = 7;
        final int recargoDisco = 3;
        if (this.tipoFreno.equals("disco")){
            return horas * (precioHora + recargoDisco);
        } else {
            return horas * precioHora;
        }
    }
    
    public void tipoFreno(){
        System.out.println("Freno: " + this.tipoFreno);
    }
    
}
