package com.hackerrank.visitorPattern;
//like TextHolidayVisitor & TextVisitor
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;
class SumInLeavesVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
        //------------------
        System.out.println(node.getColor());
        System.out.println(node.getDepth());
        System.out.println(node.getValue());
        //-------------------
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        //---------------
        Color a = leaf.getColor();
        int b = leaf.getDepth();
        int c = leaf.getValue();

        //----------------
    }
}