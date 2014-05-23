package my.Szamnevek;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SzamNevTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * "getHelyiÉrték" metódus tesztelése. 
     */
    @Test
    public void testGetHelyiÉrték() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(6, sz.getHelyiÉrték());
        sz = new SzamNev(0, 5, "öt");
        assertEquals(0, sz.getHelyiÉrték());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals(0, sz.getHelyiÉrték());
    }

    /**
     * "getÉrtékTízHatványban" metódus tesztelése. 
     */
    @Test
    public void testGetÉrtékTízHatványban() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(6, sz.getÉrtékTízHatványban());
        sz = new SzamNev(9, "milliárd");
        assertEquals(9, sz.getÉrtékTízHatványban());
    }

    /**
     * "getÉrték" metódus tesztelése. 
     */
    @Test
    public void testGetÉrték() {
        SzamNev sz = new SzamNev(0, 5, "öt");
        assertEquals(5, sz.getÉrték());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals(2, sz.getÉrték());
    }

    /**
     * "getNév" metódus tesztelése. 
     */
    @Test
    public void testGetNév() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals("millió", sz.getNév());
        sz = new SzamNev(0, 5, "öt");
        assertEquals("öt", sz.getNév());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals("két", sz.getNév());
    }

    /**
     * "getEgyedülÁllóNév" metódus tesztelése. 
     */
    @Test
    public void testGetEgyedülÁllóNév() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(null, sz.getEgyedülÁllóNév());
        sz = new SzamNev(0, 5, "öt");
        assertEquals(null, sz.getEgyedülÁllóNév());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals("kettő", sz.getEgyedülÁllóNév());
    }

    /**
     * "isMásAzEgyedülÁllóNév" metódus tesztelése. 
     */
    @Test
    public void testIsMásAzEgyedülÁllóNév() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(false, sz.isMásAzEgyedülÁllóNév());
        sz = new SzamNev(0, 5, "öt");
        assertEquals(false, sz.isMásAzEgyedülÁllóNév());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals(true, sz.isMásAzEgyedülÁllóNév());
    }

    /**
     * "isÉrtékTízHatványbanVan" metódus tesztelése. 
     */
    @Test
    public void testIsÉrtékTízHatványbanVan() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(true, sz.isÉrtékTízHatványbanVan());
        sz = new SzamNev(0, 5, "öt");
        assertEquals(false, sz.isÉrtékTízHatványbanVan());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals(false, sz.isÉrtékTízHatványbanVan());
    }

}
