package my.xml;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import my.EgeszSzamokMagyarul.Fomenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * A program minden osztályára vonatkozó metódusokat és adattagokat tartalmazó
 * osztály.
 *
 * @author Mikuci
 */
public class ProgramManager {

    /**
     * A gyakorlas egy körének ideje, másodpercben megadva.
     */
    private static int ido;

    /**
     * Ennél nagyobb számot nem generál a feladatok során.
     */
    private static int maxszam;

    /**
     * Jelzi, hogy a -dik toldalék be legyen-e kapcsolva a számok nevében.
     */
    private static boolean dik;

    /**
     * Naplózó.
     */
    private static final Logger logger;

    /**
     * XML fájlból beolvasott adatok.
     */
    private static final String[][] t = new String[2][3];

    /**
     * Felhasználó neve.
     */
    private static String userName;

    /**
     * XML feldolgozó.
     */
    private static XMLProcessor xmlProcessor;
    
    /**
     * Lekérdező metódus az aktuális felhasználó nevéhez.
     *
     * @return felhasználó néve
     */
    public static String getUserName() {
        return userName;
    }

    /**
     * Beállító metódus az aktuális felhasználó nevéhez.
     *
     * @param userName felhasználó
     */
    public static void setUserName(String userName) {
        ProgramManager.userName = userName;
    }

    /**
     * Statikus inicializáló blokk.
     *
     * @see #dik
     * @see #maxszam
     * @see #ido
     * @see #logger
     */
    static {
        ido = 15;
        maxszam = 999999999;
        dik = false;
        logger = LoggerFactory.getLogger(Fomenu.class);
    }

    /**
     * Lekérdező metódus a köridőhöz.
     *
     * @return köridő.
     * @see #dik
     */
    public static int getIdo() {
        return ido;
    }

    /**
     * Beállító metódus a köridőhöz.
     *
     * @param ido köridő
     * @see #ido
     */
    public static void setIdo(int ido) {
        ProgramManager.ido = ido;
    }

    /**
     * Lekérdező metódus a MaxSzámhoz.
     *
     * @return MaxSzám
     * @see #maxszam
     */
    public static int getMaxszam() {
        return maxszam;
    }

    /**
     * Beállító metódus a MaxSzámhoz.
     *
     * @param maxszam maxSzám
     * @see #maxszam
     */
    public static void setMaxszam(int maxszam) {
        ProgramManager.maxszam = maxszam;
    }

    /**
     * Lekérdező metódus a dik változóhoz.
     *
     * @return dik
     * @see #dik
     */
    public static boolean isDik() {
        return dik;
    }

    /**
     * Lekérdező metódus a dik változóhoz.
     *
     * @param dik dik logikai értéke
     * @see #dik
     */
    public static void setDik(boolean dik) {
        ProgramManager.dik = dik;
    }

    /**
     * Lekérdező metódus a t változóhoz.
     *
     * @param i első index
     * @param j második index
     * @return a t tömb
     * @see #t
     */
    public static String getT(int i, int j) {
        return t[i][j];
    }

    /**
     * Betölt az aktuális felhasználó beállításait, egy xml fájlból.
     */
    public static void loadConfigInXml() {
        try {
            xmlProcessor = new XMLProcessor(XMLProcessor.XMLFile.CONFIGURATION, "FőmenüBeállítások");
            ido = Integer.parseInt(xmlProcessor.loadXmlvalue("idő"));
            maxszam = Integer.parseInt(xmlProcessor.loadXmlvalue("maxszám"));
            dik = Boolean.parseBoolean(xmlProcessor.loadXmlvalue("dik"));
        } catch (TransformerException | ParserConfigurationException | SAXException | IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "A program nem tudta betölteni a \"" + getUserName() + "\" felhasználó beállításait" + "\n" + e.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            logger.error("A program nem tudta betölteni a \"" + getUserName() + "\" felhasználó beállításait");
            return;
        }catch (Exception e) {
            return;
        }
    }

    /**
     * Kimenti az aktuális felhasználó beállításait, egy xml fájlba.
     *
     * @return
     * <ul>
     * <li>{@code true}, ha a mentés sikeres,</li>
     * <li>{@code false}, egyébként.</li>
     * </ul>
     */
    public static boolean saveConfigToXml() {
        try {
            xmlProcessor = new XMLProcessor(XMLProcessor.XMLFile.CONFIGURATION, "FőmenüBeállítások");
            xmlProcessor.saveToXmlWithConfig("FőmenüBeállítások");
        } catch (TransformerException | ParserConfigurationException | SAXException | IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "A program nem tudta kimenteni a \"" + getUserName() + "\" felhasználó beállításait" + "\n" + e.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            logger.error("A program nem tudta kimenteni a \"" + getUserName() + "\" felhasználó beállításait");
            return false;
        }
        catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * Betölt minden statisztikai adatot, az aktuális felhasználóról, egy xml
     * fájlból.
     *
     * @return 
     * <ul>
     * <li>{@code true}, ha a mentés sikeres,</li>
     * <li>{@code false}, egyébként.</li>
     * </ul>
     * @see #XMLProcessor
     */
    public static boolean loadStaticsInXml() {
        boolean ok = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = "";
            }
        }

