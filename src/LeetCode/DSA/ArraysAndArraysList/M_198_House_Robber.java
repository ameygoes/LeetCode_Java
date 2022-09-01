/*
 * Copyright (c) 9/1/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/1/2022
 * Leetcode - https://leetcode.com/problems/house-robber/
 */
package LeetCode.DSA.ArraysAndArraysList;

public class M_198_House_Robber {

    public static int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }


        int[] dpArray = new int[nums.length];
        dpArray[0] = nums[0];
        dpArray[1] = Integer.max(nums[0], nums[1]);

        for (int numsIndex = 2; numsIndex < nums.length; numsIndex++) {
            dpArray[numsIndex] = Math.max(dpArray[numsIndex-2] + nums[numsIndex], dpArray[numsIndex-1]);
        }

        return dpArray[nums.length-1];

        }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
