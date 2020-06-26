package model;

import entity.Ghe;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import util.Database;

public class GheModel {

    public static ArrayList<Ghe> taiTatCa(String masuatchieu) throws SQLException {
        ArrayList<Ghe> arr = new ArrayList<>();
        String sql = "SELECT SOGHE\n"
                + "    FROM VE,GHE\n"
                + "    WHERE VE.MAGHE=GHE.MAGHE\n"
                + "    AND VE.MASUATCHIEU='" + masuatchieu + "'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new Ghe(rs.getString(1)));
        }
        return arr;
    }

    public static int them() throws SQLException {
        int row = Database.callQueryInsert("ghe", null);
        return row;
    }
    public static int giave(String masuatchieu) throws SQLException {
    Connection con = Database.connect();
        try {  
        CallableStatement st = Database.connect().prepareCall("{? = call FUNC_GIAVE(?)}");
        st.registerOutParameter(1, Types.INTEGER);
        st.setString(2,masuatchieu);
        st.execute();
        System.out.println(st.getInt(1));
        return st.getInt(1);
        } catch (Exception e) {
            return 0;
        } finally {
            con.close();
        }
    }
}
