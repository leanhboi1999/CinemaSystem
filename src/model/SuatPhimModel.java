/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.SuatPhim;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import util.Database;

/**
 *
 * @author Lenovo
 */
public class SuatPhimModel {

    public static ArrayList<SuatPhim> taiTatCa() throws SQLException {
        ArrayList<SuatPhim> arr = new ArrayList<>();
        String sql = "select * from SuatPhim";
        ResultSet rs = Database.callQuery(sql);
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
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new SuatPhim(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        return arr;
    }

    public static boolean them(SuatPhim sp) throws SQLException {
        Connection con = Database.connect();
        try {
            con.setAutoCommit(false);
            Database.callStoredUpdate("PRO_INSERT_SUATPHIM", sp.getMasuatphim());
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        } finally {
            con.close();
        }
    }

    public static int xoaSuatPhim(String masuatchieu) throws SQLException {
        String sql = "DELETE FROM suatchieu where masuatchieu =" + "'" + masuatchieu + "'";
        int rs = Database.callQueryDelete(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_SUATPHIM}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

}
