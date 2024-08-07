package com.pulsaright.arrays;

public class BuySellStock {
    /*
    * Best Time to Buy and Sell Stock - LeetCode 121
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:

Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    *
    *
    * */

    public int maxProfit(int[] prices) {
        // TODO
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length - 2; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if ( (prices[j] - prices[i])>max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
