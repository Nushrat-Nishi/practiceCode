package com.hackerrank.visitorPattern;

import java.util.ArrayList;
        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        import java.util.ArrayList;
        import java.util.Scanner;

enum Color {
    RED, GREEN
}

public class Solution {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        //-----------------------------------------
        return null;
        //-----------------------------------------
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}