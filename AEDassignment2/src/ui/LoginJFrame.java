/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import datamodel.DataManager;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Community;
import model.*;
import datamodel.DataManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ashwini
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
   Community cm;
   CardLayout cl;
   JPanel cards;
   
    public LoginJFrame() {
        
        initComponents();
        this.cl = new CardLayout();
        this.cards = new JPanel(cl);
        addListener();
        
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
        controllPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        userLabel = new javax.swing.JLabel();
        unameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        workPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setDividerLocation(160);

        jLabel2.setText("User Role : ");

        jComboBox1.setBackground(new java.awt.Color(102, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "SystemAdmin", "HospitalAdmin", "CommunityAdmin" }));

        userLabel.setText("Username ");

        passwordLabel.setText("Password ");

        loginButton.setBackground(new java.awt.Color(51, 51, 255));
        loginButton.setText("Login ");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 0, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controllPanelLayout = new javax.swing.GroupLayout(controllPanel);
        controllPanel.setLayout(controllPanelLayout);
        controllPanelLayout.setHorizontalGroup(
            controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unameField)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        controllPanelLayout.setVerticalGroup(
            controllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controllPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(userLabel)
                .addGap(18, 18, 18)
                .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controllPanel);

        workPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ashwini\\Documents\\1_BMZvNPfzgFwfJu0_ChVQOA.png")); // NOI18N
        workPanel.add(jLabel1, "card2");

        splitPane.setRightComponent(workPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        
        DataManager.shared.currentuserId = -1;
        String selectedfield = jComboBox1.getSelectedItem().toString();
        
        String username = unameField.getText();
        String password = passwordField.getText();
        
        if(username.equals("admin") & password.equals("admin") & selectedfield.equals("HospitalAdmin")){
            
            SysadminJPanel spanel = new SysadminJPanel(cards);
            cards.add(spanel, "SPanel");
            splitPane.setRightComponent(cards);
            cl.show(cards,"SPanel");
            
            
        }
        else if(selectedfield.equals("Doctor")){
            DoctorJPanel dpanel = new DoctorJPanel(cards);
            int did = DataManager.shared.doctors.fetchDoctorbyName(username).getId();
            DataManager.shared.currentuserId = did;
            cards.add(dpanel,"DPanel");
            splitPane.setRightComponent(cards);
            cl.show(cards, "DPanel");
        }
        else if(selectedfield.equals("Patient")){
            PatientJPanel ppanel = new PatientJPanel(cards);
            Patient patient = DataManager.shared.patients.fetchPatient(username);
            if(patient == null){
                JOptionPane.showMessageDialog(this, "Unregistered Patient User");
            } else {
                int pid = patient.getId();
                DataManager.shared.currentuserId = pid;
                System.out.println("Patient logged in with uname "+patient+" id "+pid+" "+patient.getCity());
                cards.add(ppanel,"PPanel");
                splitPane.setRightComponent(cards);
                cl.show(cards, "PPanel");
            }
            
        }
        else if(selectedfield.equals("CommunityAdmin")){
            HospitalCommunityJPanel hpanel = new HospitalCommunityJPanel(cards);
            cards.add(hpanel,"HPanel");
            splitPane.setRightComponent(cards);
            cl.show(cards, "PPanel");
        }
        else if(selectedfield.equals("HospitalAdmin")){
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid Username and password");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        registerJPanel dpanel = new registerJPanel(cards);
        cards.add(dpanel,"RegisterPanel");
        splitPane.setRightComponent(cards);
        cl.show(cards, "RegiserPanel");
    }//GEN-LAST:event_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controllPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField unameField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables

    private void addListener() {
        jComboBox1.addActionListener (new ActionListener () {
        public void actionPerformed(ActionEvent e) {
            cards.removeAll();
            splitPane.setRightComponent(workPanel);
            registerButton.setVisible(jComboBox1.getSelectedItem().equals("Patient"));
        }
    });
    }
}
