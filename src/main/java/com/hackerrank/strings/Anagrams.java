package com.hackerrank.strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        int al = A.length();
        int bl = B.length();

        int counta = 0;
        int countb = 0;

        boolean anagram = true;

        if (al != bl) {
            return false;
        } else {
            for (int i = 0; i < al; i++) {
                int ac = A.charAt(i);

                for (int j = 0; j < al; j++) {
                    int acc = A.charAt(j);
                    int bcc = B.charAt(j);

                    if (ac == acc) {
                        counta++;
                    }

                    if (ac == bcc) {
                        countb++;
                    }
                }

                if (counta == countb) {
                    anagram = true;
                } else {
                    anagram = false;
                    break;
                }
                counta = 0;
                countb = 0;
            }
        }
        return anagram;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
