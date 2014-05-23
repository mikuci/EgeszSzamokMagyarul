package my.EgeszSzamokMagyarul;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import my.xml.ProgramManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Főmenü grafkus felületét megvalósító osztály.
 *
 * @author Borsi Miklós Gábor
 */
@SuppressWarnings("serial")
public class Fomenu extends javax.swing.JFrame {

    /**
     * Paraméter nélküli konstruktor.
     */
    public Fomenu() {
        initComponents();
        RadioButtons = new JRadioButton[3];
        RadioButtons[0] = jRadioButton1;
        RadioButtons[1] = jRadioButton2;
        RadioButtons[2] = jRadioButton3;

        logger = LoggerFactory.getLogger(Fomenu.class);
    }

    /**
     * Ez a metódus inicializálja a form komponenseit.
     */
    private void initComponents() {//GEN-BEGIN:initComponents

        jExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jExerciseGoButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jStaticsButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Főmenü");
        setMinimumSize(new java.awt.Dimension(343, 272));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jExitButton.setBackground(new java.awt.Color(153, 153, 153));
        jExitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jExitButton.setForeground(new java.awt.Color(51, 0, 204));
        jExitButton.setText("Kilépés");
        jExitButton.setName("jExitButton"); // NOI18N
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Egész szám magyarul");
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("jPanel1"); // NOI18N

        jRadioButton2.setText("Add meg a számot, a neve alapján.");
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Gyakorolj.");
        jRadioButton3.setName("jRadioButton3"); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Válaszd ki a gyakorlás típusát:");
        jLabel2.setName("jLabel2"); // NOI18N

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Írd be a szám nevét időre.");
        jRadioButton1.setActionCommand("jRadioButton1");
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jSpinner1.setName("jSpinner1"); // NOI18N
        jSpinner1.setValue(15);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jExerciseGoButton.setBackground(new java.awt.Color(153, 153, 153));
        jExerciseGoButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jExerciseGoButton.setForeground(new java.awt.Color(51, 0, 204));
        jExerciseGoButton.setText("Gyakorlás kezdése");
        jExerciseGoButton.setName("jButton2"); // NOI18N
        jExerciseGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExerciseGoButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Kör idő (ms):"); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jStaticsButton.setBackground(new java.awt.Color(153, 153, 153));
        jStaticsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jStaticsButton.setForeground(new java.awt.Color(51, 0, 204));
        jStaticsButton.setText("Statisztika");
        jStaticsButton.setName("jStaticsButton"); // NOI18N
        jStaticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStaticsButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("-dik toldalék használata");
        jCheckBox1.setName("jCheckBox1"); // NOI18N
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Legnagyobb lehetséges szám:"); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jSpinner2.setName("jSpinner2"); // NOI18N
        jSpinner2.setValue(999999999);
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jLogoutButton.setBackground(new java.awt.Color(153, 153, 153));
        jLogoutButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLogoutButton.setForeground(new java.awt.Color(51, 0, 204));
        jLogoutButton.setText("Kijelentkezés");
        jLogoutButton.setName("jLogoutButton"); // NOI18N
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jStaticsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExerciseGoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExerciseGoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStaticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }//GEN-END:initComponents

