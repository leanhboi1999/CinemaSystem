package controller;

import entity.Cthdtp;
import entity.HoaDonThucPham;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HoaDonThucPhamModel;

public class HoaDonThucPhamController {

    public static ArrayList<HoaDonThucPham> taiTatCa() throws SQLException {
        return HoaDonThucPhamModel.taiTatCa();
    }

    public static ArrayList<HoaDonThucPham> timKiemMa(String mahoadon) throws SQLException {
        return HoaDonThucPhamModel.timKiemMa(mahoadon);
    }

    public static ArrayList<HoaDonThucPham> timKiemNgay(String startDate, String endDate) throws SQLException {
        return HoaDonThucPhamModel.timKiemNgay(startDate, endDate);
    }

    public static String hienMa() throws SQLException {
        return HoaDonThucPhamModel.hienMa();
    }

    public static int inserthd(String m1, String m2, String m3) throws SQLException {
        return HoaDonThucPhamModel.inserthd(m1, m2, m3);
    }

    /*public static boolean insertcthdtp(HoaDonThucPham hd, ArrayList<Cthdtp> chitiethoadon) throws SQLException {
        if (HoaDonThucPhamModel.inserthd_cthd(hd, chitiethoadon)) {
            return true;
        } else {
            return false;
        }
    }*/
    public static boolean insertcthdtp(ArrayList<Cthdtp> chitiethoadon) throws SQLException {
        if (HoaDonThucPhamModel.inserthd_cthd(chitiethoadon)) {
            return true;
        } else {
            return false;
        }
    }
}
