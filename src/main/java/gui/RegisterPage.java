/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import java.util.UUID;

import models.objects.Account;
import utils.*;

/**
 * This is the register page GUI of the application. It is used to create accounts, registering them
 * into the database.
 *
 * @author <a href="https://github.com/vianneynara">Nara</a>
 * @author <a href="https://github.com/trustacean">Edward</a>
 */

public class RegisterPage extends javax.swing.JDialog {

    private final String DEFAULT_DOMAIN = "@konsmail.dev";

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // Sets background, panels, buttons colors
        ComponentUtils.setBackgroundColor(UColors.IVORY.toColor(), MAIN_PANEL);
        ComponentUtils.setBackgroundColor(UColors.BRIGHT_GREEN.toColor(), b_register);
        ComponentUtils.setBackgroundColor(UColors.BRIGHT_ORANGE.toColor(), b_back);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_PANEL = new javax.swing.JPanel();
        l_firstName = new javax.swing.JLabel();
        i_firstName = new javax.swing.JTextField();
        l_email = new javax.swing.JLabel();
        i_email = new javax.swing.JTextField();
        l_password = new javax.swing.JLabel();
        i_password = new javax.swing.JPasswordField();
        l_confirmPassword = new javax.swing.JLabel();
        i_confirmPassword = new javax.swing.JPasswordField();
        l_lastName = new javax.swing.JLabel();
        i_lastName = new javax.swing.JTextField();
        l_konsmailLogo = new javax.swing.JLabel();
        b_back = new javax.swing.JButton();
        b_register = new javax.swing.JButton();
        l_header = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konsmail: Register new account");
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/konsmail_icon.png"))).getImage());

        l_firstName.setLabelFor(i_firstName);
        l_firstName.setText("First Name");

