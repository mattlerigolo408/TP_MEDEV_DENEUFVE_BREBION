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
     * Ligne du plateau
     * @param y
     * Colonne du plateau
     * @return 
     * true si la position est valide
     */
    public boolean estPlacementValide(boolean estBlanc, int x, int y) {
        if ((x<0 || x>7) || (y<0 || y>7)) {
            return false;
        }
        if (plateau[x][y] != null) {
            return false;
        }
        
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},  // Haut, Bas, Gauche, Droite
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1} // Diagonales
        };

        for (int[] dir : directions) {
            int dx = dir[0], dy = dir[1];
            int i = x + dx, j = y + dy;
            boolean aTrouveAdverse = false;

            while (i >= 0 && i < 8 && j >= 0 && j < 8) {
                if (plateau[i][j] == null) {
                    break;
                }
                if (plateau[i][j].isBlanc() == estBlanc) {
                    // Valide si un pion adverse est encerclé
                    if (aTrouveAdverse) {
                        return true;
                    }
                    else { 
                        break;
                    }
                } 
                else {
                    aTrouveAdverse = true; // Trouve un pion adverse
                }
                i += dx;
                j += dy;
            }
        }
        return false; // Aucune direction valide, on ne peut pas poser le pion
    }
    
    /**
     * Pose le pion et change la couleur des pions capturés
     * @param estBlanc
     * Couleur du pion (true si blanc, false si noir)
     * @param x
     * Ligne du plateau
     * @param y
     * Colonne du plateau
     */
    public void poserPion(boolean estBlanc, int x, int y) {
        if (this.estPlacementValide(estBlanc, x, y)) {
            plateau[x][y] = new Pion();
            plateau[x][y].setBlanc(estBlanc);
        }
        
        plateau[x][y] = new Pion();
        plateau[x][y].setBlanc(estBlanc);
        
        // Directions possibles : haut, bas, gauche, droite, diagonales
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},  // Haut, Bas, Gauche, Droite
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1} // Diagonales
        };

        // Parcours toutes les directions
        for (int[] dir : directions) {
            int dx = dir[0], dy = dir[1];
            int i = x + dx, j = y + dy;
            boolean aTrouveAdverse = false;

            // Vérifie si des pions adverses peuvent être retournés
            while (i >= 0 && i < 8 && j >= 0 && j < 8) {
                if (plateau[i][j] == null) {
                    break; // Arrête si on rencontre une case vide
                }
                if (plateau[i][j].isBlanc() == estBlanc) {
                    // Retourne les pions entre (x, y) et (i, j) s'il y a au moins un pion adverse à retourner
                    if (aTrouveAdverse) {
                        int k = x + dx, l = y + dy;
                        while (k != i || l != j) {
                            plateau[k][l].setBlanc(estBlanc); // Change la couleur des pions adverses
                            k += dx;
                            l += dy;
                        }
                    }
                    break;
                } 
                else {
                    aTrouveAdverse = true; // Trouve un pion adverse
                }
                i += dx;
                j += dy;
            }
        }
    }
    
    
   
    
    
}
