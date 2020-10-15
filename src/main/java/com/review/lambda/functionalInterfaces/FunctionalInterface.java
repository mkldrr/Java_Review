package com.review.lambda.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {


    public static void main(String[] args) {

        //todo: FUNCTION: it accepts a single parameter and return single value
        Function<Integer,Double> half = a -> a/2.0;

        System.out.println(half.apply(28));

        //todo: SUPPLIER interface: does not accept any param and return an object


        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


        //todo: CONSUMER interface:  accept a single param any param and does not return any object


        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(23);


        //todo: PREDICATE interface:  accept a single param any param and return boolean, true - false


        Predicate<Integer> lesserThan = i -> (i>10);
        System.out.println(lesserThan.test(13));






    }
}
