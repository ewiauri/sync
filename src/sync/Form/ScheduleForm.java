package sync.Form;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScheduleForm extends javax.swing.JPanel {

//    private DefaultTableModel tableModel;
//    private JTable tblschedule;
    public ScheduleForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblschedule = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        deltblBtn = new javax.swing.JButton();
        coursetxt = new javax.swing.JLabel();
        coursecodeTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        courseTf = new javax.swing.JTextField();
        codeTF = new javax.swing.JTextField();
        department = new javax.swing.JComboBox<>();
        schedBG = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 160, -1));

        jButton2.setText("Clear");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 160, -1));

        tblschedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
            }
        ));
        tblschedule.setOpaque(false);
        jScrollPane1.setViewportView(tblschedule);
        if (tblschedule.getColumnModel().getColumnCount() > 0) {
            tblschedule.getColumnModel().getColumn(0).setResizable(false);
            tblschedule.getColumnModel().getColumn(1).setResizable(false);
            tblschedule.getColumnModel().getColumn(2).setResizable(false);
            tblschedule.getColumnModel().getColumn(3).setResizable(false);
            tblschedule.getColumnModel().getColumn(4).setResizable(false);
            tblschedule.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 400, 400));

        jButton3.setText("Update");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 160, -1));

        deltblBtn.setText("Delete");
        deltblBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltblBtnActionPerformed(evt);
            }
        });
        add(deltblBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 160, -1));

        coursetxt.setText("Course:");
        add(coursetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 70, 20));

        coursecodeTxt.setText("Course Code:");
        add(coursecodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 100, 20));

        jLabel1.setText("Department:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 120, 20));
        add(courseTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 100, -1));
        add(codeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 100, -1));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", " ", "BSA (Crop Science)", "BSA (Animal Science)", "BSAF", "BSFo", "BSAB", "BSAE", "BSEntrep", "BSFish", "BSDevComm" }));
        add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 100, -1));

        schedBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sync/Graphics/SchedBG (1).png"))); // NOI18N
        add(schedBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void deltblBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltblBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deltblBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeTF;
    private javax.swing.JTextField courseTf;
    private javax.swing.JLabel coursecodeTxt;
    private javax.swing.JLabel coursetxt;
    private javax.swing.JButton deltblBtn;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel schedBG;
    private javax.swing.JTable tblschedule;
    // End of variables declaration//GEN-END:variables
}
