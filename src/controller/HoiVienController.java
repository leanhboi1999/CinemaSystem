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
}
