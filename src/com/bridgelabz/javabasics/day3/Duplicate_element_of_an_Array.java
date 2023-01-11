package com.bridgelabz.javabasics.day3;

public class Duplicate_element_of_an_Array {

    public static void main(String[] args) {
        int[] array = {1, 8, 2, 3, 4, 5, 6, 2, 4, 8, 6};
        System.out.println("duplicate element of an array is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
