/*
 * Created by JFormDesigner on Wed Feb 03 15:54:55 CET 2021
 */

package bd2.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import bd2.gui.db.Bilet;
import bd2.gui.db.BiletJednorazowy;
import bd2.gui.db.BiletOkresowy;
import bd2.gui.db.PosrednikPlatnosci;
import bd2.gui.db.connection.DbManager;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Tomasz Trzeciak
 */
public class WybierzPosrednika extends JPanel {
    private JFrame frame;
    private DbManager manager;
    BiletOkresowy bo;
    BiletJednorazowy bj;

    public WybierzPosrednika(JFrame frame) {
        frame.getContentPane().removeAll();
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
    public WybierzPosrednika(JFrame frame, BiletOkresowy bo) {
        frame.getContentPane().removeAll();
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        this.bo = bo;
    }
    public WybierzPosrednika(JFrame frame, BiletJednorazowy bj) {
        frame.getContentPane().removeAll();
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        this.bj = bj;
    }

    private void initComponents() {


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
        dayLabel = new JLabel();
        payProviderComboBox = new JComboBox();
        infoLabel = new JLabel();
        payButton = new JButton();
        button1 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(40, 1000));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;
        setLayout(new FormLayout(
            "8*(default, $lcgap), 3dlu, $lcgap, 41dlu, $lcgap, default, $lcgap, 0dlu, $lcgap, 127dlu, 2*($lcgap, default), $lcgap, 4dlu, $lcgap, 39dlu, 11*($lcgap, default)",
            "20*(default, $lgap), default"));

        //---- dayLabel ----
        dayLabel.setText("Wybierz po\u015brednika p\u0142atno\u015bci");
        dayLabel.setFont(dayLabel.getFont().deriveFont(dayLabel.getFont().getSize() + 12f));
        add(dayLabel, CC.xywh(7, 3, 27, 13, CC.CENTER, CC.DEFAULT));
        add(payProviderComboBox, CC.xywh(21, 19, 12, 1));
        add(infoLabel, CC.xywh(19, 25, 15, 1, CC.CENTER, CC.CENTER));

        //---- payButton ----
        payButton.setText("Zap\u0142a\u0107");
        payButton.setBackground(new Color(255, 128, 0));
        payButton.setHorizontalTextPosition(SwingConstants.CENTER);
        payButton.setMinimumSize(new Dimension(117, 30));
        payButton.setMaximumSize(new Dimension(117, 30));
        add(payButton, CC.xy(25, 27, CC.CENTER, CC.CENTER));

        //---- button1 ----
        button1.setText("Powr\u00f3t");
        button1.setBackground(new Color(255, 128, 0));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setMinimumSize(new Dimension(117, 30));
        button1.setMaximumSize(new Dimension(117, 30));
        add(button1, CC.xy(25, 31, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        try {
            for(String i : manager.getPosrednicy()) {
                payProviderComboBox.addItem(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu(frame);
            }
        });
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        if (payProviderComboBox.getSelectedItem().toString().equals("PayPal")) {

                            Desktop.getDesktop().browse(new URI("https://www.paypal.com"));

                        } else if (payProviderComboBox.getSelectedItem().toString().equals("ING")) {
                            Desktop.getDesktop().browse(new URI("https://www.ing.pl"));

                        } else if (payProviderComboBox.getSelectedItem().toString().equals("mBank")) {
                            Desktop.getDesktop().browse(new URI("https://www.mbank.pl"));

                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                if(bo != null) {
                    try {

                        manager.addSeasonTicket(bo);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if(bj != null){
                    try {
                        manager.addTicket(bj);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
    private JLabel dayLabel;
    private JComboBox payProviderComboBox;
    private JLabel infoLabel;
    private JButton payButton;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
