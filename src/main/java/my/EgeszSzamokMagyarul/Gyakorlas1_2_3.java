package my.EgeszSzamokMagyarul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import my.Szamnevek.SzamNevek;
import my.xml.ProgramManager;

/**
 * Gyakorlások megvalósítását végző osztály.
 * 
 * @author Mikuci
 */
public class Gyakorlas1_2_3 extends Gyakorlas {

    /**
     * Gyakorlás sorszáma.
     */
    private final int sorszam;

    /**
     * Az aktuális feladat.
     */
    private Feladat feladat;

    /**
     * Paraméteres konstruktor.
     *
     * @param sorszám a gyakorlás sorszáma
     */
    public Gyakorlas1_2_3(int sorszám) {
        this.sorszam = sorszám;

        if (sorszam < 3) {
            feladat = new Feladat(this, sorszám);
            getjTextArea2().enable(true);
            getjButton4().hide();
        } else {
            getjTextArea1().enable(true);
            getjLabel4().hide();
            getjLabel5().hide();
            getjTextField3().hide();
            getjTextField4().hide();
            getjProgressBar1().hide();
            getjButton4().show();
        }
        
        setTitle("Gyakorlás " + sorszám);
        setjLabel2Text(sorszám == 1 || sorszám == 3 ? "A szám:" : "A szám neve:");
        setjLabel3Text(sorszám == 2 ? "A szám:" : "A szám neve:");
        
        getjButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton2ActionPerformed(e);
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void exitWindow() {
        if (sorszam < 3) {
            feladat.exit();
        }
    }

    /**
     * "Kész" gomb (jButton2) eseménye, kattintás esetén.
     * Megvizsgálja, hogy helyes-e az aktuális feladat megoldása és új feladatot ad.
     * 
     * @param evt esemény
     * @see #feladat
     * @see #sorszam
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (sorszam < 3) {
                feladat.PontSzámítás();
            } else {
                SzamNevek sz;
                if (getjTextArea1().getText() != null && !getjTextArea1().getText().equals("")) {
                    sz = new SzamNevek(getjTextArea1().getText(), ProgramManager.isDik());
                    getjTextArea2().setText(sz.getNev());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }
    }
}
