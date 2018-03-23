package com.thoughtworks.basicJavaExercise.FunctionOverriding;

public class Apple extends Fruit {
    public Apple(String color) {
        super("red");
    }

    public boolean isTasty() {
        return true;
    }
}
