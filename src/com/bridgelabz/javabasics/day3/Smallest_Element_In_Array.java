package com.bridgelabz.javabasics.day3;

public class Smallest_Element_In_Array {

    public static void main(String[] args) {
        int array[] = {15, 28, 32, 7, 60, 2};
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest element of an array is: " + smallest);
    }
}
