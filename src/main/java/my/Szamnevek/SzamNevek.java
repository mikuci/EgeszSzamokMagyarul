package my.Szamnevek;

/**
 * <em>Egész számok magyar nyelvű leírását megvalósító</em> osztály.
 * 
 * @author Borsi Miklós Gábor
 * 
 * <p>Példa az osztály tipikus használatára:
 * <pre>
	public static void main(String[] args) {
    	SzamNevek sz;
    	
        for(int i = -100; i <= 100; i++){
            sz = new SzamNevek(i, false);
            System.out.println(sz.getNév());
        }
    }
 </pre>
 */
public class SzamNevek {
    
    /**
     * Az egész számok magyar nyelvű leírását tartalmazó tömb.
     */
    private static SzamNev[] szamnevek; 
    
    /**
     * Az egész számok magyar nyelvű leírását tartalmazó tömb, ami -dik toldalékkal van kiegészítve.
     */
    private static SzamNev[] szamnevek_dik;
    
    /**
     * A szám neve. 
     */
    private String nev;
    
    /**
     * Helyiérték. 
     */
    private HelyiErtek helyiErtek;
    
    /**
     * Az egész számok magyar neveit definiáló, statikus inicialicáló blokkban.
     * 
     * @see <a href="http://mek.oszk.hu/00000/00056/html/186.htm">Nagy számok</a>
     * @see <a href="http://hu.wikipedia.org/wiki/T%C3%ADz_hatv%C3%A1nyai">Tíz hatványai</a>
     */
    static {
        szamnevek = new SzamNev[32];
        szamnevek[0] = new SzamNev(0, 0, "nulla");
        szamnevek[1] = new SzamNev(0, 1, "egy");
        szamnevek[2] = new SzamNev(0, 2, "két", "kettő");
        szamnevek[3] = new SzamNev(0, 3, "három");
        szamnevek[4] = new SzamNev(0, 4, "négy");
        szamnevek[5] = new SzamNev(0, 5, "öt");
        szamnevek[6] = new SzamNev(0, 6, "hat");
        szamnevek[7] = new SzamNev(0, 7, "hét");
        szamnevek[8] = new SzamNev(0, 8, "nyolc");
        szamnevek[9] = new SzamNev(0, 9, "kilenc");
        szamnevek[10] = new SzamNev(1, 10, "tízen", "tíz");
        szamnevek[11] = new SzamNev(1, 20, "húszon", "húsz");
        szamnevek[12] = new SzamNev(1, 30, "harminc");
        szamnevek[13] = new SzamNev(1, 40, "negyven");
        szamnevek[14] = new SzamNev(1, 50, "ötven");
        szamnevek[15] = new SzamNev(1, 60, "hatvan");
        szamnevek[16] = new SzamNev(1, 70, "hetven");
        szamnevek[17] = new SzamNev(1, 80, "nyolcvan");
        szamnevek[18] = new SzamNev(1, 90, "kilencven");
        szamnevek[19] = new SzamNev(2, 100, "száz");
        szamnevek[20] = new SzamNev(3, 1000, "ezer");
        szamnevek[21] =  new SzamNev(6, "millió");
        szamnevek[22] =  new SzamNev(9, "milliárd");
        szamnevek[23] = new SzamNev(12, "billió");
        szamnevek[24] = new SzamNev(15, "billiárd");
        szamnevek[25] = new SzamNev(18, "trillió");
        szamnevek[26] = new SzamNev(21, "trilliárd");
        szamnevek[27] = new SzamNev(24, "kvadrillió");
        szamnevek[28] = new SzamNev(27, "kvadrilliárd");
        szamnevek[29] = new SzamNev(30, "kvintillió");
        szamnevek[30] = new SzamNev(33, "kvintilliárd");
        szamnevek[31] = new SzamNev(36, "szextillió");
        
        szamnevek_dik = new SzamNev[32];
        szamnevek_dik[0] = new SzamNev(0, 0, "nulladik");
        szamnevek_dik[1] = new SzamNev(0, 1, "egyedik");
        szamnevek_dik[2] = new SzamNev(0, 2, "kettedik");
        szamnevek_dik[3] = new SzamNev(0, 3, "harmadik");
        szamnevek_dik[4] = new SzamNev(0, 4, "negyedik");
        szamnevek_dik[5] = new SzamNev(0, 5, "ötödik");
        szamnevek_dik[6] = new SzamNev(0, 6, "hatodik");
        szamnevek_dik[7] = new SzamNev(0, 7, "hétedik");
        szamnevek_dik[8] = new SzamNev(0, 8, "nyolcadik");
        szamnevek_dik[9] = new SzamNev(0, 9, "kilencedik");
        szamnevek_dik[10] = new SzamNev(1, 10, "tízedik");
        szamnevek_dik[11] = new SzamNev(1, 20, "húszadik");
        szamnevek_dik[12] = new SzamNev(1, 30, "harmincadik");
        szamnevek_dik[13] = new SzamNev(1, 40, "negyvenedik");
        szamnevek_dik[14] = new SzamNev(1, 50, "ötvenedik");
        szamnevek_dik[15] = new SzamNev(1, 60, "hatvanadik");
        szamnevek_dik[16] = new SzamNev(1, 70, "hetvenedik");
        szamnevek_dik[17] = new SzamNev(1, 80, "nyolcvanadik");
        szamnevek_dik[18] = new SzamNev(1, 90, "kilencvenedik");
        szamnevek_dik[19] = new SzamNev(2, 100, "századik");
        szamnevek_dik[20] = new SzamNev(3, 1000, "ezeredik");
        szamnevek_dik[21] =  new SzamNev(6, "milliómodik");
        szamnevek_dik[22] =  new SzamNev(9, "milliárdomodik");
        szamnevek_dik[23] = new SzamNev(12, "billiómodik");
        szamnevek_dik[24] = new SzamNev(15, "billiárdomodik");
        szamnevek_dik[25] = new SzamNev(18, "trilliómodik");
        szamnevek_dik[26] = new SzamNev(21, "trilliárdomodik");
        szamnevek_dik[27] = new SzamNev(24, "kvadrilliómodik");
        szamnevek_dik[28] = new SzamNev(27, "kvadrilliárdomodik");
        szamnevek_dik[29] = new SzamNev(30, "kvintilliómodik");
        szamnevek_dik[30] = new SzamNev(33, "kvintilliárdomodik");
        szamnevek_dik[31] = new SzamNev(36, "szextilliómodik");
    }

