package com.pulsaright.arrays;

public class MiddleFunction {
    /*
     * Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
     * myArray = [1, 2, 3, 4]
     *middle(myArray)  # [2,3].
     *
     * */
    public static int[] middle(int[] array) {
        // TODO
        int arr[] = new int[array.length - 2];
        int index = 0;
        for (int i = 1; i < array.length - 1; i++) {
            arr[index] = array[i];
            index++;
        }
        return arr;
    }
}
