package com.nushrat.interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution10 {
    public static String getDay(String day, String month, String year) {

        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month) - 1;
        int d = Integer.parseInt(day);

        Calendar calendar = new GregorianCalendar(y, m, d);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");

        String date2 = null;

        try {
            Date date = calendar.getTime();
            date2 = simpleDateFormat.format(date).toUpperCase();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return date2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();


        System.out.println(getDay(day, month, year));
    }
}
//https://www.hackerrank.com/challenges/java-date-and-time