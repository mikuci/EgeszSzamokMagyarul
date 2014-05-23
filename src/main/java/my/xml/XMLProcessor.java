package my.xml;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * XML-ek feldolgozását elvégző osztály.
 *
 * @author Mikuci
 */
public final class XMLProcessor {

    /**
     * A segítségével a felhasznált xml fájlt határozza meg a programban.
     */
    public enum XMLFile {

        /**
         * A beállításokat tartalmazó xml fájl.
         */
        CONFIGURATION,
        /**
         * A statisztikákat tartalmazó xml fájl.
         */
        STATICS
    }

    /**
     * Beállításokat tároló xml fájl neve.
     */
    private static final String configurationXMLPath = "conf.xml";

    /**
     * Statisztikákat tároló xml fájl neve.
     */
    private static final String staticsXMLPath = "stat.xml";

    /**
     * Az xmlFile típusát adja(config., statics).
     */
    private XMLFile xmlFile;

    /** 
     * A kerestt xml állománybeli elem szülője.
     */
    private String parentElementName;

    /**
     * A keresett attributum neve.
     */
    private String Attribute;

    /**
     * A keresett xml attributum értéke.
     */
    private String Value;
    
    /**
     * Paraméterrel rendelkező konstruktor.
     *
     * @param xmlFile xml típusa
     * @param parentElementName szülő elem
     * @throws javax.xml.transform.TransformerException {@inheritDoc}
     * @throws javax.xml.parsers.ParserConfigurationException {@inheritDoc}
     * @throws java.io.IOException {@inheritDoc}
     * @throws org.xml.sax.SAXException {@inheritDoc}
     * @see #xmlFile
     * @see #parentElementName
     */
    public XMLProcessor(XMLFile xmlFile, String parentElementName) throws TransformerException, ParserConfigurationException, IOException, SAXException {
        this.xmlFile = xmlFile;
        this.parentElementName = parentElementName;
        
        createDefaultXML(XMLFile.CONFIGURATION);
        createDefaultXML(XMLFile.STATICS);
    }

    /**
     * Paraméterrel rendelkező konstruktor.
     *
     * @param xmlFile yml típusa
     * @param parentElementName szülő elem
     * @param Attribute attributum neve
     * @param Value attributum értéke
     * @throws javax.xml.transform.TransformerException {@inheritDoc}
     * @throws javax.xml.parsers.ParserConfigurationException {@inheritDoc}
     * @throws org.xml.sax.SAXException {@inheritDoc}
     * @see #xmlFile
     * @see #parentElementName
     */
    public XMLProcessor(XMLFile xmlFile, String parentElementName, String Attribute, String Value) throws TransformerException, ParserConfigurationException, SAXException, IOException {
        this.Attribute = Attribute;
        this.Value = Value;
        this.xmlFile = xmlFile;
        this.parentElementName = parentElementName;
        
        createDefaultXML(XMLFile.CONFIGURATION);
        createDefaultXML(XMLFile.STATICS);
    }

