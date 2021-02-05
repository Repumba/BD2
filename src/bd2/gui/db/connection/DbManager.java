package bd2.gui.db.connection;

import bd2.gui.db.Bilet;
import bd2.gui.db.BiletJednorazowy;
import bd2.gui.db.BiletOkresowy;
import bd2.gui.db.PosrednikPlatnosci;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
        PreparedStatement st = con.prepareStatement("SELECT * FROM bilet_jednorazowy JOIN przejazd ON bilet_jednorazowy.przejazd_id_przejazdu=przejazd.id_przejazdu");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString("data")); //wziac dzien przejazdu, stacje poczatkowa, koncowa, numer miejsca i wagonu - zapisac wszystko jako string w 1 tablicy, w tej kolejnosci
            result.add(rs.getString("stacja_poczatkowa"));
            result.add(rs.getString("stacja_koncowa"));
            result.add(rs.getString("miejsce_numer_miejsca"));
            result.add(rs.getString("miejsce_wagon_numer_wagonu"));
        }

        st.close();
        rs.close();
        return result;
    }

    public List<String> getReservations() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM zamowienie");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString("id_zamowienia"));
            result.add(rs.getString("kwota"));//wziac id_zamowienia i kwote - zapisac wszystko jako string w 1 tablicy, w tej kolejnosci
        }

        st.close();
        rs.close();
        return result;
    }

    public List<String> getPosrednicy() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT nazwa FROM posrednik_platnosci NATURAL JOIN nazwa_posrednika_platnosci");

        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            result.add(rs.getString("nazwa")); //wziac tylko nazwy posrednikow
        }

        st.close();
        rs.close();
        return result;
    }

    public List<String> getRides(String startStation, String endStation, boolean isDeparture, Date date) throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM przystanek JOIN stacja ON przystanek.stacja_id_stacji=stacja.id_stacji");
        List<String> result = new ArrayList<>();
        ResultSet rs = st.executeQuery();
        boolean first = true;
        while(rs.next()) {
            result.add(rs.getString("przejazd_id_przejazdu"));
            result.add(rs.getString("nazwa_stacji"));//wziac id_przejazdu, nazwe stacji, date -> w tej kolejności
            result.add(rs.getString("godzina_odjazdu"));
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
                if (!porownajDaty(result.get(i + 2), result.get(j + 2)))
                    continue;

                //tutaj mozna dodac porownanie z data z zapytania
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                long difference = 30;
                Date foundDate = null;
                try {

                    if (isDeparture) {
                        foundDate = df.parse(result.get(i + 2));
                    } else
                        foundDate = df.parse(result.get(j + 2));
                    long diffInMillies = Math.abs(date.getTime() - foundDate.getTime());
                    difference = TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //System.out.println(date.toString() + " " + foundDate.toString() + " " + difference);
                if(difference <= 24) {
                    //znaleziono dobre polaczenie
                    final_result.add(startStation);
                    final_result.add(result.get(i + 2));
                    final_result.add(endStation);
                    final_result.add(result.get(j + 2));
                    final_result.add(result.get(i));
                    return final_result;
                }

            }
        }
        return null;

    }

    public void addSeasonTicket(BiletOkresowy b) throws SQLException {
        //id_klienta = random%10
        //id_przejazu = random%10
        Random rand = new Random();
       int id_zamowienia = rand.nextInt(10000) + 2;
       PreparedStatement zamowienie = con.prepareStatement("INSERT INTO zamowienie VALUES (?, CURDATE(), 5, 1, 1, 'Przelew', ?, 'Oplacone')");
       zamowienie.setInt(1, id_zamowienia);
       zamowienie.setInt(2, rand.nextInt(200)+1);
       if(zamowienie.executeUpdate() > 0) {
           System.out.println("Pomyślnie dodano zamówienie");
       }
       int id_biletu = rand.nextInt(10000) + 2;
       PreparedStatement bilet = con.prepareStatement("INSERT INTO bilet VALUES (?, ?)");
       bilet.setInt(1, id_biletu);
       bilet.setInt(2, id_zamowienia);
       if(bilet.executeUpdate() > 0) {
           System.out.println("Pomyślnie dodano bilet");
       }


        PreparedStatement st = con.prepareStatement("INSERT INTO bilet_okresowy (id_osoby, numer_biletu, stacja_poczatkowa, stacja_koncowa, wazny_od, wazny_do) VALUES (1, ?, ?, ?, ?, ?)");
        st.setInt(1, id_biletu);
        st.setDate(4, new java.sql.Date(b.getWaznyOd().getTime().getTime()));
        st.setDate(5,new java.sql.Date(b.getWaznyDo().getTime().getTime()));
        st.setString(2, b.getStacjaPoczatkowa());
        st.setString(3, b.getStacjaKoncowa());
        if(st.executeUpdate() > 0) {
            System.out.println("Pomyślnie dodano bilet okresowy");
        }

        st.close();

    }

    public void addTicket(BiletJednorazowy b) throws SQLException {
        Random rand = new Random();
        PreparedStatement st = con.prepareStatement("INSERT INTO bilet_jednorazowy(id_osoby, id_przejazdu, numer_biletu, miejsce_numer_miejsca, miejsce_wagon_numer_wagonu, miejsce_wagon_pociag_id_pociagu) VALUES (?, ?, ?, ?, ?, ?)");
        st.setInt(1, rand.nextInt(10) + 1);
        st.setInt(2, rand.nextInt(1000));
//        st.setDate(5, new java.sql.Date(b.getWaznyOd().getTime().getTime()));
//        st.setDate(6,new java.sql.Date(b.getWaznyDo().getTime().getTime()));
//        st.setString(3, b.getStacjaPoczatkowa());
//        st.setString(4, b.getStacjaKoncowa());
        if(st.executeUpdate() > 0) {
            System.out.println("Pomyślnie dodano bilet");
        }

        st.close();

    }


    private boolean porownajDaty(String a, String b){ //jesli data a jest wczesniej, return true
        //parse dates
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date dateA = df.parse(a);
            Date dateB = df.parse(b);
            return dateA.compareTo(dateB) < 0;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }

    }


}
