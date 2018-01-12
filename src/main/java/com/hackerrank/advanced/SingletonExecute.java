package com.hackerrank.advanced;

public class SingletonExecute {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            SingletonPractice s = SingletonPractice.getSingletonPractice();
            System.out.println(s.hashCode());
        }

        for (int i = 0; i < 5; i++) {
            SingletonThreadSafe ss = SingletonThreadSafe.getSingletonThreadSafe();
            System.out.println(ss.hashCode());
        }

        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getSingleInstance();
            System.out.println(singleton.hashCode());
        }
    }
}