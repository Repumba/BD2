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
public class WybierzPosrednika extends JPanel {
    private JFrame frame;
    private DbManager manager;

    public WybierzPosrednika(JFrame frame) {
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        try {
            for(String i : manager.getPosrednicy()) {
                startStationComboBox.addItem(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
        dayLabel = new JLabel();
        startStationComboBox = new JComboBox();
        infoLabel = new JLabel();
        searchButton = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(40, 37));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new FormLayout(
            "8*(default, $lcgap), 3dlu, $lcgap, 41dlu, 5*($lcgap, default), $lcgap, 4dlu, $lcgap, 39dlu, 11*($lcgap, default)",
            "20*(default, $lgap), default"));

        //---- dayLabel ----
        dayLabel.setText("Wybierz po\u015brednika p\u0142atno\u015bci");
        dayLabel.setFont(dayLabel.getFont().deriveFont(dayLabel.getFont().getSize() + 15f));
        add(dayLabel, CC.xywh(19, 7, 15, 3, CC.CENTER, CC.DEFAULT));
        add(startStationComboBox, CC.xywh(21, 19, 12, 1));
        add(infoLabel, CC.xywh(19, 25, 15, 1, CC.CENTER, CC.CENTER));

        //---- searchButton ----
        searchButton.setText("Zap\u0142a\u0107");
        searchButton.setBackground(new Color(255, 128, 0));
        searchButton.setHorizontalTextPosition(SwingConstants.CENTER);
        searchButton.setMinimumSize(new Dimension(117, 30));
        searchButton.setMaximumSize(new Dimension(117, 30));
        add(searchButton, CC.xy(25, 27, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manager.addTicket();
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
    private JLabel dayLabel;
    private JComboBox startStationComboBox;
    private JLabel infoLabel;
    private JButton searchButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
