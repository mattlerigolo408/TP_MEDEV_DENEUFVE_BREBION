package edu.centralenantes.tp_medev_deneufve_brebion;

/**
 * Classe représentant un pion dans le jeu Othello.
 * Un pion peut être de couleur blanche ou noire, et il peut être manipulé par les joueurs
 * pour avancer ou capturer des pions adverses.
 * 
 * @author benja
 */
public class Pion {
    
    /**
     * Indique si le pion est Blanc (true) ou Noir (false).
     */
    private boolean blanc;
    
    /**
     * Constructeur par défaut.
     * Initialise un pion noir.
     */
    public Pion() {
        this.blanc = false;
    }

    /**
     * Constructeur pour initialiser un pion avec une couleur.
     * 
     * @param blanc true pour un pion blanc, false pour un pion noir.
     */
    public Pion(boolean blanc) {
        this.blanc = blanc;
    }

    /**
     * Retourne si le pion est Blanc.
     * 
     * @return true si le pion est Blanc, false s'il est Noir.
     */
    public boolean isBlanc() {
        return blanc;
    }
    
    /**
     * Définit la couleur du pion.
     * 
     * @param blanc true pour définir le pion comme Blanc, false pour Noir.
     */
    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }
}
