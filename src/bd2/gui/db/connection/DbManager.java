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

    public List<String> getTickets() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM bilet_jednorazowy JOIN przejazd ON bilet_jednorazowy.id_przejazdu=przejazd.id_przejazdu");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString(2)); //wziac dzien przejazdu, stacje poczatkowa, koncowa, numer miejsca i wagonu - zapisac wszystko jako string w 1 tablicy, w tej kolejnosci
        }

        st.close();
        rs.close();
        return result;
    }

    public List<String> getReservations() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM zamowienie WHERE stan_zamowienia= ____REZERWACJA____");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString(2)); //wziac id_zamowienia i kwote - zapisac wszystko jako string w 1 tablicy, w tej kolejnosci
        }

        st.close();
        rs.close();
        return result;
    }

    public List<String> getPosrednicy() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM posrednicy_platnosci");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString(2)); //wziac tylko nazwy posrednikow
        }

        st.close();
        rs.close();
        return result;
    }

    public List<String> getRides(String startStation, String endStation, boolean isDeparture, GregorianCalendar date) throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM przystanek JOIN stacja ON przystanek.id_stacji=stacja.id_stacji");
        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString(2)); //wziac id_przejazdu, nazwe stacji, date -> w tej kolejności
        }

        st.close();
        rs.close();
        List<String> final_result = new ArrayList<>();
        for (int i=0; i<result.size(); i+=3) {
            for (int j=0; j<result.size(); j+=3) {
                if( !result.get(i).equals(result.get(j)) ) //sprawdzenie czy to samo id_przejazdu
                    continue;
                if( !result.get(i+1).equals(startStation) || !result.get(j+1).equals(endStation) ) //sprawdzenie, czy dobre stacje
                    continue;
                if( !porownajDaty( result.get(i+2), result.get(j+2) ))
                    continue;

                //tutaj mozna dodac porownanie z data z zapytania

                //znaleziono dobre polaczenie
                final_result.add( startStation );
                final_result.add( result.get(i+2) );
                final_result.add( endStation );
                final_result.add( result.get(j+2) );
                final_result.add( result.get(i) );

                return final_result;
            }
        }
        return null;

    }

    public void addTicket(){
        //id_klienta = random%10
        //id_przejazu = random%10
        //tu dopisać jakieś gówno
    }

    private boolean porownajDaty(String a, String b){ //jesli data a jest wczesniej, return true
        for (int i=0; i<a.length(); ++i){
            if (a.charAt(i) == b.charAt(i))
                continue;
            if (a.charAt(i) < b.charAt(i))
                return true;
            else
                return false;
        }
        return false; //sa rowne
    }
}
