package com.oops.lambda;

public class Lambda {
    public static void main(String[] args) {
        Demo2 obj;
        obj = (x, y) -> System.out.println("Anonymous onClick " + x + y);
        obj.onClick(12, 45);
    }
}

interface Demo2 {
    void onClick(int x, int y);
}