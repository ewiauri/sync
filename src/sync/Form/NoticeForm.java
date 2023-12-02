
package sync.Form;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Font;
import javaswingdev.main.Home;
import javax.swing.UIManager;
import sync.Form.Notice.ModelNoticeBoard;


public class NoticeForm extends javax.swing.JPanel {

    public NoticeForm() {
        initComponents();
        initNoticeBoard();
    }
    
    private void initNoticeBoard() {
        noticeBoard.addDate("12/04/2023");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(200, 162,200), "[System]", "Now.", "Welcome back to Class Sync!"));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(200, 49, 200), "[System]", "2h ago", "Hello again! Feeling unmotivated? Remember, every challenge is an opportunity to grow. You've got this! Class Sync is here to support your journey. Let's turn those challenges into achievements together!"));
        noticeBoard.addDate("11/11/2023");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(200, 171, 200), "[System]", "12:30 PM", "Greetings! We're thrilled to welcome you to Class Sync, where classes become a breeze. Explore, connect, and elevate your educational experience."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(200, 93, 200), "[System]", "10:30 AM", "Exciting times ahead! You're now a part of Class Sync, where education meets innovation. Let's embark on this learning adventure together."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(200, 188, 200), "[System]", "9:00 AM", "Congratulations on joining Class Sync! Your gateway to seamless class management and collaboration. Get ready to synchronize your learning journey effortlessly."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(200, 46, 200), "[System]", "7:15 AM", "Welcome to Class Sync!"));
        noticeBoard.scrollToTop();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile1 = new com.raven.component.Profile();
        noticeBoard = new sync.Form.Notice.NoticeBoard();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 500));

        noticeBoard.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sync/Graphics/csynch logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sync/Graphics/NoticeBoard.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(noticeBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

        public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("sync.theme");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY, Font.BOLD, 16));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private sync.Form.Notice.NoticeBoard noticeBoard;
    private com.raven.component.Profile profile1;
    // End of variables declaration//GEN-END:variables
}
