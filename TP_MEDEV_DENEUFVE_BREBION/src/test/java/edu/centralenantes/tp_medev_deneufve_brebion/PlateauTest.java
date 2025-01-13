package edu.centralenantes.tp_medev_deneufve_brebion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mattlerigolo
 */
public class PlateauTest {
    
    public PlateauTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPlateau method, of class Plateau.
     */
    @Test
    public void testGetPlateau() {
        System.out.println("getPlateau");
        Plateau instance = new Plateau();

        Pion[][] expResult = new Pion[3][3];
        expResult[0][0] = new Pion(true);
        expResult[1][1] = new Pion(false);

        instance.setPlateau(expResult);

        Pion[][] result = instance.getPlateau();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setPlateau method, of class Plateau.
     */
    @Test
    public void testSetPlateau() {
        System.out.println("setPlateau");
        Plateau instance = new Plateau();

        Pion[][] plateau = new Pion[3][3];
        plateau[0][0] = new Pion(true);
        plateau[1][1] = new Pion(false);

        instance.setPlateau(plateau);

        assertArrayEquals(plateau, instance.getPlateau());
    }


    /**
     * Test of estPlacementValide method, of class Plateau.
     */
    @Test
    public void testEstPlacementValide() {
        System.out.println("estPlacementValide");
        Plateau instance = new Plateau();
        assertEquals(false, instance.estPlacementValide(true, 3, 3));
        assertEquals(false, instance.estPlacementValide(true, 0, 0));
        assertEquals(true, instance.estPlacementValide(true, 2, 4));
        
        assertEquals(false, instance.estPlacementValide(false, 3, 3));
        assertEquals(false, instance.estPlacementValide(false, 0, 0));
        assertEquals(true, instance.estPlacementValide(false, 2, 3));
        
    }

    /**
     * Test of poserPion method, of class Plateau.
     */
    @Test
    public void testPoserPion() {
        System.out.println("poserPion");
        Plateau instance = new Plateau();
        instance.poserPion(false, 2, 3);
        assertEquals(false, instance.getPlateau()[3][3].isBlanc());
        
        instance.poserPion(true, 2, 4);
        assertEquals(true, instance.getPlateau()[3][4].isBlanc());

    }

    /**
    * Test of partieFinie method, of class Plateau.
    */
    @Test
    public void testPartieFinie() {
        System.out.println("partieFinie");
        Plateau instance = new Plateau(); // le plateau est initialisé, donc la partie n'est pas finie
        assertEquals(false, instance.partieFinie());

        // Plateau complet où la partie est finie
        Plateau instance2 = new Plateau();
        Pion[][] plateau = new Pion[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                plateau[i][j] = new Pion(true); 
            }
        }
        instance2.setPlateau(plateau);
        assertEquals(true, instance2.partieFinie());
    }


    /**
     * Test of getGagnant method, of class Plateau.
     */
    @Test
    public void testGetGagnant() {
        System.out.println("getGagnant");
        Plateau instance = new Plateau(); // le plateau est initialisé, donc les deux joueurs ont chacun 2 pions
        assertEquals("Nul", instance.getGagnant());

        // Plateau complet où blanc gagne
        Plateau instance2 = new Plateau();
        Plateau instance3 = new Plateau();
        Pion[][] plateau2 = new Pion[8][8];
        Pion[][] plateau3 = new Pion[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                plateau2[i][j] = new Pion(true); 
                plateau3[i][j] = new Pion(false);
            }
        }
        instance2.setPlateau(plateau2);
        instance3.setPlateau(plateau3);
        assertEquals("Blanc", instance2.getGagnant());
        assertEquals("Noir", instance3.getGagnant());
    }
    
}
