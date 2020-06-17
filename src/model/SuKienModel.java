/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.SuKien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author Lenovo
 */
public class SuKienModel {
    public static ArrayList<SuKien> taiTatCa() throws SQLException {
        ArrayList<SuKien> arr = new ArrayList<>();
        String sql = "select * from sukien";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new SuKien(rs.getString(1), rs.getString(2),rs.getString(3),rs.getInt(4)));
        }
        return arr;
    }
    
}
