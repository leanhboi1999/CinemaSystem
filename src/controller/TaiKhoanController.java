/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.TaiKhoanModel;

/**
 *
 * @author leanh
 */
public class TaiKhoanController {
    public static boolean DangNhap (String username, String password) {
        try {
            String pass = TaiKhoanModel.layMatKhau(username);
            if(password.equals(pass) == false) {
                throw new Exception();
            }
            return true;
            
        }
         catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }
}
