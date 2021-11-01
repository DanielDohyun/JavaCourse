package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinInt = Integer.MIN_VALUE;
        int myMaxMint = Integer.MAX_VALUE;
        System.out.println("Int min val =" + myMinInt);
        System.out.println("Int max val =" + myMaxMint);
        //overflow
        System.out.println("Busted Max val = " + (myMaxMint + 1));
        //underflow
        System.out.println("Busted Min val =" + (myMinInt - 1));
    }
}
