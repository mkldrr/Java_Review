package com.dataStructors.linkedLists;

import java.util.NoSuchElementException;

public class MyLinkedList {


    public class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
            this.next=null;
        }
    }
    public Node first;
    public Node last;
    public int size;
    public MyLinkedList() {
        this.first=null;
        this.last=null;
        this.size=0;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void addLast(int item) {
        var node = new Node(item);
        //System.out.println("adding item: "+item);
        if (isEmpty())
            first = last = node;
        else {
            last.next=node;
            last = node;
        }
        size++;
    }
    public void deleteLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("Deleting last :"+ last.value);
        if (first==last) first=last=null;
        else {
            var previous = first;
            var current= first;
            while (current.next !=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            last=previous;
        }
    }
    public void printLinkedList() {
        if (isEmpty())
            throw new IllegalStateException();
        var current = first;
        while (current!= null) {
            System.out.println("Value :  "+current.value);
            current=current.next;
        }
    }






    //TODO QUESTIONS:

    //todo  1. Reversing the nodes of a singly linked lists in one pass.


    // This method reverses the nodes of the link list in one pass
    public void reverse() {
        if (isEmpty()) return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        last = first;
        last.next = null;
        first = previous;
    }


    //TODO  2. Finding the Kth node from the end in one pass where you don’t know the size of the list.



    // This method find the Kth node from the end in one pass
    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k-1 ; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }




    //  TODO 3. Find the middle of a linked list in one pass. If the list has an even number of nodes,
//       there would be two middle nodes. (Note: Assume that you don’t know the size of the list ahead of time.)

    public void printMiddle() {
        if (isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }
        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value + ", " + a.next.value);
    }




    //TODO       Additional /Optional Exercises

    //TODO   4. Check the singly linked list if it is Palindrome (Without a stack)



   //TODO    5. Sort the singly linked list of integers in descending order without using any sort algorithm.















}
