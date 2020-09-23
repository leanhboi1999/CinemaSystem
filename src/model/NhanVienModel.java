/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.NhanVien;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import util.Database;

/**
 *
 * @author Lenovo
 */
public class NhanVienModel {
    static Connection con = Database.connect();
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public static ArrayList<NhanVien> taiTatCa() throws SQLException {
        ArrayList<NhanVien> arr = new ArrayList<>();
        String sql = "select * from NhanVien";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getInt(11)));
        }
        return arr;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call ID_NHANVIEN}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static int insertNhanVien(NhanVien nv) throws SQLException {
        //Connection con = Database.connect();
        String sql = "INSERT INTO NHANVIEN VALUES (?,?,?,?,?,?,TO_DATE(?,'DD/MM/YYYY'),?,?,TO_DATE(?,'DD/MM/YYYY'),?)";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setString(1, nv.getManhanvien()); // This would set age
        stmt.setString(2, nv.getMachucvu());
        stmt.setString(3, nv.getHoten());
        stmt.setString(4, nv.getEmail());
        stmt.setString(5, nv.getCmnd());
        stmt.setString(6, nv.getGioitinh());
        stmt.setString(7, df.format(nv.getNgaysinh()));
        stmt.setString(8, nv.getDiachi());
        stmt.setString(9, nv.getDienthoai());
        stmt.setString(10, df.format(nv.getNgayvaolam()));
        stmt.setInt(11, nv.getTrangthai());
        int row = stmt.executeUpdate();
        return row;
    }

    public static boolean editNhanVien(String manv, String chucvu, String tennv, String email, String CMND, String gioitinh, Date ngaysinh, String diachi, String dienthoai, Date ngayvl, int trangthai) throws SQLException {
        try {
            String sql = "{call EDIT_NHANVIEN(?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, manv);         
            cstmt.setString(2, chucvu);
            cstmt.setString(3, tennv);
            cstmt.setString(4, email);
            cstmt.setString(5, CMND);
            cstmt.setString(6, gioitinh);
            cstmt.setString(7, df.format(ngaysinh));
            cstmt.setString(8, diachi);
            cstmt.setString(9, dienthoai);
            cstmt.setString(10, df.format(ngayvl));
            cstmt.setInt(11, trangthai);
            cstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static NhanVien layThongTin(String manhanvien) throws SQLException {
        String sql = "SELECT * FROM NHANVIEN WHERE MANHANVIEN=" + "'" + manhanvien + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getInt(11));
        Database.connect().close();
        return nv;
    }

    public static ArrayList<NhanVien> timKiemTen(String ten) throws SQLException {
        ArrayList<NhanVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM NHANVIEN WHERE HOTEN LIKE '%" + ten + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getInt(11)));
        }
        Database.connect().close();
        return arr;
    }

    public static int xoaNhanVien(String manhanvien) throws SQLException {
        String sql = "DELETE FROM NHANVIEN WHERE MANHANVIEN = '" + manhanvien + "'";
        Statement st = con.createStatement();
        int rs = st.executeUpdate(sql);
        Database.connect().close();
        return rs;
    }
}
