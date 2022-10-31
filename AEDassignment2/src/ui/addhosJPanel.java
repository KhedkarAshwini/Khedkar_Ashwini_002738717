/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author ashwini
 */
public class addhosJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addhosJPanel
     */
    HospitalDirectory hospitals;
    JPanel cards;
    CardLayout cl;
    public addhosJPanel(HospitalDirectory hos, JPanel cards) {
        this.hospitals =hos;
        this.cards = cards;
        this.cl =  (CardLayout)cards.getLayout();
        initComponents();
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
        cityLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        communityLabel = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        hnameLabel = new javax.swing.JLabel();
        hnameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        zipField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Hospital");

        cityLabel.setText("City : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Boston", "New York", "Chicago" }));

        communityLabel.setText("Community : ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Fenway", "Mission Hill", "Cambridge" }));

        hnameLabel.setText("Hospital Name : ");

        jLabel2.setText("Contact : ");

        jLabel3.setText("Email : ");

        jButton1.setBackground(new java.awt.Color(51, 0, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Zip : ");

        jLabel5.setText("Address : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 120, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hnameField)
                            .addComponent(contactField)
                            .addComponent(emailField)
                            .addComponent(zipField)
                            .addComponent(addressField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton2)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hnameLabel)
                    .addComponent(hnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cl.previous(cards);
        cards.remove(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int val = 0;
        String selectedcity = jComboBox1.getSelectedItem().toString();
        
        String selectedcommunity = jComboBox2.getSelectedItem().toString();
        
        String hname = hnameField.getText();
        if(hname.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter input");
            val++;
        }
        if(hname.matches("-?\\d+")){
            JOptionPane.showMessageDialog(this,"Please enter a string value.");
            val++;
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
        String zip = zipField.getText();
        if(contact.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter input");
            val++;
        }
        if(contact.length() > 5 | contact.length() > 5){
            JOptionPane.showMessageDialog(this,"Please enter a 5 digit value");
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
        Hospital h = new Hospital();
        
        h.setCity(selectedcity);
        h.setCommunity(selectedcommunity);
        h.setHosname(hname);
        h.setContact(contact);
        h.setEmail(email);
        h.setZipcode(zip);
        h.setAddress(address);
        
        
        hnameField.setText("");
        contactField.setText("");
        emailField.setText("");
        zipField.setText("");
        addressField.setText("");
        
        Hospital hosp = hospitals.addnewhospital(h);
        
        JOptionPane.showMessageDialog(this,"New Hospital Info added successfully!!!");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField hnameField;
    private javax.swing.JLabel hnameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField zipField;
    // End of variables declaration//GEN-END:variables
}
