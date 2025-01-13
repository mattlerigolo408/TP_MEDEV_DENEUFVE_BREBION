package edu.centralenantes.tp_medev_deneufve_brebion;

import java.util.List;

/**
 * Classe représentant le Jeu.
 * L'agrégation de l'ensemble des composants du jeu
 * Classe Main
 */
public class o_tel_o {
    private Plateau plateau;
    private int nbTour;
    private Joueur j1;
    private Joueur j2;

    /**
    * Constructeur pour initialiser le jeu.
    */
    public o_tel_o() {
        this.plateau = new Plateau();
        this.nbTour = 0;
        this.j1 = new Joueur(True);
        this.j2 = new Joueur(False);
    }

    /**
    * Methode qui commence chaque tour
    */
    public void commencerTour() {
        boolean joueurBlanc = nbTour % 2 == 0;
        System.out.println("Tour du joueur " + (joueurBlanc ? "Blanc" : "Noir"));
        if(joueurBlanc){
            j1.placerPion();
        }
        else{
            j2.placerPion();
        }
    }

    /**
    * Methode mettant fin à chaque tour
    */
    public void terminerTour() {
        nbTour++;
        System.out.println("Tour terminé. Prochain joueur : " + (nbTour % 2 == 0 ? "Blanc" : "Noir"));
    }

    /**
    * Getter du nombre de tour
    */
    public int getNbTour() {
        return nbTour;
    }

    /**
    * Getter du plateau
    */
    public Plateau getPlateau() {
        return plateau;
    }

    /**
    * Methode déterminant le joueur actif
    */
    public boolean joueurActifEstBlanc() {
        return nbTour % 2 == 0;
    }
}
