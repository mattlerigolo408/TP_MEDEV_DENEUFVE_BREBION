package edu.centralenantes.tp_medev_deneufve_brebion;

import java.util.ArrayList;

/**
 * Plateau de jeu
 * @author mattlerigolo
 */
public class Plateau {
    /**
     * Liste de pions représentant le plateau de jeu
     */
    private Pion[][] plateau;
    
    
    /**
     * Constructeur par défaut initialisant le plateau de départ
     */
    public Plateau() {
        this.plateau = new Pion[8][8];
        plateau[3][3] = new Pion();
        plateau[3][3].setBlanc(true);
        plateau[4][4] = new Pion();
        plateau[4][4].setBlanc(true);
        
        plateau[3][4] = new Pion();
        plateau[4][3] = new Pion();
    }

    /**
     * Getter du plateau
     * @return 
     * Plateau de jeu
     */
    public Pion[][] getPlateau() {
        return plateau;
    }

    /**
     * Setter du plateau
     * @param plateau 
     * Plateau de jeu à utiliser
     */
    public void setPlateau(Pion[][] plateau) {
        this.plateau = plateau;
    }
    
    
   
    
    
}
