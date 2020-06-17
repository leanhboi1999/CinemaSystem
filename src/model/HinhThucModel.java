package model;

import entity.HinhThuc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

public class HinhThucModel {
    public static ArrayList<HinhThuc> taiTatCa () throws SQLException {
        String sql = "select * from hinhthuc";
        ResultSet rs = Database.callQuery(sql);
        ArrayList<HinhThuc> arr = new ArrayList<>();
        while(rs.next()) {
            arr.add(new HinhThuc(rs.getString(1), rs.getString(2)));
        }
        return arr;
    }
}
