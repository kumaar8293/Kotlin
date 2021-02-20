package com.oops;

public class Singletona {

    private Singletona() {
    }

    private static Singletona instance;

    public static Singletona getInstance() {

        if (instance == null) {
            synchronized (Singletona.class) {
                if (instance == null) {
                    instance = new Singletona();
                }
            }
        }
        return instance;
    }
}