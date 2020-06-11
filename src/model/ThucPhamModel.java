/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ThucPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author leanh
 */
public class ThucPhamModel {
    public static ArrayList<ThucPham> taiTatCa () throws SQLException {
        String sql = "select * from thucpham";
        ResultSet rs = Database.callQuery(sql);
        ArrayList<ThucPham> arr = new ArrayList<>();
        while(rs.next()) {
            arr.add(new ThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getByte(5)));
        }
        Database.connect().close();
        return arr;
    }
}
