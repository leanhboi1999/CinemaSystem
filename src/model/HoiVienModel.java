package model;

import entity.HoiVien;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import util.Database;

public class HoiVienModel {
    static Connection con = Database.connect();
    private static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");

    public static ArrayList<HoiVien> taiTatCa() throws SQLException {
        ArrayList<HoiVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM HOIVIEN";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9)));
        }
        Database.connect().close();
        return arr;
    }

    public static HoiVien layThongTin(String mahoivien) throws SQLException {
        String sql = "SELECT * FROM HOIVIEN WHERE MAHOIVIEN =" + "'" + mahoivien + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        HoiVien hv = new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9));
        Database.connect().close();
        return hv;
    }

    public static ArrayList<HoiVien> timKiemTen(String ten) throws SQLException {
        ArrayList<HoiVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM HOIVIEN WHERE HOTEN LIKE '%" + ten + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9)));

        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<HoiVien> timKiemCMND(String cmnd) throws SQLException {
        ArrayList<HoiVien> arr = new ArrayList<>();
        String sql = "SELECT * FROM HOIVIEN WHERE CMND =" + "'" + cmnd + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoiVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getInt(9)));

        }
        Database.connect().close();
        return arr;
    }

    public static int xoaHoiVien(String mahoivien) throws SQLException {
        String sql = "DELETE FROM HOIVIEN WHERE MAHOIVIEN = '" + mahoivien + "'";
        Statement st = con.createStatement();
        int rs = st.executeUpdate(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call ID_HOIVIEN}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        Database.connect().close();
        return st.getString(1);
    }

    public static int insertHoiVien(HoiVien hv) throws SQLException {
        String sql = "INSERT INTO HOIVIEN VALUES (?,?,?,?,TO_DATE(?,'DD-MM-YYYY'),?,?,?,?)";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setString(1, hv.getMahoivien()); // This would set age
        stmt.setString(2, hv.getHoten());
        stmt.setString(3, hv.getGioitinh());
        stmt.setString(4, hv.getCmnd());
        stmt.setString(5, fm.format(hv.getNgaysinh()));
        stmt.setString(6, hv.getEmail());
        stmt.setString(7, hv.getSodienthoai());
        stmt.setDate(8, (java.sql.Date) (Date) hv.getNgaydangki());
        stmt.setInt(9, hv.getDiemtichluy());
        int row = stmt.executeUpdate();
        Database.connect().close();
        return row;
    }

    public static boolean editHoiVien(String mahv, String tenhv, String gioitinh, String CMND, Date ngaysinh, String email, String dienthoai) throws SQLException {
        try {
            String sql = "{call EDIT_HOIVIEN(?,?,?,?,?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, mahv);
            cstmt.setString(2, tenhv);
            cstmt.setString(3, gioitinh);
            cstmt.setString(4, CMND);
            cstmt.setString(5, fm.format(ngaysinh));
            cstmt.setString(6, email);
            cstmt.setString(7, dienthoai);
            cstmt.executeUpdate();
            Database.connect().close();
            return true;
        } catch (Exception e) {
            Database.connect().close();
            return false;
        }
    }

}
