package com.leetcode.array;


/*

problem statement


You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.


 */


public class Buy_SellStock {

    public static void main(String[] args) {

        int []  arr =  {7,1,5,3,6,4}  ;
        System.out.println(getMaxProfit( arr));


    }



    static  int getMaxProfit(int[] arr) {

        int min_buy = Integer.MAX_VALUE;

        int maxprofit = 0;

        int diffrence = 0;

        for (int j : arr) {

            if (j < min_buy) {
                min_buy = j;
            }

            diffrence = j - min_buy;

            if (maxprofit < diffrence) {
                maxprofit = diffrence;
            }

        }


        return maxprofit;
    }



}
