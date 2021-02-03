/*
 * Created by JFormDesigner on Thu Jan 07 13:48:03 CET 2021
 */

package bd2.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.*;

import bd2.gui.db.connection.DbManager;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Tymoteusz Perka
 */
public class SearchMenu extends JPanel {
    private JFrame frame;
    private DbManager manager;

    public SearchMenu(JFrame frame) {
        manager = new DbManager();
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
        startStationLabel = new JLabel();
        endStationLabel = new JLabel();
        startStationComboBox = new JComboBox();
        endStationComboBox = new JComboBox();
        departureRadioButton = new JRadioButton();
        arrivalRadioButton = new JRadioButton();
        dayLabel = new JLabel();
        monthLabel = new JLabel();
        yearLabel = new JLabel();
        dayTextField = new JTextField();
        monthTextField = new JTextField();
        yearTextField = new JTextField();
        hourLabel = new JLabel();
        minLabel = new JLabel();
        hourTextField = new JTextField();
        minTextField = new JTextField();
        infoLabel = new JLabel();
        searchButton = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(40, 37));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new FormLayout(
            "8*(default, $lcgap), 3dlu, $lcgap, 41dlu, 5*($lcgap, default), $lcgap, 4dlu, $lcgap, 39dlu, 11*($lcgap, default)",
            "20*(default, $lgap), default"));

        //---- titleLabel ----
        titleLabel.setText("Wyszukiwanie po\u0142\u0105cze\u0144");
        titleLabel.setFont(new Font("Cambria", Font.BOLD, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, CC.xywh(1, 1, 55, 1));

        //---- startStationLabel ----
        startStationLabel.setText("Stacja pocz\u0105tkowa");
        startStationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startStationLabel.setLabelFor(startStationComboBox);
        add(startStationLabel, CC.xywh(15, 5, 9, 1));

        //---- endStationLabel ----
        endStationLabel.setText("Stacja ko\u0144cowa");
        endStationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        endStationLabel.setLabelFor(endStationComboBox);
        add(endStationLabel, CC.xywh(27, 5, 8, 1));
        add(startStationComboBox, CC.xywh(13, 7, 11, 1));
        add(endStationComboBox, CC.xywh(27, 7, 11, 1));

        //---- departureRadioButton ----
        departureRadioButton.setText("Odjazd");
        add(departureRadioButton, CC.xy(25, 9));

        //---- arrivalRadioButton ----
        arrivalRadioButton.setText("Przyjazd");
        add(arrivalRadioButton, CC.xy(25, 11));

        //---- dayLabel ----
        dayLabel.setText("Dzie\u0144");
        dayLabel.setLabelFor(dayTextField);
        add(dayLabel, CC.xy(19, 15, CC.CENTER, CC.DEFAULT));

        //---- monthLabel ----
        monthLabel.setText("Miesi\u0105c");
        monthLabel.setLabelFor(monthTextField);
        add(monthLabel, CC.xy(25, 15, CC.CENTER, CC.DEFAULT));

        //---- yearLabel ----
        yearLabel.setText("Rok");
        yearLabel.setLabelFor(yearTextField);
        add(yearLabel, CC.xy(33, 15, CC.CENTER, CC.DEFAULT));
        add(dayTextField, CC.xy(19, 17));
        add(monthTextField, CC.xy(25, 17));

        //---- yearTextField ----
        yearTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        add(yearTextField, CC.xy(33, 17));

        //---- hourLabel ----
        hourLabel.setText("Godzina");
        hourLabel.setLabelFor(hourTextField);
        add(hourLabel, CC.xy(23, 21, CC.CENTER, CC.DEFAULT));

        //---- minLabel ----
        minLabel.setText("Minuty");
        minLabel.setLabelFor(minTextField);
        add(minLabel, CC.xy(27, 21));
        add(hourTextField, CC.xy(23, 23));
        add(minTextField, CC.xy(27, 23));
        add(infoLabel, CC.xywh(19, 25, 15, 1, CC.CENTER, CC.CENTER));

        //---- searchButton ----
        searchButton.setText("Szukaj po\u0142\u0105cze\u0144");
        searchButton.setBackground(new Color(255, 128, 0));
        searchButton.setHorizontalTextPosition(SwingConstants.CENTER);
        searchButton.setMinimumSize(new Dimension(117, 30));
        searchButton.setMaximumSize(new Dimension(117, 30));
        add(searchButton, CC.xy(25, 27, CC.CENTER, CC.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


        try {
            for(String i : manager.getStations()) {
                startStationComboBox.addItem(i);
                endStationComboBox.addItem(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAndSendRequest();
            }
        });

    }

    private void checkAndSendRequest() {
        String startStation = (String)startStationComboBox.getSelectedItem();
        String endStation = (String)endStationComboBox.getSelectedItem();
        boolean isDeparture = departureRadioButton.isSelected();
        boolean isArrival = arrivalRadioButton.isSelected();
        if(isDeparture == isArrival) {
            infoLabel.setText("Wybierz jedno z: odjazd, przyjazd");
            return;
        }
        infoLabel.setText("");
        String day = dayTextField.getText();
        String month = monthTextField.getText();
        String year = yearTextField.getText();
        String hour = hourTextField.getText();
        String minutes = minTextField.getText();
        if(!(validateDate(day, month, year) && validateTime(hour, minutes))) {
            infoLabel.setText("Błędna data");
            return;
        }
        GregorianCalendar date = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day), Integer.parseInt(hour), Integer.parseInt(minutes));

        List<String> trasa = null;
        try {
            trasa = manager.getRides(startStation, endStation, isDeparture, date);
        } catch (Exception e){
            //upsi nie udało się
        }

        if (trasa == null){
            return;
        }
        frame.getContentPane().removeAll();
        new ShowRoutes(frame, trasa);

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
    // Generated using JFormDesigner Evaluation license - Tymoteusz Perka
    private JLabel titleLabel;
    private JLabel startStationLabel;
    private JLabel endStationLabel;
    private JComboBox startStationComboBox;
    private JComboBox endStationComboBox;
    private JRadioButton departureRadioButton;
    private JRadioButton arrivalRadioButton;
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JTextField yearTextField;
    private JLabel hourLabel;
    private JLabel minLabel;
    private JTextField hourTextField;
    private JTextField minTextField;
    private JLabel infoLabel;
    private JButton searchButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
