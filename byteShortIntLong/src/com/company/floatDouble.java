package com.company;

public class floatDouble {
    //precision = format and amount of space occupided by the type
    //single and double precisions occupy 32 and 64 bits respectively

    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min = " + minFloat);
        System.out.println("Float max = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("double min = " + minDouble);
        System.out.println("double max = " + maxDouble);
    }
}
