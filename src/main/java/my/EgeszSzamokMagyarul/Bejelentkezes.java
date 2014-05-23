package my.EgeszSzamokMagyarul;

import static my.EgeszSzamokMagyarul.Fomenu.fomenu;
import my.xml.ProgramManager;

/**
 * A felhaználó azonosítását megvalósító, grafikus felülettel rendelkező osztály.
 * 
 * @author Mikuci
 */
@SuppressWarnings("serial")
public class Bejelentkezes extends javax.swing.JFrame {

    /**
     * Paraméter nélküli konstruktor.
     */
    public Bejelentkezes() {
        initComponents();
    }
    
    /**
     * Inicializálja a form komponenseit.
     */
    private void initComponents() {//GEN-BEGIN:initComponents

        jScrollPane1 = new javax.swing.JScrollPane();
        jLoginName = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLoginButton = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bejelentkezés");
        setBackground(new java.awt.Color(153, 153, 255));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(318, 155));
        setMinimumSize(new java.awt.Dimension(318, 155));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLoginName.setColumns(20);
        jLoginName.setRows(5);
        jScrollPane1.setViewportView(jLoginName);

        jLabel1.setText("Felhesználói név:");

        jLoginButton.setBackground(new java.awt.Color(153, 153, 153));
        jLoginButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLoginButton.setForeground(new java.awt.Color(51, 0, 204));
        jLoginButton.setText("Bejelentkezés");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jExitButton.setBackground(new java.awt.Color(153, 153, 153));
        jExitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jExitButton.setForeground(new java.awt.Color(51, 0, 204));
        jExitButton.setText("Kilépés");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLoginButton)
                        .addGap(18, 18, 18)
                        .addComponent(jExitButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    /**
     * "Bejelentkezés" gomb (jLoginButton) eseménye, kattintás esetén. 
     * 
     * @param evt esemény
     * @see #jLoginButton
     */
    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        ProgramManager.setUserName(jLoginName.getText().toCharArray().length > 0 ? jLoginName.getText() : "default");
        Fomenu.fomenu = new Fomenu();
        ProgramManager.MoveToScreenCenter(Fomenu.fomenu);
        ProgramManager.login();
        fomenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLoginButtonActionPerformed

    /**
     * "Kilépés" gomb (jExitButton) eseménye, kattintás esetén. 
     * 
     * @param evt esemény
     * @see #jExitButton
     */
    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitButtonActionPerformed

    /**
     * Main metódus.
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bejelentkezes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProgramManager.start();
                Bejelentkezes bejelentkezes = new Bejelentkezes();
                ProgramManager.MoveToScreenCenter(bejelentkezes);
                bejelentkezes.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * "Kilépés" gomb.
    */
    private javax.swing.JButton jExitButton;
    /**
    * 1.címke.
    */
    private javax.swing.JLabel jLabel1;
    /**
    * "Kilépés" gomb.
    */
    private javax.swing.JButton jLoginButton;
    /**
    * 1.bevíteli mező (felhasználói név).
    */
    private javax.swing.JTextArea jLoginName;
    /**
    * 1.Scroll.
    */
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
