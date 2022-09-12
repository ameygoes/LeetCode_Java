/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] num = {5,4,2,3,1};
//        int[] num = {1};
//        int[] num = {};
//        int[] num = {1,2,3,4,5};
//        int[] num = {2,1};
//        int[] num = {5,0,-2,32,1};
        System.out.println(Arrays.toString(bubbleSort(num)));
    }

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j , j-1);
                }
            }

        }

        return arr;
    }

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
