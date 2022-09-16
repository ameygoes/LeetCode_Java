/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package LeetCode.DSA.Sorting;

import java.util.Arrays;

public class E_268_missing_number {

    public static void main(String[] args) {
int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] arr) {

//        CODE FOR CYCLIC SORT
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
         System.out.println(Arrays.toString(arr));
        for(int index=0; index<arr.length;index++){
            if(arr[index] != index + 1){
                return index+1;
            }


        }
        return arr.length + 1;

    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}