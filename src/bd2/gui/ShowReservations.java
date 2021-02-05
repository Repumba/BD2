/*
 * Created by JFormDesigner on Wed Feb 03 15:54:55 CET 2021
 */

package bd2.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ShowReservations extends JPanel {
    private JFrame frame;
    private DbManager manager;
    private List<String> dane = new ArrayList<>();

    public ShowReservations(JFrame frame) {
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        try {
            for(String i : manager.getReservations()) {
                dane.add(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
        titleLabel = new JLabel();
        Rezerwacja1 = new JLabel();
        button1 = new JButton();
        Rezerwacja2 = new JLabel();
        button2 = new JButton();
        Rezerwacja3 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
        javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax
        . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
        . awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .
        PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .
        equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(new FormLayout(
            "4*(default, $lcgap), 80dlu, 2*(0dlu), 100dlu, $lcgap, 80dlu, 9*($lcgap, default)",
            "29*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Twoje Rezerwacje");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 20f));
        add(titleLabel, CC.xywh(9, 5, 6, 1, CC.CENTER, CC.CENTER));

        //---- Rezerwacja1 ----
        Rezerwacja1.setText("Rezerwacja1");
        Rezerwacja1.setFont(Rezerwacja1.getFont().deriveFont(Rezerwacja1.getFont().getStyle() & ~Font.ITALIC, Rezerwacja1.getFont().getSize() + 10f));
        add(Rezerwacja1, CC.xywh(9, 9, 4, 1, CC.LEFT, CC.CENTER));

        //---- button1 ----
        button1.setText("Zap\u0142a\u0107");
        add(button1, CC.xy(14, 9));

        //---- Rezerwacja2 ----
        Rezerwacja2.setText("Rezerwacja2");
        Rezerwacja2.setFont(Rezerwacja2.getFont().deriveFont(Rezerwacja2.getFont().getStyle() & ~Font.ITALIC, Rezerwacja2.getFont().getSize() + 10f));
        add(Rezerwacja2, CC.xy(9, 13, CC.LEFT, CC.CENTER));

        //---- button2 ----
        button2.setText("Zap\u0142a\u0107");
        add(button2, CC.xy(14, 13));

        //---- Rezerwacja3 ----
        Rezerwacja3.setText("Rezerwacja3");
        Rezerwacja3.setFont(Rezerwacja3.getFont().deriveFont(Rezerwacja3.getFont().getStyle() & ~Font.ITALIC, Rezerwacja3.getFont().getSize() + 10f));
        add(Rezerwacja3, CC.xy(9, 17, CC.LEFT, CC.CENTER));

        //---- button3 ----
        button3.setText("Zap\u0142a\u0107");
        add(button3, CC.xy(14, 17));

        //---- button4 ----
        button4.setText("Powr\u00f3t");
        button4.setBackground(new Color(255, 128, 0));
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        button4.setMinimumSize(new Dimension(117, 30));
        button4.setMaximumSize(new Dimension(117, 30));
        add(button4, CC.xy(12, 23, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new WybierzPosrednika(frame);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new WybierzPosrednika(frame);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new WybierzPosrednika(frame);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu(frame);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
    private JLabel titleLabel;
    private JLabel Rezerwacja1;
    private JButton button1;
    private JLabel Rezerwacja2;
    private JButton button2;
    private JLabel Rezerwacja3;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
