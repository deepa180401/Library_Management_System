/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Department extends javax.swing.JFrame {

    /**
     * Creates new form Department
     */
    public Department() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDepartment = new javax.swing.JLabel();
        lblChoose = new javax.swing.JLabel();
        lblEnglish = new javax.swing.JLabel();
        lblNewspaper = new javax.swing.JLabel();
        lblScience = new javax.swing.JLabel();
        lblLiterature = new javax.swing.JLabel();
        lblGoBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Library Department");

        lblDepartment.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(0, 0, 204));
        lblDepartment.setText("Library Departments");

        lblChoose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblChoose.setText("Choose the Departments :");

        lblEnglish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/English.jpg"))); // NOI18N
        lblEnglish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnglishMouseClicked(evt);
            }
        });

        lblNewspaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newspaperjpg.jpg"))); // NOI18N
        lblNewspaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewspaperMouseClicked(evt);
            }
        });

        lblScience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/science.jpg"))); // NOI18N
        lblScience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblScienceMouseClicked(evt);
            }
        });

        lblLiterature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/literature_1.jpg"))); // NOI18N
        lblLiterature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLiteratureMouseClicked(evt);
            }
        });

        lblGoBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGoBack.setForeground(new java.awt.Color(255, 0, 0));
        lblGoBack.setText("Go Back");
        lblGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblChoose, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNewspaper)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(lblScience)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(lblEnglish))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(lblLiterature))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(lblDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblGoBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lblLiterature, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(lblEnglish))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblScience)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNewspaper)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoBackMouseClicked
        // TODO add your handling code here:
        new Menu_Page().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblGoBackMouseClicked

    private void lblScienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblScienceMouseClicked
        // TODO add your handling code here:
        new Science().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblScienceMouseClicked

    private void lblLiteratureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiteratureMouseClicked
        // TODO add your handling code here:
        new Literature().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLiteratureMouseClicked

    private void lblNewspaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewspaperMouseClicked
        // TODO add your handling code here:
        new Newspaper().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblNewspaperMouseClicked

    private void lblEnglishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnglishMouseClicked
        // TODO add your handling code here:
        new English().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblEnglishMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEnglish;
    private javax.swing.JLabel lblGoBack;
    private javax.swing.JLabel lblLiterature;
    private javax.swing.JLabel lblNewspaper;
    private javax.swing.JLabel lblScience;
    // End of variables declaration//GEN-END:variables
}
