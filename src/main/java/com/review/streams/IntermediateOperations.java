package com.review.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperations { // here the action goes on, there is no result yet we can get

    public static void main(String[] args) {

        Integer [] numbersArr = {23,343,56,23,2,23};

        Stream<Integer> numbersStream = Arrays.stream(numbersArr);

        System.out.println("===============FILTER OPERATION===================");

        System.out.println(  numbersStream.filter(number -> number%2 ==0).count());

        Stream<String> stringStream = Arrays.asList("Apple", "Banana","Blueberry","mango").stream();

        System.out.println(stringStream.filter(str -> str.length()==5).count());
       // System.out.println(stringStream.filter(str-> str.startsWith("A")).count()); i cant get anything here, because stream is closed

        // i can also do like this:

        Arrays.asList("Apple", "Banana","Blueberry","mango","Apple","Apple").stream().filter(str->str.equals("Apple")).forEach(str-> System.out.println(str));




        System.out.println("=================MAP OPERATION=================");

        Arrays.asList("Apple", "Banana","Blueberry","mango","Apple","Apple").stream().map(str-> str.toUpperCase()).forEach(str -> System.out.println(str));




        System.out.println("=================DISTINCT OPERATION=================");

        Arrays.asList("Apple", "Banana","Blueberry","mango","Apple","Apple").stream().distinct().forEach(str-> System.out.println(str));



        System.out.println("=================SORTED ORDER OPERATION=================");

        Arrays.asList(1,2,3,4,5,45,53).stream().sorted().forEach(integer -> System.out.println(integer));
        // here i used an array at top and called it and converted to list, then stream
        Arrays.asList(numbersArr).stream().sorted().forEach(num-> System.out.println(num));



        System.out.println("=================SORTED REVERSED ORDER OPERATION=================");

        Arrays.asList(1,2,3,4,5,6,7).stream().sorted(Comparator.reverseOrder()).forEach(integer -> System.out.println(integer));

        // here i used an array at top and called it and converted to list, then stream
        Arrays.asList(numbersArr).stream().sorted(Comparator.reverseOrder()).forEach(num-> System.out.println(num));


    }

}
