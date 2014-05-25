package my.Szamnevek;

/**
 * <em>Egész számok helyi értékekre bontását végzi el</em> ez az osztály.
 * 
 * @author Borsi Miklós Gábor
 */
public class HelyiErtek {

    /**
     * A program szextillió-ig ismeri a számok magyar nyelvű leírását.
     */
    private static final double MaxSzám;
    
    /**
     * A szám helyi értékre bontva.
     */
    private final int[] HelyiÉrtékek;
    
    /**
     * Az aktuális helyi éréken ez az utolsó nem nulla szám.
     */
    private boolean[] UtolsóASajátHelyiÉrtékén;
    
    /**
     * A szám, számjegyeinek száma.
     */
    private int size;
    
    /**
     * Az utolsó nem nulla számjegy helyi értéke.
     */
    private int UtolsóSzámHelyiÉrtéke;
    
    /**
     * Statikus inicializáló blokk.
     * 
     * @see #MaxSzám
     */
    static {
        double M = new SzamNevek().tizHatvany(37);
        MaxSzám = M * (M / 10.0);
    }
    
    /**
     * Inicializáló metódus.
     * 
     * @see #UtolsóASajátHelyiÉrtékén_fg() 
     * @see #UtolsóASajátHelyiÉrtékén
     */
    private void Init(){
    	this.UtolsóASajátHelyiÉrtékén = UtolsóASajátHelyiÉrtékén_fg();
    }
    
    /**
     * Paraméteres konstruktor.
     * 
     * @param szám valós szám
     * @see #HelyiÉrtékek
     * @see #HelyiÉrtékekreDarabolás(double)
     */
    public HelyiErtek(double szám) {
    	this.HelyiÉrtékek = HelyiÉrtékekreDarabolás(szám);
    	Init();
    }
    
    /**
     * Paraméteres konstruktor.
     * 
     * @param szám szöveg
     * @see #HelyiÉrtékek
     * @see #HelyiÉrtékekreDarabolás(java.lang.String) 
     */
    public HelyiErtek(String szám) {
    	this.HelyiÉrtékek = HelyiÉrtékekreDarabolás(szám);
    	Init();
    }
    
    /**
     * Paraméteres konstruktor.
     * 
     * @param szám egész szám
     * @see #HelyiÉrtékek
     * @see #HelyiÉrtékekreDarabolás(double)
     */
    public HelyiErtek(int szám) {
    	this.HelyiÉrtékek = HelyiÉrtékekreDarabolás((double)szám);
    	Init();
    }

    /**
     * A számot helyi értékekre bontja.
     * 
     * @param szám egész szám, valós típusban
     * @return szám helyi értékre bontva
     * @see #size
     * @see #MaxSzám
     * @see #UtolsóASajátHelyiÉrtékén
     * @see #UtolsóSzámHelyiÉrtéke
     */
    private int[] HelyiÉrtékekreDarabolás(double szám){
        double max_osztó = 1.0;
        int db = 1, h;
        int[] out = null;
        double sz = szám;
        
        try{
            size = 0;
            UtolsóSzámHelyiÉrtéke = 0;

            if(szám == 0.0)
            {
                out = new int[1];
                out[0] = 0;
                UtolsóASajátHelyiÉrtékén = new boolean[1];
                UtolsóASajátHelyiÉrtékén[0] = true;
                return out;
            }

            for(double i = 1.0; i <= MaxSzám; i *= 10){
                if(((int)sz / (int)i) == 0){
                    max_osztó = (int)((int)i / (int)10.0);
                    db--;
                    break;
                }
                else if(i > MaxSzám / 10)
                {
                    max_osztó = MaxSzám;
                    break;
                }
                db++;
            }

            out = new int[db--];
            size = db;

            for(double i = max_osztó; i >= 1.0; i = (i) / 10.0)
            {
                h = (int)((int)sz / (int)i);
                if(h != 0.0)
                    UtolsóSzámHelyiÉrtéke = db;
                out[db--] = h;
                sz = (int)((int)sz % (int)i);
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return out;
    }
    
    /**
     * A számot, amelyet szöveges típusban kap, helyi értékekre bontja.
     * 
     * @param szám egész szám, szöveges típusban
     * @return szám helyi értékre bontva 
     * 
     * @see #size
     * @see #UtolsóSzámHelyiÉrtéke 
     */
    private int[] HelyiÉrtékekreDarabolás(String szám){
        int db = szám.length() - 1;
        int[] out = null;
        
        try{
            UtolsóSzámHelyiÉrtéke = 0;
            out = new int[szám.length()];
            size = db;
            
            for(int i = 0; i < szám.length(); i++)
            {
                char c = szám.toCharArray()[i];
                String S = String.valueOf(c);
                int h = Integer.parseInt(S);

                if(h != 0)
                    UtolsóSzámHelyiÉrtéke = db;
                out[db--] = h;
            }

        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        return out;
    }
    
    /**
     * Eldönti, hogy egyes helyi érékeken hol van az utolsó nem nulla szám.
     * 
     * @return aktuális helyi éréken ez az utolsó nem nulla szám (tömbben)
     * @see #size
     * @see #HelyiÉrtékek 
     */
    private boolean[] UtolsóASajátHelyiÉrtékén_fg(){
    	boolean[] out = null;
        try{
            if(size == 0)
            {
                out = new boolean[1];
                out[0] = true;
                return out;
            }

            out = new boolean[size+1];

            for(int i = 0; i <= size; i++)
                out[i] = false;

            for(int i = 3; i <= size; i+=3)
            {
                for(int j = i; j < i+3; j++)
                    if(HelyiÉrtékek[j] != 0)
                    {
                        out[j] = true;
                        break;
                    }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return out;
    }
    
    /**
     * Visszaadja a számot helyi értékre bontva egy tömbben.
     * 
     * @see #HelyiÉrtékek
     * @return egész szám helyi értékre bontva
     */
    public int[] getHelyiÉrtékek() {
        return HelyiÉrtékek;
    }

    /**
     * Visszaadja a szám, számjegyeinek számát.
     * 
     * @see #size
     * @return szám, számjegyeinek száma
     */
    public int getlength() {
        return size;
    }
    
    /**
     * Visszaadja, az utolsó nem nulla számjegy helyi értékét.
     * 
     * @see #UtolsóSzámHelyiÉrtéke
     * @return utolsó nem nulla számjegy helyi értéke
     */
    public int getUtolsóSzámHelyiÉrtéke() {
        return UtolsóSzámHelyiÉrtéke;
    }

    /**
     * Visszaadja, hogy melyek az aktuális helyi éréken az utolsó nem nulla szám.
     * 
     * @see #UtolsóASajátHelyiÉrtékén
     * @return aktuális helyi éréken az utolsó nem nulla szám
     */
    public boolean[] getUtolsóASajátHelyiÉrtékén() {
        return UtolsóASajátHelyiÉrtékén;
    }

    /**
     * Visszaadja, azt a számot, aminél nagyobb számnak a program már, nem ismeri a magyar nyelvű leírását.
     * 
     * @see #MaxSzám
     * @return legnagyobb szám, amelynek a program ismeri a magyar nyelvű leírását
     */
    public static double getMaxSzám() {
        return MaxSzám;
    }
}