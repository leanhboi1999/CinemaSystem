/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author Lenovo
 */
public class NhanVienModel {
    public static ArrayList<NhanVien> taiTatCa() throws SQLException {
        ArrayList<NhanVien> arr = new ArrayList<>();
        String sql = "select * from NhanVien";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new NhanVien(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getString(9),rs.getDate(10),rs.getInt(11)));
        }
        return arr;
    }
    
}
