package controller;

import entity.SuatPhim;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SuatPhimModel;

public class SuatPhimController {

    public static ArrayList<SuatPhim> tatTatCa() throws SQLException {
        return SuatPhimModel.taiTatCa();
    }

    public static ArrayList<SuatPhim> taiDanhSach(String maphim) throws SQLException {
        return SuatPhimModel.taiDanhSach(maphim);
    }
    
    public static boolean them(SuatPhim sp) throws SQLException {
        return SuatPhimModel.them(sp);
    }
    
    public static boolean xoaSuatPhim(String masuatphim) throws SQLException{
        int kq = SuatPhimModel.xoaSuatPhim(masuatphim);
        if (kq > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String hienMa() throws SQLException {
        return SuatPhimModel.hienMa();
    }
}