        i_firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_firstNameFocusLost(evt);
            }
        });

        l_email.setLabelFor(i_email);
        l_email.setText("Email");

        i_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_emailFocusLost(evt);
            }
        });

        l_password.setLabelFor(i_password);
        l_password.setText("Password");

        i_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        l_confirmPassword.setLabelFor(i_confirmPassword);
        l_confirmPassword.setText("Confirm Password");

        i_confirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        l_lastName.setLabelFor(i_lastName);
        l_lastName.setText("Last Name (optional)");

        i_lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_lastNameFocusLost(evt);
            }
        });

        l_konsmailLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/KonsmailMail_logo.png"))).getImage().getScaledInstance(194, 86, Image.SCALE_SMOOTH)));

        b_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_back.setText("Back");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });

        b_register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_register.setText("Register");
        b_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registerActionPerformed(evt);
            }
        });

        l_header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_header.setText("<html>Register a new<br/>Konsmail account</html>");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("@konsmail.dev");

        javax.swing.GroupLayout MAIN_PANELLayout = new javax.swing.GroupLayout(MAIN_PANEL);
        MAIN_PANEL.setLayout(MAIN_PANELLayout);
        MAIN_PANELLayout.setHorizontalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_PANELLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(i_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(i_confirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(l_konsmailLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l_header, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(i_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(l_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(i_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(l_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                                .addComponent(i_email, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                    .addComponent(l_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_confirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        MAIN_PANELLayout.setVerticalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_konsmailLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_header, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(l_lastName)
                        .addGap(0, 0, 0)
                        .addComponent(i_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(l_firstName)
                        .addGap(0, 0, 0)
                        .addComponent(i_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_email)
                .addGap(0, 0, 0)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(i_email, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_password)
                .addGap(0, 0, 0)
                .addComponent(i_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_confirmPassword)
                .addGap(0, 0, 0)
                .addComponent(i_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_register, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean b_registerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_registerActionPerformed
        String fName = i_firstName.getText().trim();
        String lName = i_lastName.getText().trim();
        String address = i_email.getText().trim().toLowerCase();
        String pass = String.valueOf(i_password.getPassword());
        String confPass = String.valueOf(i_confirmPassword.getPassword()).trim();

        if (fName.isEmpty() || address.isEmpty() || pass.isEmpty() ){
            JOptionPane.showMessageDialog(
                    this,
                    "Please fill all the fields!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (Checker.containsNonAlpha(fName) || Checker.containsNonAlpha(lName)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Name can not contain non alpha!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!Checker.isEmailAddressValid(address)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Email address must be between 4 and 30 characters long!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (Checker.containsNonAlphanumeric(address)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Email can not contain symbols!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!Checker.isPasswordLengthValid(pass)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Password length must be between 8 and 128 characters long!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!pass.equals(confPass)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Passowrd and Password confirmation does not match!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Adds default domain
        address += DEFAULT_DOMAIN;

        if (DatabaseUtils.emailAddressExists(address)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Email already exist!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        DatabaseUtils.insertAccount(new Account(fName, lName, address, pass, UUID.randomUUID().toString()));
        
        resetField();
        JOptionPane.showMessageDialog(
                    this,
                    "Account created successfully.",
                    "Congratulations!",
                    JOptionPane.INFORMATION_MESSAGE);
        b_backActionPerformed(evt);
        return true;

    }// GEN-LAST:event_b_registerActionPerformed

    private void resetField() {
        i_firstName.setText("");
        i_lastName.setText("");
        i_email.setText("");
        i_password.setText("");
        i_confirmPassword.setText("");
    }

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_b_backActionPerformed
        this.dispose();
    }// GEN-LAST:event_b_backActionPerformed

    private void i_firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_firstNameFocusLost
        l_firstName.setText("First Name");
        ComponentUtils.setForegroundColor(0x000000, l_firstName);

        if (i_firstName.getText().isEmpty()) {
            l_firstName.setText("First Name (Required!)");
            ComponentUtils.setForegroundColor(0xdc143c, l_firstName);
        }
        if (Checker.containsNonAlpha(i_firstName.getText().trim())) {
            l_firstName.setText("First Name (Invalid!)");
            ComponentUtils.setForegroundColor(0xdc143c, l_firstName);
        }
    }//GEN-LAST:event_i_firstNameFocusLost

    private void i_lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_lastNameFocusLost
        l_lastName.setText("Last Name (optional)");
        ComponentUtils.setForegroundColor(0x000000, l_lastName);

        if (Checker.containsNonAlpha(i_lastName.getText().trim())) {
            l_lastName.setText("Last Name (Invalid!)");
            ComponentUtils.setForegroundColor(0xdc143c, l_lastName);
        }
    }//GEN-LAST:event_i_lastNameFocusLost

    private void i_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_emailFocusLost
        l_email.setText("Email");
        ComponentUtils.setForegroundColor(0x000000, l_email);

        if (i_email.getText().isEmpty()) {
            l_email.setText("Email (Required!)");
            ComponentUtils.setForegroundColor(0xdc143c, l_email);
        }
        if (Checker.containsNonAlphanumeric(i_email.getText())) {
            l_email.setText("Email (Invalid!)");
            ComponentUtils.setForegroundColor(0xdc143c, l_email);
        }
        if (!Checker.isEmailAddressValid(i_email.getText())) {
            l_email.setText("Email (Invalid!)");
            ComponentUtils.setForegroundColor(0xdc143c, l_email);
        }
    }//GEN-LAST:event_i_emailFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN_PANEL;
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_register;
    private javax.swing.JPasswordField i_confirmPassword;
    private javax.swing.JTextField i_email;
    private javax.swing.JTextField i_firstName;
    private javax.swing.JTextField i_lastName;
    private javax.swing.JPasswordField i_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l_confirmPassword;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_firstName;
    private javax.swing.JLabel l_header;
    private javax.swing.JLabel l_konsmailLogo;
    private javax.swing.JLabel l_lastName;
    private javax.swing.JLabel l_password;
    // End of variables declaration//GEN-END:variables
}
