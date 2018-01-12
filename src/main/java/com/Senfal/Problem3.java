package com.Senfal;

import java.util.Scanner;

public class Problem3 {

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
    }
}

//https://www.hackerrank.com/challenges/java-loops/problem

/*
Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/

//My code