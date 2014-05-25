package my.EgeszSzamokMagyarul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import my.Szamnevek.SzamNevek;
import my.xml.ProgramManager;

/**
 * Feladatokat generáló osztály.
 * 
 * @author Mikuci
 */
public class Feladat {

    /**
     * Gyakorlás.
     */
    Gyakorlas gyakorlas;

    /**
     * Időzitő.
     */
    private Timer timer;

    /**
     * Aktuális számnév.
     */
    private SzamNevek SzNév;

    /**
     * Véletlen szám generálásához kell.
     */
    private final Random rand;

    /**
     * Véletlen szám.
     */
    private String szám;

    /**
     * Az időzitő számlálója.
     */
    private int számláló;

    /**
     * Elkezdett feladatok száma.
     */
    private int jatszott;

    /**
     * Helyes válaszok száma.
     */
    private int helyes;

    /**
     * Gyakorlás sorszáma.
     */
    private final int sorszam;

    /**
     * Visszadja a szám, jatszott, helyes paraméterek értékét egy tömbben.
     * 
     * @return szám, jatszott, helyes paraméterek értéke
     * @see #szám
     * @see #jatszott
     * @see #helyes
     */
    public int[] getStatus()
    {
        int[] t = new int[3];
        t[0] = Integer.parseInt(szám);
        t[1] = jatszott;
        t[2] = helyes;
        
        return t;
    }
    
    /**
     * Paraméteres konstruktor.
     * 
     * @param gyakorlas Gyakorlás
     * @param sorszam Gyakorlás típusának száma
     */
    public Feladat(final Gyakorlas gyakorlas, int sorszam) {
        this.gyakorlas = gyakorlas;
        this.sorszam = sorszam;

        jatszott = helyes = 0;
        rand = new Random(new Date().getTime());
        ÚjSzám();

        if (timer != null) {
            if (timer.isRunning()) {
                timer.stop();
            }
        }

        számláló = ProgramManager.getIdo();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (számláló > 0) {
                    számláló--;

                    gyakorlas.getjTextField4().setText(Integer.toString(számláló));
                } else {
                    try {
                        PontSzámítás();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        timer.start();
    }

    /**
     * Új véletlenszámot generál.
     */
    private void ÚjSzám() {
        int x = rand.nextInt(ProgramManager.getMaxszam());
        boolean negativ = rand.nextInt(100) == 50;
        if (rand.nextBoolean() && negativ) {
            x *= -1;
        }

        szám = Integer.toString(x);
        SzNév = new SzamNevek(szám, ProgramManager.isDik());

        String text;
        if (sorszam == 1) {
            text = szám;
        } else {
            text = SzNév.getNev();
        }

        gyakorlas.getjTextArea1().setText(text);
    }

    /**
     * Ellenőrzi az eredmény helyességét, és új feladatot generál.
     */
    public void PontSzámítás() {
        int val;
        jatszott++;
        if (SzNév.getNev().equals(gyakorlas.getjTextArea2().getText()) && sorszam == 1) {
            helyes++;
        } else if (szám.equals(gyakorlas.getjTextArea2().getText()) && sorszam == 2) {
            helyes++;
        }

        if (helyes != 0) {
            val = (int) ((double) helyes / ((double) jatszott / 100.0));
        } else {
            val = 0;
        }

        gyakorlas.getjProgressBar1().setValue(val);
        gyakorlas.getjTextField3().setText(jatszott + " / " + helyes);

        gyakorlas.getjTextArea2().setText(null);
        ÚjSzám();
        számláló = ProgramManager.getIdo();
    }

    /**
     * Kilépés.
     */
    public void exit() {
        ProgramManager.saveStaticsToXml(jatszott, helyes, sorszam);
    }
}
