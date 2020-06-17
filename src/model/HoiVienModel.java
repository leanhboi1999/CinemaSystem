/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.HoiVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author leanh
 */
public class HoiVienModel {
    public static ArrayList<HoiVien> taiTatCa() throws SQLException {
        ArrayList<HoiVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM HOIVIEN";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9)));
        }
        return arr;
    }
}
