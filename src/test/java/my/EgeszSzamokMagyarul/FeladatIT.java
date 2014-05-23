/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.EgeszSzamokMagyarul;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikuci
 */
public class FeladatIT {
    
    public FeladatIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of PontSzámítás method, of class Feladat.
     */
    @Test
    public void testPontSzámítás() {
        System.out.println("PontSz\u00e1m\u00edt\u00e1s");
        Feladat instance = null;
        instance.PontSzámítás();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exit method, of class Feladat.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        Feladat instance = null;
        instance.exit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
