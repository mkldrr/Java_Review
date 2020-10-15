package com.review.core;


public class SelectionStatements {

    public static void demoIfStatement(){

          String userName = "Michael";
        if (userName.length()<10) System.out.println(userName);
        else if (userName.length()>10) System.out.println("username is length is more than 10");
    }

    public static void demoSwitchStatement(){
        String userName = "Mkldrr";
        switch (userName){
            case "Mkldrr":
                System.out.println(userName + " is the Correct nickname");
            case "Michael":
                System.out.println("Not a correct username");
        }

    }





}
