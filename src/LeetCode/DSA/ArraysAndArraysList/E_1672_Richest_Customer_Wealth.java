/*
 * Copyright (c) 8/28/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/28/2022
 */
package LeetCode.DSA.ArraysAndArraysList;


//    ===========================================================
//      TIME COMPLEXITY: O(N^2)
//      Space Complexity: O(1).
//    LEETCODE PROBLEM LINK - https://leetcode.com/problems/richest-customer-wealth/
//    ===========================================================


public class E_1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;

        for (int rowIndex = 0; rowIndex < accounts.length; rowIndex++) {

            int wealthOfAnIndividual = 0;
            for (int colIndex = 0; colIndex < accounts[rowIndex].length; colIndex++) {
                wealthOfAnIndividual+=accounts[rowIndex][colIndex];
            }
            // Update the maximum wealth seen so far if the current wealth is greater
            // If it is less than the current sum

//            TWO WAYS TO UPDATE MAX - IF STATEMENT TAKES ALOT OF TIME
//            if(wealthOfAnIndividual > maximumWealth){
//                maximumWealth = wealthOfAnIndividual;
//            }
//          SECOND WAY IS TO USE MAT.MAX TO DO COMPARISON, ITS HELL ALOT FAST!
            maximumWealth = Math.max(maximumWealth,wealthOfAnIndividual);
        }
        return maximumWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
