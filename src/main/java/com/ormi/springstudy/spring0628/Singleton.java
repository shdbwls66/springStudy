package com.ormi.springstudy.spring0628;

public class Singleton {
//    private static final Singleton instance = new Singleton();
//
//    private Singleton() {
//
//    }
//    public static Singleton getInstance() {
//        return instance;
//    }

//    private static Singleton instance;
//
//    private Singleton() {
//        // private 생성자
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    private static Singleton instance;
    private int count = 0;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
