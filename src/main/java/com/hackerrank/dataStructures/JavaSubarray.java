package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
//--------------------------------------
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            a[i] = input;
        }
        sc.close();

        int sum = 0;
        List<Integer> sumList = new ArrayList<Integer>();

        for (int k = 0; k < n; k++) {
            for (int i = n - 1; i >= k; i--) {
                List<Integer> list = new ArrayList<Integer>();
                for (int j = k; j <= i; j++) {
                    list.add(a[j]);
                    sum = sum + a[j];
                }
                if (sum < 0) {
                    sumList.add(sum);
                }
                sum = 0;
            }
        }
        System.out.println(sumList.size());
//--------------------------------------
    }
}