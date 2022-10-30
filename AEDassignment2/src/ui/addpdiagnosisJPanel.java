/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounterhistory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author ashwini
 */
public class addpdiagnosisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addpdiagnosisJPanel
     */
    PatientDirectory patients;
    Encounterhistory history;
    JPanel cards;
    CardLayout c1;
    
    public addpdiagnosisJPanel(PatientDirectory patients, Encounterhistory history,JPanel cards) {
        this.patients = patients;
        this.history = history;
        this.cards = cards;
        this.c1 =  (CardLayout)cards.getLayout();
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        hLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        visitdateLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        diagnosisLabel = new javax.swing.JLabel();
        temperatureField = new javax.swing.JTextField();
        pulseField = new javax.swing.JTextField();
        bloodpressureField = new javax.swing.JTextField();
        diagnosisField = new javax.swing.JTextField();
        temperatureLabel = new javax.swing.JLabel();
        BPLabel = new javax.swing.JLabel();
        pidField = new javax.swing.JTextField();
        pulseLabel = new javax.swing.JLabel();
        pnameField = new javax.swing.JTextField();
        pnameLabel = new javax.swing.JLabel();
        visitdateField = new javax.swing.JTextField();
        pIDLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        medicationLabel = new javax.swing.JLabel();
        medicationField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patient Diagnosis");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "PatientId", "Age", "Gender", "Visit Date", "Height", "Weight", "Temperature", "BloodPressure", "Pulse", "Diagnosis", "Medication"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(825, 80));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        viewButton.setBackground(new java.awt.Color(102, 51, 255));
        viewButton.setText("View Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Age :");

        hLabel.setText("Height :");

        visitdateLabel.setText("Visit Date :");

        weightLabel.setText("Weight :");

        diagnosisLabel.setText("Diagnosis :");

        bloodpressureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodpressureFieldActionPerformed(evt);
            }
        });

        temperatureLabel.setText("Temperature :");

        BPLabel.setText("Blood Pressure :");

        pulseLabel.setText("Pulse :");

        pnameLabel.setText("Patient name :");

        visitdateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitdateFieldActionPerformed(evt);
            }
        });

        pIDLabel.setText("Patient ID :");

        heightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFieldActionPerformed(evt);
            }
        });

        medicationLabel.setText("Medication : ");

        updateButton.setBackground(new java.awt.Color(102, 0, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateButton)
                            .addComponent(jButton1))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pIDLabel)
                                    .addComponent(pnameLabel))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(pidField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hLabel)
                                    .addComponent(visitdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diagnosisLabel)
                                    .addComponent(pulseLabel)
                                    .addComponent(BPLabel)
                                    .addComponent(temperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(weightLabel)
                                    .addComponent(medicationLabel))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(weightField)
                                    .addComponent(temperatureField)
                                    .addComponent(bloodpressureField)
                                    .addComponent(pulseField)
                                    .addComponent(diagnosisField)
                                    .addComponent(heightField)
                                    .addComponent(visitdateField)
                                    .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(medicationField)))))
                    .addComponent(viewButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewButton)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameLabel)
                    .addComponent(pnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pIDLabel)
                    .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visitdateLabel)
                            .addComponent(visitdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heightField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(temperatureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPLabel)
                    .addComponent(bloodpressureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pulseLabel)
                    .addComponent(pulseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diagnosisLabel)
                    .addComponent(diagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicationLabel)
                    .addComponent(medicationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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
        Patient selectedp = (Patient) model.getValueAt(rowindex, 0);

        pnameField.setText(String.valueOf(selectedp.getPatient().getName()));
        pidField.setText(String.valueOf(selectedp.getPatient().getId()));
        ageField.setText(String.valueOf(selectedp.getPatient().getAge()));
        visitdateField.setText(String.valueOf(selectedp.getVitalsigns().getVisitdate()));
        heightField.setText(String.valueOf(selectedp.getVitalsigns().getHeight()));
        weightField.setText(String.valueOf(selectedp.getVitalsigns().getWeight()));
        temperatureField.setText(String.valueOf(selectedp.getVitalsigns().getTemperature()));
        bloodpressureField.setText(String.valueOf(selectedp.getVitalsigns().getBloodpressure()));
        pulseField.setText(String.valueOf(selectedp.getVitalsigns().getPulse()));
        diagnosisField.setText(String.valueOf(selectedp.getEncounter().getDiagnosis()));
        medicationField.setText(String.valueOf(selectedp.getEncounter().getMedication()));
    }//GEN-LAST:event_viewButtonActionPerformed

    private void bloodpressureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodpressureFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodpressureFieldActionPerformed

    private void visitdateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitdateFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_visitdateFieldActionPerformed

    private void heightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowindex = jTable1.getSelectedRow();

        String newname = pnameField.getText();
        int newid = Integer.parseInt(pidField.getText());
        int newage = Integer.parseInt(ageField.getText());
        String newvisitdate = visitdateField.getText();
        double newh = Double.parseDouble(heightField.getText());
        double neww = Double.parseDouble(weightField.getText());
        double temp = Double.parseDouble(temperatureField.getText());
        double bp = Double.parseDouble(bloodpressureField.getText());
        double pulse = Double.parseDouble(pulseField.getText());
        String d = diagnosisField.getText();
        String med = medicationField.getText();
        Patient pat = patients.updatepatient(rowindex);

        pat.getPatient().setName(newname);
        pat.getPatient().setId(newid);
        pat.getPatient().setAge(newage);
        pat.getVitalsigns().setVisitdate(newvisitdate);
        pat.getVitalsigns().setHeight(newh);
        pat.getVitalsigns().setWeight(newh);
        pat.getVitalsigns().setTemperature(temp);
        pat.getVitalsigns().setBloodpressure(bp);
        pat.getVitalsigns().setPulse(pulse);
        pat.getEncounter().getDiagnosis();
        pat.getEncounter().getMedication();

        model.setValueAt(newname, rowindex, 0);
        model.setValueAt(newid, rowindex, 1);
        model.setValueAt(newage, rowindex, 2);
        model.setValueAt(newvisitdate, rowindex, 4);
        model.setValueAt(newh, rowindex, 5);
        model.setValueAt(neww, rowindex, 6);
        model.setValueAt(temp, rowindex, 7);
        model.setValueAt(bp, rowindex, 8);
        model.setValueAt(pulse, rowindex, 9);
        model.setValueAt(d, rowindex, 10);
        model.setValueAt(med, rowindex, 11);
        
        PopulateTable();

    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        c1.previous(cards);
        cards.remove(this);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField bloodpressureField;
    private javax.swing.JTextField diagnosisField;
    private javax.swing.JLabel diagnosisLabel;
    private javax.swing.JLabel hLabel;
    private javax.swing.JTextField heightField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicationField;
    private javax.swing.JLabel medicationLabel;
    private javax.swing.JLabel pIDLabel;
    private javax.swing.JTextField pidField;
    private javax.swing.JTextField pnameField;
    private javax.swing.JLabel pnameLabel;
    private javax.swing.JTextField pulseField;
    private javax.swing.JLabel pulseLabel;
    private javax.swing.JTextField temperatureField;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JTextField visitdateField;
    private javax.swing.JLabel visitdateLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables

    private void PopulateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Patient pat: patients.getPatient()){
            Object[] row = new Object[12];
            row[0] = pat;
            row[1] = pat.getPatient().getName();
            row[1] = pat.getPatient().getId();
            row[2] = pat.getPatient().getAge();
            row[3] = pat.getPatient().getGender();
            row[4] = pat.getVitalsigns().getVisitdate();
            row[5] = pat.getVitalsigns().getHeight();
            row[6] = pat.getVitalsigns().getWeight();
            row[7] = pat.getVitalsigns().getTemperature();
            row[8] = pat.getVitalsigns().getBloodpressure();
            row[9] = pat.getVitalsigns().getPulse();
            row[10]= pat.getEncounter().getDiagnosis();
            row[11]= pat.getEncounter().getMedication();
            model.addRow(row);
    }
    }
}
