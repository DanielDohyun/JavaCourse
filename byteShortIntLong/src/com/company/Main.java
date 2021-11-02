package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        //Occupies 32 bits
        int myMinInt = Integer.MIN_VALUE;
        int myMaxMint = Integer.MAX_VALUE;
        System.out.println("Int min val =" + myMinInt);
        System.out.println("Int max val =" + myMaxMint);
        //overflow
        System.out.println("Busted Max val = " + (myMaxMint + 1));
        //underflow
        System.out.println("Busted Min val =" + (myMinInt - 1));

        //Occupies 8 bits
        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;
        System.out.println("byte min = " + myMinByteVal );
        System.out.println("byte max = " + myMaxByteVal );

        //Occupies 16 bits
        short myMinShortVal = Short.MIN_VALUE;
        short myMaxShortVal = Short.MAX_VALUE;
        System.out.println("short min = " + myMinShortVal );
        System.out.println("short max = " + myMaxShortVal );
        
        //Occupies 64 bits
        long myLongVal = 100L;
        long myMinLongVal = Long.MIN_VALUE;
        long myMaxLongVal = Long.MAX_VALUE;
        System.out.println("long min = " + myMinLongVal );
        System.out.println("long max = " + myMaxLongVal );

        //Casting
        //to convert a number from one type to another
        //ex. (byte)(myMinByteVal/2)

        byte byte1 = 123;
        short short1 = 111;
        int int1 = 1389123;
        long long1 = 50000L + 10L *(byte1 + short1 + int1);
        System.out.println("long1 = " + long1);

    }
}
