package com.pulsaright.arrays;

public class ArrayDiagonalSum {
    public static int sumDiagonalElements(int[][] array) {
        int length = array.length - 1;
        int sum = 0;
        for (int i = 0; i <= length; i++) {
            sum =sum+ array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumDiagonalElements(arr));
    }
}
