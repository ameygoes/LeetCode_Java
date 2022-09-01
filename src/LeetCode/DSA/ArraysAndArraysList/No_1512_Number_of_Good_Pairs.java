/*
 * Copyright (c) 8/31/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 8/31/2022
 * LeetCode - https://leetcode.com/problems/number-of-good-pairs/
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.HashMap;
public class No_1512_Number_of_Good_Pairs {

//    APPROACH 1
      /*
    TIME COMPLEXITY - O(N)
    SPACE COMPLEXITY - O(N)
     */
    static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> ansMap = new HashMap<>();

        for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {

            if (ansMap.containsKey(nums[numsIndex])){
                ansMap.put(nums[numsIndex] , ansMap.get(nums[numsIndex]) + 1);
            }
            else{
                ansMap.put(nums[numsIndex], 1);
            }
        }

        int numberOfGoodPairs = 0;
        for (Integer intValue: ansMap.values()){
            numberOfGoodPairs = numberOfGoodPairs + (intValue * (intValue - 1))/2;
        }
        return numberOfGoodPairs;
    }

//    APPROACH 2
    /*
    TIME COMPLEXITY - O(N)
    SPACE COMPLEXITY - O(1)
     */
static int numIdenticalPairs2(int[] nums) {
    int[] ansArray = new int[101];
    int res = 0;

    for (int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++) {
        res += ansArray[nums[indexOfNums]];
        ansArray[nums[indexOfNums]]++;
    }

    return res;
}

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs2(nums));
    }

}
