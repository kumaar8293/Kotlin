package com.oops.lambda;

public class Lambdaaaa {

    public static void main(String[] args) {


        String x="sfdsf";
        Print test;
        test = (a, y) -> {
            System.out.println(y);
        };


//        test = new Print() {
//            @Override
//            public void printt() {
//                System.out.println("PLPLPLP");
//            }
//        };


        test.printt(12, 122);
    }
}


interface Print {
    void printt(int x, int y);
}
