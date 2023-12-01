
package sync.Form;

import javax.swing.table.DefaultTableModel;

public class DashboardForm extends javax.swing.JPanel {

    public DashboardForm() {
        initComponents();
        init();
    }

    private void init(){
//        table.fixTable(jScrollPane1);
        DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.addRow(new Object [] {    1, "Introduction to Java", "Elementary", "90%", "Jan 05"});
            model.addRow(new Object [] {    2, "Styling with CSS", "Elementary", "50%", "Jan 25"});
            model.addRow(new Object [] {    3, "Basics To Programming",  "Elementary", "99%", "Feb 05"});
            model.addRow(new Object [] {    4, "HTML Basics",  "Elementary", "96%", "Mar 05"}); 
            model.addRow(new Object [] {    5, "Learn to Program in Python", "Elementary", "89%", "Apr 08"});
            model.addRow(new Object [] {    6, "Web Designing", "Elementary", "90%", "Jan 05"});
            model.addRow(new Object [] {    7, "Styling with CSS", "Elementary", "50%", "Jan 25"});
            model.addRow(new Object [] {    8, "Bash Shell Scripts",  "Elementary", "99%", "Feb 05"});
            model.addRow(new Object [] {    9, "JavaScript Basics",  "Elementary", "96%", "Mar 05", "--"}); 
            model.addRow(new Object [] {    10, "Learn to Program in Javaswing", "Elementary", "89%", "Apr 08"});
            model.addRow(new Object [] {    11, "Development Basics", "Elementary", "90%", "Jan 05"});
            model.addRow(new Object [] {    12, "Data with PHP", "Elementary", "50%", "Jan 25"});
            model.addRow(new Object [] {    13, "Bash Shell Scripts",  "Elementary", "99%", "Feb 05"});
            model.addRow(new Object [] {    14, "JavaScript Basics",  "Elementary", "96%", "Mar 05", "--"}); 
            model.addRow(new Object [] {    15, "Learn to Data in HTML", "Elementary", "89%", "Apr 08"});
            
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        card4 = new javaswingdev.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();

        setPreferredSize(new java.awt.Dimension(800, 500));

        card2.setBackground(new java.awt.Color(0, 0, 0));
        card2.setForeground(new java.awt.Color(153, 153, 255));
        card2.setColor1(new java.awt.Color(255, 153, 102));
        card2.setColor2(new java.awt.Color(255, 153, 51));
        card2.setDescription("Introduction to C++ Programming");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.LAPTOP);
        card2.setValues("90%");

        card3.setBackground(new java.awt.Color(0, 0, 0));
        card3.setForeground(new java.awt.Color(153, 153, 255));
        card3.setColor1(new java.awt.Color(204, 204, 255));
        card3.setDescription("Code with Python");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.KEYBOARD);
        card3.setValues("50%");

        card4.setBackground(new java.awt.Color(0, 0, 0));
        card4.setForeground(new java.awt.Color(153, 153, 255));
        card4.setColor1(new java.awt.Color(0, 153, 255));
        card4.setColor2(new java.awt.Color(0, 204, 204));
        card4.setDescription("Styling with CSS");
        card4.setIcon(javaswingdev.GoogleMaterialDesignIcon.TV);
        card4.setValues("95%");

        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        table.setForeground(new java.awt.Color(153, 153, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Course", "Level", "Progress", "Date Started"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setOpaque(false);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(5);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javaswingdev.card.Card card4;
    private javax.swing.JScrollPane jScrollPane2;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.table.Table table;
    // End of variables declaration//GEN-END:variables
}
