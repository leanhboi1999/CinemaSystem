/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Phim;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhimModel;

/**
 *
 * @author leanh
 */
public class PhimController {
    public static ArrayList<Phim> taiTatCa () throws SQLException {
        return PhimModel.taiTatCa();
    }
    
    public static Phim getPhim(String maphim) throws SQLException {
        return PhimModel.getPhim(maphim);
    }
}
