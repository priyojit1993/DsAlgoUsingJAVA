package com.pulsaright.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    /*
    * Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
    *
    * */
    public static int[] removeDuplicates(int[] arr) {
        //   TODO
        return Arrays.stream(arr).distinct().toArray();
    }
}