    /**
     * Beolvassa a kiválasztott xml állományt és visszadja a keresett elemet.
     *
     * @param ElementsByTagName Keresett elem neve.
     * @return az adott elem
     * @throws ParserConfigurationException {@inheritDoc}
     * @throws SAXException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     * @see #xmlFile
     */
    @SuppressWarnings("empty-statement")
    private Element readXmlFile(String ElementsByTagName) throws ParserConfigurationException, SAXException, IOException {
        String fileName = "";

        if (xmlFile == XMLFile.CONFIGURATION) {
            fileName = configurationXMLPath;
        } else if (xmlFile == XMLFile.STATICS) {
            fileName = staticsXMLPath;
        }

        File fXmlFile = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName(ElementsByTagName);

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                if (eElement.getAttribute("userName").equals(ProgramManager.getUserName())) {
                    return eElement;
                }
            }
        }

        return null;
    }

    /**
     * Egy kiválasztott elemből visszadja keresett leszármazott elemet.
     *
     * @param element egy xml elem
     * @return keresett leszármazott elem
     * @see #Attribute
     * @see #Value
     */
    @SuppressWarnings("empty-statement")
    private Element readXmlElement(Element element) {
        NodeList nList = (NodeList) element;
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                if (eElement.getAttribute(Attribute).equals(Value)) {
                    return eElement;
                }
            }
        }

        return null;
    }

    /**
     * Betölti xml fájlból, egy éréket az elem neve alapján.
     *
     * @param thisElementName elem neve
     * @return elem értéke
     * @throws TransformerException {@inheritDoc}
     * @throws TransformerConfigurationException {@inheritDoc}
     * @throws ParserConfigurationException {@inheritDoc}
     * @throws SAXException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     */
    public String loadXmlvalue(String thisElementName) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, SAXException, IOException {
        Element eElement = readXmlFile(parentElementName);
        if (eElement == null) {
            if (xmlFile == XMLFile.CONFIGURATION) {
                saveToXmlWithConfig("FőmenüBeállítások");
            }
            eElement = readXmlFile(parentElementName);
        }

        return eElement.getElementsByTagName(thisElementName).item(0).getTextContent();
    }

    /**
     * Betölt egy értéket at adott xml-ből.
     *
     * @param thisElementName elem neve
     * @return a megadott elem értéke
     * @throws javax.xml.parsers.ParserConfigurationException {@inheritDoc}
     * @throws org.xml.sax.SAXException {@inheritDoc}
     * @throws java.io.IOException {@inheritDoc}
     */
    public String loadXmlvalueByAttribute(String thisElementName) throws ParserConfigurationException, SAXException, IOException {
        Element eElement = readXmlFile(parentElementName);
        eElement = readXmlElement(eElement);
        return eElement.getElementsByTagName(thisElementName).item(0).getTextContent();
    }

    /**
     * Kimenti egy xml fájlba az aktuális felhasználó beállításokat.
     *
     * @param ElementName az xml elem neve, ami tartalmazza a beállításokat
     * @throws javax.xml.transform.TransformerConfigurationException
     * {@inheritDoc}
     * @throws org.xml.sax.SAXException {@inheritDoc}
     * @throws javax.xml.parsers.ParserConfigurationException {@inheritDoc}
     * @throws java.io.IOException {@inheritDoc}
     */
    @SuppressWarnings("empty-statement")
    public void saveToXmlWithConfig(String ElementName) throws TransformerConfigurationException, TransformerException, ParserConfigurationException, SAXException, IOException {
        String fileName = configurationXMLPath;

        Boolean ok = false;
        File fXmlFile = new File(fileName);
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fXmlFile);
        doc.setXmlStandalone(true);

        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName(ElementName);

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                if (eElement.getAttribute("userName").equals(ProgramManager.getUserName())) {
                    eElement.getElementsByTagName("idő").item(0).setTextContent(Integer.toString(ProgramManager.getIdo()));
                    eElement.getElementsByTagName("maxszám").item(0).setTextContent(Integer.toString(ProgramManager.getMaxszam()));
                    eElement.getElementsByTagName("dik").item(0).setTextContent(Boolean.toString(ProgramManager.isDik()));

                    ok = true;
                }
            }
        }

        if (!ok) {
            Element rootElement = doc.getDocumentElement();
            Element staff = doc.createElement(ElementName);
            staff.setAttribute("userName", ProgramManager.getUserName());
            rootElement.appendChild(staff);

            Element elem;
            elem = doc.createElement("idő");
            elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getIdo())));
            staff.appendChild(elem);

            elem = doc.createElement("maxszám");
            elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getMaxszam())));
            staff.appendChild(elem);

            elem = doc.createElement("dik");
            elem.appendChild(doc.createTextNode(Boolean.toString(ProgramManager.isDik())));
            staff.appendChild(elem);
        }

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(fXmlFile);
        TransformerFactory.newInstance().newTransformer().transform(source, result);
    }

    /**
     * Kimenti egy xml fájlba az aktuális felhasználó statisztikáit.
     *
     * @param ElementsByTagName az xml elem neve, ami tartalmazza az aktuális
     * statisztikákat.
     * @param jatszott játszott(gyakorolt) körök száma
     * @param helyes sikeres körök száma
     * @param id gyakorlás azonosítója
     * @throws ParserConfigurationException {@inheritDoc}
     * @throws SAXException {@inheritDoc}
     * @throws IOException {@inheritDoc}
     * @throws TransformerException {@inheritDoc}
     */
    @SuppressWarnings("empty-statement")
    public void saveToXmlWithStatics(String ElementsByTagName, int jatszott, int helyes, int id) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        String fileName = staticsXMLPath;

        Boolean ok1 = false, ok2 = false;
        File fXmlFile = new File(fileName);
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fXmlFile);
        doc.setXmlStandalone(true);

        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName(ElementsByTagName);

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;
                if (eElement.getAttribute("userName").equals(ProgramManager.getUserName())) {

                    NodeList nList2 = eElement.getElementsByTagName("Gyakorlás");
                    for (int temp2 = 0; temp2 < nList2.getLength(); temp2++) {
                        Node nNode2 = nList2.item(temp2);
                        if (nNode2.getNodeType() == Node.ELEMENT_NODE) {
                            //megvan a felhasználó és az id is
                            Element eElement2 = (Element) nNode2;
                            if (eElement2.getAttribute("id").equals(String.valueOf(id))) {
                                eElement2.getElementsByTagName("feladatok").item(0).setTextContent(Integer.toString(jatszott));
                                eElement2.getElementsByTagName("helyes").item(0).setTextContent(Integer.toString(helyes));
                                eElement2.getElementsByTagName("idő").item(0).setTextContent(Integer.toString(ProgramManager.getIdo()));

                                ok1 = true;
                                ok2 = true;
                            }
                        }
                    }

                    //megvan a felhasználó, de ilyen id nincs
                    if (!ok1) {
                        Element staff2 = eElement;

                        Element staff = doc.createElement("Gyakorlás");
                        staff2.appendChild(staff);
                        Attr attr = doc.createAttribute("id");
                        attr.setValue(Integer.toString(id));
                        staff.setAttributeNode(attr);

                        Element elem;
                        elem = doc.createElement("feladatok");
                        elem.appendChild(doc.createTextNode(Integer.toString(jatszott)));
                        staff.appendChild(elem);

                        elem = doc.createElement("helyes");
                        elem.appendChild(doc.createTextNode(Integer.toString(helyes)));
                        staff.appendChild(elem);

                        elem = doc.createElement("idő");
                        elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getIdo())));
                        staff.appendChild(elem);

                        ok2 = true;
                    }
                }
            }

        }

        //nincs meg a felhasználó
        if (!ok2) {
            Element rootElement = doc.getDocumentElement();
            Element staff2 = doc.createElement(ElementsByTagName);
            staff2.setAttribute("userName", ProgramManager.getUserName());
            rootElement.appendChild(staff2);

            Element staff = doc.createElement("Gyakorlás");
            staff2.appendChild(staff);
            Attr attr = doc.createAttribute("id");
            attr.setValue(Integer.toString(id));
            staff.setAttributeNode(attr);

            Element elem;
            elem = doc.createElement("feladatok");
            elem.appendChild(doc.createTextNode(Integer.toString(jatszott)));
            staff.appendChild(elem);

            elem = doc.createElement("helyes");
            elem.appendChild(doc.createTextNode(Integer.toString(helyes)));
            staff.appendChild(elem);

            elem = doc.createElement("idő");
            elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getIdo())));
            staff.appendChild(elem);
        }

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(fXmlFile);
        TransformerFactory.newInstance().newTransformer().transform(source, result);
    }

    /**
     * Ha nem létezik az xml file, akkor létrehozza.
     */
    private static void createDefaultXML(XMLFile xml) throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException, TransformerException {
        File fXmlFile = null;

        if (xml == XMLFile.CONFIGURATION) {
            fXmlFile = new File(configurationXMLPath);
        } else if (xml == XMLFile.STATICS) {
            fXmlFile = new File(staticsXMLPath);
        }

        if (!fXmlFile.exists()) {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            doc.createDocumentFragment();
            if (xml == XMLFile.CONFIGURATION) {
                Element rootElement = doc.createElement("Beallítások");
                doc.appendChild(rootElement);
                Element staff = doc.createElement("FőmenüBeállítások");
                staff.setAttribute("userName", "default");
                rootElement.appendChild(staff);

                Element elem;
                elem = doc.createElement("idő");
                elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getIdo())));
                staff.appendChild(elem);

                elem = doc.createElement("maxszám");
                elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getMaxszam())));
                staff.appendChild(elem);

                elem = doc.createElement("dik");
                elem.appendChild(doc.createTextNode(Boolean.toString(ProgramManager.isDik())));
                staff.appendChild(elem);
            }
            if (xml == XMLFile.STATICS) {
                Element rootElement = doc.createElement("Statisztikák");
                doc.appendChild(rootElement);
                Element staff2 = doc.createElement("Statisztika");
                staff2.setAttribute("userName", "default");
                rootElement.appendChild(staff2);

                Element staff = doc.createElement("Gyakorlás");
                staff2.appendChild(staff);
                Attr attr = doc.createAttribute("id");
                attr.setValue(Integer.toString(1));
                staff.setAttributeNode(attr);

                Element elem;
                elem = doc.createElement("feladatok");
                elem.appendChild(doc.createTextNode(Integer.toString(0)));
                staff.appendChild(elem);

                elem = doc.createElement("helyes");
                elem.appendChild(doc.createTextNode(Integer.toString(0)));
                staff.appendChild(elem);

                elem = doc.createElement("idő");
                elem.appendChild(doc.createTextNode(Integer.toString(ProgramManager.getIdo())));
                staff.appendChild(elem);
            }
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(fXmlFile);
            Transformer trans = TransformerFactory.newInstance().newTransformer();
            //trans.setOutputProperty(OutputKeys.ENCODING, "UTF8");
            trans.transform(source, result);
        }
    }
}
