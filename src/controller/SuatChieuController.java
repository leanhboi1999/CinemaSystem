/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.SuatChieu;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SuatChieuModel;

/**
 *
 * @author leanh
 */
public class SuatChieuController {
    public static ArrayList<SuatChieu> taiTatCa() throws SQLException {
        return SuatChieuModel.taiTatCa();
    }

    public static ArrayList<SuatChieu> timKiem(String masuatchieu) throws SQLException{
       return SuatChieuModel.timKiem(masuatchieu);
    }
    
    public static boolean xoaSuatChieu(String masuatchieu) throws SQLException{
        int kq = SuatChieuModel.xoaSuatChieu(masuatchieu);
        if (kq > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<SuatChieu> timKiem(String startDate, String endDate) throws SQLException{
       return SuatChieuModel.timKiem(startDate, endDate);
    }
    
    public static String hiemNa() throws SQLException {
        return SuatChieuModel.hienMa();
    }
    
    public static boolean them(SuatChieu sc) throws SQLException{
        return SuatChieuModel.them(sc);
    }
}
