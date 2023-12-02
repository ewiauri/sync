
package javaswingdev.main;
    
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Component;
import java.awt.Font;
import javaswingdev.menu.EventMenuSelected;
import javax.swing.UIManager;
import sync.Form.CourseForm;
import sync.Form.DashboardForm;
import sync.Form.NoticeForm;
import sync.Form.ProfileForm;
import sync.Form.SchedForm;
import sync.LoginReg.LogIn;

public class Home extends javax.swing.JFrame {
    
    private static Home home; 
//    private static Home home;
//    private JFrame frame; 
//    private JPanel bodyPanel;
//    private Menu menu;
    
    public Home() {
        initComponents();
        init(); 
    }
    
    private void init(){
        home = this;    
        menu.addEvent(new EventMenuSelected(){
        public void menuSelected(int index, int indexSubMenu){
        if(index == 0 && indexSubMenu == 0){
                        showForm(new DashboardForm());
            }else if(index == 1 && indexSubMenu == 0) {
                        showForm(new CourseForm());
                }else if(index == 2 && indexSubMenu == 0) {
                        showForm(new NoticeForm());
                    }else if(index == 3 && indexSubMenu == 0){
                        showForm(new SchedForm());
                        }else if(index == 4 && indexSubMenu == 0){
                        showForm(new ProfileForm());
                        }else {
                            LogIn login = new LogIn();
                            login.setVisible(true);
                            home.dispose();
                        }
                    }
                });
                menu.setSelectedIndex(0, 0);
    }
    
    public void showForm(Component com){
        bodyPanel.removeAll();
        bodyPanel.add(com);
        bodyPanel.repaint();
        bodyPanel.revalidate();
        
    }
        public static Home getHome(){
            return home;    
        }
//        public JFrame getFrame() {
//        return frame;
//        }
        
        
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menu = new javaswingdev.menu.Menu();
        iconTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanel.setBackground(new java.awt.Color(245, 245, 245));
        bgPanel.setPreferredSize(new java.awt.Dimension(1000, 500));
        bgPanel.setRequestFocusEnabled(false);

        menuPanel.setPreferredSize(new java.awt.Dimension(160, 500));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setPreferredSize(new java.awt.Dimension(160, 500));
        menuPanel.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 410));

        iconTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iconTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sync/Graphics/csync.png"))); // NOI18N
        menuPanel.add(iconTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 50));

        jLabel1.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        jLabel1.setText("Class");
        menuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        jLabel2.setFont(new java.awt.Font("ROG Fonts", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sync");
        menuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 40));

        bodyPanel.setOpaque(false);
        bodyPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        bodyPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatInterFont.install();
        FlatLaf.registerCustomDefaultsSource("sync.theme");
        UIManager.put("defaultFont", new Font( FlatInterFont.FAMILY, Font.BOLD, 14));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel iconTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javaswingdev.menu.Menu menu;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
