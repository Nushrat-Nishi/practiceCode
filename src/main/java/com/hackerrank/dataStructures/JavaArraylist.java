package com.hackerrank.dataStructures;

import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) {
//--------------------------------------------

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, List<Integer>> dListMap = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> dList = new ArrayList<Integer>();

            for (int l=1; l<=d; l++){
                int m=sc.nextInt();
                dList.add(m);
            }
            dListMap.put(i, dList);

        }

        int q = sc.nextInt();

        List<String> resultList = new ArrayList<String>();

        for (int j = 0; j < q; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = 0;
            x=x-1;
            y=y-1;

            try {
                result = dListMap.get(x).get(y);
                String s = Integer.toString(result);
                resultList.add(s);
            } catch (Exception e) {
                resultList.add("ERROR!");
            }
        }

        for (int k = 0; k < resultList.size(); k++) {
            System.out.println(resultList.get(k));
        }

        sc.close();
//--------------------------------------------
    }
}
/*
        5
        5 41 77 74 22 44
        1 12
        4 37 34 36 52
        0
        3 20 22 33
        5
        1 3
        3 4
        3 1
        4 3
        5 5

        */
