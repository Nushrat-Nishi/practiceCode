//Mahmood's Code 2  Stack problem
package com.Senfal;

import java.util.*;

class Problem6 {
//--------------------------------------------------------
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }

    }

    public static boolean isBalanced(String expression) {
        if ((expression.length() % 2) == 1) return false;
        else {

            Stack<Character> s = new Stack<Character>();

            for (char bracket : expression.toCharArray())

                switch (bracket) {
                    case '{':
                        s.push('}'); //push places given value on top of stack
                        break;
                    case '(':
                        s.push(')');
                        break;
                    case '[':
                        s.push(']');
                        break;
                    default:
                        if (s.isEmpty() || bracket != s.peek().charValue()) {
                            //peek returns top value from stack without removing it;
                            return false;
                        }
                        s.pop();//pop removes top value from stack and returns it;
                }

            return s.isEmpty();//returns true if stack has no elements
        }
    }

 //-------------------------------------------------
}

//https://www.hackerrank.com/challenges/java-stack/problem

/*
Sample Input
{}()
({()})
{}(
[]

Sample Output
true
true
false
true
*/