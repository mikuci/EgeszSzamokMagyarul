package my.Szamnevek;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SzamNevekTest {

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
     * "getSzámnevek" metódus tesztelése. 
     */
    @Test
    public void testGetSzámnevek() {
        assertEquals("nulla", SzamNevek.getSzamnevek()[0].getNév());
        assertEquals("egy", SzamNevek.getSzamnevek()[1].getNév());
        assertEquals(0, SzamNevek.getSzamnevek()[1].getHelyiÉrték());
        assertEquals(1, SzamNevek.getSzamnevek()[1].getÉrték());
        assertEquals("kettő", SzamNevek.getSzamnevek()[2].getEgyedülÁllóNév());
        assertEquals(true, SzamNevek.getSzamnevek()[2].isMásAzEgyedülÁllóNév());
        assertEquals(6, SzamNevek.getSzamnevek()[21].getÉrtékTízHatványban());
        assertEquals(true, SzamNevek.getSzamnevek()[21].isÉrtékTízHatványbanVan());
    }

    /**
     * "getSzámnevek_dik" metódus tesztelése. 
     */
    @Test
    public void testGetSzámnevek_dik() {
        assertEquals("nulladik", SzamNevek.getSzamnevek_dik()[0].getNév());
        assertEquals("egyedik", SzamNevek.getSzamnevek_dik()[1].getNév());
        assertEquals(0, SzamNevek.getSzamnevek_dik()[1].getHelyiÉrték());
        assertEquals(1, SzamNevek.getSzamnevek_dik()[1].getÉrték());
        assertEquals(false, SzamNevek.getSzamnevek_dik()[2].isMásAzEgyedülÁllóNév());
        assertEquals(6, SzamNevek.getSzamnevek_dik()[21].getÉrtékTízHatványban());
        assertEquals(true, SzamNevek.getSzamnevek_dik()[21].isÉrtékTízHatványbanVan());
    }

    /**
     * "getNév" metódus tesztelése. 
     */
    @Test
    public void testGetNév() {
        SzamNevek sz;
        sz = new SzamNevek(4532, false);
        assertEquals("négyezer-ötszázharminckettő", sz.getNev());
        sz = new SzamNevek(4532.0, false);
        assertEquals("négyezer-ötszázharminckettő", sz.getNev());
        sz = new SzamNevek("4532", false);
        assertEquals("négyezer-ötszázharminckettő", sz.getNev());
        sz = new SzamNevek(4532, true);
        assertEquals("négyezer-ötszázharminckettedik", sz.getNev());
        sz = new SzamNevek(4532.0, true);
        assertEquals("négyezer-ötszázharminckettedik", sz.getNev());
        sz = new SzamNevek("4532", true);
        assertEquals("négyezer-ötszázharminckettedik", sz.getNev());
    }

    /**
     * "tizHatvany" metódus tesztelése. 
     */
    @Test
    public void testTizHatvany() {
        assertEquals(1000.0, new SzamNevek().tizHatvany(3), 0.0);
        assertEquals(100000.0, new SzamNevek().tizHatvany(5), 0.0);
    }

}