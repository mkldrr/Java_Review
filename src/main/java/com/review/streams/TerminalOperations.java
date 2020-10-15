package com.review.streams;

import com.review.collections.ArrayLists;
import com.review.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {


    public static void main(String[] args) {

        System.out.println("=====================COUNT=======================");

        long count= Arrays.asList(1,2,3,4,5,6,7).stream().count();
        System.out.println(count);

        long count2 =Arrays.asList("Apple", "Banana","Blueberry","mango","Apple","Apple").stream().filter(str->str.equals("Apple")).count();
        System.out.println(count2);


        System.out.println("=====================FIND FIRST - FIND ANY =======================");


        Role role = ArrayLists.createRoleList().stream().filter(role1 -> role1.getRoleZDescription().equals("Employee")).findFirst().get();

        System.out.println(role.getId());


        Role role2 = ArrayLists.createRoleList().stream().filter(role1 -> role1.getRoleZDescription().equals("Employee")).findAny().get();
        System.out.println(role2.getId());




        System.out.println("===================== COLLECT =======================");

        List<String> appleList = Arrays.asList("Apple", "Banana","Blueberry","mango","Apple","Apple").stream().filter(str-> str.equals("Apple")).collect(Collectors.toList());

        System.out.println(appleList);
        //so i can also with this list to stream annd get count

        System.out.println("Count of apples in the list that we get with using collect method of terminal operation"+appleList.stream().count());




        System.out.println("===================== REDUCE =======================");


        int total= Arrays.asList(1,2,3,5,6,7,8).stream().reduce(5,(x,y)->x+y);

        System.out.println(total);

        String nickName= Arrays.asList("M","K","L","D","D","R","R").stream().reduce("",(a,b)->a+b);

        System.out.println(nickName);









    }
}
