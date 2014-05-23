package my.Szamnevek;

/**
 * <em>Számnevek tárolását segítő</em> osztály.
 *
 * @author Borsi Miklós Gábor
 */
public class SzamNev {

    /**
     * A legnagyobb helyi érték.
     */
    private int HelyiÉrték;

    /**
     * Tíz hatványának a kitevője.
     */
    private int ÉrtékTízHatványban;

    /**
     * A szám értéke.
     */
    private int Érték;

    /**
     * A szám neve.
     */
    private String Név;

    /**
     * A szám egyedül álló neve, ha van neki (pl.: kettő).
     */
    private String EgyedülÁllóNév;

    /**
     * Megadja, hogy a számnak van-e egyedül álló neve.
     */
    private final boolean MásAzEgyedülÁllóNév;

    /**
     * Megadja, hogy a szám értéke, egy normál érték, vagy tíz hatványának a
     * kitevőjeként van megadva.
     *
     * @see #Érték
     * @see #ÉrtékTízHatványban
     */
    private boolean ÉrtékTízHatványbanVan;

    /**
     * Inicializáló metódus.
     *
     * @param HelyiÉrték szám helyi értéke
     * @param Érték szám értéke
     * @param Név szám neve
     * @param EgyedülÁllóNév szám egyedül álló neve
     * @see #getHelyiÉrték()
     * @see #getÉrték()
     * @see #getNév()
     * @see #getEgyedülÁllóNév()
     * @see #isMásAzEgyedülÁllóNév()
     */
    private void Init(int HelyiÉrték, int Érték, String Név, String EgyedülÁllóNév) {
        this.HelyiÉrték = HelyiÉrték;
        this.Érték = Érték;
        this.Név = Név;
        this.EgyedülÁllóNév = EgyedülÁllóNév;
        this.ÉrtékTízHatványbanVan = false;
    }

    /**
     * Inicializáló metódus.
     *
     * @param kitevő hatvány kitevő értéke
     * @param Név szám neve
     * @param EgyedülÁllóNév szám egyedül álló neve
     * @see #Init(int, int, java.lang.String, java.lang.String, boolean)
     * @see #getÉrtékTízHatványban()
     * @see #isÉrtékTízHatványbanVan()
     */
    private void Init(int kitevő, String Név, String EgyedülÁllóNév) {
        Init(kitevő, kitevő, Név, EgyedülÁllóNév);
        ÉrtékTízHatványban = kitevő;
        ÉrtékTízHatványbanVan = true;
    }

    /**
     * Konstruktor.
     *
     * @param HelyiÉrték szám helyi értéke
     * @param Érték szám értéke
     * @param Név szám neve
     * @see #Init(int, int, java.lang.String, java.lang.String, boolean)
     */
    public SzamNev(int HelyiÉrték, int Érték, String Név) {
        Init(HelyiÉrték, Érték, Név, null);
        MásAzEgyedülÁllóNév = false;
    }

    /**
     * Konstruktor.
     *
     * @param HelyiÉrték szám helyi értéke
     * @param Érték szám értéke
     * @param Név szám neve
     * @param EgyedülÁllóNév szám egyedül álló neve
     * @see #Init(int, int, java.lang.String, java.lang.String, boolean)
     */
    public SzamNev(int HelyiÉrték, int Érték, String Név, String EgyedülÁllóNév) {
        Init(HelyiÉrték, Érték, Név, EgyedülÁllóNév);
        MásAzEgyedülÁllóNév = true;
    }

    /**
     * Konstruktor.
     *
     * @param Kitevő hatvány kitevő értéke
     * @param Név szám neve
     * @see #Init(int, int, java.lang.String, java.lang.String, boolean,
     * boolean)
     */
    public SzamNev(int Kitevő, String Név) {
        Init(Kitevő, Név, null);
        MásAzEgyedülÁllóNév = false;
    }

    /**
     * Visszaadja a legnagyobb helyi értéket.
     *
     * @see #HelyiÉrték
     * @return legnagyobb helyi érték
     */
    public int getHelyiÉrték() {
        return HelyiÉrték;
    }

    /**
     * Visszaadja a kitevő értékét, ami tíz hatványának kitevőjeként megadja a
     * valós értéket.
     *
     * @see #ÉrtékTízHatványban
     * @return kitevő értéke
     */
    public int getÉrtékTízHatványban() {
        return ÉrtékTízHatványban;
    }

    /**
     * Visszaadja a szám értékét.
     *
     * @see #Érték
     * @return szám értéke
     */
    public int getÉrték() {
        return Érték;
    }

    /**
     * Visszaadja a szám nevét.
     *
     * @see #Név
     * @return szám neve
     */
    public String getNév() {
        return Név;
    }

    /**
     * Visszaadja a számnak az egyedül álló nevét.
     *
     * @see #EgyedülÁllóNév
     * @return egydül alló név
     */
    public String getEgyedülÁllóNév() {
        return EgyedülÁllóNév;
    }

    /**
     * Visszaadja, hogy a számnak van-e egyedül álló neve.
     *
     * @see #MásAzEgyedülÁllóNév
     * @return
     * <ul>
     * <li>{@code true}, ha létezik egyedül álló neve,</li>
     * <li>{@code false}, egyébként.</li>
     * </ul>
     */
    public boolean isMásAzEgyedülÁllóNév() {
        return MásAzEgyedülÁllóNév;
    }

    /**
     * Visszaadja, hogy a szám értéke, egy normál érték, vagy tíz hatványának a
     * kitevőjeként van megadva.
     *
     * @see #ÉrtékTízHatványbanVan
     * @return érték tíz hatványban van-e
     * <ul>
     * <li>{@code true}, ha az érték tíz hatványában van megadva,</li>
     * <li>{@code false}, egyébként.</li>
     * </ul>
     */
    public boolean isÉrtékTízHatványbanVan() {
        return ÉrtékTízHatványbanVan;
    }
}
