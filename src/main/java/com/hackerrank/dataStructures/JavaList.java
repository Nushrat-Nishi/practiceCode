package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> L = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }

        int Q = sc.nextInt();


        for (int j = 0; j < Q; j++) {
            String s = sc.next();
            String s1 = sc.nextLine();

            if (s.equals("Insert")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                L.add(a, b);
            }

            if (s.equals("Delete")) {
                int a = sc.nextInt();
                L.remove(a);
            }
        }


        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.toArray()[i] + " ");
        }
        sc.close();
    }
}

/*
Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23
*/