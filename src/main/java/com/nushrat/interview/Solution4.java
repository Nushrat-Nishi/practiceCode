package com.nushrat.interview;

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}

//https://www.hackerrank.com/challenges/java-loops-i?h_r=next-challenge&h_v=zen