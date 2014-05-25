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

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setText("Kész");
        jButton2.setName("jButton2"); // NOI18N

        jTextField3.setEnabled(false);
        jTextField3.setName("jTextField3"); // NOI18N

        jProgressBar1.setName("jProgressBar1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("A szám:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("A szám neve:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("Pontszám:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("Idő(másodpercben):");
        jLabel5.setName("jLabel5"); // NOI18N

        jTextField4.setEnabled(false);
        jTextField4.setName("jTextField4"); // NOI18N

        jScrollPane1.setAutoscrolls(false);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setAutoscrolls(false);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setEnabled(false);
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

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
