package com.review.lambda.course;

public class CourseTest {

    public static void main(String[] args) {
        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();


    //todo ======================================  inner class  ==============================//

        Course java2 = new Course() {   //todo inner class, not usual usage
            @Override
            public void study() {

            }
        };

        java2.study();

        Course selenium2 = new Course() {  //todo inner class, not usual usage
            @Override
            public void study() {

            }
        };

        selenium2.study();


        //todo ======                 NOW with LAMBDA                                    ======
        // we can use lambda only in functional interface
        // if your interface has only 1 method, you can implement lambda expression
        // another way; to be abke to use lambda, interface needs to be functional , mean, only one method.



        Course javaCourse =  () -> System.out.println("Studying Java");
        javaCourse.study();


        Course seleniumCourse =  () -> System.out.println("Studying Selenium");
        seleniumCourse.study();


    }
}
