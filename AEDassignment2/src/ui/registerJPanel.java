/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import datamodel.DataManager;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Encounter;
import model.Patient;
import model.PersonDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author ashwini
 */
public class registerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addpatientJPanel
     */
    
    CardLayout c1;
    JPanel cards;
    
    public registerJPanel(JPanel cards) {
        this. cards = cards;
        this.c1 = (CardLayout) cards.getLayout();
        initComponents();
        //c.add(JPanel);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        pnameLabel = new javax.swing.JLabel();
        pIDLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        pnameField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        contactLabel = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        weightLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register New User ");

        pnameLabel.setText("User name :");

        temperatureLabel.setText("Address : ");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender");

        buttonGroup1.add(mRadioButton);
        mRadioButton.setText("Male");

        buttonGroup1.add(fRadioButton);
        fRadioButton.setText("Female");

        contactLabel.setText("Contact : ");

        weightLabel.setText("Email : ");

        ageLabel.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(temperatureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(weightLabel)
                                .addComponent(contactLabel)
                                .addComponent(pIDLabel)
                                .addComponent(pnameLabel)
                                .addComponent(genderLabel)
                                .addComponent(ageLabel))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(pnameField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(saveButton)))
                .addContainerGap(606, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameLabel)
                    .addComponent(pnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mRadioButton)
                        .addComponent(fRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(saveButton)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        String pname = pnameField.getText();
        int age = Integer.parseInt(ageField.getText());
        
        Patient p = new Patient();
        p.setName(pname);
        p.setAge(age);
     
        if((mRadioButton.isSelected())){
            p.setGender("male");
        }
        else{
            p.setGender("female");
        }
        
        
        
        DataManager.shared.patients.addnewpatient(p);
        
        JOptionPane.showMessageDialog(this,"New User Registered successfully!!!");

        pnameField.setText("");
        ageField.setText("");
        contactField.setText("");
        emailField.setText("");
        addressField.setText("");
        
        
        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactField;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JLabel pIDLabel;
    private javax.swing.JTextField pnameField;
    private javax.swing.JLabel pnameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
