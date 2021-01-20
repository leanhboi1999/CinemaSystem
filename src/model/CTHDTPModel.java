package model;

import entity.Cthdtp;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.Database;

public class CTHDTPModel {

    static Connection con = Database.connect();

    public static ArrayList<Cthdtp> taiTatCa() throws SQLException {
        ArrayList<Cthdtp> arr = new ArrayList<>();
        String sql = "select * from cthdtp";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Cthdtp(rs.getString(1), rs.getString(2), rs.getInt(3)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<Cthdtp> taiChiTiet(String mahoadon) throws SQLException {
        ArrayList<Cthdtp> arr = new ArrayList<>();
        String sql = "SELECT * FROM CTHDTP WHERE MAHOADON = '" + mahoadon + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println(sql);
        while (rs.next()) {
            arr.add(new Cthdtp(rs.getString(1), rs.getString(2), rs.getInt(3)));
        }
        Database.connect().close();
        return arr;
        
    }

    public static int insert(String mahoadon, String mathucpham, int soluong) throws SQLException, InterruptedException {
        con.setAutoCommit(false);
        CallableStatement stmt = con.prepareCall("call {PRO_INSERT_CTHDTP(?,?,?)}");
        stmt.setString(1, mahoadon);
        stmt.setString(2, mathucpham);
        stmt.setInt(3, soluong);
        int row = stmt.executeUpdate();
        Database.connect().close();
        return row;
    }

}
