package model;

import entity.SuKien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Database;

public class SuKienModel {

    static Connection con = Database.connect();

    public static ArrayList<SuKien> taiTatCa() throws SQLException {
        ArrayList<SuKien> arr = new ArrayList<>();
        String sql = "select * from sukien";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuKien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
        }
        return arr;
    }

}
