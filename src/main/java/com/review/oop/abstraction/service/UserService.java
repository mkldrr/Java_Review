package com.review.oop.abstraction.service;

import com.review.enums.Gender;
import com.review.oop.abstraction.implementation.UserServiceImplementation;
import com.review.oop.encapsulation.Role;
import com.review.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {


    @Override
    public String userByRoleId(int id) {
        User user = new User("Michael", "Drr", new Role(id,"Admin"), Gender.MALE);
        return user.getFirstName() + " " +  user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName, "Smith", new Role(12,"Dev"),Gender.MALE);

        return user;
    }
}
