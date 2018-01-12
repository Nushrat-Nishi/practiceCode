package com.hackerrank.dataStructures;

import java.util.*;

public class Java1DArray_Part2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean b = false;
        for (int i = 0; i < game.length; i++) {

            int backi = i - 1;
            int fori = i + 1;
            int leapi = i + leap;

            try {
                if (i > 0) {
                    if (game[backi] == 0) {
                        b = true;
                    } else {
                        b = false;
                    }
                }
                if (game[fori] == 0) {
                    b = true;
                } else {
                    b = false;
                }

                if (leapi > (game.length - 1)) {
                    b = true;
                    break;
                } else if (game[leapi] == 0) {
                    b = true;
                } else {
                    b = false;
                }

            } catch (Exception e) {
                return b;
            }

            if (b==false){
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}

//https://www.hackerrank.com/challenges/java-1d-array/problem
/*
Sample Input
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output
YES
YES
NO
NO
*/
