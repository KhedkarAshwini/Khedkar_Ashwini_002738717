/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import datamodel.DataManager;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Encounterhistory;

/**
 *
 * @author ashwini
 */
public class viewencounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewencounterPanel
     */
    
    //Encounterhistory history;
    Encounter encounter;
    JPanel cards;
    CardLayout cl;
    
    public viewencounterJPanel(JPanel cards) {
        initComponents();
        //this.history = history;
        this.cards = cards;
        this.cl =  (CardLayout)cards.getLayout();
        PopulateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        visitdateLabel = new javax.swing.JLabel();
        vtypeLabel = new javax.swing.JLabel();
        vtypeField = new javax.swing.JTextField();
        vdoctorLabel = new javax.swing.JLabel();
        eidLabel = new javax.swing.JLabel();
        vdoctorField = new javax.swing.JTextField();
        eidField = new javax.swing.JTextField();
        visitdateField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Encounter Details");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visit date", "EncounterID", "Visiting Doctor", "Visit type"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(825, 80));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        viewButton.setText("View Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        visitdateLabel.setText("Visit Date :");

        vtypeLabel.setText("Visit type : ");

        vdoctorLabel.setText("Visiting Doctor : ");

        eidLabel.setText("EncounterID : ");

        eidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidFieldActionPerformed(evt);
            }
        });

        visitdateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitdateFieldActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1)
            .addComponent(viewButton)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(eidField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateButton)
                        .addComponent(deleteButton)
                        .addComponent(backButton))
                    .addGap(126, 126, 126)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(visitdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vdoctorLabel)
                        .addComponent(eidLabel)
                        .addComponent(vtypeLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(visitdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vdoctorField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vtypeField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visitdateLabel)
                            .addComponent(visitdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eidLabel)
                            .addComponent(eidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vdoctorLabel)
                            .addComponent(vdoctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vtypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vtypeLabel))
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int rowindex = jTable1.getSelectedRow();

        if(rowindex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter selectedp = (Encounter) model.getValueAt(rowindex, 0);

        eidField.setText(String.valueOf(selectedp.getEncounterid()));
        visitdateField.setText(String.valueOf(selectedp.getVisitdate()));
        vdoctorField.setText(String.valueOf(selectedp.doctor.getName()));
        vtypeField.setText(String.valueOf(selectedp.getVisittype()));
        

    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowindex = jTable1.getSelectedRow();
        
        if(rowindex != 0){
            int EncounterId = (Integer) model.getValueAt(rowindex, 1);
            encounter = DataManager.shared.history.fetchEncounter(EncounterId);
        }
        
        String vdate = visitdateField.getText();
        String eid = eidField.getText();
        String vdoctor = vdoctorField.getText();
        String vtype = vtypeField.getText();
        
        
        
        //DataManager.shared.history.updateEncounter(rowindex);
        
        encounter.setVisitdate(vdate);
        encounter.setEncounterid(Integer.parseInt(eid));
        encounter.setVisittype(vtype);
       

        
        model.setValueAt(vdate, rowindex, 0);
        model.setValueAt(eid, rowindex, 1);
        model.setValueAt(vdoctor, rowindex, 2);
        model.setValueAt(vtype, rowindex, 3);
        
        PopulateTable();

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        int rowindex = jTable1.getSelectedRow();

        if(rowindex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter selectedp = (Encounter) model.getValueAt(rowindex, 0);

        DataManager.shared.history.deleteEncounter(selectedp);

        JOptionPane.showMessageDialog(this, "Selected Encounter Record is deleted.");

        
        visitdateField.setText("");
        eidField.setText("");
        vdoctorField.setText("");
        vtypeField.setText("");
        

        PopulateTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void eidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        cl.previous(cards);
        cards.remove(this);
    }//GEN-LAST:event_backButtonActionPerformed

    private void visitdateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitdateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitdateFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField eidField;
    private javax.swing.JLabel eidLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField vdoctorField;
    private javax.swing.JLabel vdoctorLabel;
    private javax.swing.JButton viewButton;
    private javax.swing.JTextField visitdateField;
    private javax.swing.JLabel visitdateLabel;
    private javax.swing.JTextField vtypeField;
    private javax.swing.JLabel vtypeLabel;
    // End of variables declaration//GEN-END:variables

    private void PopulateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Encounter enc: DataManager.shared.history.getHistory()){
            Object[] row = new Object[5];
            row[0] = enc;
            row[1] = enc.getVisitdate();
            row[2] = enc.getEncounterid();
            row[3] = enc.doctor.getName();
            row[4] = enc.getVisittype();   
            model.addRow(row);
    }
    }
}
