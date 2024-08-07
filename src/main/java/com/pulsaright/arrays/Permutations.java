package com.pulsaright.arrays;

import java.util.Arrays;

public class Permutations {
    /*
    * Permutation
Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output

true
    *
    *
    * */
    public boolean permutation(int[] array1, int[] array2){
        // TODO
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }

}
