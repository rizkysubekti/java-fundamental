package com.juaracoding;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello juara!");
        // getYear -> camelCase
        // get_year -> snake_case
        int number = 10;
        // block if
        if (true){
            System.out.println(number);
            System.out.println("True");
        }
        // block for
        for (int i = 0; i < 5; i++) {
            System.out.println(number);
            System.out.println(i);
        }
    }
}