/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p53.joc;

/**
 *
 * @author Robert
 */
public class Torn {
    private int valor;
    
    public Torn(){
    this.valor = (int) (Math.random() * 2);
    }
    
    public int toca(){
    return this.valor;
    }
    
    public int noToca(){
      if (this.valor == 1){
      return 0;
      } else {
      return 1;
      }
    }
    
    public void canviar(){
    if (this.valor == 0){
    this.valor = 1;
    } else {
    this.valor = 0;
    }
    }
    
}
