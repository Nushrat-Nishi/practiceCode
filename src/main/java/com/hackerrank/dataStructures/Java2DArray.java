package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
//---------------------------------------------------
            }
        }
        in.close();
        List<Integer> sumList = new ArrayList<Integer>();

        for (int m = 0; m <= 3; m++) {
            for (int k = 0; k <= 3; k++) {
                List<Integer> numList = new ArrayList<Integer>();

                for (int i = m; i < m + 3; i++) {
                    for (int j = k; j < (k + 3); j++) {
                        numList.add(arr[i][j]);
                    }
                }

                int sum = 0;
                int min = 0;
                for (int i = 0; i < 9; i++) {
                    sum = sum + numList.get(i);
                }

                min = numList.get(3) + numList.get(5);
                sum = sum - min;
                sumList.add(sum);
//------------------------------------------------------------------------------
            }
        }
        System.out.println(Collections.max(sumList));
    }
}