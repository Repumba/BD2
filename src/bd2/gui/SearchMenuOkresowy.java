



package bd2.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.*;

import bd2.gui.db.connection.DbManager;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Wed Feb 03 13:06:46 CET 2021
 */



/**
 * @author Tomasz Trzeciak
 */
public class SearchMenuOkresowy extends JPanel {
    private JFrame frame;
    private DbManager manager;
    public SearchMenuOkresowy(JFrame frame) {
        manager = new DbManager();
        this.frame = frame;
        initComponents();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
        titleLabel = new JLabel();
        startStationLabel = new JLabel();
        endStationLabel = new JLabel();
        startStationComboBox = new JComboBox();
        endStationComboBox = new JComboBox();
        dayLabel = new JLabel();
        monthLabel = new JLabel();
        yearLabel = new JLabel();
        dayTextField = new JTextField();
        monthTextField = new JTextField();
        yearTextField = new JTextField();
        dayLabel2 = new JLabel();
        monthLabel2 = new JLabel();
        yearLabel2 = new JLabel();
        dayTextFieldEnd = new JTextField();
        monthTextFieldEnd = new JTextField();
        yearTextFieldEnd = new JTextField();
        infoLabel = new JLabel();
        buyButton = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(40, 37));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new FormLayout(
            "8*(default, $lcgap), 3dlu, $lcgap, 41dlu, 5*($lcgap, default), $lcgap, 4dlu, $lcgap, 39dlu, 11*($lcgap, default)",
            "20*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Kup Bilet Okresowy");
        titleLabel.setFont(new Font("Cambria", Font.BOLD, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, CC.xywh(1, 1, 55, 1));

        //---- startStationLabel ----
        startStationLabel.setText("Stacja pocz\u0105tkowa");
        startStationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startStationLabel.setLabelFor(startStationComboBox);
        add(startStationLabel, CC.xywh(13, 5, 11, 1));

        //---- endStationLabel ----
        endStationLabel.setText("Stacja ko\u0144cowa");
        endStationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        endStationLabel.setLabelFor(endStationComboBox);
        add(endStationLabel, CC.xywh(27, 5, 11, 1));
        add(startStationComboBox, CC.xywh(13, 7, 11, 1));
        add(endStationComboBox, CC.xywh(27, 7, 11, 1));

        //---- dayLabel ----
        dayLabel.setText("Dzie\u0144 rozpocz\u0119cia");
        dayLabel.setLabelFor(dayTextField);
        add(dayLabel, CC.xywh(14, 15, 6, 1, CC.CENTER, CC.DEFAULT));

        //---- monthLabel ----
        monthLabel.setText("Miesi\u0105c rozpocz\u0119cia");
        monthLabel.setLabelFor(monthTextField);
        add(monthLabel, CC.xy(25, 15, CC.CENTER, CC.DEFAULT));

        //---- yearLabel ----
        yearLabel.setText("Rok rozpocz\u0119cia");
        yearLabel.setLabelFor(yearTextField);
        add(yearLabel, CC.xywh(29, 15, 5, 1, CC.CENTER, CC.DEFAULT));
        add(dayTextField, CC.xywh(15, 17, 5, 1));
        add(monthTextField, CC.xy(25, 17));

        //---- yearTextField ----
        yearTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(yearTextField, CC.xywh(29, 17, 5, 1));

        //---- dayLabel2 ----
        dayLabel2.setText("Dzie\u0144 zako\u0144czenia");
        dayLabel2.setLabelFor(dayTextField);
        add(dayLabel2, CC.xywh(15, 21, 5, 1, CC.CENTER, CC.DEFAULT));

        //---- monthLabel2 ----
        monthLabel2.setText("Miesi\u0105c zako\u0144czenia");
        monthLabel2.setLabelFor(monthTextField);
        add(monthLabel2, CC.xy(25, 21, CC.CENTER, CC.DEFAULT));

        //---- yearLabel2 ----
        yearLabel2.setText("Rok zako\u0144czenia");
        yearLabel2.setLabelFor(yearTextField);
        add(yearLabel2, CC.xywh(29, 21, 5, 1, CC.CENTER, CC.DEFAULT));
        add(dayTextFieldEnd, CC.xywh(15, 23, 5, 1));
        add(monthTextFieldEnd, CC.xy(25, 23));

        //---- yearTextFieldEnd ----
        yearTextFieldEnd.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(yearTextFieldEnd, CC.xywh(29, 23, 5, 1));
        add(infoLabel, CC.xywh(19, 25, 15, 1, CC.CENTER, CC.CENTER));

        //---- buyButton ----
        buyButton.setText("Kup bilet");
        buyButton.setBackground(new Color(255, 128, 0));
        buyButton.setHorizontalTextPosition(SwingConstants.CENTER);
        buyButton.setMinimumSize(new Dimension(117, 30));
        buyButton.setMaximumSize(new Dimension(117, 30));
        add(buyButton, CC.xy(25, 29, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        try {
            for(String i : manager.getStations()) {
                startStationComboBox.addItem(i);
                endStationComboBox.addItem(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAndSendRequest();
            }
        });
    }

    private void checkAndSendRequest() {
        String startStation = (String)startStationComboBox.getSelectedItem();
        String endStation = (String)endStationComboBox.getSelectedItem();
        infoLabel.setText("");
        String day = dayTextField.getText();
        String month = monthTextField.getText();
        String year = yearTextField.getText();
        String dayEnd = dayTextFieldEnd.getText();
        String monthEnd = monthTextFieldEnd.getText();
        String yearEnd = yearTextFieldEnd.getText();

        if(!(validateDate(day, month, year) && validateDate(dayEnd, monthEnd, yearEnd))) {
            infoLabel.setText("Błędna data");
            return;
        }
        GregorianCalendar date = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day), 0, 0);
        GregorianCalendar dateEnd = new GregorianCalendar(Integer.parseInt(yearEnd), Integer.parseInt(monthEnd), Integer.parseInt(dayEnd), 23, 59);
        if( date.compareTo(dateEnd) >= 0 ) {
            infoLabel.setText("Data końca musi być większa od daty początku");
            return;
        }
        frame.getContentPane().removeAll();
        new WybierzPosrednika(frame);
    }

    private boolean validateDate(String day, String month, String year) {
        String date = day + "/" + month + "/" + year;
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    private boolean validateTime(String hour, String minutes) {
        String time = hour + ":" + minutes;
        return time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tomasz Trzeciak
    private JLabel titleLabel;
    private JLabel startStationLabel;
    private JLabel endStationLabel;
    private JComboBox startStationComboBox;
    private JComboBox endStationComboBox;
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JTextField yearTextField;
    private JLabel dayLabel2;
    private JLabel monthLabel2;
    private JLabel yearLabel2;
    private JTextField dayTextFieldEnd;
    private JTextField monthTextFieldEnd;
    private JTextField yearTextFieldEnd;
    private JLabel infoLabel;
    private JButton buyButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
