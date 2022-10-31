/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.Encounterhistory;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author ashwini
 */
public class SysadminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysadminJPanel
     */
    
    PatientDirectory patients;
    PersonDirectory perd;
    Encounterhistory enc;
    DoctorDirectory doctors;
    CardLayout c1;
    JPanel cards;
    
    
    public SysadminJPanel(PatientDirectory p, DoctorDirectory doc, PersonDirectory per , Encounterhistory enc , JPanel cards) {
       
        initComponents();
        this.patients = p;
        this.perd = per;
        this.enc = enc;
        this.cards = cards;
        this.c1 = (CardLayout)cards.getLayout();
        this.doctors = doc;
        
    }
    
    public SysadminJPanel(PatientDirectory p, JPanel cards){
        
        initComponents();
        this.patients = p;
        this.cards = cards;
        this.c1 =  (CardLayout)cards.getLayout();
    }
    public SysadminJPanel(DoctorDirectory p, JPanel cards){
        
        initComponents();
        this.doctors = p;
        this.cards = cards;
        this.c1 =  (CardLayout)cards.getLayout();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addpButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        insertdocButton1 = new javax.swing.JButton();
        viewdoctorButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Hospital Admin !");

        jPanel1.setLayout(new java.awt.CardLayout());

        addpButton.setBackground(new java.awt.Color(51, 0, 255));
        addpButton.setText("Insert Patient ");
        addpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 0, 255));
        jButton1.setText("View Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Add Encounter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setText("View Encounter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        insertdocButton1.setBackground(new java.awt.Color(0, 0, 255));
        insertdocButton1.setText("Insert Doctor");
        insertdocButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertdocButton1ActionPerformed(evt);
            }
        });

        viewdoctorButton.setBackground(new java.awt.Color(0, 0, 255));
        viewdoctorButton.setText("View Doctor");
        viewdoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdoctorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(insertdocButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(208, 208, 208)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(viewdoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertdocButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewdoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpButtonActionPerformed
        // TODO add your handling code here:
        Add_patientJPanel addpanel = new Add_patientJPanel(patients,enc, cards);
        cards.add(addpanel,"addPatientPanel");
        c1.next(cards);
        //c1.show(cards,"addPatientPanel");
        
    }//GEN-LAST:event_addpButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewPatientJPanel vpanel = new viewPatientJPanel(patients,enc,cards);
        cards.add(vpanel,"viewPatientPanel");
        c1.next(cards);
        //c1.show(cards,"viewPatientPanel");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        addencounterJPanel addpanel = new addencounterJPanel(cards);
        cards.add(addpanel,"addEncounterPanel");
        c1.next(cards);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        viewencounterJPanel vpanel = new viewencounterJPanel(cards);
        cards.add(vpanel,"ViewEncounterPanel");
        c1.next(cards);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void insertdocButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertdocButton1ActionPerformed
        // TODO add your handling code here:
        adddoctorJPanel addpanel = new adddoctorJPanel(cards);
        cards.add(addpanel,"addDoctorPanel");
        c1.next(cards);
    }//GEN-LAST:event_insertdocButton1ActionPerformed

    private void viewdoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdoctorButtonActionPerformed
        // TODO add your handling code here:
        viewdoctorJPanel vpanel = new viewdoctorJPanel(doctors , cards);
        cards.add(vpanel,"viewDoctorPanel");
        c1.next(cards);
    }//GEN-LAST:event_viewdoctorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addpButton;
    private javax.swing.JButton insertdocButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewdoctorButton;
    // End of variables declaration//GEN-END:variables
}
