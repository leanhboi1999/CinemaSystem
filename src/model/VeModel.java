/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Ve;
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
public class VeModel {

    static Connection con = Database.connect();

    public static ArrayList<Ve> taiTatCa() throws SQLException {
        ArrayList<Ve> arr = new ArrayList<>();
        String sql = "SELECT * FROM VE";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Ve(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getInt(7)));
        }
        return arr;
    }

    public static Ve chiTietVe(String mave) throws SQLException {
        String sql = "SELECT MAVE, MASUATCHIEU, VE.MANHANVIEN, VE.MAHOIVIEN, MAGHE, GIAVE, NHANVIEN.HOTEN, HOIVIEN.HOTEN FROM VE, NHANVIEN, HOIVIEN WHERE MAVE = '" + mave + "'" + " AND VE.MAHOIVIEN = HOIVIEN.MAHOIVIEN AND VE.MANHANVIEN = NHANVIEN.MANHANVIEN";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        Ve chitiet = new Ve(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
        return chitiet;
    }

    public static boolean sua(Ve item) throws SQLException {
        try {
            con.setAutoCommit(false);
            String sql = "{call EDIT_VE(?,?,?,?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, item.getMave());
            cstmt.setString(2, item.getMasuatchieu());
            cstmt.setString(3, item.getManhanvien());
            cstmt.setString(4, item.getMahoivien());
            cstmt.setString(5, item.getMaghe());
            cstmt.setInt(6, item.getGiave());
            cstmt.executeUpdate();
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        } finally {
            con.close();
        }
    }

    public static ArrayList<Ve> timKiem(String mave) throws SQLException {
        ArrayList<Ve> arr = new ArrayList<>();
        String sql = "SELECT * FROM VE WHERE MAVE LIKE +'%" + mave + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Ve(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getInt(7)));
        }
        return arr;
    }

    public static ArrayList<Ve> timKiemNgay(String startDate, String endDate) throws SQLException {
        String sql = "SELECT * FROM VE WHERE NGAYLAP>=TO_DATE('" + startDate + "','DD/MM/YYYY') AND NGAYLAP<=TO_DATE('" + endDate + "','DD/MM/YYYY')";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Ve> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new Ve(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getInt(7)));
        }
        return arr;
    }

}
