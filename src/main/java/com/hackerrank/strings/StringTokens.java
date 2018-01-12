package com.hackerrank.strings;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        //-----------------------------------------
        String S = s.trim();
        if (S.length() == 0) {
            System.out.println(0);
        } else if ((S.length() < 1) || (S.length() > 400000)) {
            return;

        } else {
            String reg = "[ !,?._'@]+";

            String[] b = S.split(reg);
            System.out.println(b.length);

            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        }
        //-----------------------------------------
    }
}