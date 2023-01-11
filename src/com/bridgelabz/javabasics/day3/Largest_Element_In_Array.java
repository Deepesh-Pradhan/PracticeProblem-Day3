package com.bridgelabz.javabasics.day3;

public class Largest_Element_In_Array {

    public static void main(String[] args) {
        int array[] = {15, 28, 32, 7, 60, 2};
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Largest element of an array is: " + largest);
    }
}
