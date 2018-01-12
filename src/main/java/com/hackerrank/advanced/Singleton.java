package com.hackerrank.advanced;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.lang.AssertionError;

class Singleton {
    public String str;

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}
/*
Complete the Singleton class in your editor which contains the following components:

1. A private Singleton non parameterized constructor.
2. A public String instance variable named str.
3. Write a static method named getSingleInstance that returns the single instance of the Singleton class.

Once submitted, our hidden Solution class will check your code by taking
a String as input and then using your Singleton class to print a line.
*/