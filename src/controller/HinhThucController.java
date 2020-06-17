/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.HinhThuc;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HinhThucModel;

/**
 *
 * @author leanh
 */
public class HinhThucController {
    public static ArrayList<HinhThuc> taiTatCa () throws SQLException {
        return HinhThucModel.taiTatCa();
    }
}
