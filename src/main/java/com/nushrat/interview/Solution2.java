package com.nushrat.interview;

public class Solution2 {

    public static void main(String args[]) {

        System.out.println(compress("aaaaabbbbbbbbbccccpqrstuv"));

    }

    static String compress(String str) {

        StringBuilder returnSb = new StringBuilder();

        if (str.length() < 2) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {

            returnSb.append(str.charAt(i));

            int countRepeat = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    countRepeat++;
                } else {
                    break;
                }
            }

            if (countRepeat > 1) {
                returnSb.append(countRepeat);
                i = i + countRepeat - 1;
            }
        }

        return returnSb.toString();

    }
}
