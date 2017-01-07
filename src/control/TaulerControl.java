package control;

import model.Tauler;
import vista.TaulerVista;

public class TaulerControl {
    
    TaulerVista tv = new TaulerVista();
    
    public void crearTauler(){
        int col, fil;
        tv.mostraMissatge(tv.INTRODUIR_FILES);
        fil= tv.introduirMesures();
        tv.mostraMissatge(tv.INTRODUIR_COLUMNES);
        col= tv.introduirMesures();
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
            }            
        }
    }
    
}
