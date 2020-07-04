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
        return arr;
    }

    public static ArrayList<HoaDonThucPham> timKiemMa(String mahoadon) throws SQLException {
        ArrayList<HoaDonThucPham> arr = new ArrayList<>();
        String sql = "SELECT * FROM HDTHUCPHAM WHERE MAHOADON LIKE '%" + mahoadon + "%'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new HoaDonThucPham(rs.getString(1), rs.getInt(2), rs.getTimestamp(3)));
        }
        return arr;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_HOADON}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static int inserthd(String m1, String m2, String m3) throws SQLException {
        String sql = "INSERT INTO HDTHUCPHAM VALUES (?,?,?)";
        PreparedStatement st = con.prepareCall(sql);
        st.setString(1, m1);
        st.setString(2, m2);
        st.setString(3, m3);
        int rows = st.executeUpdate();
        return rows;
    }

    //public static boolean inserthd_cthd(HoaDonThucPham hd, ArrayList<Cthdtp> chitiethoadon) throws SQLException {
    public static boolean inserthd_cthd(ArrayList<Cthdtp> chitiethoadon) throws SQLException {
        //Connection con = Database.connect();
        try {
            /*con.setAutoCommit(false);
            String sql = "INSERT INTO HDTHUCPHAM VALUES (?,?,?,TO_DATE(?,'YYYY-MM-DD'))";
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setString(1, hd.getMahoadon()); // This would set age
            stmt.setString(2, hd.getManhanvien());
            stmt.setInt(3, hd.getSotien());
            stmt.setString(4, hd.getNgaylap());
            stmt.executeUpdate();
            //PreparedStatement stmt2;*/
            for (int i = 0; i < chitiethoadon.size(); i++) {
                /*String sql2 = "INSERT INTO CTHDTP VALUES (?,?,?)";
                stmt2 = con.prepareStatement(sql2);
                stmt2.setString(2, chitiethoadon.get(i).getMathucpham()); // This would set age
                stmt2.setString(1, chitiethoadon.get(i).getMahoadon());
                stmt2.setInt(3, chitiethoadon.get(i).getSoluong());
                stmt2.executeUpdate();*/
                con.setAutoCommit(false);
                CallableStatement stmt1 = con.prepareCall("call PRO_INSERT_CTHDTP(?,?,?,?)");
                stmt1.setString(1, chitiethoadon.get(i).getMahoadon());
                stmt1.setString(2, chitiethoadon.get(i).getMathucpham());
                stmt1.setInt(3, chitiethoadon.get(i).getSoluong());
                stmt1.setString(4, LoginUI.kn_manhanvien);
                stmt1.executeUpdate();
                //Thread.sleep(1000);
                //con.commit();
            }
            //Chỉnh sửa thread tạo lost update
            Thread.sleep(1000);
            //Chỉnh tạo deadlock
            con.commit();
            return true;
        } catch (Exception e) {
            if (con != null) {
                con.rollback();
                e.printStackTrace();

            }
            return false;
        }
        /*finally {
            con.close();
        }*/
    }

}
