package edu.centralenantes.tp_medev_deneufve_brebion;

import java.util.Scanner;

/**
 * Classe représentant le jeu Othello.
 * Elle contient l'agrégation des composants nécessaires au fonctionnement du jeu,
 * comme le plateau et les joueurs.
 */
public class o_tel_o {
    private static Plateau plateau;
    private int nbTour;
    private static Joueur j1;
    private static Joueur j2;

    /**
     * Constructeur pour initialiser le jeu avec un plateau et deux joueurs.
     * J1 représente le joueur Blanc, et J2 le joueur Noir.
     */
    public o_tel_o() {
        this.plateau = new Plateau();
        this.nbTour = 0;
        this.j1 = new Joueur(true);  // Joueur Blanc
        this.j2 = new Joueur(false); // Joueur Noir
    }

    /**
     * Effectue un tour de jeu.
     * Cette méthode demande au joueur actif où il souhaite placer son pion
     * et vérifie la validité du coup avant de l'exécuter.
     */
    public void tour() {
        boolean joueurBlanc = nbTour % 2 == 0;
        System.out.println("Tour du joueur " + (joueurBlanc ? "Blanc" : "Noir"));

        Scanner scanner = new Scanner(System.in);
        boolean coupValide = false;

        // Boucle pour demander un coup valide
        while (!coupValide) {
            System.out.println("Entrez la position où vous souhaitez placer votre pion (format : x y) : ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Vérifie si le coup est valide
            if (plateau.estPlacementValide(joueurBlanc, x, y)) {
                plateau.poserPion(joueurBlanc, x, y); // Place le pion sur le plateau
                coupValide = true;
                System.out.println("Pion placé en (" + x + ", " + y + ") par le joueur " + (joueurBlanc ? "Blanc" : "Noir"));
            } else {
                System.out.println("Placement invalide ! Essayez une autre position.");
            }
        }

        nbTour++;
        System.out.println("Tour terminé. Prochain joueur : " + (nbTour % 2 == 0 ? "Blanc" : "Noir"));
    }

    /**
     * Récupère le nombre de tours joués.
     *
     * @return Le nombre de tours joués.
     */
    public int getNbTour() {
        return nbTour;
    }

    /**
     * Récupère le plateau de jeu.
     *
     * @return L'objet Plateau représentant le plateau du jeu.
     */
    public Plateau getPlateau() {
        return plateau;
    }

    /**
     * Détermine si le joueur actif est Blanc.
     *
     * @return true si le joueur actif est Blanc, false s'il est Noir.
     */
    public boolean joueurActifEstBlanc() {
        return nbTour % 2 == 0;
    }

    /**
    * Affiche le plateau dans la console avec les pions blancs et noirs,
    * ainsi que des lettres horizontales pour les colonnes et des espaces pour les cases vides.
    */
   public void afficherPlateau() {
       System.out.println("  A B C D E F G H"); // En-tête des colonnes
       for (int i = 0; i < 8; i++) {
           System.out.print(i + 1 + " "); // Numéros des lignes (1 à 8)
           for (int j = 0; j < 8; j++) {
               if (plateau.getPlateau()[i][j].isBlanc()) {
                   System.out.print("◘ "); // Pion blanc
               } else if (! plateau.getPlateau()[i][j].isBlanc()) {
                   System.out.print("• "); // Pion noir
               } else {
                   System.out.print("  "); // Case vide
               }
           }
           System.out.println(); // Nouvelle ligne après chaque ligne du plateau
       }
   }

    /**
     * Main du programme.
     * Initialise le jeu et exécute les tours jusqu'à la fin de la partie.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le jeu O tel O !");
        o_tel_o jeu = new o_tel_o();
        // Boucle principale du jeu (à remplacer par une condition de fin)
        while (true) {
            jeu.tour();
            // Vérifie si la partie est terminée (condition à implémenter)
            if (plateau.partieFinie()) {
                System.out.println("La partie est terminée !");
                if(plateau.getGagnant()=="Nul"){
                    System.out.println("Match NUL !");
                }
                else{
                    System.out.println("Le joueur " + plateau.getGagnant() + " a gagné !");
                }
                break;
            }
        }
    }
}
