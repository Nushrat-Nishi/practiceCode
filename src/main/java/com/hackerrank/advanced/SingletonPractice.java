package com.hackerrank.advanced;

class SingletonPractice {
    private static SingletonPractice instance;

    private SingletonPractice() {
    }

    public static SingletonPractice getSingletonPractice() {
        if (instance == null) {
            instance = new SingletonPractice();
        }
        return instance;
    }
}
//This code is perfect. But it may face problems when it comes to Thread. So, next Solution is to do the best.

class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    private static class SingletonThreadSafeHelper{
        private static final SingletonThreadSafe innerInstance = new SingletonThreadSafe();
    }

    public static SingletonThreadSafe getSingletonThreadSafe() {
        return SingletonThreadSafeHelper.innerInstance;
    }
}