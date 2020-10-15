package com.review.streams;

import com.review.collections.ArrayLists;
import com.review.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {


    public static void main(String[] args) {

        //todo 1: creating Stream from Array

        String [] courses= {"Java", "JS","API","Selenium","DB"};
        Stream<String > courseStream = Arrays.stream(courses);

        //todo 2: creating Stream from Collection

        Stream<Role> roleStream = ArrayLists.createRoleList().stream();// here we used the one we already created before

        //todo 3: creating Stream from Specified Values

        Stream<Integer> stream = Stream.of(23,43,23,43,23,2);








    }
}
