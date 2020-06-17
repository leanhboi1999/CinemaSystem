/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.PhongChieu;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhongChieuModel;

/**
 *
 * @author leanh
 */
public class PhongChieuController {
    public static ArrayList<PhongChieu> taiTatCa() throws SQLException {
        return PhongChieuModel.taiTatCa();
    }
}