    /**
     * Paraméter nélküli konstruktor.
     */
    public SzamNevek() {
    }
    
    /**
     * Ellenőrzi, hogy mínusz számról van-e szó, és előkészíti a számot <code>EgészSzámToSztring</code> metódus számára, 
     * -dik toldalékot nem helyez a szám végére.
     * 
     * @param szám szöveges típus
     * @param dik 
     * <ul>
	 *     <li>{@code "mínusz " + egész számok magyar nyelvű leírása}, ha a szám kisebb, mint nulla,</li>
	 *     <li>{@code egész számok magyar nyelvű leírása}, egyébként.</li>
     * </ul>
     * {@link #egeszSzamToSztring(java.lang.String, boolean)} 
     */
    public SzamNevek(String szám, boolean dik){
        nev = egeszSzamToSztring(szám, dik);
    }
    
    /**
     * Ellenőrzi, hogy mínusz számról van-e szó, és előkészíti a számot <code>EgészSzámToSztring</code> metódus számára, 
     * -dik toldalékot nem helyez a szám végére.
     * 
     * @param szám valós típus 
     * @param dik 
     * <ul>
	 *     <li>{@code "mínusz " + egész számok magyar nyelvű leírása}, ha a szám kisebb, mint nulla,</li>
	 *     <li>{@code egész számok magyar nyelvű leírása}, egyébként.</li>
	 * </ul>
         * @see #egeszSzamToSztring(double, boolean) 
     */
    public SzamNevek(double szám, boolean dik){
        nev = egeszSzamToSztring(szám, dik);
    }
    
    /**
     * Ellenőrzi, hogy mínusz számról van-e szó, és előkészíti a számot <code>EgészSzámToSztring</code> metódus számára, 
     * -dik toldalékot nem helyez a szám végére.
     * 
     * @param szám egész típus 
     * @param dik 
     * <ul>
	 *     <li>{@code "mínusz " + egész számok magyar nyelvű leírása}, ha a szám kisebb, mint nulla,</li>
	 *     <li>{@code egész számok magyar nyelvű leírása}, egyébként.</li>
	 * </ul>
         * @see #egeszSzamToSztring(double, boolean) 
     */
    public SzamNevek(int szám, boolean dik){
        nev = egeszSzamToSztring((double)szám, dik);
    }
    
    /**
     * Visszadja az egész számok magyar nyelvű leírását tartalmazó tömböt.
     * 
     * @return egész számok magyar nyelvű leírását tartalmazó tömb
     * @see #szamnevek
     */
    public static SzamNev[] getSzamnevek() {
        return szamnevek;
    }

    /**
     * Visszadja az egész számok magyar nyelvű leírását tartalmazó tömböt, ami -dik toldalékkal van kiegészítve.
     * 
     * @return egész számok magyar nyelvű leírását tartalmazó tömb, ami -dik toldalékkal van kiegészítve
     * @link #számnevek_dik
     */
    public static SzamNev[] getSzamnevek_dik() {
        return szamnevek_dik;
    }
    
