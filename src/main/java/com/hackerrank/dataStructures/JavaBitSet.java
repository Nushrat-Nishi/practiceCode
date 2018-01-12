package com.hackerrank.dataStructures;

import java.io.*;
import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        int bitOfB1 = 0;
        int bitOfB2 = 0;

        for (int j = 0; j < M; j++) {
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> list1 = new ArrayList<Integer>();

            String op = in.next();
            String operation = op.toUpperCase();
            int a = in.nextInt();
            int b = in.nextInt();

            if ("AND".equals(operation)) {
                if (a == 1 && b == 2) {
                    B1.and(B2);
                } else B2.and(B1);
            } else if ("OR".equals(operation)) {
                if (a == 1 && b == 2) {
                    B1.or(B2);
                } else
                    B2.or(B1);
            } else if ("XOR".equals(operation)) {
                if (a == 1 && b == 2) {
                    B1.xor(B2);
                } else
                    B2.xor(B1);
            } else if ("FLIP".equals(operation)) {
                if (a == 1) {
                    B1.flip(b);
                } else
                    B2.flip(b);
            } else if ("SET".equals(operation)) {
                if (a == 1) {
                    B1.set(b);
                } else
                    B2.set(b);
            }

            for (int i = 0; i < B1.size(); i++) {
                if (B1.get(i) == true) {
                    bitOfB1++;
                }
            }

            for (int i = 0; i < B2.size(); i++) {
                if (B2.get(i) == true) {
                    bitOfB2++;
                }
            }

            System.out.println(bitOfB1 + " " + bitOfB2);


            bitOfB1 = 0;
            bitOfB2 = 0;
        }
        in.close();
    }
}


/*
Sample Input
5 5
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
xor 1 2

Sample Output
0 0
1 0
1 1
1 2




523 11
XOR 2 1
FLIP 2 523
FLIP 2 406
FLIP 2 363
XOR 1 2
SET 2 364
XOR 1 2
SET 2 312
FLIP 1 253
OR 2 1
AND 2 1


946 1
XOR 1 2
SET 2 629

946 1
SET 2 946

*/