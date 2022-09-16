/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
package LeetCode.DSA.Sorting;

public class E_287_Find_the_Duplicate_Number {
    public int findDuplicate(int[] arr) {

//        CODE FOR CYCLIC SORT
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index=0; index<arr.length;index++){
            if(arr[index] != index + 1){
                return arr[index];
            }


        }
        return -1;
}

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
