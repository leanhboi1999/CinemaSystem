package model;

import entity.NgonNgu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;


public class NgonNguModel {
    public static ArrayList<NgonNgu> taiTatCa() throws SQLException {
        ArrayList<NgonNgu> arr = new ArrayList<>();
        String sql = "select * from ngonngu";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new NgonNgu(rs.getString(1), rs.getString(2)));
        }
        return arr;
    }
}
