package com.oops.lambda;


public class Anonymous {
    public static void main(String[] args) {
        Demo obj;
        obj = new Demo() {
            @Override
            public void onClick() {
                System.out.println("Anonymous onClick");
            }
        };
        obj.onClick();
    }
}

interface Demo {
    void onClick();
}