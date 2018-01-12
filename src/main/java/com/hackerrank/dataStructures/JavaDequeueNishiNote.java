package com.hackerrank.dataStructures;

import java.util.*;

public class JavaDequeueNishiNote {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
//---------------------------------------------------------------------
        //Add element
        queue.add(1);
        System.out.println("After add: " + queue);

        //Add element
        queue.offer(2);
        System.out.println("After offer: " + queue);

        System.out.println();
//---------------------------------------------------------------------
        //remove the first/top element
        //return Exception if applied on empty queue
        queue.remove();
        System.out.println("After remove [1, 2]: " + queue);

        //remove the first/top element
        //return null if applied on empty queue
        queue.poll();
        System.out.println("After poll [2]: " + queue);



        System.out.println();
//---------------------------------------------------------------------
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.add(6));
        System.out.println(queue.offer(7));

        //if applied on empty list returns Exception.
        //otherwise return the whole queue
        //queue.element();
        System.out.println("After element: " + queue.element());

        //if applied on empty list returns empty list
        //otherwise return the whole queue
        //queue.peek();
        System.out.println("After peek: " + queue.peek());

        System.out.println(queue.size());

    }
}
