package my.EgeszSzamokMagyarul;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikuci
 */
public class FeladatTest {
    /**
     * Test of PontSzámítás method, of class Feladat.
     */
    @Test
    public void testPontSzámítás() {
        Feladat feladat = new Feladat(new Gyakorlas(), 1);
        feladat.PontSzámítás();
        int[] state = feladat.getStatus();
        feladat.PontSzámítás();
        
        boolean ok = false;
        for(int i = 0; i< state.length; i++)
            if(state[i] != feladat.getStatus()[i])
            {
                ok = true;
            }
        
        assertTrue(null, ok);
    }
    
}
