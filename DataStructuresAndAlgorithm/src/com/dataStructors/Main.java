package com.dataStructors;

import com.dataStructors.linkedLists.MyLinkedList;

public class Main {

    public static void main(String[] args) {

        //todo: LinkedList
        var myLinkedList= new MyLinkedList();

        for (int i = 1; i <= 10 ; i++) myLinkedList.addLast(i);

        System.out.println("Initial LinkedList");
        myLinkedList.printLinkedList();
        System.out.println();
        //myLinkedList.deleteLast();

        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.size);


        //todo============================================ QUESTIONS ===================

        //TODO QA1;
       // System.out.println("Reverse");
       // myLinkedList.reverse();
       // myLinkedList.printLinkedList();



        //TODO QA2;

        System.out.println("7th from the last is: "+myLinkedList.getKthFromTheEnd( 7));


        //TODO QA2;

        System.out.println("              Middle             ");

        myLinkedList.printMiddle();


    }
}
