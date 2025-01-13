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
public class PionTest {
    
    public PionTest() {
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
     * Test of isBlanc method, of class Pion.
     */
    @Test
    public void testIsBlanc() {
        System.out.println("isBlanc");
        Pion instance = new Pion();
        assertEquals(false, instance.isBlanc());
        Pion instance2 = new Pion(true);
        assertEquals(true, instance2.isBlanc());
    }

    /**
     * Test of setBlanc method, of class Pion.
     */
    @Test
    public void testSetBlanc() {
        System.out.println("setBlanc");
        Pion instance = new Pion();
        instance.setBlanc(false);
        assertEquals(false, instance.isBlanc());
        instance.setBlanc(true);
        assertEquals(true, instance.isBlanc());
        instance.setBlanc(false);
        assertEquals(false, instance.isBlanc());
    }
    
}
