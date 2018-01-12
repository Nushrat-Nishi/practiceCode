package com.hackerrank.advanced;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Add {
    void add(int... n) {
        int sum = 0;
        int count = 0;
        for (int i : n) {
            count++;
            sum = sum + i;
            if (count != n.length) {
                System.out.print(i + "+");
            } else System.out.print(i);

        }
        System.out.println("=" + sum);
    }
}


public class JavaVarargsSimpleAddition {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());

            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Input:
7
18
2
5
10
98

Output:
7+18=25
7+18+2=27
7+18+2+5+10=42
7+18+2+5+10+98=140
*/