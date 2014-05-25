package my.Szamnevek;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikuci
 */
public class SzamNevTest {
    
    /**
     * "getHelyiÉrték" metódus tesztelése. 
     */
    @Test
    public void testGetHelyiErtek() {
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
    public void testGetErtekTizHatvanyban() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(6, sz.getÉrtékTízHatványban());
        sz = new SzamNev(9, "milliárd");
        assertEquals(9, sz.getÉrtékTízHatványban());
    }

    /**
     * "getÉrték" metódus tesztelése. 
     */
    @Test
    public void testGetErtek() {
        SzamNev sz = new SzamNev(0, 5, "öt");
        assertEquals(5, sz.getÉrték());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals(2, sz.getÉrték());
    }

    /**
     * "getNév" metódus tesztelése. 
     */
    @Test
    public void testGetNev() {
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
    public void testGetEgyedulAlloNev() {
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
    public void testIsMasAzEgyedulAlloNev() {
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
    public void testIsErtekTizHatvanybanVan() {
        SzamNev sz = new SzamNev(6, "millió");
        assertEquals(true, sz.isÉrtékTízHatványbanVan());
        sz = new SzamNev(0, 5, "öt");
        assertEquals(false, sz.isÉrtékTízHatványbanVan());
        sz = new SzamNev(0, 2, "két", "kettő");
        assertEquals(false, sz.isÉrtékTízHatványbanVan());
    }
}
