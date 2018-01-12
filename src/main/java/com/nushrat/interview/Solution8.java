package com.nushrat.interview;

import java.util.Scanner;

public class Solution8 {

    static Scanner in = new Scanner(System.in);
    static int B = in.nextInt();
    static int H = in.nextInt();

    static boolean flag = true;

    static {

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}

//https://www.hackerrank.com/challenges/java-static-initializer-block