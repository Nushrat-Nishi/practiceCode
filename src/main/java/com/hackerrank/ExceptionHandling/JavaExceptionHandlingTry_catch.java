package com.hackerrank.ExceptionHandling;

import java.io.*;
import java.util.*;

public class JavaExceptionHandlingTry_catch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int output = a / b;
            System.out.println(output);
        }
        catch (InputMismatchException i){
            String s = i.getClass().toString();
            String[] sa = s.split(" ");
            System.out.println(sa[1]);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        sc.close();
    }
}

//2147483648