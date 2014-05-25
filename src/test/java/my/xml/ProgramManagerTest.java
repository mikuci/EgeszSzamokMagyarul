package my.xml;

import java.awt.Dimension;
import javax.swing.JFrame;
import my.EgeszSzamokMagyarul.Bejelentkezes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikuci
 */
public class ProgramManagerTest {

    /**
     * Test of getUserName method, of class ProgramManager.
     */
    @Test
    public void testGetUserName() {
        String expResult = "default";
        ProgramManager.setUserName(expResult);
        String result = ProgramManager.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserName method, of class ProgramManager.
     */
    @Test
    public void testSetUserName() {
        String expResult = "def";
        ProgramManager.setUserName(expResult);
        String result = ProgramManager.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdo method, of class ProgramManager.
     */
    @Test
    public void testGetIdo() {
        int expResult = 3;
        ProgramManager.setIdo(expResult);
        int result = ProgramManager.getIdo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdo method, of class ProgramManager.
     */
    @Test
    public void testSetIdo() {
        int expResult = 33;
        ProgramManager.setIdo(expResult);
        int result = ProgramManager.getIdo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxszam method, of class ProgramManager.
     */
    @Test
    public void testGetMaxszam() {
        int expResult = 3;
        ProgramManager.setMaxszam(expResult);
        int result = ProgramManager.getMaxszam();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxszam method, of class ProgramManager.
     */
    @Test
    public void testSetMaxszam() {
        int expResult = 55;
        ProgramManager.setMaxszam(expResult);
        int result = ProgramManager.getMaxszam();
        assertEquals(expResult, result);
    }

    /**
     * Test of isNumber method, of class ProgramManager.
     */
    @Test
    public void testIsNumber() {
        String text = "78";
        boolean expResult = true;
        boolean result = ProgramManager.isNumber(text);
        assertEquals(expResult, result);
        
        text = "gh";
        expResult = false;
        result = ProgramManager.isNumber(text);
        assertEquals(expResult, result);
    }   
}