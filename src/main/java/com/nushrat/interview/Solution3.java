package com.nushrat.interview;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.print(s1);

            for (int j = (15 - s1.length()); j > 0; j--) {
                System.out.print(".");
            }

            if (x >= 0 && x < 10) {
                System.out.println("00" + x);
            } else if (x >= 10 && x < 100) {
                System.out.println("0" + x);
            } else if (x >= 100 && x <= 999) {
                System.out.println(x);
            }
        }
        System.out.println("================================");
        //java...........100
    }
}