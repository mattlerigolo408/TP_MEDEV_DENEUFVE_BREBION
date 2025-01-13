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
    * @param jeu Référence à l'objet principal du jeu.
    */
    public Joueur(boolean blanc, Jeu jeu) {
        this.blanc = blanc;
        this.jeu = jeu;
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
    
    /**
     * Calcule les cases disponibles pour le placement d'un pion selon les règles du jeu.
     * 
     * @param plateau Le plateau actuel du jeu.
     * @return La liste des cases où le joueur peut placer un pion.
     */
    public List<int[]> calculerPlacementsPossibles(Plateau plateau) {
        List<int[]> casesDisponibles = new ArrayList<>();

        // Parcourt toutes les cases du plateau.
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                // Vérifie si le placement est valide pour la case (x, y).
                if (plateau.estPlacementValide(blanc, x, y)) {
                    casesDisponibles.add(new int[] {x, y});
                }
            }
        }
        return casesDisponibles;
    }
}
