/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package LeetCode.DSA.ArraysAndArraysList;

import java.util.Arrays;

public class E_1365_Numbers_Are_Smaller_Than_Current_Number {

    public static void main(String[] args) {
        int[] newarray = new int[]{8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(newarray)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

//        int[] counterArray = new int[nums.length];
//
//            for (int outIndex=0; outIndex<nums.length-1; outIndex++){
//                int count = 0;
//                for (int inIndex=0; inIndex<nums.length; inIndex++){
//                    if (nums[inIndex] < nums[outIndex]){
//                        count++;
//                    }
//
//                }
//                counterArray[outIndex] = count;
//            }
//            return counterArray;
//        }}

    int arr[]=new int[101];
    int arrTemp[]=new int[101];

        for (int i = 0; i <nums.length ; i++) {
        arr[nums[i]]+=1;
    }

        for (int i = 1; i <101 ; i++) {
        arrTemp[i]+=arr[i-1];
        arr[i]+=arr[i-1];
    }
		        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrTemp));
        for (int i = 0; i <nums.length ; i++) {
        nums[i]=arrTemp[nums[i]];
    }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrTemp));
        return nums;
}
}
