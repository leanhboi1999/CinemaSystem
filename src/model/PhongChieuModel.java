/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.PhongChieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author Lenovo
 */
public class PhongChieuModel {
    public static ArrayList<PhongChieu> taiTatCa() throws SQLException {
        ArrayList<PhongChieu> arr = new ArrayList<>();
        String sql = "select * from PhongChieu";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new PhongChieu(rs.getString(1), rs.getString(2),rs.getInt(3)));
        }
        return arr;
    }
}
