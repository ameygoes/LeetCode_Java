/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package LeetCode.DSA.Sorting;

public class E_268_missing_number {

    public static void main(String[] args) {

    }
    public static int missingNumber(int[] arr){

        int i=0;

        while(i < arr.length){
            int correctIndex = arr[i];
            if (arr[i] != arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index=0; index<arr.length;index++){
            if(arr[index] != index){
                return index;
            }

        }
        return arr.length;

    }

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
