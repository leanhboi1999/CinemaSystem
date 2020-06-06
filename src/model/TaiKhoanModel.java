/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author leanh
 */
public class TaiKhoanModel {

    public static ArrayList<TaiKhoan> taiTatCa() throws SQLException {
        String sql = "select * from taikhoan";
        ResultSet rs = Database.callQuery(sql);
        ArrayList<TaiKhoan> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
        }
        return arr;
    }

    public static String layMatKhau(String username) throws SQLException {
        String sql = "select mat_khau from taikhoan where TEN_DANG_NHAP = " + username;
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        String pass = rs.getString(1);
        if (pass == null) {
            throw new SQLException();
        }
        return pass;
    }

    public static int GetQuyen(String username) throws SQLException {
        String sql = "select maquyen from taikhoan where TEN_DANG_NHAP = " + username;
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        int maQuyen = rs.getInt(1);
        return maQuyen;
    }
    
    public static int Insert (String user, String pass) throws SQLException {
        String sql = "Insert .....";
        int rs = Database.callUpdate(sql);
        return rs;
    }
}
