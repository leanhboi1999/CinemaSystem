package controller;

import entity.NhanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.NhanVienModel;

public class NhanVienController {

    public static ArrayList<NhanVien> taiTatCa() throws SQLException {
        return NhanVienModel.taiTatCa();
    }

    public static String hienMa() throws SQLException {
        return NhanVienModel.hienMa();
    }

    public static int insertNhanVien(NhanVien nv) throws SQLException {
        return NhanVienModel.insertNhanVien(nv);
    }

    public static boolean editNhanVien(String manv, String chucvu, String tennv, String email, String CMND, String gioitinh, Date ngaysinh, String diachi, String dienthoai, Date ngayvl, int trangthai) throws SQLException {
        return NhanVienModel.editNhanVien(manv, chucvu, tennv, email, CMND, gioitinh, ngaysinh, diachi, dienthoai, ngayvl, trangthai);
    }

    public static NhanVien layThongTin(String manhanvien) throws SQLException {
        return NhanVienModel.layThongTin(manhanvien);
    }

    public static ArrayList<NhanVien> timKiemTen(String ten) throws SQLException {
        return NhanVienModel.timKiemTen(ten);
    }

    public static int xoaNhanVien(String manhanvien) throws SQLException {
        return NhanVienModel.xoaNhanVien(manhanvien);
    }
}
