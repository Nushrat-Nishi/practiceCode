package com.hackerrank.dataStructures;

import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
//---------------------------------------------------
//Write your code here
        s.close();
        HashSet<List<String>> hashSet = new HashSet<List<String>>();
        int count = 0;

        for (int i = 0; i < t; i++) {
            List<String> list = new ArrayList<String>();
            list.add(pair_left[i]);
            list.add(pair_right[i]);

            if (hashSet.add(list)) {
                count++;
                System.out.println(count);
            } else {
                System.out.println(count);
            }
        }

// ---------------------------------
    }
}

//https://www.hackerrank.com/challenges/java-hashset?h_r=next-challenge&h_v=zen
/*
Sample Input
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output
1
2
2
3
3
*/