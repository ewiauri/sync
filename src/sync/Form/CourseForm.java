
package sync.Form;


public class CourseForm extends javax.swing.JPanel {

    public CourseForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card3 = new javaswingdev.card.Card();
        card4 = new javaswingdev.card.Card();
        card2 = new javaswingdev.card.Card();
        card7 = new javaswingdev.card.Card();
        myCoursestxt = new javax.swing.JLabel();
        newCoursestxt = new javax.swing.JLabel();
        card9 = new javaswingdev.card.Card();
        card8 = new javaswingdev.card.Card();
        card10 = new javaswingdev.card.Card();
        card11 = new javaswingdev.card.Card();

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

        card2.setBackground(new java.awt.Color(0, 0, 0));
        card2.setForeground(new java.awt.Color(153, 153, 255));
        card2.setColor1(new java.awt.Color(255, 153, 102));
        card2.setColor2(new java.awt.Color(255, 153, 51));
        card2.setDescription("Introduction to C++ Programming");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.LAPTOP);
        card2.setValues("90%");

        card7.setBackground(new java.awt.Color(0, 0, 0));
        card7.setForeground(new java.awt.Color(153, 153, 255));
        card7.setColor1(new java.awt.Color(153, 0, 153));
        card7.setColor2(new java.awt.Color(0, 0, 0));
        card7.setDescription("Introduction to F#");
        card7.setIcon(javaswingdev.GoogleMaterialDesignIcon.LANGUAGE);
        card7.setValues("0%");

        myCoursestxt.setText("My Courses");

        newCoursestxt.setText("New Courses");

        card9.setBackground(new java.awt.Color(0, 0, 0));
        card9.setForeground(new java.awt.Color(153, 153, 255));
        card9.setColor1(new java.awt.Color(51, 255, 204));
        card9.setColor2(new java.awt.Color(0, 0, 0));
        card9.setDescription("Swift");
        card9.setIcon(javaswingdev.GoogleMaterialDesignIcon.LAYERS);
        card9.setValues("0%");

        card8.setBackground(new java.awt.Color(0, 0, 0));
        card8.setForeground(new java.awt.Color(153, 153, 255));
        card8.setColor1(new java.awt.Color(153, 255, 102));
        card8.setColor2(new java.awt.Color(51, 51, 51));
        card8.setDescription("Pure Script");
        card8.setIcon(javaswingdev.GoogleMaterialDesignIcon.KEYBOARD_CAPSLOCK);
        card8.setValues("0%");

        card10.setBackground(new java.awt.Color(0, 0, 0));
        card10.setForeground(new java.awt.Color(153, 153, 255));
        card10.setColor1(new java.awt.Color(102, 102, 255));
        card10.setColor2(new java.awt.Color(0, 0, 0));
        card10.setDescription("Clojure");
        card10.setIcon(javaswingdev.GoogleMaterialDesignIcon.LEAK_ADD);
        card10.setValues("0%");

        card11.setBackground(new java.awt.Color(0, 0, 0));
        card11.setForeground(new java.awt.Color(153, 153, 255));
        card11.setColor1(new java.awt.Color(255, 255, 255));
        card11.setColor2(new java.awt.Color(0, 0, 0));
        card11.setDescription("Go");
        card11.setIcon(javaswingdev.GoogleMaterialDesignIcon.INSERT_CHART);
        card11.setInheritsPopupMenu(true);
        card11.setValues("0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newCoursestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCoursestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(myCoursestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(newCoursestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card10;
    private javaswingdev.card.Card card11;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javaswingdev.card.Card card4;
    private javaswingdev.card.Card card7;
    private javaswingdev.card.Card card8;
    private javaswingdev.card.Card card9;
    private javax.swing.JLabel myCoursestxt;
    private javax.swing.JLabel newCoursestxt;
    // End of variables declaration//GEN-END:variables
}
