package com.pulsaright.arrays;

import java.util.Arrays;

/*
* Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
*
* */
public class BestScore {
    public static int[] findTopTwoScores(int[] array) {
        // TODO
        Arrays.sort(array);
        int[] arr = new int[2];
        System.out.println(Arrays.toString(array));
        arr[0]=array[array.length-1];
        arr[1]=array[array.length-2];
        return arr;
    }

}
