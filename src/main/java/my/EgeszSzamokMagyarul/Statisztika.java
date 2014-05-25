package my.EgeszSzamokMagyarul;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import my.xml.ProgramManager;
import static my.xml.ProgramManager.getUserName;

/**
 * Statisztika.
 *
 * @author Borsi Miklós Gábor
 */
public class Statisztika extends javax.swing.JFrame {

    /**
     * Paraméter nélküli konstruktor.
     */
    public Statisztika() {
        initComponents();
    }

    /**
     * Ez a metódus inicializálja a form komponenseit.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_A1 = new javax.swing.JLabel();
        jLabel_A2 = new javax.swing.JLabel();
        jLabel_A3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_B1 = new javax.swing.JLabel();
        jLabel_B2 = new javax.swing.JLabel();
        jLabel_B3 = new javax.swing.JLabel();
        jLoadStaticsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statisztika");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Gyakorlás 1");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Elvégzett feladatok: ");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Helyes megoldások:");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Idő a feladat megoldására:");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel_A1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel_A1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel_A1.setText("0");
        jLabel_A1.setName("jLabel_A1"); // NOI18N

        jLabel_A2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel_A2.setForeground(new java.awt.Color(255, 51, 153));
        jLabel_A2.setText("0");
        jLabel_A2.setName("jLabel_A2"); // NOI18N

        jLabel_A3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel_A3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel_A3.setText("0");
        jLabel_A3.setName("jLabel_A3"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_A3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_A1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_A2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_A3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Legutóbbi gyakorlás adatai");
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Gyakorlás 2");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Elvégzett feladatok: ");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Helyes megoldások:");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Idő a feladat megoldására:");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel_B1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel_B1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel_B1.setText("0");
        jLabel_B1.setName("jLabel_B1"); // NOI18N

        jLabel_B2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel_B2.setForeground(new java.awt.Color(255, 51, 153));
        jLabel_B2.setText("0");
        jLabel_B2.setName("jLabel_B2"); // NOI18N

        jLabel_B3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel_B3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel_B3.setText("0");
        jLabel_B3.setName("jLabel_B3"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_B3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_B1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_B2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_B3))
                .addContainerGap())
        );

        jLoadStaticsButton.setBackground(new java.awt.Color(153, 153, 153));
        jLoadStaticsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLoadStaticsButton.setForeground(new java.awt.Color(51, 0, 204));
        jLoadStaticsButton.setText("Statisztika betöltése");
        jLoadStaticsButton.setName("jLoadStaticsButton"); // NOI18N
        jLoadStaticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoadStaticsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLoadStaticsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jLoadStaticsButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    /**
     * "Vissza a főmenübe" gomb eseménye, kattintás esetén. Bezárja a
     * statisztikát, és megjeliníti a főmenüt.
     *
     * @param evt esemény
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Fomenu.fomenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * "Kilépés" gomb eseménye, kattintás esetén. Menti a beállításokat és
     * leállítja a programot.
     *
     * @param evt esemény
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProgramManager.exitOrLogout(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * "Statisztika betöltése" gomb eseménye, kattintás esetén. Menti a beállításokat és
     * leállítja a programot.
     *
     * @param evt esemény
     */
    private void jLoadStaticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoadStaticsButtonActionPerformed
        final String default_ = "nincs";
        final Statisztika This = this;
        
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                boolean loadOk = ProgramManager.loadStaticsInXml();
                
                if (loadOk) {
                    if (ProgramManager.isNumber(ProgramManager.getT(0, 0))) {
                        if (Integer.valueOf(ProgramManager.getT(0, 0)) > 0) {
                            jLabel_A1.setText(ProgramManager.getT(0, 0) + " db.");
                            jLabel_A2.setText(ProgramManager.getT(0, 1) + " db.");
                            jLabel_A3.setText(ProgramManager.getT(0, 2) + " ms.");
                        } else {
                            jLabel_A1.setText(default_);
                            jLabel_A2.setText(default_);
                            jLabel_A3.setText(default_);
                        }
                    }

                    if (ProgramManager.isNumber(ProgramManager.getT(1, 0))) {
                        if (Integer.valueOf(ProgramManager.getT(1, 0)) > 0) {
                            jLabel_B1.setText(ProgramManager.getT(1, 0) + " db.");
                            jLabel_B2.setText(ProgramManager.getT(1, 1) + " db.");
                            jLabel_B3.setText(ProgramManager.getT(1, 2) + " ms.");
                        } else {
                            jLabel_B1.setText(default_);
                            jLabel_B2.setText(default_);
                            jLabel_B3.setText(default_);
                        }
                    }
                } else {
                    Fomenu.fomenu.setVisible(true);
                    This.dispose();
                    JOptionPane.showMessageDialog(new JFrame(), getUserName() + " felhasználónak még nics satisztika adata.", "Hiba", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
                return null;
            }

        };

        worker.execute();
    }//GEN-LAST:event_jLoadStaticsButtonActionPerformed

    /**
     * Ablak aktiválásakor hivódik meg.
     * Inicializál, és elíndítja az időzítőt. 
     * 
     * @param evt esemény 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jLoadStaticsButtonActionPerformed(null);
    }//GEN-LAST:event_formWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * "Kilépés" gomb.
    */
    private javax.swing.JButton jButton1;
    /**
    * "Vissza a főmenübe" gomb.
    */
    private javax.swing.JButton jButton3;
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
    * 6.címke.
    */
    private javax.swing.JLabel jLabel6;
    /**
    * 7.címke.
    */
    private javax.swing.JLabel jLabel7;
    /**
    * 8.címke.
    */
    private javax.swing.JLabel jLabel8;
    /**
    * 9.címke.
    */
    private javax.swing.JLabel jLabel9;
    /**
    * A1.címke.
    */
    private javax.swing.JLabel jLabel_A1;
    /**
    * A2.címke.
    */
    private javax.swing.JLabel jLabel_A2;
    /**
    * A3.címke.
    */
    private javax.swing.JLabel jLabel_A3;
    /**
    * B1.címke.
    */
    private javax.swing.JLabel jLabel_B1;
    /**
    * B2.címke.
    */
    private javax.swing.JLabel jLabel_B2;
    /**
    * B3.címke.
    */
    private javax.swing.JLabel jLabel_B3;
    /**  * "Statisztika betöltése" gomb.  */
    private javax.swing.JButton jLoadStaticsButton;
    /**
    * 1.panel.
    */
    private javax.swing.JPanel jPanel1;
    /**
    * 2.panel.
    */
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
