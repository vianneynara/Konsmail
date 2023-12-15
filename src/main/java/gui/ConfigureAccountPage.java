/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import utils.Checker;
import utils.DatabaseUtils;
import utils.USwingAppearance;

import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import models.objects.Session;

/**
 *
 * @author narwa
 */
public class ConfigureAccountPage extends javax.swing.JDialog {
    Session session;
    /**
     * Creates new form RegisterPage
     */
    public ConfigureAccountPage(java.awt.Frame parent, boolean modal, Session session) {
        super(parent, modal);
        this.session = session;
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

        MAIN_PANEL = new javax.swing.JPanel();
        l_firstName = new javax.swing.JLabel();
        i_firstName = new javax.swing.JTextField();
        l_email = new javax.swing.JLabel();
        i_email = new javax.swing.JTextField();
        l_currentPassword = new javax.swing.JLabel();
        i_currentPassword = new javax.swing.JPasswordField();
        l_newPassword = new javax.swing.JLabel();
        i_newPassword = new javax.swing.JPasswordField();
        l_lastName = new javax.swing.JLabel();
        i_lastName = new javax.swing.JTextField();
        b_cancel = new javax.swing.JButton();
        b_save = new javax.swing.JButton();
        l_header = new javax.swing.JLabel();
        l_konsmailLogo = new javax.swing.JLabel();
        i_confirmNewPassword = new javax.swing.JPasswordField();
        l_confirmNewPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Konsmail: Configuring account");
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/konsmail_icon.png"))).getImage());
        setResizable(false);

        l_firstName.setLabelFor(i_firstName);
        l_firstName.setText("First Name");
        i_firstName.setText(session.getAccountFirstName());

        i_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_firstNameActionPerformed(evt);
            }
        });

        l_email.setLabelFor(i_email);
        l_email.setText("Email");
        i_email.setText(session.getAccountEmailAddress());

        i_email.setEditable(false);

        l_currentPassword.setLabelFor(i_currentPassword);
        l_currentPassword.setText("Current Password");

        i_currentPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        i_currentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_currentPasswordActionPerformed(evt);
            }
        });

        l_newPassword.setLabelFor(i_newPassword);
        l_newPassword.setText("New Password");

        i_newPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        l_lastName.setLabelFor(i_lastName);
        l_lastName.setText("Last Name");
        i_lastName.setText(session.getAccountLastName());

        b_cancel.setText("Cancel");
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });

        b_save.setText("Save");
        b_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveActionPerformed(evt);
            }
        });

        l_header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_header.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_header.setText("<html>Configuring your<br/>account</html>");

        l_konsmailLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/KonsmailMail_logo.png"))).getImage().getScaledInstance(194, 86, Image.SCALE_SMOOTH)));

        i_confirmNewPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        l_confirmNewPassword.setLabelFor(i_newPassword);
        l_confirmNewPassword.setText("Confirm New Password");

        javax.swing.GroupLayout MAIN_PANELLayout = new javax.swing.GroupLayout(MAIN_PANEL);
        MAIN_PANEL.setLayout(MAIN_PANELLayout);
        MAIN_PANELLayout.setHorizontalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_PANELLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(i_email)
                    .addComponent(i_currentPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                        .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(i_newPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MAIN_PANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_header)
                            .addComponent(l_firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_konsmailLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(i_confirmNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MAIN_PANELLayout.createSequentialGroup()
                        .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_newPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_currentPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_confirmNewPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        MAIN_PANELLayout.setVerticalGroup(
            MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_PANELLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_header, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(l_konsmailLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(i_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_currentPassword)
                .addGap(0, 0, 0)
                .addComponent(i_currentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_newPassword)
                .addGap(0, 0, 0)
                .addComponent(i_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_confirmNewPassword)
                .addGap(0, 0, 0)
                .addComponent(i_confirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(MAIN_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private boolean b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        String address = session.getAccountEmailAddress();
        String fName = i_firstName.getText();
        String lName = i_lastName.getText();

        if (fName.isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Are you sure that your name is right?",
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

        if (!DatabaseUtils.emailAddressAndPasswordMatches(address, String.valueOf(i_currentPassword.getPassword()))) {
            JOptionPane.showMessageDialog(
                    this,
                    "Incorrect password!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
                return false;
        }

        if (!Checker.isPasswordLengthValid(String.valueOf(i_newPassword.getPassword()))) {
            JOptionPane.showMessageDialog(
                    this,
                    "Password length must be between 8 and 128 characters long!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }   

        if (!String.valueOf(i_newPassword.getPassword()).equals(String.valueOf(i_confirmNewPassword.getPassword()))) {
            JOptionPane.showMessageDialog(
                    this,
                    "Passowrd and Password confirmation does not match!",
                    "Attention!",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        DatabaseUtils.updateAccount(fName, lName, address, String.valueOf(i_newPassword.getPassword()));
        DatabaseUtils.commitChanges();
        JOptionPane.showMessageDialog(
                    this,
                    "Changes saved successfuly.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        dispose();
        return true;
    }//GEN-LAST:event_b_saveActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_b_cancelActionPerformed

    private void i_currentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_currentPasswordActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_currentPasswordActionPerformed

    private void i_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_firstNameActionPerformed
        // TODO unused:
    }//GEN-LAST:event_i_firstNameActionPerformed

    // /**
    //  * @param args the command line arguments
    //  */
    // public static void main(String[] args) {
    //     /* Set the Nimbus look and feel */
    //     USwingAppearance.setLooksAndFeel();

    //     /* Create and display the dialog */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             ConfigureAccountPage dialog = new ConfigureAccountPage(new javax.swing.JFrame(), true);
    //             dialog.addWindowListener(new java.awt.event.WindowAdapter() {
    //                 @Override
    //                 public void windowClosing(java.awt.event.WindowEvent e) {
    //                     System.exit(0);
    //                 }
    //             });
    //             dialog.setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN_PANEL;
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_save;
    private javax.swing.JPasswordField i_confirmNewPassword;
    private javax.swing.JPasswordField i_currentPassword;
    private javax.swing.JTextField i_email;
    private javax.swing.JTextField i_firstName;
    private javax.swing.JTextField i_lastName;
    private javax.swing.JPasswordField i_newPassword;
    private javax.swing.JLabel l_confirmNewPassword;
    private javax.swing.JLabel l_currentPassword;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_firstName;
    private javax.swing.JLabel l_header;
    private javax.swing.JLabel l_konsmailLogo;
    private javax.swing.JLabel l_lastName;
    private javax.swing.JLabel l_newPassword;
    // End of variables declaration//GEN-END:variables
}
