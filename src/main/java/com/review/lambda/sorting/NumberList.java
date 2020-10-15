package com.review.lambda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {

    public static void main(String[] args) {

        List<Integer> numList =  new ArrayList<>();
        
        numList.add(23);
        numList.add(56);
        numList.add(8289);
        numList.add(232);

        System.out.println(numList);

        Collections.sort(numList); // ascending
        System.out.println(numList);


        Collections.sort(numList, new MyComparator()); // descending
        System.out.println(numList);







        // todo:  with LAMBDA

        //Descending
//With Lambda

        //Ascending Order
        Collections.sort(numList);
        System.out.println(numList);

        //Descending Order
        Collections.sort(numList,((o1, o2) -> (o1>o2)?-1 : (o2>o1)?1 : 0));
        System.out.println(numList);

        //Ascending Order
        numList.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(numList);

        //Descending Order
        numList.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(numList);


    }
}
