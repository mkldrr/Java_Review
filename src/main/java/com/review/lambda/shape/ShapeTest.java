package com.review.lambda.shape;

public class ShapeTest {

    public static void main(String[] args) {


        //NO  params , NO return Type

        Drawable drawable = () -> System.out.println("Drawing the moon");
        drawable.draw();

        // ========== 1 params , NO return Type

        Drawable2 drawable2 = shape -> System.out.println("Drawing the " + shape);
        drawable2.draw("Sun");

        //============== Multiple params , NO return Type
        Drawable3 drawable3 = ((shape, name) -> System.out.println(name + " drawing " + name));
        drawable3.draw("The sun ", "Michael");


        //============== Multiple params , with return Type

        Drawable4 drawable4 = ((shape, area) -> "Drawing " + shape +  " and the area of it is: " + area);
        System.out.println(drawable4.draw("Earth", 237862873));


        // we can also do with curly brackets, but no needed.

        Drawable3 drawable31 = (shape,name) ->{
            System.out.println("What kind of shape is this? :" + shape);
            System.out.println("Who is drawing this shape? :" + name);
        };
        drawable31.draw("Triangle","Mike");




    }
}
