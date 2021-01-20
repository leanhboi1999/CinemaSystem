package model;

import entity.Cthdtp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;
import entity.HoaDonThucPham;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import view.LoginUI;

public class HoaDonThucPhamModel {

    static Connection con = Database.connect();

    public static ArrayList<HoaDonThucPham> taiTatCa() throws SQLException {
        ArrayList<HoaDonThucPham> arr = new ArrayList<>();
        String sql = "select * from hdthucpham";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoaDonThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getTimestamp(4)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<HoaDonThucPham> timKiemMa(String mahoadon) throws SQLException {
        ArrayList<HoaDonThucPham> arr = new ArrayList<>();
        String sql = "SELECT * FROM HDTHUCPHAM WHERE MAHOADON LIKE '%" + mahoadon + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoaDonThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getTimestamp(4)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<HoaDonThucPham> timKiemNgay(String startDate, String endDate) throws SQLException {
        ArrayList<HoaDonThucPham> arr = new ArrayList<>();
        String sql = "SELECT * FROM HDTHUCPHAM WHERE NGAYLAP>=TO_DATE('" + startDate + "','DD/MM/YYYY') AND NGAYLAP<=TO_DATE('" + endDate + "','DD/MM/YYYY')";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoaDonThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getTimestamp(4)));
        }
        Database.connect().close();
        return arr;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_HOADON}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        Database.connect().close();
        return st.getString(1);
    }

    public static int inserthd(String m1, String m2, String m3) throws SQLException {
        String sql = "INSERT INTO HDTHUCPHAM VALUES (?,?,?)";
        PreparedStatement st = con.prepareCall(sql);
        st.setString(1, m1);
        st.setString(2, m2);
        st.setString(3, m3);
        int rows = st.executeUpdate();
        Database.connect().close();
        return rows;
    }

    public static boolean inserthd_cthd(ArrayList<Cthdtp> chitiethoadon) throws SQLException {
        try {
            for (int i = 0; i < chitiethoadon.size(); i++) {

                con.setAutoCommit(false);
                CallableStatement stmt1 = con.prepareCall("call PRO_INSERT_CTHDTP(?,?,?,?)");
                stmt1.setString(1, chitiethoadon.get(i).getMahoadon());
                stmt1.setString(2, chitiethoadon.get(i).getMathucpham());
                stmt1.setInt(3, chitiethoadon.get(i).getSoluong());
                stmt1.setString(4, LoginUI.kn_manhanvien);
                stmt1.executeUpdate();  
            }
            con.commit();
            Database.connect().close();
            return true;
        } catch (Exception e) {
            if (con != null) {
                con.rollback();
                e.printStackTrace();
            }
            return false;
        }
    }

}
