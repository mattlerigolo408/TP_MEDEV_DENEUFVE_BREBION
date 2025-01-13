package edu.centralenantes.tp_medev_deneufve_brebion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
/**
 * Classe représentant un joueur.
 * Un joueur peut être Blanc ou Noir et a la capacité de placer des pions
 * sur le plateau selon les règles du jeu.
 */
public class Joueur {
    
    private boolean blanc;
    
    /**
    * Constructeur pour initialiser un joueur avec sa couleur et la référence au jeu.
    * 
    * @param blanc Indique si le joueur est Blanc (true) ou Noir (false).
    */
    public Joueur(boolean blanc) {
        this.blanc = blanc;
    }
    
    /**
     * Indique si le joueur est Blanc (true) ou Noir (false).
     */
    public boolean isBlanc() {
        return blanc;
    }
    
    /**
     * Définit la couleur du joueur.
     * 
     * @param blanc true pour définir le joueur comme Blanc, false pour Noir.
     */
    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }
    
    /**
     * Place un pion sur une case valide du plateau.
     * Cette méthode met également à jour l'interface graphique et les règles du jeu.
     * 
     * @param p Le pion que le joueur souhaite placer.
     */
    private void placerPion(Pion p) {
              
    }
}
