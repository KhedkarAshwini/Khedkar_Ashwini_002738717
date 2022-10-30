/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Encounterhistory;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author ashwini
 */
public class SystemadminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemadminJPanel
     */
    
    PatientDirectory patients;
    PersonDirectory perd;
    Encounterhistory enc;
    CardLayout c1;
    
    public SystemadminJPanel(PatientDirectory p, PersonDirectory per , Encounterhistory enc , CardLayout cd) {
        initComponents();
        this.patients = p;
        this.perd = per;
        this.enc = enc;
        this.c1 = cd;
        
    }
    public SystemadminJPanel(PatientDirectory p, CardLayout cd) {
        initComponents();
        this.patients = p;
        this.c1 = cd;
    }
    public SystemadminJPanel(PersonDirectory p) {
        initComponents();
        this.perd = p;
    }
    public SystemadminJPanel(Encounterhistory encounter) {
        initComponents();
        this.enc = encounter;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        workPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        insertpatientButton = new javax.swing.JButton();
        vpatientButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        insertpersonButton = new javax.swing.JButton();
        vpersonButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 600));

        splitPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        splitPane.setDividerLocation(150);
        splitPane.setDividerSize(10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome System Admin !");

        insertpatientButton.setBackground(new java.awt.Color(0, 0, 255));
        insertpatientButton.setText("Insert Patient");
        insertpatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertpatientButtonActionPerformed(evt);
            }
        });

        vpatientButton.setBackground(new java.awt.Color(0, 0, 204));
        vpatientButton.setText("View Patient ");
        vpatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpatientButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Create New Encounter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setText("View All Encounters");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        insertpersonButton.setBackground(new java.awt.Color(0, 0, 255));
        insertpersonButton.setText("Insert Person");
        insertpersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertpersonButtonActionPerformed(evt);
            }
        });

        vpersonButton.setBackground(new java.awt.Color(0, 0, 204));
        vpersonButton.setText("View Person");
        vpersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(insertpatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertpersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vpatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(vpersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertpatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(vpatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertpersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vpersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        splitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertpatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertpatientButtonActionPerformed
        // TODO add your handling code here:
        //registerJPanel addpanel = new registerJPanel(patients, c1);
        //splitPane.setRightComponent(addpanel);
    }//GEN-LAST:event_insertpatientButtonActionPerformed

    private void vpatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpatientButtonActionPerformed
        // TODO add your handling code here:
       // viewPatientJPanel vpanel = new viewPatientJPanel(patients,cl);
        //splitPane.setRightComponent(vpanel);
        
    }//GEN-LAST:event_vpatientButtonActionPerformed

    private void vpersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpersonButtonActionPerformed
        // TODO add your handling code here:
        //viewpersonJPanel vpanel = new viewpersonJPanel(perd);
        //splitPane.setRightComponent(vpanel);
       
    }//GEN-LAST:event_vpersonButtonActionPerformed

    private void insertpersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertpersonButtonActionPerformed
        // TODO add your handling code here:
        //addpersonJPanel addpanel = new addpersonJPanel(perd);
        //splitPane.setRightComponent(addpanel);
    }//GEN-LAST:event_insertpersonButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //addencounterJPanel addpanel = new addencounterJPanel(enc);
        //splitPane.setRightComponent(addpanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //viewencounterJPanel vpanel = new viewencounterJPanel(enc);
        //splitPane.setRightComponent(vpanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton insertpatientButton;
    private javax.swing.JButton insertpersonButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton vpatientButton;
    private javax.swing.JButton vpersonButton;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
