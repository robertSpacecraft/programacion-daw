/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class Angulo {

    //Atributos
    private double grados;

    //Constructores
    //A partir de los grados
    public Angulo(double grados) {
        if (grados > 360) {
            while (grados > 360) {
                grados = grados - 360;
                this.grados = grados;
            }
        } else if (grados < 0) {
            while (grados < 0) {
                grados = grados + 360;
                this.grados = grados;
            }
        } else {
            this.grados = grados;
        }
    }

    //A partir de otro ángulo
    public Angulo(Angulo angulo) {
        this.grados = angulo.grados;
    }

    //Métodos
    @Override
    public String toString() {
        return this.grados + "°";
    }
    //Convierte los grados a radianes
    public double toRadians() {
        return (this.grados * Math.PI) / 180;
    }

    //Getters & Setters
    //Devuelve los grados del  ángulo
    public double getGrados() {
        return this.grados;
    }
    //Permite establecer los grados
    public void setGrados(double grados) {
        this.grados = grados;
    }
    //Devuelve el seno
    public double getSinus() {
        return Math.sin(toRadians());
    }
    //Devuelve el coseno
    public double getCosinus() {
        return Math.cos(toRadians());
    }
    //Devulve la tangente
    public double getTangent() {
        return Math.tan(toRadians());
    }

    //Otros métodos
    //Devuelve true si el ángulo es agudo
    public boolean esAgudo() {
        return this.grados < 90;
    }
    //devuelve true si el ángulo es recto
    public boolean esRecto() {
        return this.grados == 90;
    }
    //Devuelve true si el ángulo es obtuso
    public boolean esObtuso() {
        return this.grados > 90;
    }
    //Simplifica el ángulo
    public void simplificar() {
        if (this.grados <= 0) {
            while (this.grados < 0) {
                this.grados = this.grados + 360;
            }
        } else if (this.grados > 360) {
            while (this.grados > 360) {
                this.grados = this.grados - 360;
            }
        } else {
            System.out.println("El águno no se puede simplificar");
        }
    }
    //Realiza una representación gráfica aproximada del ángulo
    public void visualizar() {
        if (esAgudo()) {
            System.out.println("   /\n  /\n /\n - - - -");
        } else if (esObtuso()) {
            System.out.println("\\\n \\\n  \\\n    - - - -");
        } else {
            System.out.println("|\n|\n|\n - - - -");
        }
    }
    //Comprueba si dos objetos de tipo ángulo son iguales
    public boolean equals(Angulo angulo) {
        return this.grados == angulo.grados;
    }

    //Esto directamente lo he copiado de ChatGPT porque no tenía ni idea...
    public int hashCode() {
        return Double.hashCode(this.grados);
    }

    //Métodos de clase
    //Recibe radianes y devulve grados
    public static double toGraus(double rad) {
        return (rad * 180) / Math.PI;
    }
    //Recibe el seno y devulve un el ángulo
    public static Angulo asin(double sin) {
        double radianes = Math.asin(sin);
        double grados = radianes * 180 / Math.PI;
        return new Angulo(grados);
    }
    //Recibe el coseno y devuelve el ángulo
    public static Angulo acos(double cos) {
        double radianes = Math.acos(cos);
        double grados = radianes * 180 / Math.PI;
        return new Angulo(grados);
    }
    //Recibe la tangente y devuelve el ángulo
    public static Angulo atan(double tan) {
        double radianes = Math.atan(tan);
        double grados = radianes * 180 / Math.PI;
        return new Angulo(grados);
    }

}
