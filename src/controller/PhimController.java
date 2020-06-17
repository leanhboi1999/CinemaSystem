/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Phim;
import entity.SuatPhim;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhimModel;

/**
 *
 * @author leanh
 */
public class PhimController {

    public static ArrayList<Phim> taiTatCa() throws SQLException {
        return PhimModel.taiTatCa();
    }
    
     public static ArrayList<Phim> taiPhimDangChieu() throws SQLException {
        return PhimModel.taiPhimDangChieu();
    }

    public static Phim getPhim(String maphim) throws SQLException {
        return PhimModel.getPhim(maphim);
    }

    public static ArrayList<Phim> timKiem(String tenphim) throws SQLException {
        return PhimModel.timKiem(tenphim);
    }
    
    public static ArrayList<Phim> timKiem(String startDate, String endDate) throws SQLException {
        return PhimModel.timKiem(startDate, endDate);
    }

    public static boolean xoaPhim(String maphim) throws SQLException{
        int kq = PhimModel.xoaPhim(maphim);
        if (kq > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String hienMa () throws SQLException {
        return PhimModel.hienMa();
    }
    
    public static boolean them(Phim p, ArrayList<SuatPhim> aSuarPhim) throws SQLException {
        return PhimModel.them(p, aSuarPhim);
    }
}
