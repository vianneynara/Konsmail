/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author narwa
 */
public class MailboxPage extends javax.swing.JFrame {

    /**
     * Creates new form MailboxPage
     */
    public MailboxPage() {
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

        MAIN_CONTAINER = new javax.swing.JPanel();
        TOOL_BAR = new javax.swing.JPanel();
        i_inboxType = new javax.swing.JComboBox<>();
        b_createMail = new javax.swing.JButton();
        b_findMail1 = new javax.swing.JButton();
        INBOX_SCROLLPANE = new javax.swing.JScrollPane();
        MAIL_VIEW = new javax.swing.JPanel();
        MAIL_HEADER = new javax.swing.JPanel();
        MAIL_BODY_SCROLLPANE = new javax.swing.JScrollPane();
        MAIL_FOOTER = new javax.swing.JPanel();
        l_konsmail = new javax.swing.JLabel();
        MAIL_TOOLS = new javax.swing.JPanel();
        b_mailReply = new javax.swing.JButton();
        b_mailFlag = new javax.swing.JButton();
        b_mailMarkUnread = new javax.swing.JButton();
        b_mailReport = new javax.swing.JButton();
        b_mailBlock = new javax.swing.JButton();
        b_mailMarkSpam = new javax.swing.JButton();
        MAILBOX_FINDPANE = new javax.swing.JPanel();
        i_searchBar = new javax.swing.JTextField();
        b_findMail = new javax.swing.JButton();
        WINDOW_MENU_BAR = new javax.swing.JMenuBar();
        m_userMenu = new javax.swing.JMenu();
        m_configureAccount = new javax.swing.JMenuItem();
        m_signOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konsmail: Mailbox");
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/konsmail_icon.png"))).getImage());
        setResizable(false);

        MAIN_CONTAINER.setBackground(new java.awt.Color(255, 255, 255));

        i_inboxType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        i_inboxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main Inbox", "All Inboxes", "Promotions", "Spam" }));
        i_inboxType.setPreferredSize(new java.awt.Dimension(76, 30));
        i_inboxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_inboxTypeActionPerformed(evt);
            }
        });

        b_createMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_createMail.setText("Create Mail");
        b_createMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createMailActionPerformed(evt);
            }
        });

        b_findMail1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_findMail1.setText("Refresh");
        b_findMail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_findMail1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TOOL_BARLayout = new javax.swing.GroupLayout(TOOL_BAR);
        TOOL_BAR.setLayout(TOOL_BARLayout);
        TOOL_BARLayout.setHorizontalGroup(
            TOOL_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TOOL_BARLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_findMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(i_inboxType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(b_createMail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TOOL_BARLayout.setVerticalGroup(
            TOOL_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TOOL_BARLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TOOL_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_createMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_inboxType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_findMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        MAIL_HEADER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        javax.swing.GroupLayout MAIL_HEADERLayout = new javax.swing.GroupLayout(MAIL_HEADER);
        MAIL_HEADER.setLayout(MAIL_HEADERLayout);
        MAIL_HEADERLayout.setHorizontalGroup(
            MAIL_HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MAIL_HEADERLayout.setVerticalGroup(
            MAIL_HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        MAIL_BODY_SCROLLPANE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        MAIL_BODY_SCROLLPANE.setForeground(new java.awt.Color(153, 153, 153));

        MAIL_FOOTER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        javax.swing.GroupLayout MAIL_FOOTERLayout = new javax.swing.GroupLayout(MAIL_FOOTER);
        MAIL_FOOTER.setLayout(MAIL_FOOTERLayout);
        MAIL_FOOTERLayout.setHorizontalGroup(
            MAIL_FOOTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        MAIL_FOOTERLayout.setVerticalGroup(
            MAIL_FOOTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        l_konsmail.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/KonsmailMail_logo.png"))).getImage().getScaledInstance(194, 86, Image.SCALE_SMOOTH)));

        javax.swing.GroupLayout MAIL_VIEWLayout = new javax.swing.GroupLayout(MAIL_VIEW);
        MAIL_VIEW.setLayout(MAIL_VIEWLayout);
        MAIL_VIEWLayout.setHorizontalGroup(
            MAIL_VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_VIEWLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MAIL_VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIL_VIEWLayout.createSequentialGroup()
                        .addComponent(MAIL_FOOTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_konsmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MAIL_VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MAIL_BODY_SCROLLPANE, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                        .addComponent(MAIL_HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        MAIL_VIEWLayout.setVerticalGroup(
            MAIL_VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_VIEWLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(MAIL_HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MAIL_BODY_SCROLLPANE, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MAIL_VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_konsmail, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(MAIL_FOOTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        b_mailReply.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailReply.setText("Reply");
        b_mailReply.setEnabled(false);
        b_mailReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailReplyActionPerformed(evt);
            }
        });

        b_mailFlag.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailFlag.setText("Flag");
        b_mailFlag.setEnabled(false);
        b_mailFlag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailFlagActionPerformed(evt);
            }
        });

        b_mailMarkUnread.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailMarkUnread.setText("Mark Unread");
        b_mailMarkUnread.setEnabled(false);
        b_mailMarkUnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailMarkUnreadActionPerformed(evt);
            }
        });

        b_mailReport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailReport.setText("Report");
        b_mailReport.setEnabled(false);
        b_mailReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailReportActionPerformed(evt);
            }
        });

        b_mailBlock.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailBlock.setText("Block");
        b_mailBlock.setEnabled(false);
        b_mailBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailBlockActionPerformed(evt);
            }
        });

        b_mailMarkSpam.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        b_mailMarkSpam.setText("Mark Spam");
        b_mailMarkSpam.setEnabled(false);
        b_mailMarkSpam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mailMarkSpamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MAIL_TOOLSLayout = new javax.swing.GroupLayout(MAIL_TOOLS);
        MAIL_TOOLS.setLayout(MAIL_TOOLSLayout);
        MAIL_TOOLSLayout.setHorizontalGroup(
            MAIL_TOOLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_TOOLSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MAIL_TOOLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_mailMarkSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mailBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mailReport, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mailMarkUnread, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mailFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mailReply, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        MAIL_TOOLSLayout.setVerticalGroup(
            MAIL_TOOLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIL_TOOLSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(b_mailReply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_mailFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_mailMarkUnread, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_mailMarkSpam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_mailBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_mailReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        i_searchBar.setText("Search mail here...");
        i_searchBar.setPreferredSize(new java.awt.Dimension(77, 30));
        i_searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_searchBarActionPerformed(evt);
            }
        });

        b_findMail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_findMail.setText("Find");
        b_findMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_findMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MAILBOX_FINDPANELayout = new javax.swing.GroupLayout(MAILBOX_FINDPANE);
        MAILBOX_FINDPANE.setLayout(MAILBOX_FINDPANELayout);
        MAILBOX_FINDPANELayout.setHorizontalGroup(
            MAILBOX_FINDPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAILBOX_FINDPANELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(i_searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_findMail)
                .addContainerGap())
        );
        MAILBOX_FINDPANELayout.setVerticalGroup(
            MAILBOX_FINDPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAILBOX_FINDPANELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MAILBOX_FINDPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i_searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_findMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout MAIN_CONTAINERLayout = new javax.swing.GroupLayout(MAIN_CONTAINER);
        MAIN_CONTAINER.setLayout(MAIN_CONTAINERLayout);
        MAIN_CONTAINERLayout.setHorizontalGroup(
            MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TOOL_BAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MAIN_CONTAINERLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INBOX_SCROLLPANE, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MAILBOX_FINDPANE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_VIEW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MAIN_CONTAINERLayout.setVerticalGroup(
            MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_CONTAINERLayout.createSequentialGroup()
                .addComponent(TOOL_BAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MAIN_CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MAIL_VIEW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MAIL_TOOLS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_CONTAINERLayout.createSequentialGroup()
                        .addComponent(MAILBOX_FINDPANE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INBOX_SCROLLPANE)))
                .addContainerGap())
        );

        m_userMenu.setText("usr: nara@konsmail.dev");

        m_configureAccount.setText("Configure Account");
        m_configureAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_configureAccountActionPerformed(evt);
            }
        });
        m_configureAccount.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/gear_icon.png"))).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
        m_userMenu.add(m_configureAccount);

        m_signOut.setText("Sign Out");
        m_signOut.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/signout_icon.png"))).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
        m_userMenu.add(m_signOut);

        WINDOW_MENU_BAR.add(m_userMenu);

        setJMenuBar(WINDOW_MENU_BAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Mailbox");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_configureAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_configureAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_configureAccountActionPerformed

    private void i_searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_searchBarActionPerformed

    private void i_inboxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_inboxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_inboxTypeActionPerformed

    private void b_createMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_createMailActionPerformed

    private void b_mailReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailReplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailReplyActionPerformed

    private void b_mailFlagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailFlagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailFlagActionPerformed

    private void b_mailMarkUnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailMarkUnreadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailMarkUnreadActionPerformed

    private void b_mailReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailReportActionPerformed

    private void b_mailBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailBlockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailBlockActionPerformed

    private void b_mailMarkSpamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mailMarkSpamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mailMarkSpamActionPerformed

    private void b_findMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_findMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_findMailActionPerformed

    private void b_findMail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_findMail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_findMail1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(MailboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailboxPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane INBOX_SCROLLPANE;
    private javax.swing.JPanel MAILBOX_FINDPANE;
    private javax.swing.JScrollPane MAIL_BODY_SCROLLPANE;
    private javax.swing.JPanel MAIL_FOOTER;
    private javax.swing.JPanel MAIL_HEADER;
    private javax.swing.JPanel MAIL_TOOLS;
    private javax.swing.JPanel MAIL_VIEW;
    private javax.swing.JPanel MAIN_CONTAINER;
    private javax.swing.JPanel TOOL_BAR;
    private javax.swing.JMenuBar WINDOW_MENU_BAR;
    private javax.swing.JButton b_createMail;
    private javax.swing.JButton b_findMail;
    private javax.swing.JButton b_findMail1;
    private javax.swing.JButton b_mailBlock;
    private javax.swing.JButton b_mailFlag;
    private javax.swing.JButton b_mailMarkSpam;
    private javax.swing.JButton b_mailMarkUnread;
    private javax.swing.JButton b_mailReply;
    private javax.swing.JButton b_mailReport;
    private javax.swing.JComboBox<String> i_inboxType;
    private javax.swing.JTextField i_searchBar;
    private javax.swing.JLabel l_konsmail;
    private javax.swing.JMenuItem m_configureAccount;
    private javax.swing.JMenuItem m_signOut;
    private javax.swing.JMenu m_userMenu;
    // End of variables declaration//GEN-END:variables
}
