package com.dataStructors.linkedLists;

public class KthNodeFromTheLAst extends MyLinkedList {

  //todo  2. Finding the Kth node from the end in one pass where you don’t know the size of the list.

    public int getKthFromTheEnd2(int k) {
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



}
