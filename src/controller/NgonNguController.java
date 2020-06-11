package controller;

import entity.NgonNgu;
import java.sql.SQLException;
import java.util.ArrayList;
import model.NgonNguModel;

public class NgonNguController {
    public static ArrayList<NgonNgu> taiTatCa () throws SQLException {
        return NgonNguModel.taiTatCa();
    }
}
