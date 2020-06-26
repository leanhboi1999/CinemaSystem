package model;

import entity.Ghe;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
