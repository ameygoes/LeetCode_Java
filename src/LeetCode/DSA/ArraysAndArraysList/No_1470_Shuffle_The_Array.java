/*
 * Copyright (c) 8/30/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/30/2022
 * LEETCODE LINK: https://leetcode.com/problems/shuffle-the-array/
 */
package LeetCode.DSA.ArraysAndArraysList;


public class No_1470_Shuffle_The_Array {

    public int[] shuffle(int[] nums, int n) {

//        POINTER 1 FOR GOING OVER THROUGH LOOP
        int pointer1 = 0;
//        ARRAY POINTER FOR TRACKING AND UPDATING THE ANSWER LIST
        int arrayPointer = 0;

//        ANSWER ARRAY TO BE RETURNED
        int[] arr = new int[2*n];

//        WHILE POINTER1 IS LESS THAN THE HALF OF THE ARRAY ELEMENTS
//        BECAUSE WE ARE GIVEN THE FACT THAT
        while (pointer1 <  n) {

            arr[arrayPointer] = nums[pointer1];
            arr[arrayPointer+1] = nums[pointer1+n];

            pointer1++;
            arrayPointer+=2;
        }
        return arr;
    }
}