    /**
     * Visszadja a szám nevét magyarul. 
     * 
     * @return a szám neve
     */
    public String getNev(){
    	return nev;
    }
    
    /**
	 * Tíz k-ik hatványát állítja elő.
	 * 
	 * @param k egész típus, a hatványkitevő
	 * @return tíz a k-ikon hatvány értéke
	 */
    public double tizHatvany(int k)
    {
        double a = 1.0;
        
        try{
            if(k > 0)
            for(int i = 0; i < k; i++)
                a *= 10.0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return a;
    }
    
    /**
	 * Egy adott helyi érteken lévő, egész szám, magyar nyelvű nevét adja vissza.
	 * 
     * @param HelyiÉrték szám HelyiÉrtéke
     * @param Érték egész típus
     * @param EgyedűlÁllóNév igaz lehet például a kettes szám esetén
     * <ul>
	 *     <li>{@code "kettő"}, ha pédául a helyi értéke 0,</li>
	 *     <li>{@code "kétezer"}, ha azonban értéke 3.</li>
	 * </ul>
     * @param t SzamNev típusú tömb, melyben megtalálhatóak a számok magyar nyelvű leírása
     * @return
     * <ul>
     *     <li>{@code az egész szám neve az adott HelyiÉrtéken}, ha megtalálja az aktuális számot,</li>
     *     <li>{@code "ismeretlen szám"}, egyébként.</li>
     * </ul>
     */
    private String kereso(int HelyiÉrték, double Érték, boolean EgyedűlÁllóNév, SzamNev[] t){
        try{
            for (SzamNev t1 : t) {
                if (t1.getÉrték() == Érték && t1.getHelyiÉrték() == HelyiÉrték) {
                    if (t1.isMásAzEgyedülÁllóNév() && EgyedűlÁllóNév) {
                        return t1.getEgyedülÁllóNév();
                    }
                    return t1.getNév();
                } else if ((t1.getÉrtékTízHatványban() == Érték && t1.isÉrtékTízHatványbanVan()) && t1.getHelyiÉrték() == HelyiÉrték) {
                    if (t1.isMásAzEgyedülÁllóNév() && EgyedűlÁllóNév) {
                        return t1.getEgyedülÁllóNév();
                    }
                    return t1.getNév();
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "imeretlen_szám";
    }
    
    /**
     * Azonos helyi értéken lévő egész számok magyar nyelvű nevét adja vissza.
     * 
     * @param HelyiÉrték szám HelyiÉrtéke
     * @param Érték egész szám
     * @param UtolsóASajátHelyiÉrtékén logikai igazság érték, amely 
     * <ul>
	 *     <li>{@code true}, ha ezen a HelyiÉrtéken, ez az utolsó nem nulla szám,</li>
	 *     <li>{@code false}, egyébként.</li>
	 * </ul>
     * @param UtolsóSzám logikai igazság érték, amely 
     * <ul>
	 *     <li>{@code true}, ha ez az utolsó nem nulla számjegy,</li>
	 *     <li>{@code false}, egyébként.</li>
	 * </ul>
     * @param t SzamNev típusú tömb, melyben megtalálhatóak a számok magyar nyelvű leírása
     * @param t2 SzamNev típusú tömb, melyben megtalálhatóak a számok magyar nyelvű leírása, ami -dik toldalékkal van kiegészítve
     * @param dik  logikai igazság érték, amely 
     * <ul>
     *     <li>{@code true}, ha kell -dik toldalék a szám végére,</li>
     *     <li>{@code false}, egyébként.</li>
     * </ul>
     * @return azonos helyi értéken lévő egész számok magyar nyelvű neve
     * @see #Kereső(int, double, boolean, my.EgészSzámokMagyarul.SzámNév[]) 
     */
    private String neve(int HelyiÉrték, int Érték, boolean UtolsóASajátHelyiÉrtékén, boolean UtolsóSzám, SzamNev[] t, SzamNev[] t2, boolean dik){
        StringBuilder sb = new StringBuilder();
        double VÉrték;
        
        try{
            if(HelyiÉrték > 3)
                VÉrték = HelyiÉrték;
            else
                VÉrték = tizHatvany(HelyiÉrték);

            if(Érték == 0 && !UtolsóSzám)
                return "";

            if(HelyiÉrték < 2)
            {
                if(UtolsóSzám || Érték != 0)
                {
                    if(dik && UtolsóSzám)
                        sb.append(kereso(HelyiÉrték, VÉrték * Érték, UtolsóSzám, t2));
                    else
                        sb.append(kereso(HelyiÉrték, VÉrték * Érték, UtolsóSzám, t));
                }
            }
            else if(HelyiÉrték >= 2)
            {
                if(HelyiÉrték % 3 == 0 || HelyiÉrték == 2){
                    if(Érték > 0)
                        sb.append(kereso(0, Érték, false, t));
                    if(dik && UtolsóSzám)
                        sb.append(kereso(HelyiÉrték, VÉrték, UtolsóSzám, t2));
                    else sb.append(kereso(HelyiÉrték, VÉrték, UtolsóSzám, t));

                    if(HelyiÉrték > 3 && Érték > 0 && HelyiÉrték % 3 == 0 && !UtolsóSzám)
                        sb.append("-");
                    else if(HelyiÉrték == 3 && Érték > 1 && !UtolsóSzám)
                        sb.append("-");
                }
                else
                {
                    int marad = HelyiÉrték % 3, mehet = HelyiÉrték - marad;
                    sb.append(neve(marad, Érték, UtolsóASajátHelyiÉrtékén, false, t, t2, false));
                    if(UtolsóASajátHelyiÉrtékén){
                        sb.append(neve(mehet, 1, UtolsóASajátHelyiÉrtékén, UtolsóSzám, t, t2, dik));
                        sb.append("-");
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }
        
    /**
     * Egy egész szám magyar nyelvű leírását adja vissza.
     * 
     * @param dik logikai igazság érték, amely 
     * <ul>
	 *     <li>{@code true}, ha kell a szám végére a -dik toldalék,</li>
	 *     <li>{@code false}, egyébként.</li>
	 * </ul>
     * @return egész számok magyar nyelvű leírása
     * @see #Neve(int, int, boolean, boolean, my.EgészSzámokMagyarul.SzámNév[], my.EgészSzámokMagyarul.SzámNév[], boolean) 
     * @see #getSzamnevek()
     * @see #getSzamnevek_dik() 
     */
    private String egeszSzamToSztring(boolean dik) {
		StringBuilder szöveg = new StringBuilder();
                boolean Utolsó = false;
		
                int[] helyiértékek = helyiErtek.getHelyiÉrtékek();
                boolean[] UtolsóA = helyiErtek.getUtolsóASajátHelyiÉrtékén();
                
		for(int i = helyiErtek.getlength(); i >= helyiErtek.getUtolsóSzámHelyiÉrtéke(); i--)
                {
                    if(i == helyiErtek.getUtolsóSzámHelyiÉrtéke())
                        Utolsó = true;
                    
                    String ss = neve(i, helyiértékek[i], UtolsóA[i], Utolsó, szamnevek, szamnevek_dik, dik);
                    szöveg.append(ss);
                }
		
		return szöveg.toString();
	}
    
    /**
     * Ellenőrzi, hogy mínusz számról van-e szó, és előkészíti a számot <code>EgészSzámToSztring</code> metódus számára.
     * 
     * @param szám valós típus
     * @param dik logikai igazság érték, amely 
     * <ul>
	 *     <li>{@code true}, ha kell a szám végére a -dik toldalék,</li>
	 *     <li>{@code false}, egyébként.</li>
	 * </ul>
     * @return 
     * <ul>
     *     <li>{@code "mínusz " + egész számok magyar nyelvű leírása}, ha a szám kisebb, mint nulla,</li>
     *     <li>{@code egész számok magyar nyelvű leírása}, egyébként.</li>
     * </ul>
     * @see #egeszSzamToSztring(boolean) 
     */
    private String egeszSzamToSztring(double szám, boolean dik) {
    	StringBuilder szöveg = new StringBuilder();
                
        if(szám < 0.0){
            szöveg.append("mínusz ");
            szám *= -1.0;
        }
		
        helyiErtek = new HelyiErtek(szám);
        return szöveg.toString() + egeszSzamToSztring(dik);
    }
	
    /**
     * Ellenőrzi, hogy mínusz számról van-e szó, és előkészíti a számot <code>EgészSzámToSztring</code> metódus számára.
     * 
     * @param szám szöveg típus
     * @param dik logikai igazság érték, amely 
     * <ul>
	 *     <li>{@code true}, ha kell a szám végére a -dik toldalék,</li>
	 *     <li>{@code false}, egyébként.</li>
	 * </ul>
     * @return 
     * <ul>
	 *     <li>{@code "mínusz " + egész számok magyar nyelvű leírása}, ha a szám kisebb, mint nulla,</li>
	 *     <li>{@code egész számok magyar nyelvű leírása}, egyébként.</li>
	 * </ul>
         * @see #egeszSzamToSztring(boolean) 
     */
    private String egeszSzamToSztring(String szám, boolean dik) {
		StringBuilder szöveg = new StringBuilder();
		String s = "";
                
		if(szám.toCharArray()[0] == '-'){
                    szöveg.append("mínusz ");
                    for(int i = 1; i < szám.length(); i++)
                        s += szám.toCharArray()[i];
                    szám = s;
                }
		
		helyiErtek = new HelyiErtek(szám);
        return szöveg.toString() + egeszSzamToSztring(dik);
	}
}