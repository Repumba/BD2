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
        // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
        titleLabel = new JLabel();
        Trasa1 = new JLabel();
        buyButton = new JButton();
        reserveButton = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new FormLayout(
            "4*(default, $lcgap), 80dlu, 2*(0dlu), 100dlu, $lcgap, 80dlu, 9*($lcgap, default)",
            "29*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Twoje Rezerwacje");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 20f));
        add(titleLabel, CC.xywh(9, 5, 6, 1, CC.CENTER, CC.CENTER));

        //---- Trasa1 ----
        Trasa1.setText("Odjazd z " + dane.get(0) + " dnia " + dane.get(1) + "\tPrzyjazd do " + dane.get(2) + " o " + dane.get(3));
        Trasa1.setFont(Trasa1.getFont().deriveFont(Trasa1.getFont().getStyle() & ~Font.ITALIC, Trasa1.getFont().getSize() + 10f));
        add(Trasa1, CC.xywh(9, 9, 6, 1, CC.CENTER, CC.CENTER));

        //---- buyButton ----
        buyButton.setText("Kup");
        add(buyButton, CC.xy(9, 17));

        //---- reserveButton ----
        reserveButton.setText("Rezerwuj");
        add(reserveButton, CC.xy(14, 17));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new WybierzPosrednika(frame);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
    private JLabel titleLabel;
    private JLabel Trasa1;
    private JButton buyButton;
    private JButton reserveButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
