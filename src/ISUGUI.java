
/*
Add exclusive Resistence methods
- Add method with number
- Every 10th day have it randomly choose a disease
- Kill one plant
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class ISUGUI extends javax.swing.JFrame {
    List<PPlant> bought = new ArrayList<>();
    DefaultListModel<String> Plantlist = new DefaultListModel<>();
    //List<PPlant> sold = new ArrayList<>();
    Stack<PPlant> sold = new Stack();
    
    public ISUGUI() {
        initComponents();
    }

    //uses a random number to decide what plant to kill
    public void resistenceTime(){
        double num = Math.random();
        Ability resist = Ability.BUG;
        if (num <=0.4){
            //if resistance type is for bug, plant is safe
            resist = Ability.BUG;
            for (PPlant pPlant : bought) {
                if (pPlant instanceof Capsica == false){
                    int gone = bought.indexOf(pPlant);
                    JOptionPane.showMessageDialog(this, "OH NO\n One of your " + bought.get(gone).toString() +" got infested with "+ resist.getName() 
                            + ".\n" + bought.get(gone).toString() + " didn't survive!\nAll profit lost!");
                    bought.remove(gone);
                    Plantlist.removeElementAt(gone); 
                    return;
                }
            }
        }
        else{
           //if resistance type is for cold, plant is safe
           resist = Ability.COLD;
           for (PPlant pPlant : bought) {
                if (pPlant instanceof Tuber == false){
                    int gone = bought.indexOf(pPlant);
                    JOptionPane.showMessageDialog(this, "OH NO\n The weather got "+ resist.getName() 
                            + ".\n" + bought.get(gone).toString() + " didn't survive!\nAll profit lost!");
                    bought.remove(gone);
                    Plantlist.removeElementAt(gone); 
                    return;
                }
            }
        } 
    }
    
    public void resCheck(){
        PPlant temp = new Tuber();
        if (temp.getDay()%10==0){
            resistenceTime();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListThing = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblmon = new javax.swing.JLabel();
        lblday = new javax.swing.JLabel();
        btnstat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mnupot = new javax.swing.JMenuItem();
        mnuspot = new javax.swing.JMenuItem();
        mnustalk = new javax.swing.JMenu();
        mnucorn = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnupep = new javax.swing.JMenuItem();
        mnujpep = new javax.swing.JMenuItem();
        mnucare = new javax.swing.JMenu();
        mnusell = new javax.swing.JMenuItem();
        mnuwat = new javax.swing.JMenuItem();
        mnufer = new javax.swing.JMenuItem();
        mnuHistory = new javax.swing.JMenu();
        mnuhis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(ListThing);

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
        lblmon.setText("$100.00");

        lblday.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblday.setText("1");

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
                    .addComponent(lblmon, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(lblday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lblday))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnstat.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnstat.setText("Status");
        btnstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatActionPerformed(evt);
            }
        });

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
        mnupot.setText("Potato - $5");
        mnupot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnupotActionPerformed(evt);
            }
        });
        jMenu5.add(mnupot);

        mnuspot.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnuspot.setText("Sweet Potato - $5");
        mnuspot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuspotActionPerformed(evt);
            }
        });
        jMenu5.add(mnuspot);

        jMenu2.add(jMenu5);

        mnustalk.setText("Stalk");
        mnustalk.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N

        mnucorn.setText("Corn - $12");
        mnucorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucornActionPerformed(evt);
            }
        });
        mnustalk.add(mnucorn);

        jMenu2.add(mnustalk);

        jMenu7.setText("Capsica");
        jMenu7.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N

        mnupep.setText("Pepper - $8");
        mnupep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnupepActionPerformed(evt);
            }
        });
        jMenu7.add(mnupep);

        mnujpep.setText("Jalapeño - $8");
        mnujpep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnujpepActionPerformed(evt);
            }
        });
        jMenu7.add(mnujpep);

        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        mnucare.setText("Care");
        mnucare.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        mnusell.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnusell.setText("Harvest (+$$)");
        mnusell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusellActionPerformed(evt);
            }
        });
        mnucare.add(mnusell);

        mnuwat.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnuwat.setText("Water - $0");
        mnuwat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuwatActionPerformed(evt);
            }
        });
        mnucare.add(mnuwat);

        mnufer.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnufer.setText("Fertilize - $2");
        mnufer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuferActionPerformed(evt);
            }
        });
        mnucare.add(mnufer);

        jMenuBar1.add(mnucare);

        mnuHistory.setText("History");
        mnuHistory.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N

        mnuhis.setText("See History");
        mnuhis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuhisActionPerformed(evt);
            }
        });
        mnuHistory.add(mnuhis);

        jMenuBar1.add(mnuHistory);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnstat)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnstat)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnupotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnupotActionPerformed
        //adds a new potato to list
        PPlant temp = new Tuber();
        if (temp.getMoney()<temp.getCost()){
            JOptionPane.showMessageDialog(this, "You do not have enough money");
            return;
        }
        temp.addDay();
        lblday.setText("" + temp.getDay());
        Plantlist.addElement(temp.toString());
        bought.add(temp);
        ListThing.setModel(Plantlist);
        temp.decrease(temp.getCost());
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        resCheck();
    }//GEN-LAST:event_mnupotActionPerformed

    private void mnucornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucornActionPerformed
        //Adds a new corn to list
        PPlant temp = new Stalk();
        if (temp.getMoney()<temp.getCost()){
            JOptionPane.showMessageDialog(this, "You do not have enough money");
            return;
        }
        temp.addDay();
        lblday.setText("" + temp.getDay());
        Plantlist.addElement(temp.toString());
        bought.add(temp);
        ListThing.setModel(Plantlist);
        temp.decrease(temp.getCost());
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        resCheck();
    }//GEN-LAST:event_mnucornActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuspotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuspotActionPerformed
        //Adds a new Sweet Potato to list
        PPlant temp = new SPTuber();
        if (temp.getMoney()<temp.getCost()){
            JOptionPane.showMessageDialog(this, "You do not have enough money");
            return;
        }
        temp.addDay();
        lblday.setText("" + temp.getDay());
        Plantlist.addElement(temp.toString());
        bought.add(temp);
        ListThing.setModel(Plantlist);
        temp.decrease(temp.getCost());
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        resCheck();
    }//GEN-LAST:event_mnuspotActionPerformed

    private void mnupepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnupepActionPerformed
        //Adds a new pepper to list
        PPlant temp = new Capsica();
        if (temp.getMoney()<temp.getCost()){
            JOptionPane.showMessageDialog(this, "You do not have enough money");
            return;
        }
        temp.addDay();
        lblday.setText("" + temp.getDay());
        Plantlist.addElement(temp.toString());
        bought.add(temp);
        ListThing.setModel(Plantlist);
        temp.decrease(temp.getCost());
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        resCheck();
    }//GEN-LAST:event_mnupepActionPerformed

    private void mnujpepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnujpepActionPerformed
        //Adds a new jalapeño to list
        PPlant temp = new JCapsica();
        if (temp.getMoney()<temp.getCost()){
            JOptionPane.showMessageDialog(this, "You do not have enough money");
            return;
        }
        temp.addDay();
        lblday.setText("" + temp.getDay());
        Plantlist.addElement(temp.toString());
        bought.add(temp);
        ListThing.setModel(Plantlist);
        temp.decrease(temp.getCost());
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        resCheck();
    }//GEN-LAST:event_mnujpepActionPerformed

    private void btnstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatActionPerformed
        int ss = ListThing.getSelectedIndex();
        if (ss == -1) {
            JOptionPane.showMessageDialog(this, "Select a plant to see status");
            return;
        }
        String stats="";
        stats = bought.get(ss).Status();
        JOptionPane.showMessageDialog(this, stats);
        
    }//GEN-LAST:event_btnstatActionPerformed

    private void mnusellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusellActionPerformed
        int sel = ListThing.getSelectedIndex();
        if (sel == -1) {
            JOptionPane.showMessageDialog(this, "Select a plant to sell");
            return;
        }
        PPlant temp = bought.get(sel);
        if (temp.getGrowth()!=0){
            JOptionPane.showMessageDialog(this, "Plant can not be sold yet ("+ temp.getGrowth()+" days left)\nTry:\n - Watering\n - Fertilizing");
            return;
        }
        
        //if it is corn, 10% chance to become popcorn ( cost x 2)
        boolean popcorn = Math.random() < 0.1; 
        if (popcorn && temp instanceof Stalk){
            ((Stalk)temp).popcorn(); 
            JOptionPane.showMessageDialog(this, "Your corn plant overheated!!!\n Popcorn was produced\n sell price was doubled");
        }
        temp.addDay();
        lblday.setText("" + temp.getDay());
        double add = temp.getCost();
        double bonus=0;
        if (temp instanceof JCapsica){
            bonus=((JCapsica)temp).getBonus();
        }
        if (temp instanceof SPTuber){
            bonus=((SPTuber)temp).getBonus();
        }
        sold.add(temp);
        bought.remove(sel);
        temp.increase((add*2)*bonus);
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        Plantlist.removeElementAt(sel);
        resCheck();
    }//GEN-LAST:event_mnusellActionPerformed

    private void mnuwatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuwatActionPerformed
        int wat = ListThing.getSelectedIndex();
        if (wat == -1) {
            JOptionPane.showMessageDialog(this, "Select a plant to water");
            return;
        }
        PPlant temp = bought.get(wat);
        if(temp.getGrowth()==0){
            JOptionPane.showMessageDialog(this, "Plant is ready to harvest");
            return;
        }
        temp.grow();
    }//GEN-LAST:event_mnuwatActionPerformed

    private void mnuferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuferActionPerformed
        int fer = ListThing.getSelectedIndex();
        if (fer == -1) {
            JOptionPane.showMessageDialog(this, "Select a plant to fertilize");
            return;
        }
        PPlant temp = bought.get(fer);
        if (temp.getMoney()<2){
            JOptionPane.showMessageDialog(this, "You do not have enough money");
            return;
        }
        if(temp.getGrowth()==0){
            JOptionPane.showMessageDialog(this, "Plant is ready to harvest");
            return;
        }
        temp.decrease(2);
        lblmon.setText(String.format("$%.2f",temp.getMoney()));
        temp.grow();
        temp.grow();
    }//GEN-LAST:event_mnuferActionPerformed

    private void mnuhisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuhisActionPerformed
        String history = "History\n";
        for (PPlant pPlant : sold) {
            history += pPlant.toString() + "\n";
        }
        if (sold.size()==0)history += "You have harvested no plants";
        JOptionPane.showMessageDialog(this, history);
    }//GEN-LAST:event_mnuhisActionPerformed

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
    private javax.swing.JList<String> ListThing;
    private javax.swing.JButton btnstat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblday;
    private javax.swing.JLabel lblmon;
    private javax.swing.JMenu mnuHistory;
    private javax.swing.JMenu mnucare;
    private javax.swing.JMenuItem mnucorn;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufer;
    private javax.swing.JMenuItem mnuhis;
    private javax.swing.JMenuItem mnujpep;
    private javax.swing.JMenuItem mnupep;
    private javax.swing.JMenuItem mnupot;
    private javax.swing.JMenuItem mnusell;
    private javax.swing.JMenuItem mnuspot;
    private javax.swing.JMenu mnustalk;
    private javax.swing.JMenuItem mnuwat;
    // End of variables declaration//GEN-END:variables
}
