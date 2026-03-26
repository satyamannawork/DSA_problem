package com.java.output;

public class CheckOutput {
    public static void main(String[] args) {

        stringOutput1();

    }

    /*
    Output: 115110
From left to right java will treat the first two numbers as integers and make addition operation
produce 11
Then will see a string s and make concatenation operation and every thing after a string will deal with as a string and concatenate them producing
115110
     */
    public static void  stringOutput1() {
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);


    }
}


