package model;

import entity.Phim;
import entity.SuatPhim;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author leanh
 */
public class PhimModel {
    static Connection con = Database.connect();
    private static SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");

    public static ArrayList<Phim> taiTatCa() throws SQLException {
        con.setAutoCommit(false);
        con.commit();
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "Select * from phim";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<Phim> taiPhimDangChieu() throws SQLException {
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "SELECT MAPHIM, TENPHIM FROM PHIM WHERE TRANGTHAI = 'ĐANG CHIẾU'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2)));
        }
        Database.connect().close();
        return arr;
    }

    public static Phim getPhim(String maphim) throws SQLException {
        String sql = "select * from phim where maphim = " + "'" + maphim + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        Phim kq = new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12));
        Database.connect().close();
        return kq;
    }

    public static ArrayList<Phim> timKiem(String tenphim) throws SQLException {
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "SELECT * FROM PHIM WHERE TENPHIM LIKE '%" + tenphim + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<Phim> timKiem(String startDate, String endDate) throws SQLException {
        String sql = "SELECT * FROM PHIM WHERE NGAYKHOICHIEU>=TO_DATE('" + startDate + "','DD/MM/YYYY') AND NGAYKHOICHIEU<=TO_DATE('" + endDate + "','DD/MM/YYYY')";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Phim> arr = new ArrayList<>();
        while (rs.next()) {
            Phim k = new Phim(rs.getString(1), rs.getString(2),
                    rs.getInt(3), rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9),
                    rs.getInt(10), rs.getString(11), rs.getString(12));
            arr.add(k);
        }
        Database.connect().close();
        return arr;
    }

    public static int xoaPhim(String maphim) throws SQLException {
        String sql = "DELETE FROM PHIM WHERE MAPHIM = '" + maphim + "'";
        Statement st = con.createStatement();
        int rs = st.executeUpdate(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st =con.prepareCall("{? = call ID_PHIM}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        Database.connect().close();
        return st.getString(1);
    }

    public static boolean them(Phim p, ArrayList<SuatPhim> aSuatPhim) throws SQLException {
        try {
            con.setAutoCommit(false);
            String sql = "INSERT INTO PHIM VALUES (?,?,?,?,?,?,?,?,TO_DATE(?,'dd/mm/yyyy'),?,?,?)";
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getMaphim());
            stmt.setString(2, p.getTenphim());
            stmt.setInt(3, p.getThoiluong());
            stmt.setString(4, p.getTheloai());
            stmt.setString(5, p.getNhasanxuat());
            stmt.setInt(6, p.getNamsanxuat());
            stmt.setString(7, p.getDienvien());
            stmt.setString(8, p.getNuocsanxuat());
            stmt.setString(9, fm.format(p.getNgaykhoichieu()));
            stmt.setInt(10, p.getGioihantuoi());
            stmt.setString(11, p.getTomtat());
            stmt.setString(12, p.getTrangthai());
            stmt.executeUpdate();
            CallableStatement cstmt;
            for (SuatPhim item : aSuatPhim) {
                String sql2 = "{call PRO_INSERT_SUATPHIM (?,?,?,?,?)}";
                cstmt = con.prepareCall(sql2);
                cstmt.setString(1, item.getMasuatphim());
                cstmt.setString(2, item.getTenngonngu());
                cstmt.setString(3, item.getTendinhdang());
                cstmt.setString(4, item.getMaphim());
                cstmt.setString(5, item.getTenhinhthuc());
                cstmt.executeUpdate();
            }
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        }
    }

    public static boolean sua(Phim p) throws SQLException {
        try {
            con.setAutoCommit(false);
            CallableStatement stmt;
            String sql = "{call EDIT_PHIM(?,?,?,?,?,?,?,?,TO_DATE(?,'dd/mm/yyyy'),?,?,?)}";
            stmt = con.prepareCall(sql);
            stmt.setString(1, p.getMaphim());
            stmt.setString(2, p.getTenphim());
            stmt.setInt(3, p.getThoiluong());
            stmt.setString(4, p.getTheloai());
            stmt.setString(5, p.getNhasanxuat());
            stmt.setInt(6, p.getNamsanxuat());
            stmt.setString(7, p.getDienvien());
            stmt.setString(8, p.getNuocsanxuat());
            stmt.setString(9, fm.format(p.getNgaykhoichieu()));
            stmt.setInt(10, p.getGioihantuoi());
            stmt.setString(11, p.getTomtat());
            stmt.setString(12, p.getTrangthai());
            stmt.executeUpdate();
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        }
    }
}
