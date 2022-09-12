/*
 * Copyright (c) 9/11/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 9/11/2022
 */
package DSA.Sorting;

import java.util.Arrays;

// ADAPTIVE SORTING ALGORITHM
// BEST AMONGST THE BUBBLE, SELECTION AND INSERTION
// ITS A STABLE SORTING ALGORITHM MEANS, POSITION OF DUPLICATE ELEMENTS IS MAINTAINED.
// WORKS WELL WITH PARTIALLY SORTED ARRAYS
public class InsertionSort {
    public static void main(String[] args) {
//        int[] num = {5,4,2,3,1};
//        int[] num = {1};
//        int[] num = {};
//        int[] num = {1,2,3,4,5};
//        int[] num = {0,1};
        int[] num = {5,0,-2,32,1};
        System.out.println(Arrays.toString(insertionSort(num)));
    }
    public static int[] insertionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i+1; j > 0 ; j--) {

                if(arr[j-1] > arr[j]){
                    swap(arr,  j, j-1);
                }
//                if the previous element is less than the current element we will break loop,
//                since the array is already sorted
                else{break;}
            }
        }
        return arr;
    }

    public static int getMaximumIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {

            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    public static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

