/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author leanh
 */
public class Database {

    public static String userName;
    public static String password;
    public static String connectionString;
    public static Connection conn;

    //Hàm khởi tạo giá trị cho kết nối database
    public static void Load() {
        userName = "";
        password = "";
        connectionString = "jdbc:oracle:thin:@localhost:1521:sid";
    }

    //Hàm kết nối dùng giá trị riêng
    public static Connection connect(String jdbcString, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcString, username, password);
    }

    //Hàm kết nối dựa vào giá trị từ hàm load
    public static Connection connect() throws SQLException {
        if (conn != null) {
            return conn;
        } else {
            return DriverManager.getConnection(connectionString, userName, password);
        }
    }
    
    //Gọi lệnh
    public static ResultSet callQuery(String sqlQuery) throws SQLException {
        Connection connect = connect();
        Statement st = connect.createStatement();
        return st.executeQuery(sqlQuery);
    }

    //Gọi stored 
    public static ResultSet callStored(String storedName, Object... param) throws SQLException {
        StringBuilder statement = new StringBuilder("{call " + storedName + " ");
        if (param != null) {
            statement.append("(");
            for (int i = 1; i < param.length; i++) {
                statement.append("?");
                if (i < param.length) {
                    statement.append(",");
                }
            }
            statement.append(")");
        }
        statement.append("}");
        //kết nối CSDL và lấy kết quả
        Connection connect = connect();
        CallableStatement call = connect.prepareCall(statement.toString());
        if (param != null) {
            for (int i = 1; i <= param.length; i++) {
                if (param[i - 1] != null) {
                    call.setObject(i, param[i - 1]);
                } else {
                    call.setNull(i, Types.NULL);
                }
            }
        } 
        return call.executeQuery();
    }
}
