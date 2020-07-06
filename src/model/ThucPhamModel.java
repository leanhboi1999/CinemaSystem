package model;

import entity.ThucPham;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import util.Database;

public class ThucPhamModel {

    static Connection con = Database.connect();

    public static ArrayList<ThucPham> taiTatCa() throws SQLException {
        String sql = "select * from thucpham";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<ThucPham> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new ThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
        }
        return arr;
    }

    public static ArrayList<ThucPham> taiCoTrangThai() throws SQLException {

        String sql = "select * from thucpham where TRANGTHAI = 1";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<ThucPham> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new ThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
        }
        return arr;
    }

    public static ArrayList<ThucPham> timKiem(String tenthucpham) throws SQLException {
        //Cái này để giải quyết non-repeatable read
        con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        String sql = "SELECT * FROM THUCPHAM WHERE TENTHUCPHAM LIKE '%" + tenthucpham + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<ThucPham> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new ThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
        }
        return arr;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call ID_THUCPHAM}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static Date hienngay() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call auto_ngaylap}");
        st.registerOutParameter(1, Types.DATE);
        st.execute();
        return st.getDate(1);
    }

    public static ThucPham layThongTin(String maThucPham) throws SQLException {
        String sql = "SELECT * FROM THUCPHAM WHERE MATHUCPHAM =" + "'" + maThucPham + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        ThucPham thucpham = new ThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
        return thucpham;
    }

    public static int insertThucPham(ThucPham thucpham) throws SQLException {
        con.setAutoCommit(false);
        String sql = "INSERT INTO THUCPHAM VALUES (?,?,?,?,?)";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setString(1, thucpham.getMathucpham()); // This would set age
        stmt.setString(2, thucpham.getTenthucpham());
        stmt.setInt(3, (int) thucpham.getDongia());
        stmt.setInt(4, thucpham.getSoluong());
        stmt.setInt(5, thucpham.getTrangthai());
        int row = stmt.executeUpdate();
        con.commit();
        return row;
    }

    public static int editThucPham(String maThucPham, String tenThucPham, int donGia, int soLuong, int trangThai) throws SQLException {
        //Connection con = Database.connect();
        try {
            con.setAutoCommit(false);
            String sql = "{call EDIT_THUCPHAM(?,?,?,?,?)}";
            CallableStatement st = con.prepareCall(sql);
            st.setString(1, maThucPham);
            st.setString(2, tenThucPham);
            st.setInt(3, donGia);
            st.setInt(4, soLuong);
            st.setInt(5, trangThai);
            int kq = st.executeUpdate();
            //con.close();
            //Thay đổi thread để demo non-repeatable read
            //Thread.sleep(2000);
            con.commit();
            return kq;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int xoaThucPham(String maThucPham) throws SQLException {
        String sql = "DELETE FROM THUCPHAM WHERE MATHUCPHAM = '" + maThucPham + "'";
        PreparedStatement st = con.prepareCall(sql);
        int rs = st.executeUpdate(sql);
        return rs;
    }

}
