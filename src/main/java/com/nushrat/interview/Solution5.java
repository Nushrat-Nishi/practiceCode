package com.nushrat.interview;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;

            for (int k = 0; k < n; k++) {
                result = result + (int) Math.pow(2, k) * b;
                System.out.print(result + " ");
            }

            System.out.println();
        }

        in.close();

// (a+2⁰.b), (a+2⁰.b+2¹.b), (a+2⁰.b+2¹.b².b)

// (0+2⁰.2), =2
// (0+2⁰.2+2¹.2), =2+4 =6
// (0+2⁰.2+2¹.2+2².2), =6+8 =14
// (0+2⁰.2+2¹.2+2².2+2³.2), =14+16 =30
// (0+2⁰.2+2¹.2+2².2+2³.2+2⁴.2), =30+32 =62
// (0+2⁰.2+2¹.2+2².2+2³.2+2⁴.2+2⁵.2), =62+64 =126
// (0+2⁰.2+2¹.2+2².2+2³.2+2⁴.2+2⁵.2+2⁶.2), =126+128 =254
// (0+2⁰.2+2¹.2+2².2+2³.2+2⁴.2+2⁵.2+2⁶.2+2⁷.2), =254+256 =510
// (0+2⁰.2+2¹.2+2².2+2³.2+2⁴.2+2⁵.2+2⁶.2+2⁷.2+2⁸.2), =510+512 =1022
// (0+2⁰.2+2¹.2+2².2+2³.2+2⁴.2+2⁵.2+2⁶.2+2⁷.2+2⁸.2+2⁹.2), =1022+1024 =2046

// (5+2⁰.3), = 5+3 =8
// (5+2⁰.3+2¹.3), =8+6 =14
// (5+2⁰.3+2¹.3+2².3), =14+12 =26
// (5+2⁰.3+2¹.3+2².3+2³.3), =26+24 =50
// (5+2⁰.3+2¹.3+2².3+2³.3+2⁴.3), =50+48 =98
    }
}

//https://www.hackerrank.com/challenges/java-loops?h_r=next-challenge&h_v=zen