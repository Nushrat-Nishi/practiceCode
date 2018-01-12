package com.Senfal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Problem5 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> m = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();

            m.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            Integer result = m.get(s);

            if (result == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+result);
            }
        }
    }
}

//https://www.hackerrank.com/challenges/phone-book/problem

/*
Sample Input
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry


Sample Output
uncle sam=99912222
Not found
harry=12299933
*/

//My code