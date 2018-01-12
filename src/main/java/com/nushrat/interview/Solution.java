package com.nushrat.interview;

public class Solution {

    public static void main(String args[]) {

        System.out.println(is_Palindrome("rubbur"));
        System.out.println(is_Palindrome("cdefghmnopqrstuvw"));
        System.out.println(is_Palindrome("madam"));

    }

    static String is_Palindrome(String s) {

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount[ch - 97]++;
        }

        int numberOfOddCount = 0;
        for (int count : charCount) {
            if (numberOfOddCount > 1) {
                return "NO";
            }
            if (count % 2 == 1) {
                numberOfOddCount++;
            }
        }

        return "YES";

    }
}
