package bd2.gui.db.connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class DbManager {

    Connection con;

    public DbManager() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = DriverManager.getConnection(DbSettings.url, DbSettings.username, DbSettings.password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<String> getStations() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM stacja");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString(2));
        }

        st.close();
        rs.close();
        return result;
    }

    public List<Object> getRides(String startStation, String endStation, boolean isDeparture, GregorianCalendar date) {


        return null;

    }
}
