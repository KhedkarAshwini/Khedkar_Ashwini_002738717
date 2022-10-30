/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Encounter;
import model.Encounterhistory;
import model.VitalSigns;

/**
 *
 * @author ashwini
 */
public class addencounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addencounterJPanel
     */
    Encounterhistory history;
    JPanel cards;
    CardLayout cl;
    
    
    public addencounterJPanel(Encounterhistory hist, JPanel cards) {
        initComponents();
        this.history =hist;
        this.cards = cards;
        this.cl =  (CardLayout)cards.getLayout();
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
        visitdateLabel = new javax.swing.JLabel();
        visitdatePicker = new org.jdesktop.swingx.JXDatePicker();
        vdoctorLabel = new javax.swing.JLabel();
        eidLabel = new javax.swing.JLabel();
        lastdateLabel = new javax.swing.JLabel();
        vdoctorField = new javax.swing.JTextField();
        eidField = new javax.swing.JTextField();
        lvisitdatePicker = new org.jdesktop.swingx.JXDatePicker();
        saveButton = new javax.swing.JButton();
        vtypeLabel = new javax.swing.JLabel();
        vtypeField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Patient Encounter");

        visitdateLabel.setText("Visit Date :");

        vdoctorLabel.setText("Visiting Doctor");

        eidLabel.setText("EncounterID : ");

        lastdateLabel.setText("Last Visit Date : ");

        saveButton.setText("Save ");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        vtypeLabel.setText("Visit type : ");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visitdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vdoctorLabel)
                            .addComponent(eidLabel)
                            .addComponent(lastdateLabel)
                            .addComponent(vtypeLabel))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(visitdatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vdoctorField)
                            .addComponent(eidField)
                            .addComponent(lvisitdatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vtypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eidLabel)
                    .addComponent(eidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(visitdateLabel)
                    .addComponent(visitdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vdoctorLabel)
                    .addComponent(vdoctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastdateLabel)
                    .addComponent(lvisitdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vtypeLabel)
                    .addComponent(vtypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
       
        Date sdate = visitdatePicker.getDate();
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String visitdate = simpleDateFormat.format(sdate);
        
        String vdoctor = vdoctorField.getText();
        int eid = Integer.parseInt(eidField.getText());
        
        Date ldate = lvisitdatePicker.getDate();
        String lvisitdate = simpleDateFormat.format(ldate);
        
        String vtype = vtypeField.getText();
        
        VitalSigns vs = new VitalSigns();
        Encounter e = new Encounter(vs);
        Encounter enc = history.addnewencounter(vs);
        
        enc.setEncounterid(eid);
        enc.setVisitdate(visitdate);
        enc.setLastvisitdate(lvisitdate);
        enc.setVisitingdoctor(vdoctor);
        enc.setVisittype(vtype);
       
        
        
        JOptionPane.showMessageDialog(this,"New Encounter Details saved successfully!!!");
        
        eidField.setText("");
        vdoctorField.setText("");
        vtypeField.setText("");
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        cl.previous(cards);
        cards.remove(this);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField eidField;
    private javax.swing.JLabel eidLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastdateLabel;
    private org.jdesktop.swingx.JXDatePicker lvisitdatePicker;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField vdoctorField;
    private javax.swing.JLabel vdoctorLabel;
    private javax.swing.JLabel visitdateLabel;
    private org.jdesktop.swingx.JXDatePicker visitdatePicker;
    private javax.swing.JTextField vtypeField;
    private javax.swing.JLabel vtypeLabel;
    // End of variables declaration//GEN-END:variables
}
