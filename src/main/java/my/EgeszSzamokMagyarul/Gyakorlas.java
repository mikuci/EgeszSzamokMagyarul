package my.EgeszSzamokMagyarul;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import my.xml.ProgramManager;

/**
 * Gyakorlások grafkus felületét megvalósító osztály.
 *
 * @author Borsi Miklós Gábor
 */
public class Gyakorlas extends javax.swing.JFrame {

    /**
     * Paraméter nélküli konstruktor.
     */
    public Gyakorlas() {
        initComponents();
    }

    /**
     * Ez a metódus inicializálja a form komponenseit.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");
        jLabel1.setName("jLabel1"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(565, 245));
        setMinimumSize(new java.awt.Dimension(565, 245));
        setPreferredSize(new java.awt.Dimension(575, 280));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setText("Kilépés");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 206, 114, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 204));
        jButton3.setText("Vissza a főmenübe");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setText("Kész");
        jButton2.setName("jButton2"); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 206, 254, -1));

        jTextField3.setEnabled(false);
        jTextField3.setName("jTextField3"); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 64, -1));

        jProgressBar1.setName("jProgressBar1"); // NOI18N
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 541, 22));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("A szám:");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 80, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("A szám neve:");
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 80, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("Pontszám:");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 67, 18));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("Idő(másodpercben):");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 159, 118, -1));

        jTextField4.setEnabled(false);
        jTextField4.setName("jTextField4"); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 158, 52, -1));

        jScrollPane1.setAutoscrolls(false);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 11, 460, 40));

        jScrollPane2.setAutoscrolls(false);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 79, 460, 40));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 204));
        jButton4.setText("Törlés");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 104, -1));

        getAccessibleContext().setAccessibleName("Gyakorlás");

        pack();
    }//GEN-END:initComponents

    /**
     * "Kilépés" gomb (jButton1) eseménye, kattintás esetén.
     * Menti a beállításokat és leállítja a programot.
     *
     * @param evt esemény
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitWindow();
        ProgramManager.exitOrLogout(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * "Vissza a főmenöbe" gomb (jButton3) eseménye, kattintás esetén. 
     * Bezárja a jelenlegi ablakot, és megjeliníti a főmenüt.
     *
     * @param evt esemény
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exitWindow();
        Fomenu.fomenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * "Törlés" gomb (jButton4) eseménye, kattintás esetén.
     * Törli a bevíteli mezők, tartalmát.
     * 
     * @param evt esemény
     * @see #jTextArea1
     * @see #jTextArea2
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getjTextArea1().setText(null);
        getjTextArea2().setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Kilépés a gyakolásból.
     */
    protected void exitWindow() {
    }

    /**
     * 2.címke (jLabel2) szövegét beállító metódus.
     * 
     * @param text szöveg
     * @see #jLabel2
     */
    public void setjLabel2Text(String text) {
        this.jLabel2.setText(text);
    }
    
    /**
     * 3.címke (jLabel3) szövegét beállító metódus.
     * 
     * @param text szöveg
     * @see #jLabel3
     */
    public void setjLabel3Text(String text) {
        this.jLabel3.setText(text);
    }

    /**
     * 1.beviteli mező (jTextArea1) lekérdező metódusa.
     * 
     * @return jTextArea1
     * @see #jTextArea1
     */
    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    /**
     * 2.beviteli mező (jTextArea2) lekérdező metódusa.
     * 
     * @return jTextArea2
     * @see #jTextArea2
     */
    public JTextArea getjTextArea2() {
        return jTextArea2;
    }

    /**
     * 3.beviteli mező (jTextArea3) lekérdező metódusa.
     * 
     * @return jTextField3
     * @see #jTextField3
     */
    public JTextField getjTextField3() {
        return jTextField3;
    }

    /**
     * 4.beviteli mező (jTextArea4) lekérdező metódusa.
     * 
     * @return jTextField4
     * @see #jTextField4
     */
    public JTextField getjTextField4() {
        return jTextField4;
    }

    /**
     * 4.címke (jLabel4) lekérdező metódusa.
     * 
     * @return jLabel4
     * @see #jLabel4
     */
    public JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * 5.címke (jLabel5) lekérdező metódusa.
     * 
     * @return jLabel5
     * @see #jLabel5
     */
    public JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * ProgressBar (jProgressBar1) lekérdező metódusa.
     * 
     * @return jProgressBar1 
     * @see #jProgressBar1
     */
    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    /**
     * "Kész" gomb (jButton2) lekérdező metódusa.
     * 
     * @return jButton2
     * @see #jButton2
     */
    public JButton getjButton2() {
        return jButton2;
    }

    /**
     * "Törlés" gomb (jButton4) lekérdező metódusa.
     * 
     * @return jButton4
     * @see #jButton4
     */
    public JButton getjButton4() {
        return jButton4;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * "Kilépés" gomb.
    */
    private javax.swing.JButton jButton1;
    /**
    * "Kész" gomb.
    */
    private javax.swing.JButton jButton2;
    /**
    * "Vissza a főmenübe" gomb.
    */
    private javax.swing.JButton jButton3;
    /**
    * "Törlés" gomb.
    */
    private javax.swing.JButton jButton4;
    /**
    * 1.címke.
    */
    private javax.swing.JLabel jLabel1;
    /**
    * 2.címke.
    */
    private javax.swing.JLabel jLabel2;
    /**
    * 3.címke.
    */
    private javax.swing.JLabel jLabel3;
    /**
    * 4.címke.
    */
    private javax.swing.JLabel jLabel4;
    /**
    * 5.címke.
    */
    private javax.swing.JLabel jLabel5;
    /**
    * Állapotjelző.
    */
    private javax.swing.JProgressBar jProgressBar1;
    /**
    * 1.görgetgő.
    */
    private javax.swing.JScrollPane jScrollPane1;
    /**
    * 2.görgetgő.
    */
    private javax.swing.JScrollPane jScrollPane2;
    /**
    * 1.szöveg terület.
    */
    private javax.swing.JTextArea jTextArea1;
    /**
    * 2.szöveg terület.
    */
    private javax.swing.JTextArea jTextArea2;
    /**
    * 3.szöveg terület.
    */
    private javax.swing.JTextField jTextField3;
    /**
    * 4.szöveg terület.
    */
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
