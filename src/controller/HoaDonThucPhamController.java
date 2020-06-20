package controller;

import java.sql.SQLException;
import model.HoaDonThucPhamModel;

public class HoaDonThucPhamController {
     public static String hienMa() throws SQLException {
        return HoaDonThucPhamModel.hienMa();
    }
}
