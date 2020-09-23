package controller;

import entity.Ve;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VeModel;

public class VeController {

    public static ArrayList<Ve> taiTatCa() throws SQLException {
        return VeModel.taiTatCa();
    }
    
    public static ArrayList<Ve> timKiem(String mave) throws SQLException {
        return VeModel.timKiem(mave);
    }
    
    public static ArrayList<Ve> timKiemNgay(String startDate, String endDate) throws SQLException {
        return VeModel.timKiemNgay(startDate, endDate);
    }

    public static Ve chiTietVe(String mave) throws SQLException {
        return VeModel.chiTietVe(mave);
    }

    public static boolean sua(Ve item) throws SQLException {
        return VeModel.sua(item);
    }
}
