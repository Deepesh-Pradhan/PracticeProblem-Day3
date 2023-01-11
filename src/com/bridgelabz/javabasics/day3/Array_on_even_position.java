package com.bridgelabz.javabasics.day3;

public class Array_on_even_position {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array presents on Even numbers are: ");
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}