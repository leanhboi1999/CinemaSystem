package model;

import entity.SuatPhim;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import util.Database;

public class SuatPhimModel {

    static Connection con = Database.connect();

    public static ArrayList<SuatPhim> taiTatCa() throws SQLException {
        ArrayList<SuatPhim> arr = new ArrayList<>();
        String sql = "select * from SuatPhim";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuatPhim(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
    }
        return arr;
    }

    public static ArrayList<SuatPhim> taiDanhSach(String maphim) throws SQLException {
        ArrayList<SuatPhim> arr = new ArrayList<>();
        String sql = "SELECT MASUATPHIM,TENNGONNGU,TENDINHDANG,TENHINHTHUC\n"
                + "  FROM SUATPHIM SP,DINHDANG DD,NGONNGU NN,HINHTHUC HT\n"
                + "  WHERE SP.MADINHDANG=DD.MADINHDANG\n"
                + "  AND SP.MANGONNGU=NN.MANGONNGU\n"
                + "  AND SP.MAHINHTHUC=HT.MAHINHTHUC\n"
                + "  AND SP.MAPHIM=" + "'" + maphim + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuatPhim(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        return arr;
    }

    public static boolean them(SuatPhim sp) throws SQLException {
        try {
            con.setAutoCommit(false);
            CallableStatement cstmt;
            //Database.callStoredUpdate("PRO_INSERT_SUATPHIM", sp.getMasuatphim(), sp.getTenngonngu(), sp.getTendinhdang(), sp.getMaphim(), sp.getTenhinhthuc());
            String sql2 = "{call PRO_INSERT_SUATPHIM (?,?,?,?,?)}";
            cstmt = con.prepareCall(sql2);
            cstmt.setString(1, sp.getMasuatphim());
            cstmt.setString(2, sp.getTenngonngu());
            cstmt.setString(3, sp.getTendinhdang());
            cstmt.setString(4, sp.getMaphim());
            cstmt.setString(5, sp.getTenhinhthuc());
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

    public static int xoaSuatPhim(String masuatphim) throws SQLException {
        String sql = "DELETE FROM SUATPHIM WHERE MASUATPHIM =" + "'" + masuatphim + "'";
        Statement st = con.createStatement();
        int rs = st.executeUpdate(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call ID_SUATPHIM}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static boolean them(String maSuatChieu, String tenPhong, String maSuatPhim, String gio, String ngaychieu) throws SQLException {
        // Connection con = Database.connect();
        try {
            con.setAutoCommit(false);
            String tam = ngaychieu + " " + gio;
            String sql = "{call PRO_INSERT_SUATCHIEU(?,?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            System.out.println("flag 1");
            cstmt.setString(1, maSuatChieu);
            System.out.println(maSuatChieu);
            cstmt.setString(2, tenPhong);
            System.out.println(tenPhong);
            cstmt.setString(3, maSuatPhim);
            System.out.println(maSuatPhim);
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
            cstmt.setTimestamp(4, new Timestamp(df.parse(tam).getTime()));
            cstmt.executeUpdate();
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        }
        /*finally {
            con.close();
        }*/
    }
}
