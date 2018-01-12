package com.nushrat.interview;

import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a;
        int i=1;
        while(in.hasNext())
        {
            a=in.nextLine();
            System.out.println(i+" "+a);
            i++;
        }
    }
}

//https://www.hackerrank.com/challenges/java-end-of-file