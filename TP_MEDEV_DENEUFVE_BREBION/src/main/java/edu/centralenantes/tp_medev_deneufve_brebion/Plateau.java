package edu.centralenantes.tp_medev_deneufve_brebion;


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
    
    /**
     * Vérifie si un placement est valide
     * @param estBlanc
     * Couleur du pion (true si blanc, false si noir)
     * @param x
     * 
     * @param y
     * @return 
     */
    public boolean estPlacementValide(boolean estBlanc, int x, int y) {
        if ((x<0 || x>7) || (y<0 || y>7)) {
            return false;
        }
        if (plateau[x][y] != null) {
            return false;
        }
        
        else {
            return true;
        }
    }
    
    public void poserPion(boolean estBlanc, int x, int y) {
        if (this.estPlacementValide(estBlanc, x, y)) {
            plateau[x][y] = new Pion();
            plateau[x][y].setBlanc(estBlanc);
        }
    }
    
    
   
    
    
}
