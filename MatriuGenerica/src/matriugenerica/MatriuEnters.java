/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriugenerica;
import java.util.Random;

/**
 *
 * @author Robert
 */
public class MatriuEnters extends MatriuGenerica<Integer> {
    
    public MatriuEnters(int tamany){
        super(tamany);
    }

    @Override
    public Integer suma(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer multiplicacion(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer zero() {
        return 0;
    }

    @Override
    public Integer aleatory() {
        Random random = new Random();
        return random.nextInt(9);
    }
    
}
