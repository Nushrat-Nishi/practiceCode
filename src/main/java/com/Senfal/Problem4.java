package com.Senfal;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
// Declare array a here---------------------------
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }

//---------------------------------------------------------
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

/*
Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50
*/

//My code