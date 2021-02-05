/*
 * Created by JFormDesigner on Wed Feb 03 15:54:55 CET 2021
 */

package bd2.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.event.ActionListener;

import bd2.gui.db.BiletJednorazowy;
import bd2.gui.db.connection.DbManager;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/**
 * @author Tomasz Trzeciak
 */
public class ShowRoutes extends JPanel {
    private JFrame frame;
    private DbManager manager;
    private List<String> dane = new ArrayList<>();

    public ShowRoutes(JFrame frame, List<String> t) {
        frame.getContentPane().removeAll();
        manager = new DbManager();
        this.frame = frame;
        dane = t;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
        titleLabel = new JLabel();
        Trasa1 = new JLabel();
        Trasa2 = new JLabel();
        buyButton = new JButton();
        reserveButton = new JButton();
        button1 = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
        .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax
        . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,
        12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans
        .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e.
        getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(new FormLayout(
            "4*(default, $lcgap), 80dlu, 2*(0dlu), 100dlu, $lcgap, 80dlu, 9*($lcgap, default)",
            "29*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Najbli\u017csze po\u0142\u0105czenie");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 20f));
        add(titleLabel, CC.xywh(9, 5, 6, 1, CC.CENTER, CC.CENTER));

        //---- Trasa1 ----
        Trasa1.setText("Nie znaleziono");
        Trasa1.setFont(Trasa1.getFont().deriveFont(Trasa1.getFont().getStyle() & ~Font.ITALIC, Trasa1.getFont().getSize() + 10f));
        add(Trasa1, CC.xywh(9, 9, 6, 1, CC.CENTER, CC.CENTER));

        //---- Trasa2 ----
        Trasa2.setFont(Trasa2.getFont().deriveFont(Trasa2.getFont().getStyle() & ~Font.ITALIC, Trasa2.getFont().getSize() + 10f));
        add(Trasa2, CC.xywh(9, 11, 6, 1, CC.CENTER, CC.CENTER));

        //---- buyButton ----
        buyButton.setText("Kup");
        buyButton.setBackground(new Color(255, 128, 0));
        buyButton.setVisible(false);
        add(buyButton, CC.xy(9, 17));

        //---- reserveButton ----
        reserveButton.setText("Zarezerwuj");
        reserveButton.setBackground(new Color(255, 128, 0));
        reserveButton.setVisible(false);
        add(reserveButton, CC.xy(14, 17));

        //---- button1 ----
        button1.setText("Powr\u00f3t");
        button1.setBackground(new Color(255, 128, 0));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setMinimumSize(new Dimension(117, 30));
        button1.setMaximumSize(new Dimension(117, 30));
        add(button1, CC.xy(12, 25, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu(frame);
            }
        });

        if(dane != null && dane.size() > 0) {
            Trasa1.setText(dane.get(0) + ": " + dane.get(1));
            Trasa2.setText(dane.get(2) + ": " + dane.get(3));
            reserveButton.setVisible(true);
            buyButton.setVisible(true);
            BiletJednorazowy bj = new BiletJednorazowy();
        }
        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new WybierzPosrednika(frame);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
    private JLabel titleLabel;
    private JLabel Trasa1;
    private JLabel Trasa2;
    private JButton buyButton;
    private JButton reserveButton;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
