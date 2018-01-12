package com.hackerrank.strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int a = A.length();
        String p;
        String q;

        if (a % 2 == 0) {
            p = A.substring(0, a / 2);
            q = A.substring((a / 2), a);
        } else {
            p = A.substring(0, a / 2);
            q = A.substring((a / 2) + 1, a);
        }

        boolean result = true;

        for (int i = 0; i < p.length(); i++) {
            char pchar = p.charAt(i);
            int ql = q.length() - i;
            int j = ql - 1;
            char qchar = q.charAt(j);

            if (pchar == qchar) {
                result = true;
            } else {
                result = false;
                break;
            }
            j--;
        }

        if (result) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}