package com.pulsaright.arrays;

public class MissingNumber {
    /*
    * Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:

Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
    *
    * */
    static int findMissingNumberInArray(int[] arr) {
        // TODO
        int length=arr.length;
        int actualSum=(length*(length-1))/2;
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(actualSum);
        System.out.println(sum);
        return actualSum-sum;
    }
}
