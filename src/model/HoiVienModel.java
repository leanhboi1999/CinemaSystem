/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.HoiVien;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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
    
    public static HoiVien layThongTin(String mahoivien) throws SQLException{
        String sql = "SELECT * FROM HOIVIEN WHERE MAHOIVIEN ="+"'"+mahoivien+"'";
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        HoiVien hv = new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9));
        Database.connect().close();
        return hv;
    }

    public static ArrayList<HoiVien> timKiemTen(String ten) throws SQLException {
        ArrayList<HoiVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM HOIVIEN WHERE HOTEN LIKE '%" + ten + "%'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9)));

        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<HoiVien> timKiemCMND(String cmnd) throws SQLException {
        ArrayList<HoiVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM HOIVIEN WHERE CMND =" + "'" + cmnd + "'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9)));

        }
        Database.connect().close();
        return arr;
    }
    
     public static int xoaHoiVien(String mahoivien) throws SQLException {
        String sql = "DELETE FROM HOIVIEN WHERE MAHOIVIEN = '" + mahoivien + "'";
        int rs = Database.callQueryDelete(sql);
        Database.connect().close();
        return rs;
    }
    
    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_HOIVIEN}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    
}
