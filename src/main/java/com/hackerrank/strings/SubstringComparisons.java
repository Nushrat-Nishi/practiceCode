package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        List<String> lista = new ArrayList<String>();

        for (int i = 0; i < (s.length() - (k - 1)); i++) {
            int p = i + k;

            String mapValue = s.substring(i, p);
            int firstChar = mapValue.charAt(0);

            lista.add(mapValue);
        }

        Collections.sort(lista);
        smallest = lista.get(0);
        largest = lista.get(lista.size()-1);

        //---------------------------------------------
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
