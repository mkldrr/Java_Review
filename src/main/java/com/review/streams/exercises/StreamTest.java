package com.review.streams.exercises;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {


    public static void main(String[] args) {

        //todo 1:

        System.out.println( StreamDemo.getListOfProject().stream().filter(str->str.getProjectName().equals("Human Resource CRM")).collect(Collectors.toList()));




    }
}
