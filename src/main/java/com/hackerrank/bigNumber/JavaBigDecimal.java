package com.hackerrank.bigNumber;

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        //Write your code here
//---------------------------------------------------
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                BigDecimal p = new BigDecimal(o1);
                BigDecimal q = new BigDecimal(o2);

                return q.compareTo(p);
            }

            public boolean equals(Object obj) {
                return false;
            }
        };

        List<String> inputList = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                inputList.add(s[i]);
            }
        }

        Collections.sort(inputList, comparator);
        inputList.toArray(s);
//---------------------------------------------------
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}