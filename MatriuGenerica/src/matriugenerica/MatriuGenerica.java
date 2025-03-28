/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriugenerica;

import java.util.Random;

/**
 *
 * @author jmas
 * @param <T>
 */
public abstract class MatriuGenerica<T extends Number> {

    // Matrius implicades en l'última operació realitzada
    private T[][] matriuOpEsquerra;
    private T[][] matriuOpDreta;

    private TipusOperacio tipusUltimaOperacio;

    // Matriu resultat
    private T[][] matriu;

    public MatriuGenerica(int tamany) {
        Random random = new Random();
        
        this.matriu = (T[][]) new Number[tamany][tamany];
        for (int i = 0; i < this.matriu.length; i++) {
            for (int j = 0; j < this.matriu[i].length; j++) {
                this.matriu[i][j] = this.aleatory();
            }
        }

        this.matriuOpEsquerra = null;
        this.matriuOpDreta = null;
        this.tipusUltimaOperacio = TipusOperacio.RES;

    }

    /**
     * Suma una matriu a l'actual
     *
     * @param matriu
     * @throws MatriuException
     */
    public void sumar(T[][] matriu) throws MatriuException {
        // Comprovació de les dimensions de les dos matrius
        if ((this.matriu.length != matriu.length)
                || (this.matriu[0].length != matriu[0].length)) {
            throw new MatriuException("Las matriu a sumar no és de tamany " + this.matriu.length);
        }

        // Nou matriu que substituirà a l'actual
        T[][] resultat = (T[][]) new Number[this.matriu.length][this.matriu[0].length];

        // Realitzar la suma
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                resultat[i][j] = this.suma(this.matriu[i][j], matriu[i][j]);
            }
        }

        // Emmagatzematge de la informació en els atributs de la classe
        this.matriuOpEsquerra = this.matriu;
        this.matriuOpDreta = matriu;
        this.matriu = resultat;
        this.tipusUltimaOperacio = TipusOperacio.SUMA;
    }

    /**
     * Multiplica la matriu actual amb la proporcionada
     *
     * @param matriu
     * @throws MatriuException
     */
    public void multiplicar(T[][] matriu) throws MatriuException {

        // Comprovar les dimensions de les matrius (nombre de columnes de l'esquerra igual al nombre de files de la dreta)
        if (this.matriu[0].length != matriu.length) {
            throw new MatriuException(
                    "La matriu a multiplicar no té una grandària compatible. Ha de tindre " + this.matriu[0].length + " files");
        }

        // Nou array que substituirà a l'actual
        T[][] resultat = (T[][]) new Number[this.matriu.length][matriu[0].length];

        // Realitzar la multiplicació
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                resultat[i][j] = this.zero();

                for (int k = 0; k < this.matriu[0].length; k++) {
                    resultat[i][j] = this.multiplicacion( this.matriu[i][j], matriu[i][j]);
                }
            }
        }

        // Emmagatzematge de la informació en els atributs de la classe
        this.matriuOpEsquerra = this.matriu;
        this.matriuOpDreta = matriu;
        this.matriu = resultat;
        this.tipusUltimaOperacio = TipusOperacio.MULTIPLICACIO;
    }

    public void imprimirUltimaOperacion() {
        for (int i = 0; i < matriuOpEsquerra.length; i++) {
            for (int j = 0; j < matriuOpEsquerra[0].length; j++) {
                System.out.print(" " + matriuOpEsquerra[i][j]);
            }

            if (i == matriuOpEsquerra.length / 2) {
                System.out.print(" " + this.tipusUltimaOperacio.simbolOperacio() + " ");
            } else {
                System.out.print("   ");
            }

            for (int j = 0; j < matriuOpDreta.length; j++) {
                System.out.print(" " + matriuOpDreta[i][j]);
            }

            if (i == matriuOpEsquerra.length / 2) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            for (int j = 0; j < matriu.length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    //Metodo que muestra la matriz
    public void mostrarMatriu(){
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(" " + this.matriu[i][j]);
            }
            System.out.println(" ");
        }
 
    }  
    
    //Métodos abstractos:
    abstract T suma(T a, T b);
    abstract T multiplicacion(T a, T b);
    abstract T zero();
    abstract T aleatory();
}