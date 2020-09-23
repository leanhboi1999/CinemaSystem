package controller;

import entity.HoiVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.HoiVienModel;

public class HoiVienController {

    public static ArrayList<HoiVien> taiTatCa() throws SQLException {
        return HoiVienModel.taiTatCa();
    }

    public static HoiVien layThongTin(String mahoivien) throws SQLException {
        return HoiVienModel.layThongTin(mahoivien);
    }

    public static ArrayList<HoiVien> timKiemTen(String ten) throws SQLException {
        return HoiVienModel.timKiemTen(ten);
    }

    public static ArrayList<HoiVien> timKiemCMND(String cmnd) throws SQLException {
        return HoiVienModel.timKiemCMND(cmnd);
    }

    public static boolean xoaHoiVien(String mahoivien) throws SQLException {
        int kq = HoiVienModel.xoaHoiVien(mahoivien);
        if (kq > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String hienMa() throws SQLException {
        return HoiVienModel.hienMa();
    }

    public static int insertHoiVien(HoiVien hv) throws SQLException {
        return HoiVienModel.insertHoiVien(hv);
    }

    public static boolean editHoiVien(String mahv, String tenhv, String gioitinh, String CMND, Date ngaysinh, String email, String dienthoai) throws SQLException {
        return HoiVienModel.editHoiVien(mahv, tenhv, gioitinh, CMND, ngaysinh, email, dienthoai);
    }
}
