package p53.util;

import java.util.Scanner;

public class Interval {

    private double inferior;
    private double superior;
    
    private Scanner input = new Scanner(System.in);

    /**
     * Proporciona un interval amb els límits inferior i superior que li donem
     * @param inferior
     * @param superior 
     */
    public Interval(double inferior, double superior) {
        if (inferior > superior){
            double aux = inferior;
            inferior = superior;
            superior = aux;
        }
        this.inferior = inferior;
        this.superior = superior;
    }

    /**
     * Proporciona un interval amb límit superior que li donem
     * @param superior 
     */
    public Interval(double superior) {
       this.inferior = 0.0;
       this.superior = superior;      
    }

    /**
     * Proporciona un interval a partir d'un altre (copia)
     * @param interval 
     */
    public Interval(Interval interval) {
        this.inferior = interval.inferior;
        this.superior = interval.superior;
    }

    /**
     * Proporciona un interval amb límits per defecte.
     */
    public Interval() {
        this.inferior = 0.0;
        this.superior = 0.0;        
    }
    
    /**
     * Para realizar las pruebas
     */
    public String toString(){
    return "[" + this.inferior + ", " + this.superior + "]";
    }

    /**
     * Clona l'interval
     * @return 
     */
    public Interval clone() {      
        return new Interval(this.inferior, this.superior);
    }

    /**
     * Longitud de l'interval
     * @return 
     */
    public double longitud() {      
       return this.superior - this.inferior;
    }

    /**
     * Mou els límits de l'interval segons el que indiquem
     * @param moviment 
     */
    public void moure(double moviment) {
        this.inferior += moviment;
        this.superior += moviment;
    }

    /**
     * Obtiene l'interval mogut segons el moviment proporcionat
     * @param moviment
     * @return 
     */
    public Interval mogut(double moviment) {
        return new Interval(this.inferior + moviment, this.superior + moviment);
    }

    /**
     * Determina si el valor está dintre de l'interval
     * @param valor
     * @return 
     */
    public boolean inclou(double valor) {
        if (valor >= this.inferior && valor <= this.superior){
        return true;
        } else {
        return false;
        }
    }

    /**
     * Determina si l'interval proporcionat está inclòs en l'interval
     * @param interval
     * @return 
     */
    public boolean inclou(Interval interval) {
        if (interval.inferior >= this.inferior && interval.superior <= this.superior){
        return true;
        } else {
       return false;
        }
    }

    /**
     * Determina si dos intervals són iguals
     * @param interval
     * @return 
     */
    public boolean equals(Interval interval) {
        final double EPSILON = 1e-10;
        if (Math.abs(this.inferior - interval.inferior) < EPSILON
                && Math.abs(this.superior - interval.superior) < EPSILON) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obté l'interval que intersecta
     *
     * @param interval
     * @return
     */
    public Interval interseccio(Interval interval) {
        if (intersecta(interval)) {
            double nuevoInferior = Math.max(this.inferior, interval.inferior);
            double nuevoSuperior = Math.min(this.superior, interval.superior);
            return new Interval(nuevoInferior, nuevoSuperior);
        } else {
            System.out.println("No hay intersección");
            return null;
        }
    }

    /**
     * Determina si un interval intersecta amb el nostre
     *
     * @param interval
     * @return
     */
    public boolean intersecta(Interval interval) {
        if (this.inferior <= interval.superior && interval.inferior <= this.superior) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Transforma l'interval en el seu oposat.
     */
    public void oposar() {
        double aux = 0;
        aux = this.inferior;
        this.inferior = this.superior;
        this.superior = aux;       
    }

    /**
     * Augmenta la grandària de l'interval al doble de la seua longitud (ha de creixer igual pels dos extrems).
     */
    public void doblar() {
       double distancia = longitud();
       this.inferior -= distancia / 2;
       this.superior += distancia / 2;
    }

    /**
     * Demana a l'usuari que introduïsca els límits de l'interval
     */
    public void recollir() {       
       //this.inferior = validar("Introduce el límite inferior: ");
       //this.superior = validar("Introduce el límite superior");
       GestorIO input = new GestorIO();
       double userInferior = 0;
       double userSuperior = 0;
       input.out("Introduce el límite inferior: ");
       userInferior = input.inDouble();
       
       input.out("Introduce el límiter superior: ");
       userSuperior = input.inDouble();
       
       if (userInferior > userSuperior){
       double aux = userInferior;
       userInferior = userSuperior;
       userSuperior = aux;
       }
       this.inferior = userInferior;
       this.superior = userSuperior;
    }

    /** Mostra l'interval amb el format [limitInferior, limitSuperior].
     * 
     */
    public void mostrar() {
        System.out.println("[" + this.inferior + ", " + this.superior + "]");
    }

    /**
     * Obté els subintervals en grandàries iguals segons els trossos proporcionats
     * @param trossos
     * @return 
     */
    public Interval[] trossejar(int trossos) {
        Interval[] intervalos = new Interval[trossos];
        
        double cadaIntervalo = this.longitud() / trossos;
        double intervaloOrigen = this.inferior;
        
        for (int i = 0; i < intervalos.length; i++) {
            double intervaloDestino = intervaloOrigen + cadaIntervalo;
            intervalos[i] = new Interval(intervaloOrigen, intervaloDestino);
            intervaloOrigen = intervaloDestino;
        }
        
        return intervalos; 
    }
     /**
     * EXTRA: Compara si dos intervalos son mayores, menores o iguales
     */
    
    public static void compara(Interval i1, Interval i2){
     if (i1.longitud() == i2.longitud()){
         System.out.println("Los intervalos tienes la misma longitud");
     } else if (i1.longitud() < i2.longitud()){
         System.out.println("El intervalo " + i2 + " es mayor que " + i1);
     } else {
         System.out.println("El intervalo " + i1 + " es mayor que " + i2);
     }
      
    }
    
     /**
     * Valida que el valor introducido sea un double
     */
    private double validar(String mensaje){ 
        double validada = 0.0;
        System.out.println(mensaje);
       while (!input.hasNextDouble()){
           System.out.println("Debes introducir un número: ");
           input.nextLine();
           System.out.println(mensaje);
       }
       validada = input.nextDouble();
       return validada;
    }
}
