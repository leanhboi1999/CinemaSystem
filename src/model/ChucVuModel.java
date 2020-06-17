package model;

import entity.ChucVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

public class ChucVuModel {
    public static ArrayList<ChucVu> taiTatCa() throws SQLException {
        ArrayList<ChucVu> arr = new ArrayList<>();
        String sql = "select * from ChucVu";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new ChucVu(rs.getString(1), rs.getString(2),rs.getInt(3)));
        }
        return arr;
    }
}
