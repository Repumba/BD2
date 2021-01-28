package bd2.gui;

import bd2.gui.db.DbSettings;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Main {
    public static void main( String[] args ) {
        JFrame frame = new JFrame("PKP");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainMenu menu = new MainMenu(frame);

    }

    public void testDbConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection(DbSettings.url, DbSettings.username, DbSettings.password);
            PreparedStatement st = con.prepareStatement("SELECT * FROM przejazd");
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            } else {
                System.out.println("nie udało się");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
