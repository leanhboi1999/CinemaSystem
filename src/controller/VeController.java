package controller;

import entity.Ve;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VeModel;

public class VeController {

    public static ArrayList<Ve> taiTatCa() throws SQLException {
        return VeModel.taiTatCa();
    }

    public static Ve chiTietVe(String mave) throws SQLException {
        return VeModel.chiTietVe(mave);
    }

    public static boolean sua(Ve item) throws SQLException {
        return VeModel.sua(item);
    }
}
