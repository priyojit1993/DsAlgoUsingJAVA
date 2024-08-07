package com.pulsaright.arrays;

import com.pulsaright.Main;

public class MaxProductOfIntegers {
    /*
    *
    *Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)
    *
    * */

    public String maxProduct(int[] intArray) {
        // TODO
        int maxProduct = Integer.MIN_VALUE;
        String maxProductString="";
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if ((intArray[i] * intArray[j]) > maxProduct) {
                    maxProduct = (intArray[i] * intArray[j]);
                    maxProductString=String.format("%d,%d",intArray[i],intArray[j]);
                }
            }
        }

        return maxProductString;
    }
}
