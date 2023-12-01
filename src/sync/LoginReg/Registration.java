
package sync.LoginReg;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Font;
import javax.swing.UIManager;


public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGRBTN = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        regTXT = new javax.swing.JLabel();
        genderTXT = new javax.swing.JLabel();
        nameTXT = new javax.swing.JLabel();
        courseTXT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        studnumTF = new javax.swing.JTextField();
        namestudTF = new javax.swing.JTextField();
        courseYrTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yearCB = new javax.swing.JComboBox<>();
        genderCB = new javax.swing.JComboBox<>();
        createBTN = new javax.swing.JButton();
        cancelSignupBTN = new javax.swing.JButton();
        haveaccountTXT = new javax.swing.JLabel();
        loginbackBTN = new javax.swing.JButton();
        regBGPn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regTXT.setBackground(new java.awt.Color(255, 255, 255));
        regTXT.setForeground(new java.awt.Color(255, 255, 255));
        regTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regTXT.setText("Registration Form");
        jPanel1.add(regTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        genderTXT.setForeground(new java.awt.Color(255, 255, 255));
        genderTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderTXT.setText("Gender:");
        jPanel1.add(genderTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 90, 50));

        nameTXT.setForeground(new java.awt.Color(255, 255, 255));
        nameTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameTXT.setText("Name:");
        jPanel1.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, 30));

        courseTXT.setForeground(new java.awt.Color(255, 255, 255));
        courseTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        courseTXT.setText("Course:");
        jPanel1.add(courseTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 110, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Student Num. :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, 30));
        jPanel1.add(studnumTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 30));

        namestudTF.setText("\n");
        namestudTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namestudTFActionPerformed(evt);
            }
        });
        jPanel1.add(namestudTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 170, 30));

        courseYrTF.setText("\n");
        jPanel1.add(courseYrTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 170, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Year:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 50));

        yearCB.setForeground(new java.awt.Color(255, 255, 255));
        yearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Year", "Second Year", "Third Year", "Fourth Year" }));
        jPanel1.add(yearCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 170, 30));

        genderCB.setForeground(new java.awt.Color(255, 255, 255));
        genderCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel1.add(genderCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, 30));

        createBTN.setBackground(new java.awt.Color(0, 0, 0));
        createBTN.setForeground(new java.awt.Color(153, 153, 255));
        createBTN.setText("Create");
        createBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBTNActionPerformed(evt);
            }
        });
        jPanel1.add(createBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 130, -1));

        cancelSignupBTN.setText("Cancel");
        cancelSignupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSignupBTNActionPerformed(evt);
            }
        });
        jPanel1.add(cancelSignupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 130, -1));

        haveaccountTXT.setForeground(new java.awt.Color(255, 255, 255));
        haveaccountTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        haveaccountTXT.setText("Already have an account?");
        jPanel1.add(haveaccountTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 240, 30));

        loginbackBTN.setBackground(new java.awt.Color(153, 153, 255));
        loginbackBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginbackBTN.setForeground(new java.awt.Color(255, 255, 255));
        loginbackBTN.setText("Log in");
        loginbackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbackBTNActionPerformed(evt);
            }
        });
        jPanel1.add(loginbackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 120, -1));

        regBGPn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sync/Graphics/RegBG.png"))); // NOI18N
        jPanel1.add(regBGPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namestudTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namestudTFActionPerformed
        
    }//GEN-LAST:event_namestudTFActionPerformed

    private void cancelSignupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSignupBTNActionPerformed

        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelSignupBTNActionPerformed

    private void createBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBTNActionPerformed
     
        
    }//GEN-LAST:event_createBTNActionPerformed

    private void loginbackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbackBTNActionPerformed
        LogIn login = new LogIn();
            login.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_loginbackBTNActionPerformed

    public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("sync.theme");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY, Font.BOLD, 14));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelSignupBTN;
    private javax.swing.JLabel courseTXT;
    private javax.swing.JTextField courseYrTF;
    private javax.swing.JButton createBTN;
    private javax.swing.JComboBox<String> genderCB;
    private javax.swing.ButtonGroup genderGRBTN;
    private javax.swing.JLabel genderTXT;
    private javax.swing.JLabel haveaccountTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbackBTN;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JTextField namestudTF;
    private javax.swing.JLabel regBGPn;
    private javax.swing.JLabel regTXT;
    private javax.swing.JTextField studnumTF;
    private javax.swing.JComboBox<String> yearCB;
    // End of variables declaration//GEN-END:variables
}
