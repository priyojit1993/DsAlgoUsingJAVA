package com.pulsaright.arrays;

import java.util.Arrays;

public class FindingNumberInArray {
    /*
    * Finding a Number in an Array
Write a program to to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5
    *
    *
    * */
    public int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        return Arrays.binarySearch(intArray,valueToSearch);
    }
}
