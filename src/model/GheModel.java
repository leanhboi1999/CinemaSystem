package model;

import entity.Ghe;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import util.Database;

public class GheModel {

    static Connection con = Database.connect();

    public static ArrayList<Ghe> taiTatCa(String masuatchieu) throws SQLException {
        ArrayList<Ghe> arr = new ArrayList<>();
        String sql = "SELECT SOGHE\n"
                + "    FROM VE,GHE\n"
                + "    WHERE VE.MAGHE=GHE.MAGHE\n"
                + "    AND VE.MASUATCHIEU='" + masuatchieu + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new Ghe(rs.getString(1)));
        }
        return arr;
    }

    public static Ghe timKiemGhe(String maphong, int soghe) throws SQLException {
        Connection con = Database.connect();
        String sql = "SELECT * FROM GHE WHERE MAPHONG='" + maphong + "'" + "AND SOGHE='" + soghe + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        Ghe gh = new Ghe(rs.getString(1), rs.getString(2), rs.getInt(3));
        Database.connect().close();
        return gh;
    }

    public static int them() throws SQLException {
        String sql = "INSERT INTO GHE VALUES (?) ";
        PreparedStatement st = con.prepareCall(sql);
        st.setString(1, null);
        int row = st.executeUpdate();
        return row;
    }

    public static int giave(String masuatchieu) throws SQLException {
        Connection con = Database.connect();
        try {
            CallableStatement st = con.prepareCall("{? = call FUNC_GIAVE(?)}");
            st.registerOutParameter(1, Types.INTEGER);
            st.setString(2, masuatchieu);
            st.execute();
            System.out.println(st.getInt(1));
            return st.getInt(1);
        } catch (Exception e) {
            return 0;
        }
        /*finally {
            con.close();
        }*/
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call ID_VE}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }

    public static boolean themVe(String mave, String masuatchieu, String manhanvien, String mahoivien, String maghe, int giave) throws SQLException {
        //Connection con = Database.connect();
        try {
            String sql = "{call PRO_BANVE(?,?,?,?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, mave);
            cstmt.setString(2, masuatchieu);
            cstmt.setString(3, manhanvien);
            cstmt.setString(4, mahoivien);
            cstmt.setString(5, maghe);
            //System.out.println(fm.format(ngaysinh));
            cstmt.setInt(6, giave);
            cstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
