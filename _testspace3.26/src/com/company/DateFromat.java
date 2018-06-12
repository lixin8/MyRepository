package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFromat {

    public static void main(String args[]) throws ParseException {
        String dateStr="2018-04-28";
        Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        String dateFromat=new SimpleDateFormat("yyyy年MM月dd日").format(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,1);
        dateFromat=new SimpleDateFormat("yyyy年MM月dd日").format(calendar.getTime());
        System.out.println(dateFromat);

    }
}
