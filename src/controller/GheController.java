/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Ghe;
import java.sql.SQLException;
import java.util.ArrayList;
import model.GheModel;

/**
 *
 * @author leanh
 */
public class GheController {

    public static ArrayList<Ghe> taiTatCa(String masuatchieu) throws SQLException {
        return GheModel.taiTatCa(masuatchieu);
    }

    public static boolean them() throws SQLException {
        int kq = GheModel.them();
        if (kq > 0) {
            return true;
        } else {
            return false;
        }
    }
}
