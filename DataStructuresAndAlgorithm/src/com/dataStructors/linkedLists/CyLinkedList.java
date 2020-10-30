package com.dataStructors.linkedLists;

import java.util.NoSuchElementException;

public class CyLinkedList {




    public class Node{

        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }


    public Node first;
    public Node last;
    public int size;

    public CyLinkedList() {
        this.first= null;
        this.size =0;
    }



    public boolean isEmpty(){

        return first ==null;
    }
    public void addList(int item){
        var node = new Node(item);
        System.out.println("Adding an item: " + item);


        if (isEmpty()) first = last = node;
        else {
            last.next=node;
            last=node;
        }
        size++;
    }

    public void deleteLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("Deleting an item from the last" );
        if (first==last) first=last=null;
        else {
            var previous = first;
            var current = first;
            while (current.next!=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            last = previous;
        }
        size--;
    }



    public void printLinkedList(){
        if (isEmpty()) throw new NoSuchElementException();
        var current = first;

        while (current!=null){
            System.out.println("Value: "+current.value);
            current=current.next;

        }
    }



}
