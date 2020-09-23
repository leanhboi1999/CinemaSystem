package controller;

import entity.HinhThuc;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HinhThucModel;

public class HinhThucController {
    public static ArrayList<HinhThuc> taiTatCa () throws SQLException {
        return HinhThucModel.taiTatCa();
    }
}
