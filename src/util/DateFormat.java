/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author leanh
 */
public class DateFormat {

    //Chuyển string date sang date
    public static Date toDate(String date) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        return f.parse(date);
    }

    //Tạo date bằng tham số (ngày tháng năm)
    public static Date toDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }

    //Tạo date bằng tham số (ngày tháng năm giờ phút)
    public static Date toDate(int year, int month, int day, int hour, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hour, minute);
        return cal.getTime();
    }
    
    //Tạo date bằng tham số (ngày tháng năm giờ phút giây)
    public static 
}
