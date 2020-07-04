package model;

import entity.HinhThuc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Database;

public class HinhThucModel {
    static Connection con = Database.connect();
    
    public static ArrayList<HinhThuc> taiTatCa () throws SQLException {
        String sql = "select * from hinhthuc";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<HinhThuc> arr = new ArrayList<>();
        while(rs.next()) {
            arr.add(new HinhThuc(rs.getString(1), rs.getString(2)));
        }
        return arr;
    }
}
