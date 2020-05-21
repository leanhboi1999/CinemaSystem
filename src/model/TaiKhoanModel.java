/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.Database;

/**
 *
 * @author leanh
 */
public class TaiKhoanModel {

    public static String layMatKhau(String username) throws SQLException {
        ResultSet rs = Database.callStored("sp_LayMatKhau", username);
        rs.next();
        Connection conn = Database.connect();
        String pass = rs.getString(1);
        Database.connect().close();

        if (pass == null) {
            throw new SQLException();
        }
        return pass;
    }
}
