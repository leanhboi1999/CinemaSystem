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
            arr.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3)));
        }
        return arr;
    }

    public static String layMatKhau(String username) throws SQLException {
        String sql = "select mat_khau from TAIKHOAN where manhanvien = " + "'" + username + "'";
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        String pass = rs.getString(1);
        if (pass == null) {
            throw new SQLException();
        }
        return pass;
    }

    public static String GetQuyen(String username) throws SQLException {
        String sql = "select MAQUYEN from TAIKHOAN where manhanvien = " + "'" + username + "'";
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        String maQuyen = rs.getString(1);
        return maQuyen;
    }

    public static boolean taoTaiKhoan(String manhanvien, String tenquyen, String matkhau) throws SQLException {
        Connection con = Database.connect();
        try {
            String sql = "{call TAOTK(?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, manhanvien);
            //System.out.println();
            cstmt.setString(2, tenquyen);
            System.out.println(tenquyen);
            //System.out.println(tenhv);
            cstmt.setString(3, matkhau);
            //System.out.println(gioitinh);
            cstmt.executeUpdate();
            System.out.println("hhhh");
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            con.close();
        }
    }

    /*public static int Insert (String user, String pass) throws SQLException {
        String sql = "Insert .....";
        int rs = Database.callQueryUpdate(sql);
        return rs;
    }*/
}
