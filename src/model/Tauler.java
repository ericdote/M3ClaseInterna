/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Eric
 */
public class Tauler {
    
    private int files, columnes;
    private Casella[][] tauler;

    public Tauler(int files, int columnes) {
        this.files = files;
        this.columnes = columnes;
        tauler = new Casella[files][columnes];
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public void setColumnes(int columnes) {
        this.columnes = columnes;
    }
    
    
    
}

class Casella{
    
    private boolean estat;
    private String color;

    public Casella(boolean estat, String color) {
        this.estat = estat;
        this.color = color;
    }

    public boolean isEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
