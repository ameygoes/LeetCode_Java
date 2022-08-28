/*
 * Copyright (c) 8/28/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/28/2022
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.Arrays;

public class No_1480_Running_Sum_Of_1d_Array {

//    ===========================================================
//      TIME COMPLEXITY: O(N)
//      Space Complexity: O(1).
//    THE MOST EASY SOLUTION, STRAIGHT FORWARD, GO OVER ARRAY
//    CALCULATE ARRAY SUM AND MODIFY THE CURRENT ARRAY ITSELF.
//    ===========================================================

    static int[] runningSum(int[] givenArray){
        int runningSum = 0;
        for (int arrayIndex = 0; arrayIndex < givenArray.length; arrayIndex++) {
            runningSum+=givenArray[arrayIndex];
            givenArray[arrayIndex] = runningSum;
        }
        return givenArray;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        Output: [1,3,6,10]
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
