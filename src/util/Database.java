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

    public static String userName = "quanlirap";
    public static String password = "123456";
    public static String connectionString = "jdbc:oracle:thin:@localhost:1521:orcl";
    public static Connection conn;

    //Hàm khởi tạo giá trị cho kết nối database
    public static void Load() {
        userName = "quanlirap";
        password = "123456";
        connectionString = "jdbc:oracle:thin:@localhost:1521:sid";
    }
    //Hàm kết nối dùng giá trị riêng
    public static Connection connect(String jdbcString, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcString, username, password);
    }

    //Hàm kết nối dựa vào giá trị từ hàm load
    public static Connection connect() {
        try {
            if (conn != null) {
            return conn;
        } else {
            return DriverManager.getConnection(connectionString, userName, password);
        }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }  
    }
    
    //Gọi lệnh
   public static ResultSet callQuery(String sqlQuery) throws SQLException {
        Connection connect = connect();
        Statement st = connect.createStatement();
        return st.executeQuery(sqlQuery);
    }

    public static int callQueryInsert(String table, Object... param) throws SQLException {
        //Dựng lệnh truy vấn
        StringBuilder statement = new StringBuilder("INSERT INTO " + table + " values " + " ");
        if (param != null) {
            statement.append("(");
            for (int i = 1; i <= param.length; i++) {
                statement.append("?");
                if (i < param.length) {
                    statement.append(",");
                }
            }
            statement.append(")");
        }

        //Kết nối và truyền tham số
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
        // trả về kết quả
        return call.executeUpdate();

    }
    
    public static int callQueryDelete (String sqlQuery) throws SQLException {
        Connection connect = connect();
        Statement st = connect.createStatement();
        return st.executeUpdate(sqlQuery);
    }

    //Gọi stored 
    //Hàm này có thể trả về 1 list data được lấy lên
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

    //Gọi stored inseet update delete
    //Hàm trả về true false - thành công, thất bại
    public static int callStoredUpdate(String storeName, Object... param) throws SQLException {
        // tạo chuỗi lời gọi
        StringBuilder statement = new StringBuilder("{call " + storeName + " ");
        if (param != null) {
            statement.append("(");
            for (int i = 1; i <= param.length; i++) {
                statement.append("?");
                if (i < param.length) {
                    statement.append(",");
                }
            }
            statement.append(")");
        }
        statement.append("}");

        // kết nối và truyền tham số
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
        // trả về kết quả
        return call.executeUpdate();
    }
}
