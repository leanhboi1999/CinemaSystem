/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.HoiVien;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HoiVienModel;

/**
 *
 * @author leanh
 */
public class HoiVienController {

    public static ArrayList<HoiVien> taiTatCa() throws SQLException {
        return HoiVienModel.taiTatCa();
    }

    public static ArrayList<HoiVien> timKiemTen(String ten) throws SQLException {
        return HoiVienModel.timKiemTen(ten);
    }
    
    public static ArrayList<HoiVien> timKiemCMND(String cmnd) throws SQLException {
        return HoiVienModel.timKiemCMND(cmnd);
    }
    
    public static boolean xoaHoiVien(String mahoivien) throws SQLException{
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
}
