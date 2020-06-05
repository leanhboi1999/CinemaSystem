/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.TaiKhoan;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TaiKhoanModel;

/**
 *
 * @author leanh
 */
public class TaiKhoanController {

    public static ArrayList<TaiKhoan> taiTatCa() throws SQLException {
        return TaiKhoanModel.taiTatCa();
    }

    public static boolean DangNhap(String username, String password) {
        try {
            String pass = TaiKhoanModel.layMatKhau(username);
            if (password.equals(pass) == false) {
                throw new Exception();
            }
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int GetQuyen(String username) throws SQLException {
        return TaiKhoanModel.GetQuyen(username);
    }
    
    public static int Inset(String user, String pass) throws SQLException{
        return TaiKhoanModel.Insert(user, pass);
             
    }
}
