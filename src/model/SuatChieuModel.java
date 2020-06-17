/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SuatChieuController;
import entity.SuatChieu;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import util.Database;

public class SuatChieuModel {

    public static ArrayList<SuatChieu> taiTatCa() throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "select * from SuatChieu";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
        }
        return arr;
    }

    public static ArrayList<SuatChieu> timKiem(String masuatchieu) throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "SELECT * FROM SUATCHIEU WHERE MASUATCHIEU =" + "'" + masuatchieu + "'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<SuatChieu> timKiem(String startDate, String endDate) throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "SELECT * FROM SUATCHIEU WHERE THOIGIANCHIEU>=TO_DATE('" + startDate + "','DD/MM/YYYY') AND THOIGIANCHIEU<=TO_DATE('" + endDate + "','DD/MM/YYYY')";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
        }
        Database.connect().close();
        return arr;
    }

    public static int xoaSuatChieu(String masuatchieu) throws SQLException {
        String sql = "DELETE FROM SUATCHIEU WHERE MASUATCHIEU = '" + masuatchieu + "'";
        int rs = Database.callQueryDelete(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_SUATCHIEU}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        Database.connect().close();
        return st.getString(1);
    }

}
