package com.hackerrank.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int lengthA = A.length();
        int lengthB = B.length();
        int sumLength = lengthA + lengthB;

        System.out.println(sumLength);

        int valueA = A.charAt(0);
        int valueB = B.charAt(0);

        if (valueB < valueA) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        char a = A.charAt(0);
        char b = B.charAt(0);
        String stringA = Character.toString(a);
        String stringB = Character.toString(b);

        String upperA = stringA.toUpperCase();
        String upperB = stringB.toUpperCase();

        String c = upperA.concat(upperB);
        String Asub = A.substring(1, lengthA);
        String Bsub = B.substring(1, lengthB);

        String conA = upperA.concat(Asub);
        String conB = upperB.concat(Bsub);

        String finalString = conA.concat(" ").concat(conB);
        System.out.println(finalString);
    }
}
