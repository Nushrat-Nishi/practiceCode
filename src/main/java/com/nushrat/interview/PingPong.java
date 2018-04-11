package com.nushrat.interview;

import java.util.ArrayList;
import java.util.List;

public class PingPong {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        String output = "";

        for (int i = 0; i < list.size(); i++) {
            boolean divisibleByThreeOrFour = false;

            if (i == 0) {
                output += list.get(i);
            } else {
                if (i % 3 == 0) {
                    output += "Ping";
                    divisibleByThreeOrFour = true;
                }
                if (i % 4 == 0) {
                    output += "Pong";
                    divisibleByThreeOrFour = true;
                } if(divisibleByThreeOrFour==false) {
                    output += list.get(i);
                }
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
