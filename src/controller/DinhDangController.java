package controller;

import entity.DinhDang;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DinhDangModel;

public class DinhDangController {
    public static ArrayList<DinhDang> taiTatCa () throws SQLException {
        return DinhDangModel.taiTatCa();
    }
}
