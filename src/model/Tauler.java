/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author Eric
 */
public final class Tauler {

    private Casella[][] tauler;
    Scanner lector = new Scanner(System.in);

    /**
     * Constructor de Tauler on li arriba per parametre el numero de files i columnes que tindra el tauler.
     * S'inicialitza el tauler amb els parametres i es crida al metode completarTauler
     * @param files
     * @param columnes 
     */
    public Tauler(int files, int columnes) {
        tauler = new Casella[files][columnes];
        completarTauler();
    }
    /**
     * Aquest metode basicament lo que fa es a cada posicio del tauler introduir un objecte Casella.
     */
    public void completarTauler() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                tauler[i][j] = new Casella();
            }
        }
    }


    /**
     * Aquest metode demana una fila i una columna per modificar-li l'estat i el color.
     */
    public void modificarCasella() {
        int fila, columna;
        System.out.print("Introdueix la fila on vols modificar: ");
        fila = lector.nextInt();
        System.out.print("Introdueix la columna on vols modificar: ");
        columna = lector.nextInt();
        tauler[fila-1][columna-1].setEstat(!tauler[fila][columna].isEstat());
        tauler[fila-1][columna-1].setColor(Color.RED);
    }
    /**
     * Aquest metode mostra el color del tauler.
     */
    public void mostrarTauler() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                System.out.print(tauler[i][j].getColor() + " ");
            }
            System.out.println("");
        }
    }
    /**
     * Aquest metode mostra l'estat del tauler.
     */
    public void mostrarEstatTauler() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                System.out.print(tauler[i][j].isEstat() + " ");
            }
            System.out.println("");
        }
    }
    /**
     * Aquest metode mostra un menu per escogir si volem veure el tauler o modificar una casella.
     */
    public void mostraMenu() {
        int opcio;
        do {
        System.out.print("Escogeix una opcio\n"
                + "1- Mostra tauler\n"
                + "2- Modifica casella\n\n"
                + "3- Sortir\n"
                + "Opcio: ");
        
            opcio = lector.nextInt();
            switch (opcio) {
                case 1:
                    mostrarTauler();
                    System.out.println("");
                    mostrarEstatTauler();
                    break;
                case 2:
                    modificarCasella();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Selecciona una opcio valida!");
                    break;
            }
        } while (true);
    }
}
/**
 * Clase interna dentro de la clase Tauler.
 * @author Eric
 */
class Casella {

    private boolean estat;
    private Color color;
    /**
     * Constructor de casella on s'inicialitzan totes per defecte en false y GREEN
     */
    public Casella() {
        this.estat = false;
        this.color = Color.GREEN;
    }

    public boolean isEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
