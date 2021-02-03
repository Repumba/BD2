/*
 * Created by JFormDesigner on Wed Feb 03 15:54:55 CET 2021
 */

package bd2.gui;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import bd2.gui.db.connection.DbManager;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Tomasz Trzeciak
 */
public class ShowTickets extends JPanel {
    private JFrame frame;
    private DbManager manager;
    private List<String> dane = new ArrayList<>();

    public ShowTickets(JFrame frame) {
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {

        try {
            for(String i : manager.getTickets()) {
                dane.add(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
        titleLabel = new JLabel();
        Bilet1 = new JLabel();
        Bilet1_info = new JLabel();
        Bilet2 = new JLabel();
        Bilet2_info = new JLabel();
        Bilet3 = new JLabel();
        Bilet3_info = new JLabel();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;
        setLayout(new FormLayout(
            "4*(default, $lcgap), 80dlu, 2*(0dlu), 100dlu, $lcgap, 80dlu, 9*($lcgap, default)",
            "29*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Twoje Bilety");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 20f));
        add(titleLabel, CC.xywh(9, 5, 6, 1, CC.CENTER, CC.CENTER));

        if (dane.size() > 0) {
            //---- Bilet1 ----
            Bilet1.setText("Data: " + dane.get(0) + " Stacja początkowa: " + dane.get(1) + " Stacja końcowa: " + dane.get(2));
            Bilet1.setFont(Bilet1.getFont().deriveFont(Bilet1.getFont().getStyle() & ~Font.ITALIC, Bilet1.getFont().getSize() + 10f));
            add(Bilet1, CC.xywh(9, 9, 4, 1, CC.LEFT, CC.CENTER));

            //---- Bilet1_info ----
            Bilet1_info.setText("Miejsce: " + dane.get(3) + "\nWagon: " + dane.get(4));
            Bilet1_info.setFont(Bilet1_info.getFont().deriveFont(Bilet1_info.getFont().getStyle() & ~Font.ITALIC, Bilet1_info.getFont().getSize() + 10f));
            add(Bilet1_info, CC.xy(14, 9, CC.LEFT, CC.CENTER));
        }
        if (dane.size() > 5) {
            //---- Bilet2 ----
            Bilet2.setText("Data: " + dane.get(5) + " Stacja początkowa: " + dane.get(6) + " Stacja końcowa: " + dane.get(6));
            Bilet2.setFont(Bilet2.getFont().deriveFont(Bilet2.getFont().getStyle() & ~Font.ITALIC, Bilet2.getFont().getSize() + 10f));
            add(Bilet2, CC.xy(9, 13, CC.LEFT, CC.CENTER));

            //---- Bilet2_info ----
            Bilet2_info.setText("Miejsce: " + dane.get(8) + "\nWagon: " + dane.get(9));
            Bilet2_info.setFont(Bilet2_info.getFont().deriveFont(Bilet2_info.getFont().getStyle() & ~Font.ITALIC, Bilet2_info.getFont().getSize() + 10f));
            add(Bilet2_info, CC.xy(14, 13, CC.LEFT, CC.CENTER));
        }
        if (dane.size() > 10) {
            //---- Bilet3 ----
            Bilet3.setText("Data: " + dane.get(10) + " Stacja początkowa: " + dane.get(11) + " Stacja końcowa: " + dane.get(12));
            Bilet3.setFont(Bilet3.getFont().deriveFont(Bilet3.getFont().getStyle() & ~Font.ITALIC, Bilet3.getFont().getSize() + 10f));
            add(Bilet3, CC.xy(9, 17, CC.LEFT, CC.CENTER));

            //---- Bilet3_info ----
            Bilet3_info.setText("Miejsce: " + dane.get(13) + "\nWagon: " + dane.get(14));
            Bilet3_info.setFont(Bilet3_info.getFont().deriveFont(Bilet3_info.getFont().getStyle() & ~Font.ITALIC, Bilet3_info.getFont().getSize() + 10f));
            add(Bilet3_info, CC.xy(14, 17, CC.LEFT, CC.CENTER));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
    private JLabel titleLabel;
    private JLabel Bilet1;
    private JLabel Bilet1_info;
    private JLabel Bilet2;
    private JLabel Bilet2_info;
    private JLabel Bilet3;
    private JLabel Bilet3_info;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
