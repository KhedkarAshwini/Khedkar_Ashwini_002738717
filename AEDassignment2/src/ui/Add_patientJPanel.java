/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import datamodel.DataManager;
import java.awt.CardLayout;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.PatientDirectory;
import model.*;

/**
 *
 * @author ashwini
 */
public class Add_patientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Add_patientJPanel
     */
    //PatientDirectory patients ;
    //Encounterhistory history;
    CardLayout c1;
    JPanel cards;
    
    public Add_patientJPanel(JPanel cards) {
        initComponents();
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
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        pnameField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        pnameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        contactField = new javax.swing.JTextField();
        weightLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        temperatureLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Patient Data ");

        mRadioButton.setText("Male");

        fRadioButton.setText("Female");

        ageLabel.setText("Age:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        pnameLabel.setText("Patient name :");

        genderLabel.setText("Gender");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        weightLabel.setText("Email : ");

        temperatureLabel.setText("Address : ");

        contactLabel.setText("Contact : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnameLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel)
                            .addComponent(temperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel)
                            .addComponent(contactLabel))
                        .addGap(294, 294, 294)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(pnameField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(backButton)
                        .addGap(49, 49, 49)
                        .addComponent(saveButton)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnameLabel)
                    .addComponent(pnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addGap(181, 181, 181))
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        c1.previous(cards);
        cards.remove(this);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        int val = 0;
        String pname = pnameField.getText();
        if(pname.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter input");
            val++;
        }
        if(pname.matches("-?\\d+")){
            JOptionPane.showMessageDialog(this,"Please enter a string value.");
            val++;
        }

        
        int age = Integer.parseInt(ageField.getText());
        try{
            if(age == 0){
                JOptionPane.showMessageDialog(this,"Please enter input");
                val++;
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this,nfe.getMessage());
        }
        
        String contact = contactField.getText();
        if(contact.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter input");
            val++;
        }
        if(contact.length() > 10 | contact.length() > 10){
            JOptionPane.showMessageDialog(this,"Please enter a 10 digit value");
            val++;
        }
        String email = emailField.getText();
        if(email.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter input");
            val++;
        }
        if(!email.contains("@")){
            JOptionPane.showMessageDialog(this,"Please enter valid email");
            val++;
        }
        String address = addressField.getText();
        if(address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter input");
            val++;
        }
        if(address.matches("-?\\d+")){
            JOptionPane.showMessageDialog(this,"Please enter a string value.");
            val++;
        }
        
        if(val == 0){
            Patient p = new Patient();
        
        DataManager.shared.patients.addnewpatient(p);
        

        p.setName(pname);
        p.setAge(age);
        p.setContact(contact);
        p.setEmail(email);
        p.setAddress(address);

        if((mRadioButton.isSelected())){
            p.setGender("male");
        }
        else{
            p.setGender("female");
        }

        

        pnameField.setText("");
        ageField.setText("");
        contactField.setText("");
        emailField.setText("");
        addressField.setText("");

        JOptionPane.showMessageDialog(this,"New Patient Details saved successfully!!!");
        }
        
        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JTextField pnameField;
    private javax.swing.JLabel pnameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
