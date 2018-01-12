//Mahmood's Code 1 : Java Lambda Expressions

package com.Senfal;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    //-----------------------------------

   public static PerformOperation isOdd() {
        //return (int number) -> number % 2 != 0;
       return null;
    }

    public static PerformOperation isPrime() {
        //return (int number) -> java.math.BigInteger.valueOf(number).isProbablePrime(1);
        return null;
    }

    public static PerformOperation isPalindrome() {
        //return (int number) -> Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
        return null;
    }
}
//------------------------------------------------

public class Problem7 {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
