/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Phim;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author leanh
 */
public class PhimModel {
    public static ArrayList<Phim> taiTatCa () throws SQLException {
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "Select * from phim";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11) , rs.getInt(12)));
        }
        Database.connect().close();
        return arr;
    }
    
    public static Phim getPhim(String maphim) throws SQLException {
        String sql = "select * from phim where maphim = " + "'" + maphim + "'";
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        Phim kq = new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11) , rs.getInt(12));
        Database.connect().close();
        return kq;
    }
}
