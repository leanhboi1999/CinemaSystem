/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Phim;
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
 * @author leanh
 */
public class PhimModel {

    public static ArrayList<Phim> taiTatCa() throws SQLException {
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "Select * from phim";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<Phim> taiPhimDangChieu() throws SQLException {
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "SELECT MAPHIM, TENPHIM FROM PHIM WHERE TRANGTHAI = 'ĐANG CHIẾU'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2)));
        }
        Database.connect().close();
        return arr;
    }

    public static Phim getPhim(String maphim) throws SQLException {
        String sql = "select * from phim where maphim = " + "'" + maphim + "'";
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        Phim kq = new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12));
        Database.connect().close();
        return kq;
    }

    public static ArrayList<Phim> timKiem(String tenphim) throws SQLException {
        ArrayList<Phim> arr = new ArrayList<>();
        String sql = "SELECT * FROM PHIM WHERE TENPHIM LIKE '%" + tenphim + "%'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new Phim(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getInt(10), rs.getString(11), rs.getString(12)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<Phim> timKiem(String startDate, String endDate) throws SQLException {
        String sql = "SELECT * FROM PHIM WHERE NGAYKHOICHIEU>=TO_DATE('" + startDate + "','DD/MM/YYYY') AND NGAYKHOICHIEU<=TO_DATE('" + endDate + "','DD/MM/YYYY')";
        ResultSet rs = Database.callQuery(sql);
        ArrayList<Phim> arr = new ArrayList<>();
        while (rs.next()) {
            System.out.println("model.connectphim.look()");
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
        int rs = Database.callQueryDelete(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_PHIM}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static boolean them(Phim p, ArrayList<SuatPhim> aSuatPhim) throws SQLException {
        Connection con = Database.connect();
        try {
            con.setAutoCommit(false);
            Database.callStoredUpdate("PRO_INSERT_PHIM", p.getMaphim(), p.getTenphim(), p.getThoiluong(), p.getTheloai(), p.getNhasanxuat(), p.getNamsanxuat(), p.getDienvien(), p.getNuocsanxuat(), p.getNgaykhoichieu(), p.getGioihantuoi(), p.getTomtat(), p.getTrangthai());
            for (SuatPhim item : aSuatPhim) {
                Database.callStoredUpdate("PRO_INSERT_SUATPHIM", item.getMasuatphim());
            }
            con.close();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        } finally {
            con.close();
        }
    }
}
