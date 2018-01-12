package com.hackerrank.covariantReturnTypes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String state = in.next();

        WestBengal westBengal = new WestBengal();
        Karnataka karnataka = new Karnataka();
        AndhraPradesh andhraPradesh = new AndhraPradesh();

        if ("WestBengal".equals(state)) {
            System.out.println(westBengal.yourNationalFlower().whatsYourName());
        } else if ("Karnataka".equals(state)) {
            System.out.println(karnataka.yourNationalFlower().whatsYourName());
        } else if ("AndhraPradesh".equals(state)) {
            System.out.println(andhraPradesh.yourNationalFlower().whatsYourName());
        }



    }
}
