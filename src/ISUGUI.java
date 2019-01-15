
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class ISUGUI extends javax.swing.JFrame {
    
    ArrayList out = new ArrayList();
    DefaultListModel Plantlist;
    
    public ISUGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblmon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mnupot = new javax.swing.JMenuItem();
        mnuspot = new javax.swing.JMenuItem();
        mnucorn = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnupep = new javax.swing.JMenuItem();
        mnujpep = new javax.swing.JMenuItem();
        mnusell = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        mnuhar = new javax.swing.JMenuItem();
        mnuwat = new javax.swing.JMenuItem();
        mnufer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnust = new javax.swing.JMenuItem();
        mnuss = new javax.swing.JMenuItem();
        mnusc = new javax.swing.JMenuItem();
        mnuall = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crops Planted");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Money: ");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setText("Day: ");

        lblmon.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblmon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmon.setText("$100");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblmon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel5.setText("Plants Harvested");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel6.setText("Potato:");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel7.setText("Sweet Potato:");

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel8.setText("Corn:");

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel9.setText("Pepper:");

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel10.setText("Jalapeño:");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("0");

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0");

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        mnuexit.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buy");
        jMenu2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        jMenu5.setText("Tuber");
        jMenu5.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N

        mnupot.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnupot.setText("Potato");
        mnupot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnupotActionPerformed(evt);
            }
        });
        jMenu5.add(mnupot);

        mnuspot.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnuspot.setText("Sweet Potato");
        jMenu5.add(mnuspot);

        jMenu2.add(jMenu5);

        mnucorn.setText("Stalk");
        mnucorn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N

        jMenuItem3.setText("Corn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnucorn.add(jMenuItem3);

        jMenu2.add(mnucorn);

        jMenu7.setText("Capsica");
        jMenu7.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N

        mnupep.setText("Pepper");
        jMenu7.add(mnupep);

        mnujpep.setText("Jalapeño");
        jMenu7.add(mnujpep);

        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        mnusell.setText("Care");
        mnusell.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jMenuItem10.setText("Sell");
        mnusell.add(jMenuItem10);

        mnuhar.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnuhar.setText("Harvest");
        mnuhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuharActionPerformed(evt);
            }
        });
        mnusell.add(mnuhar);

        mnuwat.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnuwat.setText("Water");
        mnusell.add(mnuwat);

        mnufer.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnufer.setText("Fertilize");
        mnusell.add(mnufer);

        jMenuBar1.add(mnusell);

        jMenu4.setText("Food");
        jMenu4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jMenuItem13.setText("Shepard's Pie (Corn, Potato)                                                       |$40");
        jMenu4.add(jMenuItem13);

        jMenuItem15.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jMenuItem15.setText("Salsa (Peppers, Jalapeño)                                                             |$50");
        jMenu4.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jMenuItem16.setText("Stew (Potato, Sweet Potato, Corn, Pepper, Jalapeño)              |$100");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Sort");
        jMenu3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        mnust.setText("Tuber");
        jMenu3.add(mnust);

        mnuss.setText("Stalk");
        jMenu3.add(mnuss);

        mnusc.setText("Capsica");
        mnusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuscActionPerformed(evt);
            }
        });
        jMenu3.add(mnusc);

        mnuall.setText("All");
        jMenu3.add(mnuall);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnupotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnupotActionPerformed
        
    }//GEN-LAST:event_mnupotActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuharActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuscActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ISUGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISUGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISUGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISUGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISUGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmon;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenu mnucorn;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufer;
    private javax.swing.JMenuItem mnuhar;
    private javax.swing.JMenuItem mnujpep;
    private javax.swing.JMenuItem mnupep;
    private javax.swing.JMenuItem mnupot;
    private javax.swing.JMenuItem mnusc;
    private javax.swing.JMenu mnusell;
    private javax.swing.JMenuItem mnuspot;
    private javax.swing.JMenuItem mnuss;
    private javax.swing.JMenuItem mnust;
    private javax.swing.JMenuItem mnuwat;
    // End of variables declaration//GEN-END:variables
}
