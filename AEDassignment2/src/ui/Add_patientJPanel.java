/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.PatientDirectory;
import model.Person;
import model.Encounter;
import model.VitalSigns;
import model.Patient;

/**
 *
 * @author ashwini
 */
public class Add_patientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Add_patientJPanel
     */
    PatientDirectory patients ;
    CardLayout c1;
    JPanel cards;
    
    public Add_patientJPanel(PatientDirectory pa, JPanel cards) {
        initComponents();
        this.patients = pa;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        hLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        diagnosisLabel = new javax.swing.JLabel();
        pidField = new javax.swing.JTextField();
        temperatureField = new javax.swing.JTextField();
        pnameField = new javax.swing.JTextField();
        pulseField = new javax.swing.JTextField();
        bloodpressureField = new javax.swing.JTextField();
        diagnosisField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        pnameLabel = new javax.swing.JLabel();
        pIDLabel = new javax.swing.JLabel();
        visitdateLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        BPLabel = new javax.swing.JLabel();
        pulseLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        visitdatePicker = new org.jdesktop.swingx.JXDatePicker();
        genderLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Patient Data ");

        mRadioButton.setText("Male");

        fRadioButton.setText("Female");

        hLabel.setText("Height :");

        ageLabel.setText("Age:");

        diagnosisLabel.setText("Diagnosis :");

        bloodpressureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodpressureFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        pnameLabel.setText("Patient name :");

        pIDLabel.setText("Patient ID :");

        visitdateLabel.setText("Visit Date :");

        temperatureLabel.setText("Temperature :");

        BPLabel.setText("Blood Pressure :");

        pulseLabel.setText("Pulse :");

        weightLabel.setText("Weight :");

        genderLabel.setText("Gender");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diagnosisLabel)
                            .addComponent(pulseLabel)
                            .addComponent(BPLabel)
                            .addComponent(temperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel)
                            .addComponent(visitdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pIDLabel)
                            .addComponent(pnameLabel)
                            .addComponent(genderLabel)
                            .addComponent(ageLabel)
                            .addComponent(hLabel))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(temperatureField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bloodpressureField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pulseField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(diagnosisField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pnameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pidField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(visitdatePicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weightField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(backButton)
                        .addGap(34, 34, 34)
                        .addComponent(saveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameLabel)
                    .addComponent(pnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pIDLabel)
                    .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mRadioButton)
                        .addComponent(fRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visitdateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(visitdatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weightLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hLabel)
                            .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(temperatureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPLabel)
                    .addComponent(bloodpressureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseLabel)
                    .addComponent(pulseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diagnosisLabel)
                    .addComponent(diagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bloodpressureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodpressureFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodpressureFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        String pname = pnameField.getText();
        int pid = Integer.parseInt(pidField.getText());
        int age = Integer.parseInt(ageField.getText());

        Date sdate = visitdatePicker.getDate();
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String visitdate = simpleDateFormat.format(sdate);

        double temp = Double.parseDouble(temperatureField.getText());
        double bp = Double.parseDouble(bloodpressureField.getText());
        double pulse = Double.parseDouble(pulseField.getText());
        double height = Double.parseDouble(heightField.getText());
        double weight = Double.parseDouble(weightField.getText());
        String d = diagnosisField.getText();

        Person per = new Person();
        per.setName(pname);
        per.setId(pid);
        per.setAge(age);

        if((mRadioButton.isSelected())){
            per.setGender("male");
        }
        else{
            per.setGender("female");
        }

        VitalSigns vs = new VitalSigns();
        Encounter e = new Encounter(vs);
        e.setVisitdate(visitdate);
        vs.setTemperature(temp);
        vs.setBloodpressure(bp);
        vs.setPulse(pulse);
        vs.setHeight(temp);
        vs.setWeight(weight);
        e.setDiagnosis(d);
        Patient p = patients.addnewpatient(per,vs,e);

        JOptionPane.showMessageDialog(this,"New Patient Details saved successfully!!!");

    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        c1.previous(cards);
        cards.remove(this);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bloodpressureField;
    private javax.swing.JTextField diagnosisField;
    private javax.swing.JLabel diagnosisLabel;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hLabel;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JLabel pIDLabel;
    private javax.swing.JTextField pidField;
    private javax.swing.JTextField pnameField;
    private javax.swing.JLabel pnameLabel;
    private javax.swing.JTextField pulseField;
    private javax.swing.JLabel pulseLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField temperatureField;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel visitdateLabel;
    private org.jdesktop.swingx.JXDatePicker visitdatePicker;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
