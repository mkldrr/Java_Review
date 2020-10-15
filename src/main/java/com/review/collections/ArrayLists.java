package com.review.collections;

import com.review.enums.Gender;
import com.review.oop.encapsulation.Role;
import com.review.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {



    List<Integer> list = new ArrayList();


    public void createList(){
        List<Integer> list = new ArrayList();
        list.add(4);
        list.add(45);
        list.add(23);
        for (Integer num :list) {
            System.out.println(num);
        }
    }

    public void createUserList(){

        List<User> userList = new ArrayList<>();

        userList.add(new User("Lionel","Messi", new Role(1,"Manager"), Gender.MALE));

        userList.add(new User("Steven","GG", new Role(2,"Manager"), Gender.MALE));

        for (User u: userList) {

            System.out.println(u.getRole().getRoleZDescription());
        }

    }


    public static List<Role> createRoleList(){

        List<Role> roleList = new ArrayList<>();

        roleList.add( new Role(3,"QA"));
        roleList.add( new Role(4,"BA"));
        roleList.add( new Role(5,"PO"));
        roleList.add( new Role(6,"Employee"));
        roleList.add( new Role(7,"Employee"));


        return roleList;

    }



}
