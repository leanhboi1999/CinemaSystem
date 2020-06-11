package model;

import entity.DinhDang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

public class DinhDangModel {
    public static ArrayList<DinhDang> taiTatCa () throws SQLException {
        ArrayList<DinhDang> arr = new ArrayList<>();
        String sql = "SELECT * FROM DINHDANG";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new DinhDang(rs.getString(1), rs.getString(2)));
        }
        Database.connect().close();
        return arr;
    }
}
