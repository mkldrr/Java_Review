package com.review.core;

public class Loops {



    public static void demoForIterator(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }
    }

    public static void demoForEach(){
        String [] companies = {"APPL", "MCRSFT", "SQR", "AMZN", "SMSNG"};
        for ( String company : companies) {
            System.out.println(company);
        }
    }



}
