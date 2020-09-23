package controller;

import entity.Cthdtp;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CTHDTPModel;

public class CTHDTPController {

    public static ArrayList<Cthdtp> tatTatCa() throws SQLException {
        return CTHDTPModel.taiTatCa();
    }

    public static ArrayList<Cthdtp> taiChiTiet(String mahoadon) throws SQLException {
        return CTHDTPModel.taiChiTiet(mahoadon);
    }

    public static int insert(String mahoadon, String mathucpham, int soluong) throws SQLException, InterruptedException {
        return CTHDTPModel.insert(mahoadon, mathucpham, soluong);
    }
}
