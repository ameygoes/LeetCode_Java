/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.Arrays;

public class E_1389_Create_Target_Array_in_the_Given_Order {
    public static int[] createTargetArray(int[] nums, int[] indexArray) {
        int[] targetArray = new int[nums.length];

        for (int index=0; index<targetArray.length; index++){

            if(indexArray[index]<index){
                shiftRight(indexArray[index], targetArray);
            }
            targetArray[indexArray[index]] = nums[index];
        }

        return targetArray;

    }
    public static void shiftRight(int indexs, int[] targetArray){

        for(int index = targetArray.length-1 ; index > indexs; index--){
            targetArray[index] = targetArray[index-1];
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
