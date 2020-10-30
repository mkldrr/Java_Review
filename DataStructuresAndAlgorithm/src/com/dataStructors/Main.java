package com.dataStructors;

import com.dataStructors.linkedLists.CyLinkedList;

public class Main {

    public static void main(String[] args) {

        //todo: LinkedList
        var cyLinkedList= new CyLinkedList();
        cyLinkedList.addList(1);
        cyLinkedList.addList(2);
        cyLinkedList.addList(3);

        cyLinkedList.printLinkedList();
        System.out.println();
        cyLinkedList.deleteLast();

        cyLinkedList.printLinkedList();
        System.out.println(cyLinkedList.size);


        //todo============================================



    }
}
