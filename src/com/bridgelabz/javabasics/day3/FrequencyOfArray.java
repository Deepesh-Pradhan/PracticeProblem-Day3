package com.bridgelabz.javabasics.day3;

public class FrequencyOfArray {
    void Frequency(int array[], int fr[], int visited) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println(" " + array[i] + " || " + fr[i]);
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 5, 8, 2, 4, 5, 9, 1, 8, 8, 2, 3, 4, 9};
        int[] fr = new int[array.length];
        int visited = -1;
        FrequencyOfArray obj = new FrequencyOfArray();
        obj.Frequency(array, fr, visited);
    }
}

