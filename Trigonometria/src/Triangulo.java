/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Triangulo {
    
    //Atributos
    private final double LADO_A;
    private final double LADO_B;
    private final double LADO_C;
    
    private final Angulo ANGULO_A;
    private final Angulo ANGULO_B;
    private final Angulo ANGULO_C;
    
    //Constructores
    public Triangulo(double a, double b, double c) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                this.LADO_A = a;
                this.LADO_B = b;
                this.LADO_C = c;

                // Fórmulas corregidas para calcular los ángulos
                this.ANGULO_A = new Angulo(((Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))) * 180) / Math.PI);
                this.ANGULO_B = new Angulo(((Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))) * 180) / Math.PI);
                this.ANGULO_C = new Angulo(((Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))) * 180) / Math.PI);
            } else {
                System.out.println("Error, no se puede construir el triángulo");
                this.LADO_A = 0;
                this.LADO_B = 0;
                this.LADO_C = 0;

                this.ANGULO_A = null;
                this.ANGULO_B = null;
                this.ANGULO_C = null;
            }
        }

    
    public Triangulo(double lado, Angulo abyacente1, Angulo abyacente2){       
        if (lado > 0 && (abyacente1.getGrados() + abyacente2.getGrados()) < 180){
            Angulo noAbyacente = new Angulo(180 - abyacente1.getGrados() - abyacente2.getGrados());
            
            this.LADO_A = lado;
            this.LADO_B = (lado * abyacente1.getSinus()) / noAbyacente.getSinus();
            this.LADO_C = (lado * abyacente2.getSinus()) / noAbyacente.getSinus();
            
            this.ANGULO_A = noAbyacente;
            this.ANGULO_B = abyacente1;
            this.ANGULO_C = abyacente2;
        } else {
            System.out.println("Error, no se puede construir el triángulo");
            this.LADO_A = 0;
            this.LADO_B = 0;
            this.LADO_C = 0;

            this.ANGULO_A = null;
            this.ANGULO_B = null;
            this.ANGULO_C = null;
        }                
    }
    
    public Triangulo(double a, double b, Angulo angulo) {      
        if (a > 0 && b > 0 && angulo.getGrados() < 0 && angulo.getGrados() < 180){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * angulo.getCosinus()));

        this.LADO_A = a;
        this.LADO_B = b;
        this.LADO_C = c;

        this.ANGULO_A = new Angulo(((Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2) / (2 * b * c)))) * 180) / Math.PI);
        this.ANGULO_B = new Angulo(((Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2) / (2 * a * c)))) * 180) / Math.PI);
        this.ANGULO_C = new Angulo(((Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2) / (2 * a * b)))) * 180) / Math.PI);
        } else {
            System.out.println("Error, no se puede construir el triángulo");
            this.LADO_A = 0;
            this.LADO_B = 0;
            this.LADO_C = 0;

            this.ANGULO_A = null;
            this.ANGULO_B = null;
            this.ANGULO_C = null;
        }  
    }
    
    public Triangulo(double area, Angulo a, Angulo b, Angulo c) {
        if (a.getGrados() > 0 && b.getGrados() > 0 && c.getGrados() > 0
                && a.getGrados() + b.getGrados() + c.getGrados() < 180) {

            this.LADO_A = (2 * area) / (b.getSinus() * c.getSinus());
            this.LADO_B = (this.LADO_A * b.getSinus()) / a.getSinus();
            this.LADO_C = (this.LADO_A * c.getSinus()) / a.getSinus();

            this.ANGULO_A = a;
            this.ANGULO_B = b;
            this.ANGULO_C = c;
        } else {
            System.out.println("Error, no se puede construir el triángulo");
            this.LADO_A = 0;
            this.LADO_B = 0;
            this.LADO_C = 0;

            this.ANGULO_A = null;
            this.ANGULO_B = null;
            this.ANGULO_C = null;

        }

    }

    public Triangulo(Triangulo t) {
        this.LADO_A = t.LADO_A;
        this.LADO_B = t.LADO_B;
        this.LADO_C = t.LADO_C;

        this.ANGULO_A = t.ANGULO_A;
        this.ANGULO_B = t.ANGULO_B;
        this.ANGULO_C = t.ANGULO_C;
    }
           
    //Metodos de Instacia:
    //Getters para obtener los atributos
    public double getLADO_A() {
        return LADO_A;
    }

    public double getLADO_B() {
        return LADO_B;
    }

    public double getLADO_C() {
        return LADO_C;
    }

    public Angulo getANGULO_A() {
        return ANGULO_A;
    }

    public Angulo getANGULO_B() {
        return ANGULO_B;
    }
    
    public Angulo getANGULO_C() {
        return ANGULO_C;
    }
    
    //Otros métodos
    public double area() {
        return (this.LADO_A * this.LADO_B * this.ANGULO_C.getSinus()) / 2;
    }
    //Calcula 
    public double perimetro() {
        return this.LADO_A + this.LADO_B + this.LADO_C;
    }
    //Calcula el semiperímetro
    public double semiperimetro() {
        return this.perimetro() / 2;
    }
    //Calcula la altura desede el lado A
    public double getAlturaA() {
        return (2 * this.area()) / this.LADO_A;
    }
    //Calcula la altura desde el lado B
    public double getAlturaB() {
        return (2 * this.area()) / this.LADO_B;
    }
    //clacula la altura desde el lado C
    public double getAlturaC() {
        return (2 * this.area()) / this.LADO_C;
    }
    //Calcula la mediana del lado A
    public double medianaA(){
        return Math.sqrt(((2 * Math.pow(this.LADO_B, 2))
                + (2 * Math.pow(this.LADO_C, 2))
                - Math.pow(this.LADO_A, 2)) / 4);
    }
    //Calcula la mediana del lado B
    public double medianaB(){
    return Math.sqrt(((2 * Math.pow(this.LADO_A, 2))
                + (2 * Math.pow(this.LADO_C, 2))
                - Math.pow(this.LADO_B, 2)) / 4);
    
    }
    //Calcula la mediana del lado C
    public double medianaC(){
    return Math.sqrt(((2 * Math.pow(this.LADO_A, 2))
                + (2 * Math.pow(this.LADO_B, 2))
                - Math.pow(this.LADO_C, 2)) / 4);
    }
    //Devuelve el circumradio
    public double circumradio(){
        return (this.LADO_A * this.LADO_B * this.LADO_C) * (4 * this.area());
    }
    //Devuelve el inradio
    public double inradio(){
        return this.area() / this.semiperimetro();
    }
    //Devuelve el tipo de triángulo según sus ángulos
    public String getTipoAngulo() {
        if (this.ANGULO_A.esAgudo() && this.ANGULO_B.esAgudo() && this.ANGULO_C.esAgudo()) {
            return "Acutángulo";

        } else if (this.ANGULO_A.esRecto() || this.ANGULO_B.esRecto() || this.ANGULO_C.esRecto()) {
            return "Rectángulo";

        } else {
            return "Obtusángulo";
        }
    }
    //Devuelve el tipo de triángulo según sus lados
    public String getTipoLado() {
        if (this.LADO_A == this.LADO_B && this.LADO_B == this.LADO_C) {
            return "Equilátero";
        } else if (this.LADO_A != this.LADO_B && this.LADO_B != this.LADO_C
                && this.LADO_A != this.LADO_C) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
    //Devulve true si los triángulos son iguales
    public boolean esIgual(Triangulo t) {
        return this == t;
    }
    @Override
    public String toString(){
    return "Lado a: " + this.LADO_A
            + "\nLado b; " + this.LADO_B 
            + "\nLado c: " + this.LADO_C
            + "\nÁngulo A: " + this.ANGULO_A
            + "\nÁngulo B: " + this.ANGULO_B
            + "\nÁngulo C: " + this.ANGULO_C
            + "\nÁrea: " + this.area();
    }
    //Visualiza el triángulo completo
    public String visualizar() {
       return this.toString() 
               + "\nPerímetro: " + this.perimetro() 
               + "\nTipo de triángulo: " + this.getTipoLado()
               + "\nTipo de triángulo (ángulos): " + this.getTipoAngulo();
    }
    
    //Esto lo hace directamente ChatGPT
    @Override
    public int hashCode() {
        // Valor inicial
        int result = 17;

        // Multiplicar por un número primo y añadir los hashes de los lados
        result = 31 * result + Double.hashCode(this.LADO_A);
        result = 31 * result + Double.hashCode(this.LADO_B);
        result = 31 * result + Double.hashCode(this.LADO_C);

        // Retornar el resultado
        return result;
    }
    
    //Métodos de clase:
    //Recibe dos ángulos y devuelve el que falta
    public static Angulo anguloFaltante(Angulo a, Angulo b){
        return new Angulo(180 - a.getGrados() - b.getGrados());   
    }
    //Recibe dos lados y el ángulo opuesto ángulo y devulve al ángulo que forman
    public static Angulo anguloQueForman(double b, double c, Angulo ac){
        double sinusA = (b * ac.getSinus());
        if (sinusA < -1 || sinusA > 1){
            System.out.println("Fuera de rango");
            return new Angulo(0);
        } else {
      return new Angulo(Math.asin((sinusA) / c));
        }
    }
    

    
}
