package com.oops.lambda;


class AA {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.onCLick();
    }
}

interface A {
    void onCLick();
}

class B implements A {
    @Override
    public void onCLick() {
        System.out.println("OnCLick");
    }
}

