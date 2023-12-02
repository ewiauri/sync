package sync.Schedule;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.mindfusion.common.DateTime;
import static com.mindfusion.drawing.Brushes.Violet;
import com.mindfusion.scheduling.AeroEffect;
import com.mindfusion.scheduling.Calendar;
import com.mindfusion.scheduling.CalendarView;
import com.mindfusion.scheduling.ItemSelection;
import com.mindfusion.scheduling.Selection;
import com.mindfusion.scheduling.ThemeType;
import com.mindfusion.scheduling.model.Appointment;
import com.mindfusion.scheduling.model.Style;
import java.awt.Color;
import java.awt.Font;
import javaswingdev.main.Home;
import javax.swing.GroupLayout;
import javax.swing.UIManager;

public class SchedPanel extends javax.swing.JPanel {

//    private static final String URL = "jdbc:mysql://your_database_url";
//    private static final String USER = "your_username";
//    private static final String PASSWORD = "your_password";
    private Calendar calendar;
//    private ScheduleDAO scheduleDAO;
    
    public SchedPanel() {
        initComponents();
        initCalendar();

         
        Appointment app = new Appointment();
        app.setHeaderText("PF101: Final Project Deadline");
        app.setDescriptionText("Remaining days before the deadline!");
        app.setStartTime(new DateTime(2023, 12, 06, 14, 0, 0));
        app.setEndTime(new DateTime(2023, 12, 07, 16, 30, 0));

        app.setAllowMove(false);
        calendar.getSchedule().getItems().add(app);

        createAndAddAppointment("PT101: Final Project Deadline",
                "Remaining days before the deadline!",
                new DateTime(2023, 12, 04, 14, 0, 0),
                new DateTime(2023, 12, 07, 16, 30, 0));
        
    }
    private void createAndAddAppointment(String header, String description, DateTime startTime, DateTime endTime) {
        Appointment appointment = new Appointment();
        appointment.setHeaderText(header);
        appointment.setDescriptionText(description);
        appointment.setStartTime(startTime);
        appointment.setEndTime(endTime);

        appointment.setAllowMove(false);


    }
    

    
    
    
    private void initCalendar() {
        calendar = new Calendar();
        calendar.beginInit();
        calendar.setTheme(ThemeType.Black);
        calendar.setCurrentView(CalendarView.SingleMonth);
        calendar.getMonthSettings().getDaySettings().setShowToday(true);
        calendar.setDate(new DateTime(2023, 12, 1));
        calendar.setEndDate(new DateTime(2023, 12, 31));
        
        calendar.setEnableDragCreate(false);
        calendar.setAllowDrag(false);
        calendar.setAllowMoveUnselectedItems(false);
        calendar.setAllowAutoScroll(false);
//        calendar.setDragFeedBackType(DragFeedbackType.GhostImage);
        calendar.setAllowInplaceCreate(false);
        calendar.setAllowInplaceEdit(true);
        calendar.getItemEffects().add(new AeroEffect());
        
        calendar.endInit();
       
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendar, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendar, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        add(calendar);
        // second appointment
        Appointment app2 = new Appointment();
        app2.setHeaderText("Christmass Break!!!");
        app2.setDescriptionText("Long Break");
        app2.setStartTime(new DateTime(2023, 12, 25, 14, 0, 0));
        app2.setEndTime(new DateTime(2024, 1, 03, 16, 30, 0));
        app2.setAllowMove(false);
        calendar.getSchedule().getItems().add(app2);
    
//        third appointment / pathfit
        Appointment pfit = new Appointment();
        pfit.setHeaderText("Pathfit Finals");
        pfit.setDescriptionText("Final Exam");
        pfit.setStartTime(new DateTime(2023, 12, 04, 14, 10,00));
        pfit.setAllowMove(false);
        calendar.setAllowDrag(false);
        calendar.setAllowInplaceCreate(true);
        calendar.setAllowInplaceEdit(true);
        calendar.setAllowMoveUnselectedItems(false);
        calendar.setAllowAutoScroll(false); 
        
        calendar.getSchedule().getItems().add(pfit);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
