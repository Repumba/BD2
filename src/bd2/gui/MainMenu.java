/*
 * Created by JFormDesigner on Thu Jan 07 14:08:18 CET 2021
 */

package bd2.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Tymoteusz Perka
 */
public class MainMenu extends JPanel {
    private JFrame frame;
    public MainMenu(JFrame frame) {
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
        titleLabel = new JLabel();
        buySingleTicketButton = new JButton();
        buySeasonTicketButton = new JButton();
        myReservationsTicketButton = new JButton();
        myTicketsButton = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
        setLayout(new FormLayout(
            "4*(default, $lcgap), 80dlu, 2*(0dlu), 100dlu, $lcgap, 80dlu, 9*($lcgap, default)",
            "29*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Polskie Koleje Pa\u0144stwowe");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 20f));
        add(titleLabel, CC.xywh(9, 5, 6, 1, CC.CENTER, CC.CENTER));

        //---- buySingleTicketButton ----
        buySingleTicketButton.setText("Kup bilet jednorazowy");
        buySingleTicketButton.setBackground(new Color(255, 128, 0));
        add(buySingleTicketButton, CC.xy(12, 9));

        //---- buySeasonTicketButton ----
        buySeasonTicketButton.setText("Kup bilet okresowy");
        buySeasonTicketButton.setBackground(new Color(255, 128, 0));
        add(buySeasonTicketButton, CC.xy(12, 13));

        //---- myReservationsTicketButton ----
        myReservationsTicketButton.setText("Moje rezerwacje");
        myReservationsTicketButton.setBackground(new Color(255, 128, 0));
        add(myReservationsTicketButton, CC.xy(12, 17, CC.DEFAULT, CC.CENTER));

        //---- myTicketsButton ----
        myTicketsButton.setText("Moje bilety");
        myTicketsButton.setBackground(new Color(255, 128, 0));
        add(myTicketsButton, CC.xy(12, 21, CC.DEFAULT, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        buySingleTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new SearchMenu(frame);
            }
        });
        buySeasonTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new SearchMenuOkresowy(frame);
            }
        });
        myReservationsTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new ShowReservations(frame);
            }
        });
        myTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new ShowTickets(frame);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
    private JLabel titleLabel;
    private JButton buySingleTicketButton;
    private JButton buySeasonTicketButton;
    private JButton myReservationsTicketButton;
    private JButton myTicketsButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
