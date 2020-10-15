package com.review;

import com.review.core.Loops;
import com.review.core.Methods;
import com.review.core.SelectionStatements;
import com.review.enums.Gender;
import com.review.enums.Status;
import com.review.oop.abstraction.implementation.UserServiceImplementation;
import com.review.oop.abstraction.service.UserService;
import com.review.oop.encapsulation.Role;
import com.review.oop.encapsulation.User;
import com.review.oop.inharitance.BaseEntity;
import com.review.oop.inharitance.Project;
import com.review.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {


    public static void main(String[] args) {

        /*  for todo:  ---- core  ---- package*/

        //Methods
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("APPL");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(12));
        Methods.methodC();

        System.out.println("\n==================================================");

        //Loops
        Loops.demoForEach();
        Loops.demoForIterator();

        System.out.println("\n==================================================");

        //SectionStatements
        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchStatement();


        /* for todo:----- OOP ------ package  */
        System.out.println("\n==================================================");
        // todo Encapsulation

        User user = new User("Michael", "Drr", new Role(234,"Manager"), Gender.MALE);

        System.out.println("Name: "+ user.getFirstName() + " lastName: " +  user.getLastName() + " roleDesc: " + user.getRole().getRoleZDescription());



        System.out.println("\n==================================================");


        //todo Inheritance

        Project project = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().minusHours(5),
                1, "Dev01", "Spring",
                new User("Michael","D",new Role(1,"Dev Manager"), Gender.MALE),
                LocalDate.now(), LocalDate.of(2020,4,10),Status.IN_PROGRESS, "Java BackEnd Dev" );


        System.out.println("ProjectID: " + project.getId() + " " + "insertDateTime: " + project.getInsertDateTime() +
                " inserUserId: " + project.getInsertUserId());




        //todo Interface


        UserService userService = new UserService();
        System.out.println( userService.userByFirstName("John").getLastName());



        // todo Polymorphism

        Employee employee = new Employee();
        employee.getEmployeeHours();

        BaseEntity employee2= new Employee();
        ((Employee) employee2).getEmployeeHours(); //DownCasting


        UserServiceImplementation userServiceImplementation= new UserService();



        //=========// todo ENUM  //* ============


        System.out.println(Gender.FEMALE);

        System.out.println(Status.IN_PROGRESS.getValue());
        System.out.println(Status.COMPLETED.getValue().charAt(3));







    }


}