        for (int i = 0; i < 2; i++) {
            try {
                xmlProcessor = new XMLProcessor(XMLProcessor.XMLFile.STATICS, "Statisztika", "id", String.valueOf((i + 1)));
                t[i][0] = xmlProcessor.loadXmlvalueByAttribute("feladatok");
                t[i][1] = xmlProcessor.loadXmlvalueByAttribute("helyes");
                t[i][2] = xmlProcessor.loadXmlvalueByAttribute("idő");
                
                ok = true;
            } catch (ParserConfigurationException | SAXException | IOException e) {
                logger.error("A program nem tudta betölteni a \"" + userName + "\" felhasználó statisztikai adatait");
                JOptionPane.showMessageDialog(new JFrame(), "A program nem tudta betölteni a \"" + userName + "\" felhasználó statisztikai adatait" + "\n" + e.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e) {
                logger.error("A program nem tudta betölteni a \"" + userName + "\" felhasználó statisztikai adatait");
                return false;
            }
        }
        
        return ok;
    }

    /**
     * Kiment miden statisztikai adatot, az aktuális felhasználóról, egy xml
     * fájlba.
     *
     * @param jatszott elvégzett gyakorlatok száma
     * @param helyes helyes válaszok száma
     * @param id gyakorlás azonosítója
     * @return
     * <ul>
     * <li>{@code true}, ha a mentés sikeres,</li>
     * <li>{@code false}, egyébként.</li>
     * </ul>
     */
    public static boolean saveStaticsToXml(int jatszott, int helyes, int id) {
        try {
            xmlProcessor = new XMLProcessor(XMLProcessor.XMLFile.STATICS, "Statisztika");
            xmlProcessor.saveToXmlWithStatics("Statisztika", jatszott, helyes, id);
        } catch (TransformerException | ParserConfigurationException | SAXException | IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "A program nem tudta kimenteni a \"" + getUserName() + "\" felhasználó beállításait" + "\n" + e.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            logger.error("A program nem tudta kimenteni a \"" + getUserName() + "\" felhasználó beállításait");
            return false;
        }catch (Exception e) {
            return false;
        }

        return true;
    }

    /**
     * Az ablakot a képernyő közepére helyezi.
     *
     * @param window az ablak, amit a képernyő közepére helyez.
     */
    public static void MoveToScreenCenter(JFrame window) {
        Dimension dim = window.getToolkit().getScreenSize();
        int screenWidth = dim.width / 2 - (window.getWidth() / 2);
        int screenHeight = dim.height / 2 - (window.getHeight() / 2);
        window.setLocation(screenWidth, screenHeight);
        logger.debug(window.getTitle() + " ablak, a képernyő közepére helyezve");
    }

    /**
     * Meghatározza, hogy a szöveg egy számot tartaltalmaz-e.
     *
     * @param text szöveg
     * @return
     * <ul>
     * <li>{@code true}, ha a szöveg egy szám,</li>
     * <li>{@code false}, egyébként.</li>
     * </ul>
     */
    public static boolean isNumber(String text) {
        int d;
        try {
            d = Integer.parseInt(text);
        } catch (NumberFormatException e) {

            return false;
        }
        return true;
    }
    
    /**
     * A program indulásakor fut.
     *
     * @see #readXmlConfigElement()
     */
    public static void start() {
        logger.info("A program elindult");
    }

    /**
     * A felhasználó azonosítása után fut.
     *
     * @see #readXmlConfigElement()
     */
    public static void login() {
        try {
            File n = new File("conf.xml");
            if (n.exists()) {
                loadConfigInXml();
            }
            logger.debug("\"" + userName + "\" sikeresen bejelentkezett");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * A program bezárása előtt, kimenti az aktuális felhasználó beállításait.
     *
     * @param exit
     * <ul>
     * <li>{@code true}, ha kilépünk a programból,</li>
     * <li>{@code false}, ha csak kijeletkezünk.</li>
     * </ul>
     * @see #saveConfigToXml()
     */
    public static void exitOrLogout(boolean exit) {
        boolean save = saveConfigToXml();

        if (save) {
            logger.debug("\"" + getUserName() + "\" felhasználó beállításai sikeresen kimentve");
        } else {
            logger.error("A program nem tudta kimenteni a \"" + getUserName() + "\" felhasználó beállításait");
        }

        if (exit) {
            logger.info("A program leállált");
            System.exit(0);
        } else {
            logger.debug("\"" + getUserName() + "\"" + " felhasználó sikeresen kijelentkezett");
        }
    }
}
