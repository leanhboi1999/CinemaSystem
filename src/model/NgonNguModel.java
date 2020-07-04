package model;

import entity.NgonNgu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Database;


public class NgonNguModel {
    static Connection con = Database.connect();
    
    public static ArrayList<NgonNgu> taiTatCa() throws SQLException {
        ArrayList<NgonNgu> arr = new ArrayList<>();
        String sql = "select * from ngonngu";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            arr.add(new NgonNgu(rs.getString(1), rs.getString(2)));
        }
        return arr;
    }
}
