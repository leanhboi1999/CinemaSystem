/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Cthdtp;
import entity.HoaDonThucPham;
import entity.ThucPham;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.ThucPhamModel;

/**
 *
 * @author leanh
 */
public class ThucPhamController {

    public static ArrayList<ThucPham> taiTatCa() throws SQLException {
        return ThucPhamModel.taiTatCa();
    }

    public static String hienMa() throws SQLException {
        return ThucPhamModel.hienMa();
    }

    public static Date hienngay() throws SQLException {
        return ThucPhamModel.hienngay();
    }

    public static int insert(String mahoadon, String mathucpham, int soluong) throws SQLException {
        return ThucPhamModel.insert(mahoadon, mathucpham, soluong);
    }

    public static int inserthd(String m1, String m2, String m3) throws SQLException {
        return ThucPhamModel.inserthd(m1, m2, m3);
    }

    public static boolean insertcthdtp(HoaDonThucPham hd, ArrayList<Cthdtp> chitiethoadon) throws SQLException {
        if (ThucPhamModel.inserthd_cthd(hd, chitiethoadon)) {
            return true;
        } else {
            return false;
        }
    }
}
