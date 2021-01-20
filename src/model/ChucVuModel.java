package model;

import entity.ChucVu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Database;

public class ChucVuModel {
    static Connection con = Database.connect();
    
    public static ArrayList<ChucVu> taiTatCa() throws SQLException {
        ArrayList<ChucVu> arr = new ArrayList<>();
        String sql = "select * from ChucVu";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            arr.add(new ChucVu(rs.getString(1), rs.getString(2),rs.getInt(3)));
        }
        Database.connect().close();
        return arr;
    }
}
