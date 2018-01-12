//Finish it later
package com.hackerrank.dataStructures;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int a = 0;
        int b = 0;
        int c;
        int sameCount = 1;
        int notSameCount = 1;

        int count = 1;

        List<Integer> noOfUnique = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            //for (int j=0; j<m; j++){
            // if (deque.size() == 0) {
            deque.add(num);
            //a = num;
            noOfUnique.add(num);
            // }
            if (deque.size() < m) {
                for (Integer integer : noOfUnique) {
                    if (num == integer) {
                        sameCount++;
                    } else notSameCount++;
                }

                if (num == a) {
                    sameCount++;

                } else {
                    notSameCount++;
                    a = num;
                }
            }


            //   }


            if (deque.size() == 0) {
                deque.add(num);
                a = num;
            } else if (deque.size() == 1) {
                deque.add(num);
                b = num;
            } else if (deque.size() == 2) {
                deque.add(num);
                c = num;

                if (a != b) {
                    count++;
                }
                if ((c != a) && (c != b)) {
                    count++;
                }
                deque.remove();
                noOfUnique.add(count);
                count = 1;
                a = b;
                b = c;
            }
        }

        System.out.println(Collections.max(noOfUnique));
    }
}

/*
Sample Input
6 3
5 3 5 2 3 2

Sample Output
3
*/