/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class TaulerVista {

    Scanner lector = new Scanner(System.in);

    public static final String INTRODUIR_FILES = "Introdueix el numero de files: ";
    public static final String INTRODUIR_COLUMNES = "Introdueix el numero de columnes: ";
    public static final String ERROR_ENTERS = "Ha de ser un numero enter!";
    public static final String ERROR_NEGATIUS = "Ha de ser un numero enter positiu!";

    public int introduirMesures() {
        int valor;
        do {
            if (!lector.hasNextInt()) {
                System.err.println(ERROR_ENTERS);
            } else {
                valor = lector.nextInt();
                if (valor <= 0) {
                    System.err.println(ERROR_NEGATIUS);
                } else {
                    break;
                }
            }
        } while (true);
        return valor;
    }
    
    public void mostraMissatge(String frase){
        System.out.println(frase);
    }

}
