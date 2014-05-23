package my.Szamnevek;

import org.junit.*;
import static org.junit.Assert.*;

public class HelyiErtekTest {

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

    private void assertArrayEqualsBool(boolean[] A, boolean[] B) {
        int n = Math.min(A.length, B.length);
        for(int i = 0; i < n; i++)
            assertEquals(A[i], B[i]);
    }

    /**
     * "getHelyiÉrtékek" metódus tesztelése. 
     */
    @Test
    public void testGetHelyiÉrtékek() {
        HelyiErtek H;
        H = new HelyiErtek(5000);
        assertArrayEquals(new int[]{ 0, 0, 0, 5 }, H.getHelyiÉrtékek());
        H = new HelyiErtek(333);
        assertArrayEquals(new int[]{ 3, 3, 3 }, H.getHelyiÉrtékek());
        H = new HelyiErtek(543);
        assertArrayEquals(new int[]{ 3, 4, 5 }, H.getHelyiÉrtékek());
        H = new HelyiErtek("5000");
        assertArrayEquals(new int[]{ 0, 0, 0, 5 }, H.getHelyiÉrtékek());
        H = new HelyiErtek("333");
        assertArrayEquals(new int[]{ 3, 3, 3 }, H.getHelyiÉrtékek());
        H = new HelyiErtek("543");
        assertArrayEquals(new int[]{ 3, 4, 5 }, H.getHelyiÉrtékek());
    }

    /**
     * "getlength" metódus tesztelése. 
     */
    @Test
    public void testGetlength() {
        HelyiErtek H;
        H = new HelyiErtek(5000);
        assertEquals(3, H.getlength());
        H = new HelyiErtek(333);
        assertEquals(2, H.getlength());
        H = new HelyiErtek(543);
        assertEquals(2, H.getlength());
        H = new HelyiErtek("5000");
        assertEquals(3, H.getlength());
        H = new HelyiErtek("333");
        assertEquals(2, H.getlength());
        H = new HelyiErtek("543");
        assertEquals(2, H.getlength());
    }

    /**
     * "getUtolsóSzámHelyiÉrtéke" metódus tesztelése. 
     */
    @Test
    public void testGetUtolsóSzámHelyiÉrtéke() {
        HelyiErtek H;
        H = new HelyiErtek(5000);
        assertEquals(3, H.getUtolsóSzámHelyiÉrtéke());
        H = new HelyiErtek(333);
        assertEquals(0, H.getUtolsóSzámHelyiÉrtéke());
        H = new HelyiErtek(543);
        assertEquals(0, H.getUtolsóSzámHelyiÉrtéke());
        H = new HelyiErtek("5000");
        assertEquals(3, H.getUtolsóSzámHelyiÉrtéke());
        H = new HelyiErtek("333");
        assertEquals(0, H.getUtolsóSzámHelyiÉrtéke());
        H = new HelyiErtek("543");
        assertEquals(0, H.getUtolsóSzámHelyiÉrtéke());
    }

    /**
     * "getUtolsóASajátHelyiÉrtékén" metódus tesztelése. 
     */
    @Test
    public void testGetUtolsóASajátHelyiÉrtékén() {
        HelyiErtek H;
        H = new HelyiErtek(5000);
        assertArrayEqualsBool(new boolean[]{false, false, false, true}, H.getUtolsóASajátHelyiÉrtékén());
        H = new HelyiErtek(333);
        assertArrayEqualsBool(new boolean[]{false, false, false}, H.getUtolsóASajátHelyiÉrtékén());
        H = new HelyiErtek(543);
        assertArrayEqualsBool(new boolean[]{false, false, false}, H.getUtolsóASajátHelyiÉrtékén());
        H = new HelyiErtek("5000");
        assertArrayEqualsBool(new boolean[]{false, false, false, true}, H.getUtolsóASajátHelyiÉrtékén());
        H = new HelyiErtek("333");
        assertArrayEqualsBool(new boolean[]{false, false, false}, H.getUtolsóASajátHelyiÉrtékén());
        H = new HelyiErtek("543");
        assertArrayEqualsBool(new boolean[]{false, false, false}, H.getUtolsóASajátHelyiÉrtékén());
    }

    /**
     * "getMaxSzám" metódus tesztelése. 
     */
    @Test
    public void testGetMaxSzám() {
        assertNotNull(HelyiErtek.getMaxSzám());
    }

}