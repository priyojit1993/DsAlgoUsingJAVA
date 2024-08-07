package com.pulsaright.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RotateMatrix {

    /*
    *Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

DO NOT allocate another 2D matrix and do the rotation.


    * */

    //Approach a using a new array

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] newArray = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newArray[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return newArray;
    }

    // approach using no new array
    public static void rotateMatrix2(int[][] matrix) {
        // step 1 transponse matrix
        int n = matrix.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row of the newly transpose of matrix
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       /* System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(rotateMatrix(a)));*/
        rotateMatrix2(a);
    }


}
