package edu.centralenantes.tp_medev_deneufve_brebion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mattlerigolo
 */
public class O_tel_oTest {
    
    public O_tel_oTest() {
    }

    /**
     * Test of tour method, of class O_tel_o.
     */
    @Test
    public void testTour() {
        System.out.println("tour");
        O_tel_o instance = new O_tel_o();
    }

    /**
    * Test of getNbTour method, of class O_tel_o.
    */
    @Test
    public void testGetNbTour() {
        System.out.println("getNbTour");
        O_tel_o instance = new O_tel_o();

        // La valeur initiale de nbTour devrait être 0 par défaut
        int expResult = 0;
        int result = instance.getNbTour();
        assertEquals(expResult, result);
    }

    /**
    * Test of getPlateau method, of class O_tel_o.
    */
    @Test
    public void testGetPlateau() {
        System.out.println("getPlateau");
        O_tel_o instance = new O_tel_o();

        // Initialisation d'un plateau
        Plateau expectedPlateau = new Plateau();  // Crée une instance de Plateau. Assure-toi que Plateau est une classe existante.

        // Simuler le plateau initial (si la méthode getPlateau retourne un plateau initialisé)
        instance.setPlateau(expectedPlateau);

        Plateau result = instance.getPlateau();
        assertEquals(expectedPlateau, result);  // On vérifie que le plateau retourné est bien celui attendu
    }


    /**
     * Test of joueurActifEstBlanc method, of class O_tel_o.
     */
    @Test
    public void testJoueurActifEstBlanc() {
        System.out.println("joueurActifEstBlanc");
        O_tel_o instance = new O_tel_o();
        boolean expResult = false;
        boolean result = instance.joueurActifEstBlanc();
        assertEquals(expResult, result);
    }

    /**
     * Test of afficherPlateau method, of class O_tel_o.
     */
    @Test
    public void testAfficherPlateau() {
        System.out.println("afficherPlateau");
        O_tel_o instance = new O_tel_o();
    }

    /**
     * Test of jeu method, of class O_tel_o.
     */
    @Test
    public void testJeu() {
        System.out.println("jeu");
    }
    
}
