package com.pulsaright.arrays;

public class CheckArrayDuplicate {
    /*
    * IsUnique / Contains Duplicate - LeetCode 217
Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
    *
    * */
    public boolean isUnique(int[] intArray) {
        // TODO
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if(intArray[i]==intArray[j])
                    return false;
            }
        }
        return true;
    }
}
