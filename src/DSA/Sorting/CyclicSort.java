/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package DSA.Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
//        int[] num = {5,4,2,3,1};
//        int[] num = {1};
//        int[] num = {};
//        int[] num = {1,2,3,4,5};
//        int[] num = {0,1};
        int[] num = {5,3,2,4,1};
        System.out.println(Arrays.toString(cyclicSort(num)));
    }

    public static int[] cyclicSort(int[] arr){
        int i=0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        return  arr;
    }

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
