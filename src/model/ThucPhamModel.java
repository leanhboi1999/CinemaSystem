package model;

import entity.Cthdtp;
import entity.HoaDonThucPham;
import entity.ThucPham;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import util.Database;

public class ThucPhamModel {

    public static ArrayList<ThucPham> taiTatCa() throws SQLException {
        String sql = "select * from thucpham";
        ResultSet rs = Database.callQuery(sql);
        ArrayList<ThucPham> arr = new ArrayList<>();
        while (rs.next()) {
            arr.add(new ThucPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
        }
        Database.connect().close();
        return arr;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_HOADON}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static Date hienngay() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call auto_ngaylap}");
        st.registerOutParameter(1, Types.DATE);
        st.execute();
        return st.getDate(1);
    }

    public static int insert(String mahoadon, String mathucpham, int soluong) throws SQLException {
        int rows = Database.callQueryInsert("CTHDTP", mahoadon, mathucpham, soluong);
        Database.connect().close();
        return rows;
    }

    public static int inserthd(String m1, String m2, String m3) throws SQLException {
        int rows;
        rows = Database.callQueryInsert("HDTHUCPHAM", m1, m2, m3);
        Database.connect().close();
        return rows;
    }

    public static boolean inserthd_cthd(HoaDonThucPham hd, ArrayList<Cthdtp> chitiethoadon) throws SQLException {
        Connection con = Database.connect();
        try {
            con.setAutoCommit(false);
            String sql = "INSERT INTO HDTHUCPHAM VALUES (?,?,?,TO_DATE(?,'YYYY-MM-DD'))";
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setString(1, hd.getMahoadon()); // This would set age
            stmt.setString(2, hd.getManhanvien());
            stmt.setInt(3, hd.getSotien());
            stmt.setString(4, hd.getNgaylap());
            stmt.executeUpdate();

            PreparedStatement stmt2;
            for (int i = 0; i < chitiethoadon.size(); i++) {
                String sql2 = "INSERT INTO CTHDTP VALUES (?,?,?)";
                stmt2 = con.prepareStatement(sql2);
                stmt2.setString(2, chitiethoadon.get(i).getMathucpham()); // This would set age
                stmt2.setString(1, chitiethoadon.get(i).getMahoadon());
                stmt2.setInt(3, chitiethoadon.get(i).getSoluong());
                stmt2.executeUpdate();
            }
            con.commit();
            return true;
        } catch (Exception e) {
            if (con != null) {
                con.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            con.close();
        }
    }
}
