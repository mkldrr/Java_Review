package com.review.lambda.sorting;

import com.review.oop.encapsulation.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//TODO: instead of getter setter and toString, i can use @Data
public class Employee {


    private Integer employeeId;
    private String employeeFirstName;
    private String getEmployeeLastName;
    private String getEmployeeCity;
    private Role role;

}
