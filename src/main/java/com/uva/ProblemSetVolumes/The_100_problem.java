package com.uva.ProblemSetVolumes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class The_100_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int m=0; m<4; m++){
            List<Integer> list = new ArrayList<>();
            int i = sc.nextInt();
            int j = sc.nextInt();

            for (int d = i; d <= j; d++) {
                List<Integer> listi = getSequenceList(d);
                int cycleLength = listi.size();
                list.add(cycleLength);
            }
            int maximumCycleLength = Collections.max(list);
            System.out.println(i+" "+j+" "+maximumCycleLength);
        }
    }

    static List<Integer> getSequenceList(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            if (n % 2 != 0) {
                n = 3 * n + 1;
                list.add(n);
            } else {
                n = n / 2;
                list.add(n);
            }
        }
        return list;
    }
}

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=3&page=show_problem&problem=36

/*
Sample Input
1 10
100 200
201 210
900 1000

Sample Output
1 10 20
100 200 125
201 210 89
900 1000 174
*/


//Submission received with ID 20288259