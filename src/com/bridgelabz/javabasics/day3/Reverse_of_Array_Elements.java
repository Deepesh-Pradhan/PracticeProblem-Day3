package com.bridgelabz.javabasics.day3;

public class Reverse_of_Array_Elements {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Reverse Order of an Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

