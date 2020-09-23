/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.TaiKhoan;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author leanh
 */
public class TaiKhoanModel {

    static Connection con = Database.connect();

    public static ArrayList<TaiKhoan> taiTatCa() throws SQLException {
        String sql = "select * from taikhoan";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<TaiKhoan> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3)));
        }
        return arr;
    }

    public static String layMatKhau(String username) throws SQLException {
        String sql = "select matkhau from TAIKHOAN where manhanvien = " + "'" + username + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String pass = rs.getString(1);
        System.out.println(pass);
        if (pass == null) {
            throw new SQLException();
        }
        return pass;
    }

    public static String GetQuyen(String username) throws SQLException {
        String sql = "select MAQUYEN from TAIKHOAN where manhanvien = " + "'" + username + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String maQuyen = rs.getString(1);
        return maQuyen;
    }

    public static boolean taoTaiKhoan(String manhanvien, String matkhau) throws SQLException {
        try {
            String sql = "{call TAOTK(?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, manhanvien);
            cstmt.setString(2, matkhau);
            cstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
