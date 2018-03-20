package com.thoughtworks.basicJavaExercise;

public class FunctionOverloading {

    static public int sum(int a,int b) {
        return a+b;
    }
    static public int sum(int a,int b,int c) {
        return a+b+c;
    }
    static public String sum(String a, String b) {
        return a.concat(b);
    }
    static public String sum(char a, char b) {
        return new StringBuilder().append(a).append(b).toString();
    }
    static public double sum(double a, double b) {
        return a+b;
    }
}
