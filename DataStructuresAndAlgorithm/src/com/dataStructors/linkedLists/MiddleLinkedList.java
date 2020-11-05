package com.dataStructors.linkedLists;

public class MiddleLinkedList extends MyLinkedList{

//  TODO 3. Find the middle of a linked list in one pass. If the list has an even number of nodes,
//   there would be two middle nodes. (Note: Assume that you don’t know the size of the list ahead of time.)
//   Additional /Optional Exercises


    public void printMiddle2() {
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

}
