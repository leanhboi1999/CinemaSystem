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

    public static ArrayList<ThucPham> taiCoTrangThai() throws SQLException {
        return ThucPhamModel.taiCoTrangThai();
    }

    public static ArrayList<ThucPham> timKiem(String tenthucpham) throws SQLException {
        return ThucPhamModel.timKiem(tenthucpham);
    }

    public static String hienMa() throws SQLException {
        return ThucPhamModel.hienMa();
    }

    public static Date hienngay() throws SQLException {
        return ThucPhamModel.hienngay();
    }

    public static ThucPham layThongTin(String maThucPham) throws SQLException {
        return ThucPhamModel.layThongTin(maThucPham);
    }

    public static int insertThucPham(ThucPham thucpham) throws SQLException{
        return ThucPhamModel.insertThucPham(thucpham);
    }

    public static int editThucPham(String maThucPham, String tenThucPham, int donGia, int soLuong, int trangThai) throws SQLException {
        return ThucPhamModel.editThucPham(maThucPham, tenThucPham, donGia, soLuong, trangThai);
    }

    public static int xoaThucPham(String maThucPham) throws SQLException {
        return ThucPhamModel.xoaThucPham(maThucPham);
    }

}
