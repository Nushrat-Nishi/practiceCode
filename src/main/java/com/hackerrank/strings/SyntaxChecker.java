package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Boolean> booleans = new ArrayList<Boolean>();

        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            //--------------------------
            Boolean b = true;
            try {
                Pattern.compile(pattern, 0);
                b = true;
            } catch (Exception e) {
                b = false;
            }
            booleans.add(b);
            testCases--;
            //----------------------------
        }
        //-------------
        for (int i = 0; i < booleans.size(); i++) {
            if (booleans.get(i) == true) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        //--------
    }
}
