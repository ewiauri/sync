
package sync.LoginReg;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Font;
import javaswingdev.main.Home;
import javax.swing.UIManager;

public class LogIn extends javax.swing.JFrame {


    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        userlogTXT = new javax.swing.JLabel();
        UnameTXT = new javax.swing.JLabel();
        unameTF = new javax.swing.JTextField();
        passTXT = new javax.swing.JLabel();
        passwdTF = new javax.swing.JPasswordField();
        loginBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        signINtxt = new javax.swing.JLabel();
        signupBTN = new javax.swing.JButton();
        bgLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setMaximumSize(new java.awt.Dimension(900, 500));
        bg.setMinimumSize(new java.awt.Dimension(900, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlogTXT.setForeground(new java.awt.Color(255, 255, 255));
        userlogTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userlogTXT.setText("Login User");
        bg.add(userlogTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 260, 110));

        UnameTXT.setForeground(new java.awt.Color(255, 255, 255));
        UnameTXT.setText("Username");
        bg.add(UnameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 120, 40));

        unameTF.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(unameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 260, 40));

        passTXT.setForeground(new java.awt.Color(255, 255, 255));
        passTXT.setText("Password");
        bg.add(passTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 130, 40));

        passwdTF.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(passwdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 260, 40));

        loginBTN.setBackground(new java.awt.Color(153, 153, 255));
        loginBTN.setForeground(new java.awt.Color(255, 255, 255));
        loginBTN.setText("Log in");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });
        bg.add(loginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 120, 40));

        cancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });
        bg.add(cancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 120, 40));

        signINtxt.setForeground(new java.awt.Color(255, 255, 255));
        signINtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signINtxt.setText("Don't have an account yet?");
        bg.add(signINtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 260, 40));

        signupBTN.setBackground(new java.awt.Color(153, 153, 255));
        signupBTN.setForeground(new java.awt.Color(255, 255, 255));
        signupBTN.setText("Sign up");
        signupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBTNActionPerformed(evt);
            }
        });
        bg.add(signupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 120, 40));

        bgLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sync/Graphics/BG.png"))); // NOI18N
        bg.add(bgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBTNActionPerformed

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
            Home hm = new Home();
            hm.setVisible(true);
            
    }//GEN-LAST:event_loginBTNActionPerformed

    private void signupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBTNActionPerformed
        Registration reg = new Registration();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupBTNActionPerformed

    public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("sync.theme");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY, Font.BOLD, 14));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UnameTXT;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgLogin;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JButton loginBTN;
    private javax.swing.JLabel passTXT;
    private javax.swing.JPasswordField passwdTF;
    private javax.swing.JLabel signINtxt;
    private javax.swing.JButton signupBTN;
    private javax.swing.JTextField unameTF;
    private javax.swing.JLabel userlogTXT;
    // End of variables declaration//GEN-END:variables
}
