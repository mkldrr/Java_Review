package com.dataStructors.linkedLists;

public class Reverse extends MyLinkedList {


  //TODO  1. Reversing the nodes of a singly linked lists in one pass.






    public void reverse2(){
        if(isEmpty()) return;

        var previous = first;
        var current = first.next;

        while (current!=null){
            var nextNode=current.next;
            previous=current;
            current=nextNode;
        }
        last=first;
        last.next=null;
        first=previous;

    }





}