    /**
     * "Kilépés" gomb (jExitButton) eseménye, kattintás esetén. 
     * Menti a beállításokat és leállítja a programot.
     *
     * @param evt esemény
     * @see #jExitButton
     */
    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        ProgramManager.exitOrLogout(true);
    }//GEN-LAST:event_jExitButtonActionPerformed

    /**
     * "Gyakorlás kezdése" gomb (jExerciseGoButton) eseménye, kattintás esetén.
     *
     * @param evt esemény
     * @see #jExerciseGoButton
     */
    private void jExerciseGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExerciseGoButtonActionPerformed
        if (jRadioButton1.isSelected()) {
            logger.debug("1.gyakolás kezdése");
            gyak1_2_3 = new Gyakorlas1_2_3(1);
            ProgramManager.MoveToScreenCenter(gyak1_2_3);
            gyak1_2_3.setVisible(true);
        } else if (jRadioButton2.isSelected()) {
            logger.debug("2.gyakolás kezdése");
            gyak1_2_3 = new Gyakorlas1_2_3(2);
            ProgramManager.MoveToScreenCenter(gyak1_2_3);
            gyak1_2_3.setVisible(true);
        } else if (jRadioButton3.isSelected()) {
            logger.debug("3.gyakolás kezdése");
            gyak1_2_3 = new Gyakorlas1_2_3(3);
            ProgramManager.MoveToScreenCenter(gyak1_2_3);
            gyak1_2_3.setVisible(true);
        } else {
            String message = "Nincs kiválasztva a gyakorlás típusa";
            logger.warn(message);
            JOptionPane.showMessageDialog(new JFrame(), message, "Hiba", JOptionPane.ERROR_MESSAGE);
        }
        for (int i = 0; i < 3; i++) {
            if (RadioButtons[i].isSelected()) {
                ProgramManager.setIdo((int) jSpinner1.getValue());
                this.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_jExerciseGoButtonActionPerformed

    /**
     * 1.választó gomb (jRadioButton1) eseménye, kattintás esetén.
     *
     * @param evt esemény
     * @see #jRadioButton1
     */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        for (int i = 0; i < 3; i++) {
            if (RadioButtons[i].isSelected() && i != 0) {
                RadioButtons[i].setSelected(false);
            }
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * 2.választó gomb (jRadioButton2) eseménye, kattintás esetén.
     *
     * @param evt esemény
     * @see #jRadioButton2
     */
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        for (int i = 0; i < 3; i++) {
            if (RadioButtons[i].isSelected() && i != 1) {
                RadioButtons[i].setSelected(false);
            }
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * 3.választó gomb (jRadioButton3) eseménye, kattintás esetén.
     *
     * @param evt esemény
     * @see #jRadioButton3
     */
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        for (int i = 0; i < 3; i++) {
            if (RadioButtons[i].isSelected() && i != 2) {
                RadioButtons[i].setSelected(false);
            }
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * Spinner1 (jSpinner1) eseménye, érték megvátoztatása esetén.
     *
     * @param evt esemény
     * @see #jSpinner1
     */
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        if (((int) jSpinner1.getValue()) <= 1) {
            jSpinner1.setValue(1);
        }
        ProgramManager.setIdo((int) jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged

    /**
     * Spinner2 (jSpinner2) eseménye, érték megvátoztatása esetén.
     *
     * @param evt esemény
     * @see #jSpinner2
     */
    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        if (((int) jSpinner2.getValue()) > 999999999) {
            jSpinner2.setValue(999999999);
        } else if (((int) jSpinner2.getValue()) < 1) {
            jSpinner2.setValue(1);
        }
        ProgramManager.setMaxszam((int) jSpinner2.getValue());
    }//GEN-LAST:event_jSpinner2StateChanged

    /**
     * "Statisztika" gomb (jStaticsButton) eseménye, kattintás esetén.
     *
     * @param evt esemény
     * @see #jStaticsButton
     */
    private void jStaticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStaticsButtonActionPerformed
        Statisztika stat = new Statisztika();
        ProgramManager.MoveToScreenCenter(stat);
        stat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jStaticsButtonActionPerformed

    /**
     * "dik" (jCheckBox1) eseménye, kattintás esetén.
     * Beállítja, hogy legyen-e -dik toldalék a számnevekben.
     *
     * @param evt esemény
     */
    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        ProgramManager.setDik(jCheckBox1.isSelected());
    }//GEN-LAST:event_jCheckBox1StateChanged

    /**
     * Ablak aktiválásakor, betölti a beállításokat.
     *
     * @param evt esemény
     * @see #jSpinner1
     * @see #jSpinner2
     * @see #jCheckBox1
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jSpinner1.setValue(ProgramManager.getIdo());
        jSpinner2.setValue(ProgramManager.getMaxszam());
        jCheckBox1.setSelected(ProgramManager.isDik());
    }//GEN-LAST:event_formWindowActivated

    /**
     * "Kijelentkezés" gomb (jLogoutButton) eseménye, kattintás esetén.
     * 
     * @param evt esemény
     * @see #jLogoutButton
     */
    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        ProgramManager.exitOrLogout(false);
        Bejelentkezes bejelentkezes = new Bejelentkezes();
        ProgramManager.MoveToScreenCenter(bejelentkezes);
        bejelentkezes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * dik toldalék.
    */
    private javax.swing.JCheckBox jCheckBox1;
    /**
    * "Gyakorlás kezdése" gomb.
    */
    private javax.swing.JButton jExerciseGoButton;
    /**
    * "Kilépés" gomb.
    */
    private javax.swing.JButton jExitButton;
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
    * "Kilépés" gomb.
    */
    private javax.swing.JButton jLogoutButton;
    /**
    * 1.panel.
    */
    private javax.swing.JPanel jPanel1;
    /**
    * 1.választógomb.
    */
    private javax.swing.JRadioButton jRadioButton1;
    /**
    * 2.választógomb.
    */
    private javax.swing.JRadioButton jRadioButton2;
    /**
    * 3.választógomb.
    */
    private javax.swing.JRadioButton jRadioButton3;
    /**
    * Spinner1.
    */
    private javax.swing.JSpinner jSpinner1;
    /**
    * Spinner2.
    */
    private javax.swing.JSpinner jSpinner2;
    /**
    * "Statisztika" gomb.
    */
    private javax.swing.JButton jStaticsButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Választógombok.
     */
    private final JRadioButton[] RadioButtons;

    /**
     * Főmenü.
     */
    protected static Fomenu fomenu;

    /**
     * Gyakorlások.
     */
    protected static Gyakorlas1_2_3 gyak1_2_3;

    /**
     * Naplózó.
     */
    private static Logger logger;
}
