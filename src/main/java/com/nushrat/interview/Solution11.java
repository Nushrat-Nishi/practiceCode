package com.nushrat.interview;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution11 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
//--------------------------------------------------------
        String us = null;
        String india = null;
        String china = null;
        String france = null;

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        us = numberFormat1.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(indiaLocale);
        india = numberFormat2.format(payment);

        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = numberFormat3.format(payment);

        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = numberFormat4.format(payment);
//---------------------------------------------------
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
//https://www.hackerrank.com/challenges/java-currency-formatter?h_r=next-challenge&h_v=zen