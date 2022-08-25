/*
 * Copyright (c) 8/23/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/23/2022
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.Arrays;


/*=====================================================
//    TIME COMPLEXITY - O(n)
//    SPACE COMPLEXITY - O(2n)
//    TAKES LONGER TIME TO RUN - 1 ms
======================================================
 */
public class No_1929_Concatenation_Of_Array {

//    FUNCTION TO GET CONCATENATION ARRAY
    public static int[] getConcatenation(int[] nums) {

//        GET THE LENGTH OF AN ARRAY TO CREATE AN ARRAY OF TWICE THE SIZE OF THE ORIGINAL ONE.
        int lengthOfArray = nums.length;

//        CREATE NEW ARRAY OF TWICE THE SIZE AS ORIGINAL ONE
        int[] ans = new int[2*lengthOfArray];

//        RUN OVER A LOOP AN CONCATENATE THE ARRAY
        for (int i=0; i<lengthOfArray; i++){
            ans[i] = nums[i];
            ans[i + lengthOfArray] = nums[i];
        }

//        RETURN THE ARRAY
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
