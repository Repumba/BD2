/*
 * Created by JFormDesigner on Wed Feb 03 15:54:55 CET 2021
 */

package bd2.gui;

import bd2.gui.db.connection.DbManager;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tomasz Trzeciak
 */
public class ShowTicketsOkresowy extends JPanel {
    private JFrame frame;
    private DbManager manager;
    private List<String> dane = new ArrayList<>();

    public ShowTicketsOkresowy(JFrame frame) {
        frame.getContentPane().removeAll();
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {

        try {
            for(String i : manager.getTicketsOkresowy()) {
                dane.add(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
        titleLabel = new JLabel();
        Bilet1 = new JLabel();
        Bilet1_info = new JLabel();
        Bilet1_2 = new JLabel();
        Bilet2 = new JLabel();
        Bilet2_info = new JLabel();
        Bilet2_2 = new JLabel();
        Bilet3 = new JLabel();
        Bilet3_info = new JLabel();
        Bilet3_2 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
        swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border
        . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new Font ( "D\u0069al\u006fg"
        , Font. BOLD ,12 ) , Color .red ) , getBorder
        () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
        . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
        ( ) ;} } );
        setLayout(new FormLayout(
            "5*(default, $lcgap), 80dlu, 2*(0dlu), 100dlu, $lcgap, 80dlu, 9*($lcgap, default)",
            "29*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Twoje Bilety");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 20f));
        add(titleLabel, CC.xywh(11, 5, 6, 1, CC.CENTER, CC.CENTER));

        //---- Bilet1 ----
        Bilet1.setFont(Bilet1.getFont().deriveFont(Bilet1.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet1, CC.xywh(11, 9, 4, 1, CC.LEFT, CC.CENTER));

        //---- Bilet1_info ----
        Bilet1_info.setFont(Bilet1_info.getFont().deriveFont(Bilet1_info.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet1_info, CC.xy(16, 9, CC.LEFT, CC.CENTER));

        //---- Bilet1_2 ----
        Bilet1_2.setFont(Bilet1_2.getFont().deriveFont(Bilet1_2.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet1_2, CC.xywh(11, 11, 4, 1, CC.LEFT, CC.CENTER));

        //---- Bilet2 ----
        Bilet2.setFont(Bilet2.getFont().deriveFont(Bilet2.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet2, CC.xywh(11, 13, 4, 1, CC.LEFT, CC.CENTER));

        //---- Bilet2_info ----
        Bilet2_info.setFont(Bilet2_info.getFont().deriveFont(Bilet2_info.getFont().getStyle() & ~Font.ITALIC, Bilet2_info.getFont().getSize() + 10f));
        add(Bilet2_info, CC.xy(16, 13, CC.LEFT, CC.CENTER));

        //---- Bilet2_2 ----
        Bilet2_2.setFont(Bilet2_2.getFont().deriveFont(Bilet2_2.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet2_2, CC.xywh(11, 15, 4, 1, CC.LEFT, CC.CENTER));

        //---- Bilet3 ----
        Bilet3.setFont(Bilet3.getFont().deriveFont(Bilet3.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet3, CC.xywh(11, 17, 4, 1, CC.LEFT, CC.CENTER));

        //---- Bilet3_info ----
        Bilet3_info.setFont(Bilet3_info.getFont().deriveFont(Bilet3_info.getFont().getStyle() & ~Font.ITALIC, Bilet3_info.getFont().getSize() + 10f));
        add(Bilet3_info, CC.xy(16, 17, CC.LEFT, CC.CENTER));

        //---- Bilet3_2 ----
        Bilet3_2.setFont(Bilet3_2.getFont().deriveFont(Bilet3_2.getFont().getStyle() & ~Font.ITALIC));
        add(Bilet3_2, CC.xywh(11, 19, 4, 1, CC.LEFT, CC.CENTER));

        //---- button1 ----
        button1.setText("Powr\u00f3t");
        button1.setBackground(new Color(255, 128, 0));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setMinimumSize(new Dimension(117, 30));
        button1.setMaximumSize(new Dimension(117, 30));
        add(button1, CC.xy(14, 25, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        if (dane.size() > 0) {
            //---- Bilet1 ----
//            Bilet1.setText("Data: " + dane.get(0));

            Bilet1_2.setText(dane.get(1) + " - " + dane.get(2));
            //---- Bilet1_info ----
            Bilet1_info.setText("Od: " + dane.get(3) + " Do: " + dane.get(4));
        }
        if (dane.size() > 5) {
            //---- Bilet2 ----
  //          Bilet2.setText("Data: " + dane.get(5));
            Bilet2_2.setText(dane.get(6) + " - " + dane.get(7));
            //---- Bilet2_info ----
            Bilet2_info.setText("Od: " + dane.get(8) + " Do: " + dane.get(9));
        }
        if (dane.size() > 10) {
            //---- Bilet3 ----
//            Bilet3.setText("Data: " + dane.get(10));
            Bilet3_2.setText(dane.get(11) + " - " + dane.get(12));


            //---- Bilet3_info ----
            Bilet3_info.setText("Od: " + dane.get(13) + " Do: " + dane.get(14));
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu(frame);
            }
        });

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
    private JLabel titleLabel;
    private JLabel Bilet1;
    private JLabel Bilet1_info;
    private JLabel Bilet1_2;
    private JLabel Bilet2;
    private JLabel Bilet2_info;
    private JLabel Bilet2_2;
    private JLabel Bilet3;
    private JLabel Bilet3_info;
    private JLabel Bilet3_2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
